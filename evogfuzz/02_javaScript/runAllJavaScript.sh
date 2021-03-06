RUN=1
MAX=31
GRAMMAR=JavaScript
SUBJECTS=(Rhino)

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
		timeout 600 python3.7 ./scripts/main.py -f $GRAMMAR -b --outDir="results/$subject/Iteration-$RUN"  --subject="$subject" --fileExtension="js" --grammar_start_rule="nprogram"
		true $(( RUN++ ))
	done
	RUN=1

	python3.7 ./scripts/analyseExceptions.py --subject="$subject"
done

python3.7 ./scripts/analyseCoverage.py

echo "All done"

