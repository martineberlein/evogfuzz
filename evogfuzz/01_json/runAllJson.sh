RUN=1
MAX=31
GRAMMAR=json_noregex
SUBJECTS=(Argo Genson Gson JSONJava JsonToJava MinimalJson Pojo json-simple)

rm -rf "./results"
mkdir "./results"

for subject in "${SUBJECTS[@]}"
do
	echo "$subject"
	mkdir "./results/$subject"
	while [ $RUN -lt $MAX ]
	do
		echo "output: $RUN"
		mkdir "./results/$subject/Iteration-$RUN"
		timeout 600 python3.7 ./scripts/main.py -f $GRAMMAR -b --outDir="./results/$subject/Iteration-$RUN" --subject="$subject" --fileExtension="json" --grammar_start_rule="nstart"
		true $(( RUN++ ))
	done
	RUN=1

	python3.7 ./scripts/analyseExceptions.py --subject="$subject"

done

python3.7 ./scripts/analyseCoverage.py

echo "All done"

