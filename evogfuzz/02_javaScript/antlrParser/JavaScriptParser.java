// Generated from JavaScriptParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptParser extends JavaScriptBaseParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, RegularExpressionLiteral=3, OpenBracket=4, 
		CloseBracket=5, OpenParen=6, CloseParen=7, OpenBrace=8, CloseBrace=9, 
		SemiColon=10, Comma=11, Assign=12, QuestionMark=13, Colon=14, Ellipsis=15, 
		Dot=16, PlusPlus=17, MinusMinus=18, Plus=19, Minus=20, BitNot=21, Not=22, 
		Multiply=23, Divide=24, Modulus=25, RightShiftArithmetic=26, LeftShiftArithmetic=27, 
		RightShiftLogical=28, LessThan=29, MoreThan=30, LessThanEquals=31, GreaterThanEquals=32, 
		Equals_=33, NotEquals=34, IdentityEquals=35, IdentityNotEquals=36, BitAnd=37, 
		BitXOr=38, BitOr=39, And=40, Or=41, MultiplyAssign=42, DivideAssign=43, 
		ModulusAssign=44, PlusAssign=45, MinusAssign=46, LeftShiftArithmeticAssign=47, 
		RightShiftArithmeticAssign=48, RightShiftLogicalAssign=49, BitAndAssign=50, 
		BitXorAssign=51, BitOrAssign=52, ARROW=53, NullLiteral=54, BooleanLiteral=55, 
		DecimalLiteral=56, HexIntegerLiteral=57, OctalIntegerLiteral=58, OctalIntegerLiteral2=59, 
		BinaryIntegerLiteral=60, Break=61, Do=62, Instanceof=63, Typeof=64, Case=65, 
		Else=66, New=67, Var=68, Catch=69, Finally=70, Return=71, Void=72, Continue=73, 
		For=74, Switch=75, While=76, Debugger=77, Function=78, This=79, With=80, 
		Default=81, If=82, Throw=83, Delete=84, In=85, Try=86, Class=87, Enum=88, 
		Extends=89, Super=90, Const=91, Export=92, Import=93, Implements=94, Let=95, 
		Private=96, Public=97, Interface=98, Package=99, Protected=100, Static=101, 
		Yield=102, Identifier=103, StringLiteral=104, TemplateStringLiteral=105, 
		WhiteSpaces=106, LineTerminator=107, HtmlComment=108, CDataComment=109, 
		UnexpectedCharacter=110;
	public static final int
		RULE_main_dummy_rule_hope_for_no_collisions = 0, RULE_program = 1, RULE_sourceElement = 2, 
		RULE_statement = 3, RULE_block = 4, RULE_statementList = 5, RULE_variableStatement = 6, 
		RULE_variableDeclarationList = 7, RULE_variableDeclaration = 8, RULE_emptyStatement = 9, 
		RULE_expressionStatement = 10, RULE_ifStatement = 11, RULE_iterationStatement = 12, 
		RULE_varModifier = 13, RULE_continueStatement = 14, RULE_breakStatement = 15, 
		RULE_returnStatement = 16, RULE_withStatement = 17, RULE_switchStatement = 18, 
		RULE_caseBlock = 19, RULE_caseClauses = 20, RULE_caseClause = 21, RULE_defaultClause = 22, 
		RULE_labelledStatement = 23, RULE_throwStatement = 24, RULE_tryStatement = 25, 
		RULE_catchProduction = 26, RULE_finallyProduction = 27, RULE_debuggerStatement = 28, 
		RULE_functionDeclaration = 29, RULE_classDeclaration = 30, RULE_classTail = 31, 
		RULE_classElement = 32, RULE_methodDefinition = 33, RULE_generatorMethod = 34, 
		RULE_formalParameterList = 35, RULE_formalParameterArg = 36, RULE_lastFormalParameterArg = 37, 
		RULE_functionBody = 38, RULE_sourceElements = 39, RULE_arrayLiteral = 40, 
		RULE_elementList = 41, RULE_lastElement = 42, RULE_objectLiteral = 43, 
		RULE_propertyAssignment = 44, RULE_propertyName = 45, RULE_arguments = 46, 
		RULE_lastArgument = 47, RULE_expressionSequence = 48, RULE_singleExpression = 49, 
		RULE_arrowFunctionParameters = 50, RULE_arrowFunctionBody = 51, RULE_assignmentOperator = 52, 
		RULE_literal = 53, RULE_numericLiteral = 54, RULE_identifierName = 55, 
		RULE_reservedWord = 56, RULE_keyword = 57, RULE_getter = 58, RULE_setter = 59, 
		RULE_eos = 60;
	public static final String[] ruleNames = {
		"main_dummy_rule_hope_for_no_collisions", "program", "sourceElement", 
		"statement", "block", "statementList", "variableStatement", "variableDeclarationList", 
		"variableDeclaration", "emptyStatement", "expressionStatement", "ifStatement", 
		"iterationStatement", "varModifier", "continueStatement", "breakStatement", 
		"returnStatement", "withStatement", "switchStatement", "caseBlock", "caseClauses", 
		"caseClause", "defaultClause", "labelledStatement", "throwStatement", 
		"tryStatement", "catchProduction", "finallyProduction", "debuggerStatement", 
		"functionDeclaration", "classDeclaration", "classTail", "classElement", 
		"methodDefinition", "generatorMethod", "formalParameterList", "formalParameterArg", 
		"lastFormalParameterArg", "functionBody", "sourceElements", "arrayLiteral", 
		"elementList", "lastElement", "objectLiteral", "propertyAssignment", "propertyName", 
		"arguments", "lastArgument", "expressionSequence", "singleExpression", 
		"arrowFunctionParameters", "arrowFunctionBody", "assignmentOperator", 
		"literal", "numericLiteral", "identifierName", "reservedWord", "keyword", 
		"getter", "setter", "eos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", 
		"','", "'='", "'?'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'-'", 
		"'~'", "'!'", "'*'", "'/'", "'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", 
		"'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", 
		"'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
		"'>>>='", "'&='", "'^='", "'|='", "'=>'", "'null'", null, null, null, 
		null, null, null, "'break'", "'do'", "'instanceof'", "'typeof'", "'case'", 
		"'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'", "'void'", 
		"'continue'", "'for'", "'switch'", "'while'", "'debugger'", "'function'", 
		"'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", 
		"'try'", "'class'", "'enum'", "'extends'", "'super'", "'const'", "'export'", 
		"'import'", "'implements'", "'let'", "'private'", "'public'", "'interface'", 
		"'package'", "'protected'", "'static'", "'yield'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MultiLineComment", "SingleLineComment", "RegularExpressionLiteral", 
		"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
		"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
		"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", 
		"Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", 
		"RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
		"Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", 
		"BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
		"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
		"ARROW", "NullLiteral", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "OctalIntegerLiteral2", "BinaryIntegerLiteral", 
		"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", "Catch", 
		"Finally", "Return", "Void", "Continue", "For", "Switch", "While", "Debugger", 
		"Function", "This", "With", "Default", "If", "Throw", "Delete", "In", 
		"Try", "Class", "Enum", "Extends", "Super", "Const", "Export", "Import", 
		"Implements", "Let", "Private", "Public", "Interface", "Package", "Protected", 
		"Static", "Yield", "Identifier", "StringLiteral", "TemplateStringLiteral", 
		"WhiteSpaces", "LineTerminator", "HtmlComment", "CDataComment", "UnexpectedCharacter"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    double  _var_program_0          = 0.0;

	    double  _var_sourceElement_0    = 0.0;

	    double  _var_statement_0        = 0.0;
	    double  _var_statement_1        = 0.0;
	    double  _var_statement_2        = 0.0;
	    double  _var_statement_3        = 0.0;
	    double  _var_statement_4        = 0.0;
	    double  _var_statement_5        = 0.0;
	    double  _var_statement_6        = 0.0;
	    double  _var_statement_7        = 0.0;
	    double  _var_statement_8        = 0.0;
	    double  _var_statement_9        = 0.0;
	    double  _var_statement_10       = 0.0;
	    double  _var_statement_11       = 0.0;
	    double  _var_statement_12       = 0.0;
	    double  _var_statement_13       = 0.0;
	    double  _var_statement_14       = 0.0;
	    double  _var_statement_15       = 0.0;
	    double  _var_statement_16       = 0.0;

	    double  _var_block_0            = 0.0;

	    double  _var_statementList_0    = 0.0;

	    double  _var_variableStatement_0    = 0.0;

	    double _var_variableDeclarationList_0   = 0.0;

	    double _var_variableDeclaration_0   = 0.0;

	    double _var_emptyStatement_0    = 0.0;

	    double _var_expressionStatement_0 = 0.0;

	    double _var_ifStatement_0 = 0.0;

	    double _var_iterationStatement_0 = 0.0;
	    double _var_iterationStatement_1 = 0.0;
	    double _var_iterationStatement_2 = 0.0;
	    double _var_iterationStatement_3 = 0.0;
	    double _var_iterationStatement_4 = 0.0;
	    double _var_iterationStatement_5 = 0.0;

	    double _var_varModifier_0 = 0.0;
	    double _var_varModifier_1 = 0.0;
	    double _var_varModifier_2 = 0.0;

	    double _var_continueStatement_0 = 0.0;

	    double _var_breakStatement_0 = 0.0;

	    double _var_returnStatement_0 = 0.0;

	    double _var_withStatement_0 = 0.0;

	    double _var_switchStatement_0 = 0.0;

	    double _var_caseBlock_0 = 0.0;

	    double _var_caseClauses_0 = 0.0;

	    double _var_caseClause_0 = 0.0;

	    double _var_defaultClause_0 = 0.0;

	    double _var_labelledStatement_0 = 0.0;

	    double _var_throwStatement_0 = 0.0;

	    double _var_tryStatement_0 = 0.0;

	    double _var_catchProduction_0 = 0.0;

	    double _var_finallyProduction_0 = 0.0;

	    double _var_debuggerStatement_0 = 0.0;

	    double _var_functionDeclaration_0 = 0.0;

	    double _var_classDeclaration_0 = 0.0;

	    double _var_classTail_0 = 0.0;

	    double _var_classElement_0 = 0.0;

	    double _var_methodDefinition_0 = 0.0;
	    double _var_methodDefinition_1 = 0.0;
	    double _var_methodDefinition_2 = 0.0;
	    double _var_methodDefinition_3 = 0.0;

	    double _var_generatorMethod_0 = 0.0;

	    double _var_formalParameterList_0 = 0.0;
	    double _var_formalParameterList_1 = 0.0;
	    double _var_formalParameterList_2 = 0.0;
	    double _var_formalParameterList_3 = 0.0;

	    double _var_formalParameterArg_0 = 0.0;

	    double _var_lastFormalParameterArg_0 = 0.0;

	    double _var_functionBody_0 = 0.0;

	    double _var_sourceElements_0 = 0.0;

	    double _var_arrayLiteral_0 = 0.0;

	    double _var_elementList_0 = 0.0;
	    double _var_elementList_1 = 0.0;

	    double _var_lastElement_0 = 0.0;

	    double _var_objectLiteral_0 = 0.0;

	    double _var_propertyAssignment_0 = 0.0;
	    double _var_propertyAssignment_1 = 0.0;
	    double _var_propertyAssignment_2 = 0.0;
	    double _var_propertyAssignment_3 = 0.0;
	    double _var_propertyAssignment_4 = 0.0;
	    double _var_propertyAssignment_5 = 0.0;

	    double _var_propertyName_0 = 0.0;
	    double _var_propertyName_1 = 0.0;
	    double _var_propertyName_2 = 0.0;

	    double _var_arguments_0 = 0.0;

	    double _var_lastArgument_0 = 0.0;

	    double _var_expressionSequence_0 = 0.0;

	    double _var_singleExpression_0 = 0.0;
	    double _var_singleExpression_1 = 0.0;
	    double _var_singleExpression_2 = 0.0;
	    double _var_singleExpression_3 = 0.0;
	    double _var_singleExpression_4 = 0.0;
	    double _var_singleExpression_5 = 0.0;
	    double _var_singleExpression_6 = 0.0;
	    double _var_singleExpression_7 = 0.0;
	    double _var_singleExpression_8 = 0.0;
	    double _var_singleExpression_9 = 0.0;
	    double _var_singleExpression_10 = 0.0;
	    double _var_singleExpression_11 = 0.0;
	    double _var_singleExpression_12 = 0.0;
	    double _var_singleExpression_13 = 0.0;
	    double _var_singleExpression_14 = 0.0;
	    double _var_singleExpression_15 = 0.0;
	    double _var_singleExpression_16 = 0.0;
	    double _var_singleExpression_17 = 0.0;
	    double _var_singleExpression_18 = 0.0;
	    double _var_singleExpression_19 = 0.0;
	    double _var_singleExpression_20 = 0.0;
	    double _var_singleExpression_21 = 0.0;
	    double _var_singleExpression_22 = 0.0;
	    double _var_singleExpression_23 = 0.0;
	    double _var_singleExpression_24 = 0.0;
	    double _var_singleExpression_25 = 0.0;
	    double _var_singleExpression_26 = 0.0;
	    double _var_singleExpression_27 = 0.0;
	    double _var_singleExpression_28 = 0.0;
	    double _var_singleExpression_29 = 0.0;
	    double _var_singleExpression_30 = 0.0;
	    double _var_singleExpression_31 = 0.0;
	    double _var_singleExpression_32 = 0.0;
	    double _var_singleExpression_33 = 0.0;
	    double _var_singleExpression_34 = 0.0;
	    double _var_singleExpression_35 = 0.0;
	    double _var_singleExpression_36 = 0.0;
	    double _var_singleExpression_37 = 0.0;
	    double _var_singleExpression_38 = 0.0;
	    double _var_singleExpression_39 = 0.0;
	    double _var_singleExpression_40= 0.0;

	    double _var_arrowFunctionParameters_0= 0.0;
	    double _var_arrowFunctionParameters_1= 0.0;

	    double _var_arrowFunctionBody_0= 0.0;
	    double _var_arrowFunctionBody_1= 0.0;

	    double _var_assignmentOperator_0= 0.0;
	    double _var_assignmentOperator_1= 0.0;
	    double _var_assignmentOperator_2= 0.0;
	    double _var_assignmentOperator_3= 0.0;
	    double _var_assignmentOperator_4= 0.0;
	    double _var_assignmentOperator_5= 0.0;
	    double _var_assignmentOperator_6= 0.0;
	    double _var_assignmentOperator_7= 0.0;
	    double _var_assignmentOperator_8= 0.0;
	    double _var_assignmentOperator_9= 0.0;
	    double _var_assignmentOperator_10= 0.0;

	    double _var_literal_0= 0.0;
	    double _var_literal_1= 0.0;
	    double _var_literal_2= 0.0;
	    double _var_literal_3= 0.0;
	    double _var_literal_4= 0.0;
	    double _var_literal_5= 0.0;

	    double _var_numericLiteral_0= 0.0;
	    double _var_numericLiteral_1= 0.0;
	    double _var_numericLiteral_2= 0.0;
	    double _var_numericLiteral_3= 0.0;
	    double _var_numericLiteral_4= 0.0;

	    double _var_identifierName_0= 0.0;
	    double _var_identifierName_1= 0.0;

	    double _var_reservedWord_0= 0.0;
	    double _var_reservedWord_1= 0.0;
	    double _var_reservedWord_2= 0.0;

	    double _var_keyword_0= 0.0;
	    double _var_keyword_1= 0.0;
	    double _var_keyword_2= 0.0;
	    double _var_keyword_3= 0.0;
	    double _var_keyword_4= 0.0;
	    double _var_keyword_5= 0.0;
	    double _var_keyword_6= 0.0;
	    double _var_keyword_7= 0.0;
	    double _var_keyword_8= 0.0;
	    double _var_keyword_9= 0.0;
	    double _var_keyword_10= 0.0;
	    double _var_keyword_11= 0.0;
	    double _var_keyword_12= 0.0;
	    double _var_keyword_13= 0.0;
	    double _var_keyword_14= 0.0;
	    double _var_keyword_15= 0.0;
	    double _var_keyword_16= 0.0;
	    double _var_keyword_17= 0.0;
	    double _var_keyword_18= 0.0;
	    double _var_keyword_19= 0.0;
	    double _var_keyword_20= 0.0;
	    double _var_keyword_21= 0.0;
	    double _var_keyword_22= 0.0;
	    double _var_keyword_23= 0.0;
	    double _var_keyword_24= 0.0;
	    double _var_keyword_25= 0.0;
	    double _var_keyword_26= 0.0;
	    double _var_keyword_27= 0.0;
	    double _var_keyword_28= 0.0;
	    double _var_keyword_29= 0.0;
	    double _var_keyword_30= 0.0;
	    double _var_keyword_31= 0.0;
	    double _var_keyword_32= 0.0;
	    double _var_keyword_33= 0.0;
	    double _var_keyword_34= 0.0;
	    double _var_keyword_35= 0.0;
	    double _var_keyword_36= 0.0;
	    double _var_keyword_37= 0.0;
	    double _var_keyword_38= 0.0;
	    double _var_keyword_39= 0.0;
	    double _var_keyword_40= 0.0;
	    double _var_keyword_41= 0.0;

	    double _var_getter_0= 0.0;

	    double _var_setter_0= 0.0;

	    double _var_eos_0= 0.0;
	    double _var_eos_1= 0.0;
	    double _var_eos_2= 0.0;
	    double _var_eos_3= 0.0;

	    //////////////////////////////////////////
	    double  _prob_program_0         = 0.0;

	    double  _prob_sourceElement_0   = 0.0;

	    double  _prob_statement_0       = 0.0;
	    double  _prob_statement_1       = 0.0;
	    double  _prob_statement_2       = 0.0;
	    double  _prob_statement_3       = 0.0;
	    double  _prob_statement_4       = 0.0;
	    double  _prob_statement_5       = 0.0;
	    double  _prob_statement_6       = 0.0;
	    double  _prob_statement_7       = 0.0;
	    double  _prob_statement_8       = 0.0;
	    double  _prob_statement_9       = 0.0;
	    double  _prob_statement_10      = 0.0;
	    double  _prob_statement_11      = 0.0;
	    double  _prob_statement_12      = 0.0;
	    double  _prob_statement_13      = 0.0;
	    double  _prob_statement_14      = 0.0;
	    double  _prob_statement_15      = 0.0;
	    double  _prob_statement_16      = 0.0;

	    double  _prob_block_0           = 0.0;

	    double  _prob_statementList_0    = 0.0;

	    double  _prob_variableStatement_0   = 0.0;

	    double  _prob_variableDeclarationList_0 = 0.0;

	    double _prob_variableDeclaration_0  = 0.0;

	    double _prob_emptyStatement_0   = 0.0;

	    double _prob_expressionStatement_0 = 0.0;

	    double _prob_ifStatement_0 = 0.0;

	    double _prob_iterationStatement_0 = 0.0;
	    double _prob_iterationStatement_1 = 0.0;
	    double _prob_iterationStatement_2 = 0.0;
	    double _prob_iterationStatement_3 = 0.0;
	    double _prob_iterationStatement_4 = 0.0;
	    double _prob_iterationStatement_5 = 0.0;

	    double _prob_varModifier_0 = 0.0;
	    double _prob_varModifier_1 = 0.0;
	    double _prob_varModifier_2 = 0.0;

	    double _prob_continueStatement_0 = 0.0;

	    double _prob_breakStatement_0 = 0.0;

	    double _prob_returnStatement_0 = 0.0;

	    double _prob_withStatement_0 = 0.0;

	    double _prob_switchStatement_0 = 0.0;

	    double _prob_caseBlock_0 = 0.0;

	    double _prob_caseClauses_0 = 0.0;

	    double _prob_caseClause_0 = 0.0;

	    double _prob_defaultClause_0 = 0.0;

	    double _prob_labelledStatement_0 = 0.0;

	    double _prob_throwStatement_0 = 0.0;

	    double _prob_tryStatement_0 = 0.0;

	    double _prob_catchProduction_0 = 0.0;

	    double _prob_finallyProduction_0 = 0.0;

	    double _prob_debuggerStatement_0 = 0.0;

	    double _prob_functionDeclaration_0 = 0.0;

	    double _prob_classDeclaration_0 = 0.0;

	    double _prob_classTail_0 = 0.0;

	    double _prob_classElement_0 = 0.0;

	    double _prob_methodDefinition_0 = 0.0;
	    double _prob_methodDefinition_1 = 0.0;
	    double _prob_methodDefinition_2 = 0.0;
	    double _prob_methodDefinition_3 = 0.0;

	    double _prob_generatorMethod_0 = 0.0;

	    double _prob_formalParameterList_0 = 0.0;
	    double _prob_formalParameterList_1 = 0.0;
	    double _prob_formalParameterList_2 = 0.0;
	    double _prob_formalParameterList_3 = 0.0;

	    double _prob_formalParameterArg_0 = 0.0;

	    double _prob_lastFormalParameterArg_0 = 0.0;

	    double _prob_functionBody_0 = 0.0;

	    double _prob_sourceElements_0 = 0.0;

	    double _prob_arrayLiteral_0 = 0.0;

	    double _prob_elementList_0 = 0.0;
	    double _prob_elementList_1 = 0.0;

	    double _prob_lastElement_0 = 0.0;

	    double _prob_objectLiteral_0 = 0.0;

	    double _prob_propertyAssignment_0 = 0.0;
	    double _prob_propertyAssignment_1 = 0.0;
	    double _prob_propertyAssignment_2 = 0.0;
	    double _prob_propertyAssignment_3 = 0.0;
	    double _prob_propertyAssignment_4 = 0.0;
	    double _prob_propertyAssignment_5 = 0.0;

	    double _prob_propertyName_0 = 0.0;
	    double _prob_propertyName_1 = 0.0;
	    double _prob_propertyName_2 = 0.0;

	    double _prob_arguments_0 = 0.0;

	    double _prob_lastArgument_0 = 0.0;

	    double _prob_expressionSequence_0 = 0.0;

	    double _prob_singleExpression_0 = 0.0;
	    double _prob_singleExpression_1 = 0.0;
	    double _prob_singleExpression_2 = 0.0;
	    double _prob_singleExpression_3 = 0.0;
	    double _prob_singleExpression_4 = 0.0;
	    double _prob_singleExpression_5 = 0.0;
	    double _prob_singleExpression_6 = 0.0;
	    double _prob_singleExpression_7 = 0.0;
	    double _prob_singleExpression_8 = 0.0;
	    double _prob_singleExpression_9 = 0.0;
	    double _prob_singleExpression_10 = 0.0;
	    double _prob_singleExpression_11 = 0.0;
	    double _prob_singleExpression_12 = 0.0;
	    double _prob_singleExpression_13 = 0.0;
	    double _prob_singleExpression_14 = 0.0;
	    double _prob_singleExpression_15 = 0.0;
	    double _prob_singleExpression_16 = 0.0;
	    double _prob_singleExpression_17 = 0.0;
	    double _prob_singleExpression_18 = 0.0;
	    double _prob_singleExpression_19 = 0.0;
	    double _prob_singleExpression_20 = 0.0;
	    double _prob_singleExpression_21 = 0.0;
	    double _prob_singleExpression_22 = 0.0;
	    double _prob_singleExpression_23 = 0.0;
	    double _prob_singleExpression_24 = 0.0;
	    double _prob_singleExpression_25 = 0.0;
	    double _prob_singleExpression_26 = 0.0;
	    double _prob_singleExpression_27 = 0.0;
	    double _prob_singleExpression_28 = 0.0;
	    double _prob_singleExpression_29 = 0.0;
	    double _prob_singleExpression_30 = 0.0;
	    double _prob_singleExpression_31 = 0.0;
	    double _prob_singleExpression_32 = 0.0;
	    double _prob_singleExpression_33 = 0.0;
	    double _prob_singleExpression_34 = 0.0;
	    double _prob_singleExpression_35 = 0.0;
	    double _prob_singleExpression_36 = 0.0;
	    double _prob_singleExpression_37 = 0.0;
	    double _prob_singleExpression_38 = 0.0;
	    double _prob_singleExpression_39 = 0.0;
	    double _prob_singleExpression_40= 0.0;

	    double _prob_arrowFunctionParameters_0= 0.0;
	    double _prob_arrowFunctionParameters_1= 0.0;

	    double _prob_arrowFunctionBody_0= 0.0;
	    double _prob_arrowFunctionBody_1= 0.0;

	    double _prob_assignmentOperator_0= 0.0;
	    double _prob_assignmentOperator_1= 0.0;
	    double _prob_assignmentOperator_2= 0.0;
	    double _prob_assignmentOperator_3= 0.0;
	    double _prob_assignmentOperator_4= 0.0;
	    double _prob_assignmentOperator_5= 0.0;
	    double _prob_assignmentOperator_6= 0.0;
	    double _prob_assignmentOperator_7= 0.0;
	    double _prob_assignmentOperator_8= 0.0;
	    double _prob_assignmentOperator_9= 0.0;
	    double _prob_assignmentOperator_10= 0.0;

	    double _prob_literal_0= 0.0;
	    double _prob_literal_1= 0.0;
	    double _prob_literal_2= 0.0;
	    double _prob_literal_3= 0.0;
	    double _prob_literal_4= 0.0;
	    double _prob_literal_5= 0.0;

	    double _prob_numericLiteral_0= 0.0;
	    double _prob_numericLiteral_1= 0.0;
	    double _prob_numericLiteral_2= 0.0;
	    double _prob_numericLiteral_3= 0.0;
	    double _prob_numericLiteral_4= 0.0;

	    double _prob_identifierName_0= 0.0;
	    double _prob_identifierName_1= 0.0;

	    double _prob_reservedWord_0= 0.0;
	    double _prob_reservedWord_1= 0.0;
	    double _prob_reservedWord_2= 0.0;

	    double _prob_keyword_0= 0.0;
	    double _prob_keyword_1= 0.0;
	    double _prob_keyword_2= 0.0;
	    double _prob_keyword_3= 0.0;
	    double _prob_keyword_4= 0.0;
	    double _prob_keyword_5= 0.0;
	    double _prob_keyword_6= 0.0;
	    double _prob_keyword_7= 0.0;
	    double _prob_keyword_8= 0.0;
	    double _prob_keyword_9= 0.0;
	    double _prob_keyword_10= 0.0;
	    double _prob_keyword_11= 0.0;
	    double _prob_keyword_12= 0.0;
	    double _prob_keyword_13= 0.0;
	    double _prob_keyword_14= 0.0;
	    double _prob_keyword_15= 0.0;
	    double _prob_keyword_16= 0.0;
	    double _prob_keyword_17= 0.0;
	    double _prob_keyword_18= 0.0;
	    double _prob_keyword_19= 0.0;
	    double _prob_keyword_20= 0.0;
	    double _prob_keyword_21= 0.0;
	    double _prob_keyword_22= 0.0;
	    double _prob_keyword_23= 0.0;
	    double _prob_keyword_24= 0.0;
	    double _prob_keyword_25= 0.0;
	    double _prob_keyword_26= 0.0;
	    double _prob_keyword_27= 0.0;
	    double _prob_keyword_28= 0.0;
	    double _prob_keyword_29= 0.0;
	    double _prob_keyword_30= 0.0;
	    double _prob_keyword_31= 0.0;
	    double _prob_keyword_32= 0.0;
	    double _prob_keyword_33= 0.0;
	    double _prob_keyword_34= 0.0;
	    double _prob_keyword_35= 0.0;
	    double _prob_keyword_36= 0.0;
	    double _prob_keyword_37= 0.0;
	    double _prob_keyword_38= 0.0;
	    double _prob_keyword_39= 0.0;
	    double _prob_keyword_40= 0.0;
	    double _prob_keyword_41= 0.0;

	    double _prob_getter_0= 0.0;

	    double _prob_setter_0= 0.0;

	    double _prob_eos_0= 0.0;
	    double _prob_eos_1= 0.0;
	    double _prob_eos_2= 0.0;
	    double _prob_eos_3= 0.0;

	public JavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Main_dummy_rule_hope_for_no_collisionsContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Main_dummy_rule_hope_for_no_collisionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_dummy_rule_hope_for_no_collisions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMain_dummy_rule_hope_for_no_collisions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMain_dummy_rule_hope_for_no_collisions(this);
		}
	}

	public final Main_dummy_rule_hope_for_no_collisionsContext main_dummy_rule_hope_for_no_collisions() throws RecognitionException {
		Main_dummy_rule_hope_for_no_collisionsContext _localctx = new Main_dummy_rule_hope_for_no_collisionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main_dummy_rule_hope_for_no_collisions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			program();

			    double total_program = _var_program_0;
			    _prob_program_0 = total_program != 0 ? _var_program_0 / total_program : 1.0/1;

			    double total_sourceElement = _var_sourceElement_0;
			    _prob_sourceElement_0 = total_sourceElement != 0 ? _var_sourceElement_0 / total_sourceElement : 1.0/1;

			    double total_statement = _var_statement_0 + _var_statement_1 + _var_statement_2 + _var_statement_3 + _var_statement_4 + _var_statement_5 + _var_statement_6 + _var_statement_7 + _var_statement_8 + _var_statement_9 + _var_statement_10 + _var_statement_11 + _var_statement_12 + _var_statement_13 + _var_statement_14 + _var_statement_15 + _var_statement_16;
			    _prob_statement_0 = total_statement != 0 ? _var_statement_0 / total_statement : 1.0/17;
			    _prob_statement_1 = total_statement != 0 ? _var_statement_1 / total_statement : 1.0/17;
			    _prob_statement_2 = total_statement != 0 ? _var_statement_2 / total_statement : 1.0/17;
			    _prob_statement_3 = total_statement != 0 ? _var_statement_3 / total_statement : 1.0/17;
			    _prob_statement_4 = total_statement != 0 ? _var_statement_4 / total_statement : 1.0/17;
			    _prob_statement_5 = total_statement != 0 ? _var_statement_5 / total_statement : 1.0/17;
			    _prob_statement_6 = total_statement != 0 ? _var_statement_6 / total_statement : 1.0/17;
			    _prob_statement_7 = total_statement != 0 ? _var_statement_7 / total_statement : 1.0/17;
			    _prob_statement_8 = total_statement != 0 ? _var_statement_8 / total_statement : 1.0/17;
			    _prob_statement_9 = total_statement != 0 ? _var_statement_9 / total_statement : 1.0/17;
			    _prob_statement_10 = total_statement != 0 ? _var_statement_10 / total_statement : 1.0/17;
			    _prob_statement_11 = total_statement != 0 ? _var_statement_11 / total_statement : 1.0/17;
			    _prob_statement_12 = total_statement != 0 ? _var_statement_12 / total_statement : 1.0/17;
			    _prob_statement_13 = total_statement != 0 ? _var_statement_13 / total_statement : 1.0/17;
			    _prob_statement_14 = total_statement != 0 ? _var_statement_14 / total_statement : 1.0/17;
			    _prob_statement_15 = total_statement != 0 ? _var_statement_15 / total_statement : 1.0/17;
			    _prob_statement_16 = total_statement != 0 ? _var_statement_16 / total_statement : 1.0/17;

			    double total_block = _var_block_0;
			    _prob_block_0 = total_block != 0 ? _var_block_0 / total_block : 1.0/1;

			    double total_statementList = _var_statementList_0;
			    _prob_statementList_0 = total_statementList != 0 ? _var_statementList_0 / total_statementList : 1.0/1;

			    double total_variableStatement = _var_variableStatement_0;
			    _prob_variableStatement_0 = total_variableStatement != 0 ? _var_variableStatement_0 / total_variableStatement : 1.0/1;

			    double total_variableDeclarationList = _var_variableDeclarationList_0;
			    _prob_variableDeclarationList_0 = total_variableDeclarationList != 0 ? _var_variableDeclarationList_0 / total_variableDeclarationList : 1.0/1;

			    double total_variableDeclaration = _var_variableDeclaration_0;
			    _prob_variableDeclaration_0 = total_variableDeclaration != 0 ? _var_variableDeclaration_0 / total_variableDeclaration : 1.0/1;

			    double total_emptyStatement = _var_emptyStatement_0;
			    _prob_emptyStatement_0 = total_emptyStatement != 0 ? _var_emptyStatement_0 / total_emptyStatement : 1.0/1;

			    double total_expressionStatement = _var_expressionStatement_0;
			    _prob_expressionStatement_0 = total_expressionStatement != 0 ? _var_expressionStatement_0 / total_expressionStatement : 1.0/1;

			    double total_ifStatement = _var_ifStatement_0;
			    _prob_ifStatement_0 = total_ifStatement != 0 ? _var_ifStatement_0 / total_ifStatement : 1.0/1;

			    double total_iterationStatement = _var_iterationStatement_0 + _var_iterationStatement_1 + _var_iterationStatement_2 + _var_iterationStatement_3 + _var_iterationStatement_4 + _var_iterationStatement_5;
			    _prob_iterationStatement_0 = total_iterationStatement != 0 ? _var_iterationStatement_0 / total_iterationStatement : 1.0/6;
			    _prob_iterationStatement_1 = total_iterationStatement != 0 ? _var_iterationStatement_1 / total_iterationStatement : 1.0/6;
			    _prob_iterationStatement_2 = total_iterationStatement != 0 ? _var_iterationStatement_2 / total_iterationStatement : 1.0/6;
			    _prob_iterationStatement_3 = total_iterationStatement != 0 ? _var_iterationStatement_3 / total_iterationStatement : 1.0/6;
			    _prob_iterationStatement_4 = total_iterationStatement != 0 ? _var_iterationStatement_4 / total_iterationStatement : 1.0/6;
			    _prob_iterationStatement_5 = total_iterationStatement != 0 ? _var_iterationStatement_5 / total_iterationStatement : 1.0/6;

			    double total_varModifier = _var_varModifier_0 + _var_varModifier_1 + _var_varModifier_2;
			    _prob_varModifier_0 = total_varModifier != 0 ? _var_varModifier_0 / total_varModifier : 1.0/3;
			    _prob_varModifier_1 = total_varModifier != 0 ? _var_varModifier_1 / total_varModifier : 1.0/3;
			    _prob_varModifier_2 = total_varModifier != 0 ? _var_varModifier_2 / total_varModifier : 1.0/3;

			    double total_continueStatement= _var_continueStatement_0;
			    _prob_continueStatement_0 = total_continueStatement != 0 ? _var_continueStatement_0 / total_continueStatement : 1.0/1;

			    double total_breakStatement= _var_breakStatement_0;
			    _prob_breakStatement_0 = total_breakStatement != 0 ? _var_breakStatement_0 / total_breakStatement : 1.0/1;

			    double total_returnStatement= _var_returnStatement_0;
			    _prob_returnStatement_0 = total_returnStatement != 0 ? _var_returnStatement_0 / total_returnStatement : 1.0/1;

			    double total_withStatement= _var_withStatement_0;
			    _prob_withStatement_0 = total_withStatement != 0 ? _var_withStatement_0 / total_withStatement : 1.0/1;

			    double total_switchStatement= _var_switchStatement_0;
			    _prob_switchStatement_0 = total_switchStatement != 0 ? _var_switchStatement_0 / total_switchStatement : 1.0/1;

			    double total_caseBlock= _var_caseBlock_0;
			    _prob_caseBlock_0 = total_caseBlock != 0 ? _var_caseBlock_0 / total_caseBlock : 1.0/1;

			    double total_caseClauses= _var_caseClauses_0;
			    _prob_caseClauses_0 = total_caseClauses != 0 ? _var_caseClauses_0 / total_caseClauses : 1.0/1;

			    double total_caseClause= _var_caseClause_0;
			    _prob_caseClause_0 = total_caseClause != 0 ? _var_caseClause_0 / total_caseClause : 1.0/1;

			    double total_defaultClause= _var_defaultClause_0;
			    _prob_defaultClause_0 = total_defaultClause != 0 ? _var_defaultClause_0 / total_defaultClause : 1.0/1;

			    double total_labelledStatement = _var_labelledStatement_0;
			    _prob_labelledStatement_0 = total_labelledStatement != 0 ? _var_labelledStatement_0 / total_labelledStatement : 1.0/1;

			    double total_throwStatement= _var_throwStatement_0;
			    _prob_throwStatement_0 = total_throwStatement != 0 ? _var_throwStatement_0 / total_throwStatement : 1.0/1;

			    double total_tryStatement= _var_tryStatement_0;
			    _prob_tryStatement_0 = total_tryStatement != 0 ? _var_tryStatement_0 / total_tryStatement : 1.0/1;

			    double total_catchProduction = _var_catchProduction_0;
			    _prob_catchProduction_0 = total_catchProduction != 0 ? _var_catchProduction_0 / total_catchProduction : 1.0/1;

			    double total_finallyProduction = _var_finallyProduction_0;
			    _prob_finallyProduction_0 = total_finallyProduction != 0 ? _var_finallyProduction_0 / total_finallyProduction : 1.0/1;

			    double total_debuggerStatement = _var_debuggerStatement_0;
			    _prob_debuggerStatement_0 = total_debuggerStatement != 0 ? _var_debuggerStatement_0 / total_debuggerStatement : 1.0/1;

			    double total_functionDeclaration= _var_functionDeclaration_0;
			    _prob_functionDeclaration_0 = total_functionDeclaration != 0 ? _var_functionDeclaration_0 / total_functionDeclaration : 1.0/1;

			    double total_classDeclaration= _var_classDeclaration_0;
			    _prob_classDeclaration_0 = total_classDeclaration != 0 ? _var_classDeclaration_0 / total_classDeclaration : 1.0/1;

			    double total_classTail= _var_classTail_0;
			    _prob_classTail_0 = total_classTail != 0 ? _var_classTail_0 / total_classTail : 1.0/1;

			    double total_classElement = _var_classElement_0;
			    _prob_classElement_0 = total_classElement != 0 ? _var_classElement_0 / total_classElement : 1.0/1;

			    double total_methodDefinition= _var_methodDefinition_0 + _var_methodDefinition_1 + _var_methodDefinition_2 + _var_methodDefinition_3;
			    _prob_methodDefinition_0 = total_methodDefinition != 0 ? _var_methodDefinition_0 / total_methodDefinition : 1.0/4;
			    _prob_methodDefinition_1 = total_methodDefinition != 0 ? _var_methodDefinition_1 / total_methodDefinition : 1.0/4;
			    _prob_methodDefinition_2 = total_methodDefinition != 0 ? _var_methodDefinition_2 / total_methodDefinition : 1.0/4;
			    _prob_methodDefinition_3 = total_methodDefinition != 0 ? _var_methodDefinition_3 / total_methodDefinition : 1.0/4;

			    double total_generatorMethod = _var_generatorMethod_0;
			    _prob_generatorMethod_0 = total_generatorMethod != 0 ? _var_generatorMethod_0 / total_generatorMethod : 1.0/1;

			    double total_formalParameterList= _var_formalParameterList_0 + _var_formalParameterList_1 + _var_formalParameterList_2 + _var_formalParameterList_3;
			    _prob_formalParameterList_0 = total_formalParameterList != 0 ? _var_formalParameterList_0 / total_formalParameterList : 1.0/4;
			    _prob_formalParameterList_1 = total_formalParameterList != 0 ? _var_formalParameterList_1 / total_formalParameterList : 1.0/4;
			    _prob_formalParameterList_2 = total_formalParameterList != 0 ? _var_formalParameterList_2 / total_formalParameterList : 1.0/4;
			    _prob_formalParameterList_3 = total_formalParameterList != 0 ? _var_formalParameterList_3 / total_formalParameterList : 1.0/4;

			    double total_formalParameterArg= _var_formalParameterArg_0;
			    _prob_formalParameterArg_0 = total_formalParameterArg != 0 ? _var_formalParameterArg_0 / total_formalParameterArg : 1.0/1;

			    double total_lastFormalParameterArg= _var_lastFormalParameterArg_0;
			    _prob_lastFormalParameterArg_0 = total_lastFormalParameterArg != 0 ? _var_lastFormalParameterArg_0 / total_lastFormalParameterArg : 1.0/1;

			    double total_functionBody = _var_functionBody_0;
			    _prob_functionBody_0 = total_functionBody != 0 ? _var_functionBody_0 / total_functionBody : 1.0/1;

			    double total_sourceElements= _var_sourceElements_0;
			    _prob_sourceElements_0 = total_sourceElements != 0 ? _var_sourceElements_0 / total_sourceElements : 1.0/1;

			    double total_arrayLiteral= _var_arrayLiteral_0;
			    _prob_arrayLiteral_0 = total_arrayLiteral != 0 ? _var_arrayLiteral_0 / total_arrayLiteral : 1.0/1;

			    double total_elementList= _var_elementList_0 + _var_elementList_1;
			    _prob_elementList_0 = total_elementList != 0 ? _var_elementList_0 / total_elementList : 1.0/2;
			    _prob_elementList_1 = total_elementList != 0 ? _var_elementList_1 / total_elementList : 1.0/2;

			    double total_lastElement = _var_lastElement_0;
			    _prob_lastElement_0 = total_lastElement != 0 ? _var_lastElement_0 / total_lastElement : 1.0/1;

			    double total_objectLiteral = _var_objectLiteral_0;
			    _prob_objectLiteral_0 = total_objectLiteral != 0 ? _var_objectLiteral_0 / total_objectLiteral : 1.0/1;

			    double total_propertyAssignment = _var_propertyAssignment_0 + _var_propertyAssignment_1 + _var_propertyAssignment_2 + _var_propertyAssignment_3 + _var_propertyAssignment_4 + _var_propertyAssignment_5;
			    _prob_propertyAssignment_0 = total_propertyAssignment != 0 ? _var_propertyAssignment_0 / total_propertyAssignment : 1.0/6;
			    _prob_propertyAssignment_1 = total_propertyAssignment != 0 ? _var_propertyAssignment_1 / total_propertyAssignment : 1.0/6;
			    _prob_propertyAssignment_2 = total_propertyAssignment != 0 ? _var_propertyAssignment_2 / total_propertyAssignment : 1.0/6;
			    _prob_propertyAssignment_3 = total_propertyAssignment != 0 ? _var_propertyAssignment_3 / total_propertyAssignment : 1.0/6;
			    _prob_propertyAssignment_4 = total_propertyAssignment != 0 ? _var_propertyAssignment_4 / total_propertyAssignment : 1.0/6;
			    _prob_propertyAssignment_5 = total_propertyAssignment != 0 ? _var_propertyAssignment_5 / total_propertyAssignment : 1.0/6;

			    double total_propertyName = _var_propertyName_0 + _var_propertyName_1 + _var_propertyName_2;
			    _prob_propertyName_0 = total_propertyName != 0 ? _var_propertyName_0 / total_propertyName : 1.0/3;
			    _prob_propertyName_1 = total_propertyName != 0 ? _var_propertyName_1 / total_propertyName : 1.0/3;
			    _prob_propertyName_2 = total_propertyName != 0 ? _var_propertyName_2 / total_propertyName : 1.0/3;

			    double total_arguments= _var_arguments_0;
			    _prob_arguments_0 = total_arguments != 0 ? _var_arguments_0 / total_arguments : 1.0/1;

			    double total_lastArgument = _var_lastArgument_0;
			    _prob_lastArgument_0 = total_lastArgument != 0 ? _var_lastArgument_0 / total_lastArgument : 1.0/1;

			    double total_expressionSequence = _var_expressionSequence_0;
			    _prob_expressionSequence_0 = total_expressionSequence != 0 ? _var_expressionSequence_0 / total_expressionSequence : 1.0/1;

			    double total_singleExpression = _var_singleExpression_0 + _var_singleExpression_1 + _var_singleExpression_2 + _var_singleExpression_3 + _var_singleExpression_4 + _var_singleExpression_5 + _var_singleExpression_6 + _var_singleExpression_7 + _var_singleExpression_8 + _var_singleExpression_9 + _var_singleExpression_10 + _var_singleExpression_11 + _var_singleExpression_12 + _var_singleExpression_13 + _var_singleExpression_14 + _var_singleExpression_15 + _var_singleExpression_16 + _var_singleExpression_17 + _var_singleExpression_18 + _var_singleExpression_19 + _var_singleExpression_20 + _var_singleExpression_21 + _var_singleExpression_22 + _var_singleExpression_23 + _var_singleExpression_24 + _var_singleExpression_25 + _var_singleExpression_26 + _var_singleExpression_27 + _var_singleExpression_28 + _var_singleExpression_29 + _var_singleExpression_30 + _var_singleExpression_31 + _var_singleExpression_32 + _var_singleExpression_33 + _var_singleExpression_34 + _var_singleExpression_35 + _var_singleExpression_36 + _var_singleExpression_37 + _var_singleExpression_38 + _var_singleExpression_39 + _var_singleExpression_40;
			    _prob_singleExpression_0 = total_singleExpression != 0 ? _var_singleExpression_0 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_1 = total_singleExpression != 0 ? _var_singleExpression_1 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_2 = total_singleExpression != 0 ? _var_singleExpression_2 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_3 = total_singleExpression != 0 ? _var_singleExpression_3 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_4 = total_singleExpression != 0 ? _var_singleExpression_4 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_5 = total_singleExpression != 0 ? _var_singleExpression_5 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_6 = total_singleExpression != 0 ? _var_singleExpression_6 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_7 = total_singleExpression != 0 ? _var_singleExpression_7 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_8 = total_singleExpression != 0 ? _var_singleExpression_8 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_9 = total_singleExpression != 0 ? _var_singleExpression_9 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_10 = total_singleExpression != 0 ? _var_singleExpression_10 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_11 = total_singleExpression != 0 ? _var_singleExpression_11 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_12 = total_singleExpression != 0 ? _var_singleExpression_12 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_13 = total_singleExpression != 0 ? _var_singleExpression_13 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_14 = total_singleExpression != 0 ? _var_singleExpression_14 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_15 = total_singleExpression != 0 ? _var_singleExpression_15 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_16 = total_singleExpression != 0 ? _var_singleExpression_16 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_17 = total_singleExpression != 0 ? _var_singleExpression_17 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_18 = total_singleExpression != 0 ? _var_singleExpression_18 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_19 = total_singleExpression != 0 ? _var_singleExpression_19 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_20 = total_singleExpression != 0 ? _var_singleExpression_20 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_21 = total_singleExpression != 0 ? _var_singleExpression_21 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_22 = total_singleExpression != 0 ? _var_singleExpression_22 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_23 = total_singleExpression != 0 ? _var_singleExpression_23 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_24 = total_singleExpression != 0 ? _var_singleExpression_24 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_25 = total_singleExpression != 0 ? _var_singleExpression_25 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_26 = total_singleExpression != 0 ? _var_singleExpression_26 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_27 = total_singleExpression != 0 ? _var_singleExpression_27 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_28 = total_singleExpression != 0 ? _var_singleExpression_28 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_29 = total_singleExpression != 0 ? _var_singleExpression_29 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_30 = total_singleExpression != 0 ? _var_singleExpression_30 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_31 = total_singleExpression != 0 ? _var_singleExpression_31 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_32 = total_singleExpression != 0 ? _var_singleExpression_32 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_33 = total_singleExpression != 0 ? _var_singleExpression_33 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_34 = total_singleExpression != 0 ? _var_singleExpression_34 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_35 = total_singleExpression != 0 ? _var_singleExpression_35 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_36 = total_singleExpression != 0 ? _var_singleExpression_36 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_37 = total_singleExpression != 0 ? _var_singleExpression_37 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_38 = total_singleExpression != 0 ? _var_singleExpression_38 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_39 = total_singleExpression != 0 ? _var_singleExpression_39 / total_singleExpression : 1.0/41;
			    _prob_singleExpression_40 = total_singleExpression != 0 ? _var_singleExpression_40 / total_singleExpression : 1.0/41;

			    double total_arrowFunctionParameters = _var_arrowFunctionParameters_0 + _var_arrowFunctionParameters_1;
			    _prob_arrowFunctionParameters_0= total_arrowFunctionParameters != 0 ? _var_arrowFunctionParameters_0 / total_arrowFunctionParameters : 1.0/2;
			    _prob_arrowFunctionParameters_1= total_arrowFunctionParameters != 0 ? _var_arrowFunctionParameters_1 / total_arrowFunctionParameters : 1.0/2;

			    double total_arrowFunctionBody = _var_arrowFunctionBody_0 + _var_arrowFunctionBody_1;
			    _prob_arrowFunctionBody_0= total_arrowFunctionBody != 0 ? _var_arrowFunctionBody_0 / total_arrowFunctionBody : 1.0/2;
			    _prob_arrowFunctionBody_1= total_arrowFunctionBody != 0 ? _var_arrowFunctionBody_1 / total_arrowFunctionBody : 1.0/2;

			    double total_assignmentOperator= _var_assignmentOperator_0 + _var_assignmentOperator_1 + _var_assignmentOperator_2 + _var_assignmentOperator_3 + _var_assignmentOperator_4 + _var_assignmentOperator_5 + _var_assignmentOperator_6 + _var_assignmentOperator_7 + _var_assignmentOperator_8 + _var_assignmentOperator_9 + _var_assignmentOperator_10;
			    _prob_assignmentOperator_0= total_assignmentOperator != 0 ? _var_assignmentOperator_0 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_1= total_assignmentOperator != 0 ? _var_assignmentOperator_1 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_2= total_assignmentOperator != 0 ? _var_assignmentOperator_2 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_3= total_assignmentOperator != 0 ? _var_assignmentOperator_3 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_4= total_assignmentOperator != 0 ? _var_assignmentOperator_4 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_5= total_assignmentOperator != 0 ? _var_assignmentOperator_5 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_6= total_assignmentOperator != 0 ? _var_assignmentOperator_6 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_7= total_assignmentOperator != 0 ? _var_assignmentOperator_7 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_8= total_assignmentOperator != 0 ? _var_assignmentOperator_8 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_9= total_assignmentOperator != 0 ? _var_assignmentOperator_9 / total_assignmentOperator : 1.0/11;
			    _prob_assignmentOperator_10= total_assignmentOperator != 0 ? _var_assignmentOperator_10 / total_assignmentOperator : 1.0/11;

			    double total_literal = _var_literal_0 + _var_literal_1 + _var_literal_2 + _var_literal_3 + _var_literal_4 + _var_literal_5;
			    _prob_literal_0= total_literal != 0 ? _var_literal_0 / total_literal : 1.0/6;
			    _prob_literal_1= total_literal != 0 ? _var_literal_1 / total_literal : 1.0/6;
			    _prob_literal_2= total_literal != 0 ? _var_literal_2 / total_literal : 1.0/6;
			    _prob_literal_3= total_literal != 0 ? _var_literal_3 / total_literal : 1.0/6;
			    _prob_literal_4= total_literal != 0 ? _var_literal_4 / total_literal : 1.0/6;
			    _prob_literal_5= total_literal != 0 ? _var_literal_5 / total_literal : 1.0/6;

			    double total_numericLiteral= _var_numericLiteral_0 + _var_numericLiteral_1 + _var_numericLiteral_2 + _var_numericLiteral_3 + _var_numericLiteral_4;
			    _prob_numericLiteral_0= total_numericLiteral != 0 ? _var_numericLiteral_0 / total_numericLiteral : 1.0/5;
			    _prob_numericLiteral_1= total_numericLiteral != 0 ? _var_numericLiteral_1 / total_numericLiteral : 1.0/5;
			    _prob_numericLiteral_2= total_numericLiteral != 0 ? _var_numericLiteral_2 / total_numericLiteral : 1.0/5;
			    _prob_numericLiteral_3= total_numericLiteral != 0 ? _var_numericLiteral_3 / total_numericLiteral : 1.0/5;
			    _prob_numericLiteral_4= total_numericLiteral != 0 ? _var_numericLiteral_4 / total_numericLiteral : 1.0/5;

			    double total_identifierName = _var_identifierName_0 + _var_identifierName_1;
			    _prob_identifierName_0= total_identifierName != 0 ? _var_identifierName_0 / total_identifierName : 1.0/2;
			    _prob_identifierName_1= total_identifierName != 0 ? _var_identifierName_1 / total_identifierName : 1.0/2;

			    double total_reservedWord = _var_reservedWord_0 + _var_reservedWord_1 + _var_reservedWord_2;
			    _prob_reservedWord_0= total_reservedWord != 0 ? _var_reservedWord_0 / total_reservedWord : 1.0/3;
			    _prob_reservedWord_1= total_reservedWord != 0 ? _var_reservedWord_1 / total_reservedWord : 1.0/3;
			    _prob_reservedWord_2= total_reservedWord != 0 ? _var_reservedWord_2 / total_reservedWord : 1.0/3;

			    double total_keyword= _var_keyword_0 + _var_keyword_1 + _var_keyword_2 + _var_keyword_3 + _var_keyword_4 + _var_keyword_5 + _var_keyword_6 + _var_keyword_7 + _var_keyword_8 + _var_keyword_9 + _var_keyword_10 + _var_keyword_11 + _var_keyword_12 + _var_keyword_13 + _var_keyword_14 + _var_keyword_15 + _var_keyword_16 + _var_keyword_17 + _var_keyword_18 + _var_keyword_19 + _var_keyword_20 + _var_keyword_21 + _var_keyword_22 + _var_keyword_23 + _var_keyword_24 + _var_keyword_25 + _var_keyword_26 + _var_keyword_27 + _var_keyword_28 + _var_keyword_29 + _var_keyword_30 + _var_keyword_31 + _var_keyword_32 + _var_keyword_33 + _var_keyword_34 + _var_keyword_35 + _var_keyword_36 + _var_keyword_37 + _var_keyword_38 + _var_keyword_39 + _var_keyword_40 + _var_keyword_41;
			    _prob_keyword_0= total_keyword != 0 ? _var_keyword_0 / total_keyword : 1.0/42;
			    _prob_keyword_1= total_keyword != 0 ? _var_keyword_1 / total_keyword : 1.0/42;
			    _prob_keyword_2= total_keyword != 0 ? _var_keyword_2 / total_keyword : 1.0/42;
			    _prob_keyword_3= total_keyword != 0 ? _var_keyword_3 / total_keyword : 1.0/42;
			    _prob_keyword_4= total_keyword != 0 ? _var_keyword_4 / total_keyword : 1.0/42;
			    _prob_keyword_5= total_keyword != 0 ? _var_keyword_5 / total_keyword : 1.0/42;
			    _prob_keyword_6= total_keyword != 0 ? _var_keyword_6 / total_keyword : 1.0/42;
			    _prob_keyword_7= total_keyword != 0 ? _var_keyword_7 / total_keyword : 1.0/42;
			    _prob_keyword_8= total_keyword != 0 ? _var_keyword_8 / total_keyword : 1.0/42;
			    _prob_keyword_9= total_keyword != 0 ? _var_keyword_9 / total_keyword : 1.0/42;
			    _prob_keyword_10= total_keyword != 0 ? _var_keyword_10 / total_keyword : 1.0/42;
			    _prob_keyword_11= total_keyword != 0 ? _var_keyword_11 / total_keyword : 1.0/42;
			    _prob_keyword_12= total_keyword != 0 ? _var_keyword_12 / total_keyword : 1.0/42;
			    _prob_keyword_13= total_keyword != 0 ? _var_keyword_13 / total_keyword : 1.0/42;
			    _prob_keyword_14= total_keyword != 0 ? _var_keyword_14 / total_keyword : 1.0/42;
			    _prob_keyword_15= total_keyword != 0 ? _var_keyword_15 / total_keyword : 1.0/42;
			    _prob_keyword_16= total_keyword != 0 ? _var_keyword_16 / total_keyword : 1.0/42;
			    _prob_keyword_17= total_keyword != 0 ? _var_keyword_17 / total_keyword : 1.0/42;
			    _prob_keyword_18= total_keyword != 0 ? _var_keyword_18 / total_keyword : 1.0/42;
			    _prob_keyword_19= total_keyword != 0 ? _var_keyword_19 / total_keyword : 1.0/42;
			    _prob_keyword_20= total_keyword != 0 ? _var_keyword_20 / total_keyword : 1.0/42;
			    _prob_keyword_21= total_keyword != 0 ? _var_keyword_21 / total_keyword : 1.0/42;
			    _prob_keyword_22= total_keyword != 0 ? _var_keyword_22 / total_keyword : 1.0/42;
			    _prob_keyword_23= total_keyword != 0 ? _var_keyword_23 / total_keyword : 1.0/42;
			    _prob_keyword_24= total_keyword != 0 ? _var_keyword_24 / total_keyword : 1.0/42;
			    _prob_keyword_25= total_keyword != 0 ? _var_keyword_25 / total_keyword : 1.0/42;
			    _prob_keyword_26= total_keyword != 0 ? _var_keyword_26 / total_keyword : 1.0/42;
			    _prob_keyword_27= total_keyword != 0 ? _var_keyword_27 / total_keyword : 1.0/42;
			    _prob_keyword_28= total_keyword != 0 ? _var_keyword_28 / total_keyword : 1.0/42;
			    _prob_keyword_29= total_keyword != 0 ? _var_keyword_29 / total_keyword : 1.0/42;
			    _prob_keyword_30= total_keyword != 0 ? _var_keyword_30 / total_keyword : 1.0/42;
			    _prob_keyword_31= total_keyword != 0 ? _var_keyword_31 / total_keyword : 1.0/42;
			    _prob_keyword_32= total_keyword != 0 ? _var_keyword_32 / total_keyword : 1.0/42;
			    _prob_keyword_33= total_keyword != 0 ? _var_keyword_33 / total_keyword : 1.0/42;
			    _prob_keyword_34= total_keyword != 0 ? _var_keyword_34 / total_keyword : 1.0/42;
			    _prob_keyword_35= total_keyword != 0 ? _var_keyword_35 / total_keyword : 1.0/42;
			    _prob_keyword_36= total_keyword != 0 ? _var_keyword_36 / total_keyword : 1.0/42;
			    _prob_keyword_37= total_keyword != 0 ? _var_keyword_37 / total_keyword : 1.0/42;
			    _prob_keyword_38= total_keyword != 0 ? _var_keyword_38 / total_keyword : 1.0/42;
			    _prob_keyword_39= total_keyword != 0 ? _var_keyword_39 / total_keyword : 1.0/42;
			    _prob_keyword_40= total_keyword != 0 ? _var_keyword_40 / total_keyword : 1.0/42;
			    _prob_keyword_41= total_keyword != 0 ? _var_keyword_41 / total_keyword : 1.0/42;

			    double total_getter = _var_getter_0;
			    _prob_getter_0= total_getter != 0 ? _var_getter_0 / total_getter : 1.0/1;

			    double total_setter= _var_setter_0;
			    _prob_setter_0= total_setter != 0 ? _var_setter_0 / total_setter : 1.0/1;

			    double total_eos= _var_eos_0 + _var_eos_1 + _var_eos_2 + _var_eos_3;
			    _prob_eos_0= total_eos != 0 ? _var_eos_0 / total_eos : 1.0/4;
			    _prob_eos_1= total_eos != 0 ? _var_eos_1 / total_eos : 1.0/4;
			    _prob_eos_2= total_eos != 0 ? _var_eos_2 / total_eos : 1.0/4;
			    _prob_eos_3= total_eos != 0 ? _var_eos_3 / total_eos : 1.0/4;

			///////////////////////////////////////////////////
			    // TODO EOF was taken out of all productions as it makes no sense for generation

			    System.out.println("program = " +
			        "sourceElements? @@ " + _prob_program_0 + ";\n\n"
			        );

			    System.out.println("sourceElement = " +
			        "Export? \" \" statement @@ " + _prob_sourceElement_0 + ";\n\n"
			        );

			    System.out.println("statement = " +
			        "block \"\\n\" @@ " + _prob_statement_0 + " | " +
			        "variableStatement  \"\\n\" @@ " + _prob_statement_1 + " | " +
			        "emptyStatement \"\\n\" @@ " + _prob_statement_2 + " | " +
			        "expressionStatement \"\\n\" @@ " + _prob_statement_3 + " | " +
			        "ifStatement \"\\n\" @@ " + _prob_statement_4 + " | " +
			        "iterationStatement \"\\n\" @@ " + _prob_statement_5 + " | " +
			        "continueStatement \"\\n\" @@ " + _prob_statement_6 + " | " +
			        "breakStatement \"\\n\" @@ " + _prob_statement_7 + " | " +
			        "returnStatement \"\\n\" @@ " + _prob_statement_8 + " | " +
			        "withStatement \"\\n\" @@ " + _prob_statement_9 + " | " +
			        "labelledStatement \"\\n\" @@ " + _prob_statement_10 + " | " +
			        "switchStatement \"\\n\" @@ " + _prob_statement_11 + " | " +
			        "throwStatement \"\\n\" @@ " + _prob_statement_12 + " | " +
			        "tryStatement \"\\n\" @@ " + _prob_statement_13 + " | " +
			        "debuggerStatement \"\\n\" @@ " + _prob_statement_14 + " | " +
			        "functionDeclaration \"\\n\" @@ " + _prob_statement_15 + " | " +
			        "classDeclaration \"\\n\" @@ " + _prob_statement_16 + ";\n\n"
			        );

			    System.out.println("block = " +
			        "\"{\" statementList? \"}\" @@ " + _prob_block_0 + ";\n\n"
			        );

			    System.out.println("statementList = " +
			        "(statement \" \")+ @@ " + _prob_statementList_0  + ";\n\n"
			        );

			    System.out.println("variableStatement = "+
			        "varModifier \" \" variableDeclarationList \" \" eos @@ " + _prob_variableStatement_0 + ";\n\n"
			        );

			    System.out.println("variableDeclarationList = " +
			        "variableDeclaration (\",\" variableDeclaration)* @@ " + _prob_variableDeclarationList_0 + ";\n\n"
			        );

			    System.out.println("variableDeclaration = " +
			        "(Identifier | arrayLiteral | objectLiteral) (\"=\" singleExpression)? @@ " + _prob_variableDeclaration_0 + ";\n\n"
			        );

			    System.out.println("emptyStatement = " +
			        "SemiColon @@ " + _prob_emptyStatement_0 + ";\n\n"
			        );

			    // TODO just delete the context information
			    System.out.println("expressionStatement = " +
			        "expressionSequence eos @@ " + _prob_expressionStatement_0 + ";\n\n"
			        );

			    System.out.println("ifStatement = " +
			        "If \"(\" expressionSequence \")\" statement \" \" (Else \" \" statement)? @@ " + _prob_ifStatement_0 + ";\n\n"
			        );

			    // TODO what is that p("of")
			    System.out.println("iterationStatement = " +
			        "Do \" \" statement \" \" While \"(\" expressionSequence \")\" eos @@ " + _prob_iterationStatement_0 + " | " +
			        "While \"(\" expressionSequence \")\" statement @@ " + _prob_iterationStatement_1 + " | " +
			        "For \"(\" expressionSequence? \";\" expressionSequence? \";\" expressionSequence? \")\" statement @@ " + _prob_iterationStatement_2 + " | " +
			        "For \"(\" varModifier \" \" variableDeclarationList \";\" expressionSequence? \";\" expressionSequence? \")\" statement @@ " + _prob_iterationStatement_3 + " | " +
			        "For \"(\" singleExpression \" \" (In | Identifier?) \" \" expressionSequence \")\" statement @@ " + _prob_iterationStatement_4 + " | " +
			        "For \"(\" varModifier \" \" variableDeclaration \" \" (In | Identifier?) \" \" expressionSequence \")\" statement @@ " + _prob_iterationStatement_5 + ";\n\n"
			        );

			    System.out.println("varModifier = " +
			        "Var @@ " + _prob_varModifier_0 + " | " +
			        "Let @@ " + _prob_varModifier_1 + " | " +
			        "Const @@ " + _prob_varModifier_2 + ";\n\n"
			        );

			    // TODO what about notLineTerminator
			    System.out.println("continueStatement = " +
			        "Continue \" \" Identifier? \" \" eos @@ " + _prob_continueStatement_0 + ";\n\n"
			        );

			    // TODO what about notLineTerminator
			    System.out.println("breakStatement = " +
			        "Break \" \" Identifier? \" \" eos @@ " + _prob_breakStatement_0 + ";\n\n"
			        );

			    // TODO what about notLineTerminator
			    System.out.println("returnStatement = " +
			        "Return \" \" expressionSequence? \" \" eos @@ " + _prob_returnStatement_0 + ";\n\n"
			        );

			    System.out.println("withStatement = " +
			        "With \"(\" expressionSequence \")\" statement @@ " + _prob_withStatement_0 + ";\n\n"
			        );

			    System.out.println("switchStatement = " +
			        "Switch \"(\" expressionSequence \")\" caseBlock @@ " + _prob_switchStatement_0 + ";\n\n"
			        );

			    System.out.println("caseBlock = " +
			        "\"{\" caseClauses? (defaultClause \" \" caseClauses?)? \"}\" @@ " + _prob_caseBlock_0 + ";\n\n"
			        );

			    System.out.println("caseClauses = " +
			        "(caseClause \" \")+ @@ " + _prob_caseClauses_0 + ";\n\n"
			        );

			    System.out.println("caseClause = " +
			        "Case \" \" expressionSequence \":\" statementList? @@ " + _prob_caseClause_0 + ";\n\n"
			        );

			    System.out.println("defaultClause = " +
			        "Default \":\" statementList? @@ " + _prob_defaultClause_0 + ";\n\n"
			        );

			    System.out.println("labelledStatement = " +
			        "Identifier \":\" statement @@ " + _prob_labelledStatement_0 + ";\n\n"
			        );

			    // TODO what about notLineTerminator
			    System.out.println("throwStatement = " +
			        "Throw \" \" expressionSequence \" \" eos @@ " + _prob_throwStatement_0 + ";\n\n"
			        );

			    System.out.println("tryStatement = " +
			        "Try \" \" block (catchProduction finallyProduction? | finallyProduction) @@ " + _prob_tryStatement_0 + ";\n\n"
			        );

			    System.out.println("catchProduction = " +
			        "Catch \"(\" Identifier \")\" block @@ " + _prob_catchProduction_0 + ";\n\n"
			        );

			    System.out.println("finallyProduction = " +
			        "Finally \" \" block @@ " + _prob_finallyProduction_0 + ";\n\n"
			        );

			    System.out.println("debuggerStatement = " +
			        "Debugger \" \" eos @@ " + _prob_debuggerStatement_0 + ";\n\n"
			        );

			    System.out.println("functionDeclaration = " +
			        "Function \" \" Identifier \"(\" formalParameterList? \")\" \"{\" functionBody \"}\" @@ " + _prob_functionDeclaration_0 + ";\n\n"
			        );

			    System.out.println("classDeclaration = " +
			        "Class \" \" Identifier \" \" classTail @@ " + _prob_classDeclaration_0 + ";\n\n"
			        );

			    System.out.println("classTail = " +
			        "(Extends \" \" singleExpression)? \"{\" classElement* \"}\" @@ " + _prob_classTail_0 + ";\n\n"
			        );

			    System.out.println("classElement = " +
			        "Static? \" \" methodDefinition @@ " + _prob_classElement_0 + ";\n\n"
			        );

			    System.out.println("methodDefinition = " +
			        "propertyName \"(\" formalParameterList? \")\" \"{\" functionBody \"}\" @@ " + _prob_methodDefinition_0 + " | " +
			        " getter \"(\" \")\" \"{\" functionBody \"}\" @@ " + _prob_methodDefinition_1 + " | " +
			        " setter \"(\" formalParameterList? \")\" \"{\" functionBody \"}\" @@ " + _prob_methodDefinition_2 + " | " +
			        " generatorMethod @@ " + _prob_methodDefinition_3 + ";\n\n");

			    System.out.println("generatorMethod = " +
			        "\"*\"? Identifier \"(\" formalParameterList? \")\" \"{\" functionBody \"}\" @@ " + _prob_generatorMethod_0 + ";\n\n");

			    System.out.println("formalParameterList = " +
			        "formalParameterArg (\",\" formalParameterArg)* (\",\" lastFormalParameterArg)? @@ " + _prob_formalParameterList_0 + " | " +
			        "lastFormalParameterArg @@ " + _prob_formalParameterList_1 + " | " +
			        "arrayLiteral @@ " + _prob_formalParameterList_2 + " | " +
			        "objectLiteral @@ " + _prob_formalParameterList_3 + ";\n\n");

			    System.out.println("formalParameterArg = " +
			        "Identifier (\"=\" singleExpression)? @@ " + _prob_formalParameterArg_0 + ";\n\n");

			    System.out.println("lastFormalParameterArg = " +
			        "Ellipsis \" \" Identifier @@ " + _prob_lastFormalParameterArg_0 + ";\n\n");

			    System.out.println("functionBody = " +
			        "sourceElements? @@ " + _prob_functionBody_0 + ";\n\n");

			    System.out.println("sourceElements = " +
			        "(sourceElement \" \")+ @@ " + _prob_sourceElements_0 + ";\n\n");

			    System.out.println("arrayLiteral = " +
			        "\"[\" \",\"* elementList? \",\"* \"]\" @@ " + _prob_arrayLiteral_0 + ";\n\n");

			    System.out.println("elementList = " +
			        "singleExpression (\",\"+ singleExpression)* (\",\"+ lastElement)? @@ " + _prob_elementList_0 + " | " +
			        "lastElement @@ " + _prob_elementList_1 + ";\n\n");

			    System.out.println("lastElement = " +
			        "Ellipsis \" \" Identifier @@ " + _prob_lastElement_0 + ";\n\n");

			    System.out.println("objectLiteral = " +
			        "\"{\" (propertyAssignment (\",\" propertyAssignment)*)? \",\"? \"}\" @@ " + _prob_objectLiteral_0 + ";\n\n");

			    System.out.println("propertyAssignment = " +
			        "propertyName (\":\" |\"=\") singleExpression @@ " + _prob_propertyAssignment_0 + " | " +
			        "\"[\" singleExpression \"]\" \":\" singleExpression @@ " + _prob_propertyAssignment_1 + " | " +
			        "getter \"(\" \")\" \"{\" functionBody \"}\" @@ " + _prob_propertyAssignment_2 + " | " +
			        "setter \"(\" Identifier \")\" \"{\" functionBody \"}\" @@ " + _prob_propertyAssignment_3 + " | " +
			        "generatorMethod @@ " + _prob_propertyAssignment_4 + " | " +
			        "Identifier @@ " + _prob_propertyAssignment_5 + ";\n\n"
			        );

			    System.out.println("propertyName = " +
			        "identifierName @@ " + _prob_propertyName_0 + " | " +
			        "StringLiteral @@ " + _prob_propertyName_1 + " | " +
			        "numericLiteral @@ " + _prob_propertyName_2  + ";\n\n");

			    System.out.println("arguments = " +
			        "\"(\"( singleExpression (\",\" singleExpression)* (\",\" lastArgument)? | lastArgument)?\")\" @@ " + _prob_arguments_0 + ";\n\n");

			    System.out.println("lastArgument = " +
			        "Ellipsis \" \" Identifier @@ " + _prob_lastArgument_0 + ";\n\n");

			    System.out.println("expressionSequence = " +
			        "singleExpression (\",\" singleExpression)* @@ " + _prob_expressionSequence_0 + ";\n\n");

			    // TODO what about notLineTerminator() ?
			    System.out.println("singleExpression = " +
			        "Function \" \" Identifier? \"(\" formalParameterList? \")\" \"{\" functionBody \"}\" @@ " + _prob_singleExpression_0 + " | " +
			        "Class \" \" Identifier? \" \" classTail @@ " + _prob_singleExpression_1 + " | " +
			        "singleExpression \"[\" expressionSequence \"]\" @@ " + _prob_singleExpression_2 + " | " +
			        "singleExpression \".\" identifierName @@ " + _prob_singleExpression_3 + " | " +
			        "singleExpression \" \" arguments @@ " + _prob_singleExpression_4 + " | " +
			        "New \" \" singleExpression \" \" arguments? @@ " + _prob_singleExpression_5 + " | " +
			        "singleExpression \"++\" @@ " + _prob_singleExpression_6 + " | " +
			        "singleExpression \"--\" @@ " + _prob_singleExpression_7 + " | " +
			        "Delete \" \" singleExpression @@ " + _prob_singleExpression_8 + " | " +
			        "Void \" \" singleExpression @@ " + _prob_singleExpression_9 + " | " +
			        "Typeof \" \" singleExpression @@ " + _prob_singleExpression_10 + " | " +
			        "\"++\" singleExpression @@ " + _prob_singleExpression_11 + " | " +
			        "\"--\" singleExpression @@ " + _prob_singleExpression_12 + " | " +
			        "\"+\" singleExpression @@ " + _prob_singleExpression_13 + " | " +
			        "\"-\" singleExpression @@ " + _prob_singleExpression_14 + " | " +
			        "\"~\" singleExpression @@ " + _prob_singleExpression_15 + " | " +
			        "\"!\" singleExpression @@ " + _prob_singleExpression_16 + " | " +
			        "singleExpression (\"*\" | \"/\" | \"%\") singleExpression @@ " + _prob_singleExpression_17 + " | " +
			        "singleExpression (\"+\" | \"-\") singleExpression @@ " + _prob_singleExpression_18 + " | " +
			        "singleExpression (\"<<\" | \">>\" | \">>>\") singleExpression @@ " + _prob_singleExpression_19 + " | " +
			        "singleExpression (\"<\" | \">\" | \"<=\" | \">=\") singleExpression @@ " + _prob_singleExpression_20 + " | " +
			        "singleExpression \" \" Instanceof \" \" singleExpression @@ " + _prob_singleExpression_21 + " | " +
			        "singleExpression \" \" In \" \" singleExpression @@ " + _prob_singleExpression_22 + " | " +
			        "singleExpression (\"==\" | \"!=\" | \"===\" | \"!==\") singleExpression @@ " + _prob_singleExpression_23 + " | " +
			        "singleExpression \"&\" singleExpression @@ " + _prob_singleExpression_24 + " | " +
			        "singleExpression \"^\" singleExpression @@ " + _prob_singleExpression_25 + " | " +
			        "singleExpression \"|\" singleExpression @@ " + _prob_singleExpression_26 + " | " +
			        "singleExpression \"&&\" singleExpression @@ " + _prob_singleExpression_27 + " | " +
			        "singleExpression \"||\" singleExpression @@ " + _prob_singleExpression_28 + " | " +
			        "singleExpression \"?\" singleExpression \":\" singleExpression @@ " + _prob_singleExpression_29 + " | " +
			        "singleExpression \"=\" singleExpression @@ " + _prob_singleExpression_30 + " | " +
			        "singleExpression assignmentOperator singleExpression @@ " + _prob_singleExpression_31 + " | " +
			        "singleExpression \" \" TemplateStringLiteral \" \" @@ " + _prob_singleExpression_32 + " | " +
			        "This @@ " + _prob_singleExpression_33 + " | " +
			        "Identifier @@ " + _prob_singleExpression_34 + " | " +
			        "Super @@ " + _prob_singleExpression_35 + " | " +
			        "literal @@ " + _prob_singleExpression_36 + " | " +
			        "arrayLiteral @@ " + _prob_singleExpression_37 + " | " +
			        "objectLiteral @@ " + _prob_singleExpression_38 + " | " +
			        "\"(\" expressionSequence \")\" @@ " + _prob_singleExpression_39 + " | " +
			        "arrowFunctionParameters \"=>\" arrowFunctionBody @@ " + _prob_singleExpression_40 + ";\n\n"
			        );

			    System.out.println("arrowFunctionParameters = " +
			        "Identifier @@ " + _prob_arrowFunctionParameters_0 + " | " +
			        "\"(\" formalParameterList? \")\" @@ " + _prob_arrowFunctionParameters_1 + ";\n\n");

			    System.out.println("arrowFunctionBody = " +
			        "singleExpression @@ " + _prob_arrowFunctionBody_0 + " | " +
			        "\"{\" functionBody \"}\" @@ " + _prob_arrowFunctionBody_1 + ";\n\n");

			    System.out.println("assignmentOperator = " +
			        "\"*=\" @@ " + _prob_assignmentOperator_0 + " | " +
			        "\"/=\" @@ " + _prob_assignmentOperator_1 + " | " +
			        "\"%=\" @@ " + _prob_assignmentOperator_2 + " | " +
			        "\"+=\" @@ " + _prob_assignmentOperator_3 + " | " +
			        "\"-=\" @@ " + _prob_assignmentOperator_4 + " | " +
			        "\"<<=\" @@ " + _prob_assignmentOperator_5 + " | " +
			        "\">>=\" @@ " + _prob_assignmentOperator_6 + " | " +
			        "\">>>=\" @@ " + _prob_assignmentOperator_7 + " | " +
			        "\"&=\" @@ " + _prob_assignmentOperator_8 + " | " +
			        "\"^=\" @@ " + _prob_assignmentOperator_9 + " | " +
			        "\"|=\" @@ " + _prob_assignmentOperator_10 + ";\n\n"
			        );

			    System.out.println("literal = " +
			        "NullLiteral @@ " + _prob_literal_0 + " | " +
			        "BooleanLiteral @@ " + _prob_literal_1 + " | " +
			        "StringLiteral @@ " + _prob_literal_2 + " | " +
			        "TemplateStringLiteral @@ " + _prob_literal_3 + " | " +
			        "RegularExpressionLiteral @@ " + _prob_literal_4 + " | " +
			        "numericLiteral @@ " + _prob_literal_5 + ";\n\n"
			        );

			    System.out.println("numericLiteral = " +
			        "DecimalLiteral @@ " + _prob_numericLiteral_0 + " | " +
			        "HexIntegerLiteral @@ " + _prob_numericLiteral_1 + " | " +
			        "OctalIntegerLiteral @@ " + _prob_numericLiteral_2 + " | " +
			        "OctalIntegerLiteral2 @@ " + _prob_numericLiteral_3 + " | " +
			        "BinaryIntegerLiteral @@ " + _prob_numericLiteral_4 + ";\n\n"
			        );

			    System.out.println("identifierName = " +
			        "Identifier @@ " + _prob_identifierName_0 + " | " +
			        "reservedWord @@ " + _prob_identifierName_1 + ";\n\n"
			        );

			    System.out.println("reservedWord = " +
			        "keyword @@ " + _prob_reservedWord_0 + " | " +
			        "NullLiteral @@ " + _prob_reservedWord_1 + " | " +
			        "BooleanLiteral @@ " + _prob_reservedWord_2 + ";\n\n"
			        );

			    System.out.println("keyword = " +
			        "Break @@ " + _prob_keyword_0 + " | " +
			        "Do @@ " + _prob_keyword_1 + " | " +
			        "Instanceof @@ " + _prob_keyword_2 + " | " +
			        "Typeof @@ " + _prob_keyword_3 + " | " +
			        "Case @@ " + _prob_keyword_4 + " | " +
			        "Else @@ " + _prob_keyword_5 + " | " +
			        "New @@ " + _prob_keyword_6 + " | " +
			        "Var @@ " + _prob_keyword_7 + " | " +
			        "Catch @@ " + _prob_keyword_8 + " | " +
			        "Finally @@ " + _prob_keyword_9 + " | " +
			        "Return @@ " + _prob_keyword_10 + " | " +
			        "Void @@ " + _prob_keyword_11 + " | " +
			        "Continue @@ " + _prob_keyword_12 + " | " +
			        "For @@ " + _prob_keyword_13 + " | " +
			        "Switch @@ " + _prob_keyword_14 + " | " +
			        "While @@ " + _prob_keyword_15 + " | " +
			        "Debugger @@ " + _prob_keyword_16 + " | " +
			        "Function @@ " + _prob_keyword_17 + " | " +
			        "This @@ " + _prob_keyword_18 + " | " +
			        "With @@ " + _prob_keyword_19 + " | " +
			        "Default @@ " + _prob_keyword_20 + " | " +
			        "If @@ " + _prob_keyword_21 + " | " +
			        "Throw @@ " + _prob_keyword_22 + " | " +
			        "Delete @@ " + _prob_keyword_23 + " | " +
			        "In @@ " + _prob_keyword_24 + " | " +
			        "Try @@ " + _prob_keyword_25 + " | " +
			        "Class @@ " + _prob_keyword_26 + " | " +
			        "Enum @@ " + _prob_keyword_27 + " | " +
			        "Extends @@ " + _prob_keyword_28 + " | " +
			        "Super @@ " + _prob_keyword_29 + " | " +
			        "Const @@ " + _prob_keyword_30 + " | " +
			        "Export @@ " + _prob_keyword_31 + " | " +
			        "Import @@ " + _prob_keyword_32 + " | " +
			        "Implements @@ " + _prob_keyword_33 + " | " +
			        "Let @@ " + _prob_keyword_34 + " | " +
			        "Private @@ " + _prob_keyword_35 + " | " +
			        "Public @@ " + _prob_keyword_36 + " | " +
			        "Interface @@ " + _prob_keyword_37 + " | " +
			        "Package @@ " + _prob_keyword_38 + " | " +
			        "Protected @@ " + _prob_keyword_39 + " | " +
			        "Static @@ " + _prob_keyword_40 + " | " +
			        "Yield @@ " + _prob_keyword_41 + ";\n\n"
			        );

			    // TODO what about this p()
			    System.out.println("getter = " +
			        "Identifier? \" \" propertyName @@ " + _prob_getter_0 + ";\n\n"
			        );

			    // TODO what about this p()
			    System.out.println("setter = " +
			        "Identifier? \" \" propertyName @@ " + _prob_setter_0 + ";\n\n"
			        );

			    // TODO lineTerminatorAhead() was replaced by "\r\n" | "\n" , but may generate invalid JS files now
			    // TODO closeBrace() was replaced by "}"
			    System.out.println("eos = " +
			        "SemiColon @@ " + _prob_eos_0 + " | " +
			        "\" \" @@ " + _prob_eos_1 + " | " +
			        "(\"\\r\\n\" | \"\\n\")? @@ " + _prob_eos_2 + " | " +
			        "\"}\"? @@ " + _prob_eos_3 + ";\n\n"
			        );

			    ////////////////////////////////////////////////////////////
			    //////////// LEXER items - no probabilities
			    ////////////////////////////////////////////////////////////

			    System.out.println("Do = \"do\" ;\n\n");
			    System.out.println("While = \"while\" ;\n\n");
			    System.out.println("For = \"for\" ;\n\n");
			    System.out.println("In = \"in\" ;\n\n");
			    System.out.println("Var = \"var\" ;\n\n");
			    System.out.println("Let = \"let\" ;\n\n");
			    System.out.println("Const = \"const\" ;\n\n");
			    System.out.println("Continue = \"continue\" ;\n\n");
			    System.out.println("Break = \"break\" ;\n\n");
			    System.out.println("Return = \"return\" ;\n\n");
			    System.out.println("With = \"with\" ;\n\n");
			    System.out.println("Switch = \"switch\" ;\n\n");
			    System.out.println("Case = \"case\" ;\n\n");
			    System.out.println("Default = \"default\" ;\n\n");
			    System.out.println("Throw = \"throw\" ;\n\n");
			    System.out.println("Try = \"try\" ;\n\n");
			    System.out.println("Catch = \"catch\" ;\n\n");
			    System.out.println("Finally = \"finally\" ;\n\n");
			    System.out.println("Debugger = \"debugger\" ;\n\n");
			    System.out.println("Function = \"function\" ;\n\n");
			    System.out.println("Class = \"class\" ;\n\n");
			    System.out.println("Extends = \"extends\" ;\n\n");
			    System.out.println("Static = \"static\" ;\n\n");
			    System.out.println("Ellipsis = \"...\" ;\n\n");
			    System.out.println("New = \"new\" ;\n\n");
			    System.out.println("Delete = \"delete\" ;\n\n");
			    System.out.println("Void = \"void\" ;\n\n");
			    System.out.println("Typeof = \"typeof\" ;\n\n");
			    System.out.println("This = \"this\" ;\n\n");
			    System.out.println("Super = \"super\" ;\n\n");
			    System.out.println("Instanceof = \"instanceof\" ;\n\n");
			    System.out.println("Enum = \"enum\" ;\n\n");
			    System.out.println("Import = \"import\" ;\n\n");
			    System.out.println("Implements = \"implements\" ;\n\n");
			    System.out.println("Private = \"private\" ;\n\n");
			    System.out.println("Public = \"public\" ;\n\n");
			    System.out.println("Interface = \"interface\" ;\n\n");
			    System.out.println("Package = \"package\" ;\n\n");
			    System.out.println("Protected = \"protected\" ;\n\n");
			    System.out.println("Yield = \"yield\" ;\n\n");

			    System.out.println("Export = \"export\";\n\n");
			    System.out.println("Identifier = IdentifierStart IdentifierPart*;\n\n");
			    System.out.println("IdentifierStart = " +
			        "UnicodeLetter | " +
			        "/[_$\\\\\\\\]/ | " +
			        "\"\\\\\" UnicodeEscapeSequence ;\n\n"
			        );
			    System.out.println("IdentifierPart = " +
			        "IdentifierStart | " +
			        "UnicodeCombiningMark | " +
			        "UnicodeDigit | " +
			        "UnicodeConnectorPunctuation | " +
			        "\"\\\\u200C\" | " +
			        "\"\\\\u200D\";\n\n"
			        );
			    System.out.println("UnicodeConnectorPunctuation = " +
			        "/[\\\\u005F]/ | " +
			        "/[\\\\u203F-\\\\u2040]/ | " +
			        "/[\\\\u30FB]/ | " +
			        "/[\\\\uFE33-\\\\uFE34]/ | " +
			        "/[\\\\uFE4D-\\\\uFE4F]/ | " +
			        "/[\\\\uFF3F]/ | " +
			        "/[\\\\uFF65]/" +
			        ";\n\n");
			    System.out.println("UnicodeEscapeSequence = " +
			        "\"u\" HexDigit HexDigit HexDigit HexDigit ;\n\n"
			        );
			    System.out.println("HexDigit = " +
			        "/[0-9a-fA-F]/ ;\n\n"
			        );
			    System.out.println("UnicodeLetter = " +
			        "/[\\\\u0041-\\\\u005A]/ | " +
			        "/[\\\\u0061-\\\\u007A]/ | " +
			        "/[\\\\u00AA]/ | " +
			        "/[\\\\u00B5]/ | " +
			        "/[\\\\u00BA]/ | " +
			        "/[\\\\u00C0-\\\\u00D6]/ | " +
			        "/[\\\\u00D8-\\\\u00F6]/ | " +
			        "/[\\\\u00F8-\\\\u021F]/ | " +
			        "/[\\\\u0222-\\\\u0233]/ | " +
			        "/[\\\\u0250-\\\\u02AD]/ | " +
			        "/[\\\\u02B0-\\\\u02B8]/ | " +
			        "/[\\\\u02BB-\\\\u02C1]/ | " +
			        "/[\\\\u02D0-\\\\u02D1]/ | " +
			        "/[\\\\u02E0-\\\\u02E4]/ | " +
			        "/[\\\\u02EE]/ | " +
			        "/[\\\\u037A]/ | " +
			        "/[\\\\u0386]/ | " +
			        "/[\\\\u0388-\\\\u038A]/ | " +
			        "/[\\\\u038C]/ | " +
			        "/[\\\\u038E-\\\\u03A1]/ | " +
			        "/[\\\\u03A3-\\\\u03CE]/ | " +
			        "/[\\\\u03D0-\\\\u03D7]/ | " +
			        "/[\\\\u03DA-\\\\u03F3]/ | " +
			        "/[\\\\u0400-\\\\u0481]/ | " +
			        "/[\\\\u048C-\\\\u04C4]/ | " +
			        "/[\\\\u04C7-\\\\u04C8]/ | " +
			        "/[\\\\u04CB-\\\\u04CC]/ | " +
			        "/[\\\\u04D0-\\\\u04F5]/ | " +
			        "/[\\\\u04F8-\\\\u04F9]/ | " +
			        "/[\\\\u0531-\\\\u0556]/ | " +
			        "/[\\\\u0559]/ | " +
			        "/[\\\\u0561-\\\\u0587]/ | " +
			        "/[\\\\u05D0-\\\\u05EA]/ | " +
			        "/[\\\\u05F0-\\\\u05F2]/ | " +
			        "/[\\\\u0621-\\\\u063A]/ | " +
			        "/[\\\\u0640-\\\\u064A]/ | " +
			        "/[\\\\u0671-\\\\u06D3]/ | " +
			        "/[\\\\u06D5]/ | " +
			        "/[\\\\u06E5-\\\\u06E6]/ | " +
			        "/[\\\\u06FA-\\\\u06FC]/ | " +
			        "/[\\\\u0710]/ | " +
			        "/[\\\\u0712-\\\\u072C]/ | " +
			        "/[\\\\u0780-\\\\u07A5]/ | " +
			        "/[\\\\u0905-\\\\u0939]/ | " +
			        "/[\\\\u093D]/ | " +
			        "/[\\\\u0950]/ | " +
			        "/[\\\\u0958-\\\\u0961]/ | " +
			        "/[\\\\u0985-\\\\u098C]/ | " +
			        "/[\\\\u098F-\\\\u0990]/ | " +
			        "/[\\\\u0993-\\\\u09A8]/ | " +
			        "/[\\\\u09AA-\\\\u09B0]/ | " +
			        "/[\\\\u09B2]/ | " +
			        "/[\\\\u09B6-\\\\u09B9]/ | " +
			        "/[\\\\u09DC-\\\\u09DD]/ | " +
			        "/[\\\\u09DF-\\\\u09E1]/ | " +
			        "/[\\\\u09F0-\\\\u09F1]/ | " +
			        "/[\\\\u0A05-\\\\u0A0A]/ | " +
			        "/[\\\\u0A0F-\\\\u0A10]/ | " +
			        "/[\\\\u0A13-\\\\u0A28]/ | " +
			        "/[\\\\u0A2A-\\\\u0A30]/ | " +
			        "/[\\\\u0A32-\\\\u0A33]/ | " +
			        "/[\\\\u0A35-\\\\u0A36]/ | " +
			        "/[\\\\u0A38-\\\\u0A39]/ | " +
			        "/[\\\\u0A59-\\\\u0A5C]/ | " +
			        "/[\\\\u0A5E]/ | " +
			        "/[\\\\u0A72-\\\\u0A74]/ | " +
			        "/[\\\\u0A85-\\\\u0A8B]/ | " +
			        "/[\\\\u0A8D]/ | " +
			        "/[\\\\u0A8F-\\\\u0A91]/ | " +
			        "/[\\\\u0A93-\\\\u0AA8]/ | " +
			        "/[\\\\u0AAA-\\\\u0AB0]/ | " +
			        "/[\\\\u0AB2-\\\\u0AB3]/ | " +
			        "/[\\\\u0AB5-\\\\u0AB9]/ | " +
			        "/[\\\\u0ABD]/ | " +
			        "/[\\\\u0AD0]/ | " +
			        "/[\\\\u0AE0]/ | " +
			        "/[\\\\u0B05-\\\\u0B0C]/ | " +
			        "/[\\\\u0B0F-\\\\u0B10]/ | " +
			        "/[\\\\u0B13-\\\\u0B28]/ | " +
			        "/[\\\\u0B2A-\\\\u0B30]/ | " +
			        "/[\\\\u0B32-\\\\u0B33]/ | " +
			        "/[\\\\u0B36-\\\\u0B39]/ | " +
			        "/[\\\\u0B3D]/ | " +
			        "/[\\\\u0B5C-\\\\u0B5D]/ | " +
			        "/[\\\\u0B5F-\\\\u0B61]/ | " +
			        "/[\\\\u0B85-\\\\u0B8A]/ | " +
			        "/[\\\\u0B8E-\\\\u0B90]/ | " +
			        "/[\\\\u0B92-\\\\u0B95]/ | " +
			        "/[\\\\u0B99-\\\\u0B9A]/ | " +
			        "/[\\\\u0B9C]/ | " +
			        "/[\\\\u0B9E-\\\\u0B9F]/ | " +
			        "/[\\\\u0BA3-\\\\u0BA4]/ | " +
			        "/[\\\\u0BA8-\\\\u0BAA]/ | " +
			        "/[\\\\u0BAE-\\\\u0BB5]/ | " +
			        "/[\\\\u0BB7-\\\\u0BB9]/ | " +
			        "/[\\\\u0C05-\\\\u0C0C]/ | " +
			        "/[\\\\u0C0E-\\\\u0C10]/ | " +
			        "/[\\\\u0C12-\\\\u0C28]/ | " +
			        "/[\\\\u0C2A-\\\\u0C33]/ | " +
			        "/[\\\\u0C35-\\\\u0C39]/ | " +
			        "/[\\\\u0C60-\\\\u0C61]/ | " +
			        "/[\\\\u0C85-\\\\u0C8C]/ | " +
			        "/[\\\\u0C8E-\\\\u0C90]/ | " +
			        "/[\\\\u0C92-\\\\u0CA8]/ | " +
			        "/[\\\\u0CAA-\\\\u0CB3]/ | " +
			        "/[\\\\u0CB5-\\\\u0CB9]/ | " +
			        "/[\\\\u0CDE]/ | " +
			        "/[\\\\u0CE0-\\\\u0CE1]/ | " +
			        "/[\\\\u0D05-\\\\u0D0C]/ | " +
			        "/[\\\\u0D0E-\\\\u0D10]/ | " +
			        "/[\\\\u0D12-\\\\u0D28]/ | " +
			        "/[\\\\u0D2A-\\\\u0D39]/ | " +
			        "/[\\\\u0D60-\\\\u0D61]/ | " +
			        "/[\\\\u0D85-\\\\u0D96]/ | " +
			        "/[\\\\u0D9A-\\\\u0DB1]/ | " +
			        "/[\\\\u0DB3-\\\\u0DBB]/ | " +
			        "/[\\\\u0DBD]/ | " +
			        "/[\\\\u0DC0-\\\\u0DC6]/ | " +
			        "/[\\\\u0E01-\\\\u0E30]/ | " +
			        "/[\\\\u0E32-\\\\u0E33]/ | " +
			        "/[\\\\u0E40-\\\\u0E46]/ | " +
			        "/[\\\\u0E81-\\\\u0E82]/ | " +
			        "/[\\\\u0E84]/ | " +
			        "/[\\\\u0E87-\\\\u0E88]/ | " +
			        "/[\\\\u0E8A]/ | " +
			        "/[\\\\u0E8D]/ | " +
			        "/[\\\\u0E94-\\\\u0E97]/ | " +
			        "/[\\\\u0E99-\\\\u0E9F]/ | " +
			        "/[\\\\u0EA1-\\\\u0EA3]/ | " +
			        "/[\\\\u0EA5]/ | " +
			        "/[\\\\u0EA7]/ | " +
			        "/[\\\\u0EAA-\\\\u0EAB]/ | " +
			        "/[\\\\u0EAD-\\\\u0EB0]/ | " +
			        "/[\\\\u0EB2-\\\\u0EB3]/ | " +
			        "/[\\\\u0EBD-\\\\u0EC4]/ | " +
			        "/[\\\\u0EC6]/ | " +
			        "/[\\\\u0EDC-\\\\u0EDD]/ | " +
			        "/[\\\\u0F00]/ | " +
			        "/[\\\\u0F40-\\\\u0F6A]/ | " +
			        "/[\\\\u0F88-\\\\u0F8B]/ | " +
			        "/[\\\\u1000-\\\\u1021]/ | " +
			        "/[\\\\u1023-\\\\u1027]/ | " +
			        "/[\\\\u1029-\\\\u102A]/ | " +
			        "/[\\\\u1050-\\\\u1055]/ | " +
			        "/[\\\\u10A0-\\\\u10C5]/ | " +
			        "/[\\\\u10D0-\\\\u10F6]/ | " +
			        "/[\\\\u1100-\\\\u1159]/ | " +
			        "/[\\\\u115F-\\\\u11A2]/ | " +
			        "/[\\\\u11A8-\\\\u11F9]/ | " +
			        "/[\\\\u1200-\\\\u1206]/ | " +
			        "/[\\\\u1208-\\\\u1246]/ | " +
			        "/[\\\\u1248]/ | " +
			        "/[\\\\u124A-\\\\u124D]/ | " +
			        "/[\\\\u1250-\\\\u1256]/ | " +
			        "/[\\\\u1258]/ | " +
			        "/[\\\\u125A-\\\\u125D]/ | " +
			        "/[\\\\u1260-\\\\u1286]/ | " +
			        "/[\\\\u1288]/ | " +
			        "/[\\\\u128A-\\\\u128D]/ | " +
			        "/[\\\\u1290-\\\\u12AE]/ | " +
			        "/[\\\\u12B0]/ | " +
			        "/[\\\\u12B2-\\\\u12B5]/ | " +
			        "/[\\\\u12B8-\\\\u12BE]/ | " +
			        "/[\\\\u12C0]/ | " +
			        "/[\\\\u12C2-\\\\u12C5]/ | " +
			        "/[\\\\u12C8-\\\\u12CE]/ | " +
			        "/[\\\\u12D0-\\\\u12D6]/ | " +
			        "/[\\\\u12D8-\\\\u12EE]/ | " +
			        "/[\\\\u12F0-\\\\u130E]/ | " +
			        "/[\\\\u1310]/ | " +
			        "/[\\\\u1312-\\\\u1315]/ | " +
			        "/[\\\\u1318-\\\\u131E]/ | " +
			        "/[\\\\u1320-\\\\u1346]/ | " +
			        "/[\\\\u1348-\\\\u135A]/ | " +
			        "/[\\\\u13A0-\\\\u13B0]/ | " +
			        "/[\\\\u13B1-\\\\u13F4]/ | " +
			        "/[\\\\u1401-\\\\u1676]/ | " +
			        "/[\\\\u1681-\\\\u169A]/ | " +
			        "/[\\\\u16A0-\\\\u16EA]/ | " +
			        "/[\\\\u1780-\\\\u17B3]/ | " +
			        "/[\\\\u1820-\\\\u1877]/ | " +
			        "/[\\\\u1880-\\\\u18A8]/ | " +
			        "/[\\\\u1E00-\\\\u1E9B]/ | " +
			        "/[\\\\u1EA0-\\\\u1EE0]/ | " +
			        "/[\\\\u1EE1-\\\\u1EF9]/ | " +
			        "/[\\\\u1F00-\\\\u1F15]/ | " +
			        "/[\\\\u1F18-\\\\u1F1D]/ | " +
			        "/[\\\\u1F20-\\\\u1F39]/ | " +
			        "/[\\\\u1F3A-\\\\u1F45]/ | " +
			        "/[\\\\u1F48-\\\\u1F4D]/ | " +
			        "/[\\\\u1F50-\\\\u1F57]/ | " +
			        "/[\\\\u1F59]/ | " +
			        "/[\\\\u1F5B]/ | " +
			        "/[\\\\u1F5D]/ | " +
			        "/[\\\\u1F5F-\\\\u1F7D]/ | " +
			        "/[\\\\u1F80-\\\\u1FB4]/ | " +
			        "/[\\\\u1FB6-\\\\u1FBC]/ | " +
			        "/[\\\\u1FBE]/ | " +
			        "/[\\\\u1FC2-\\\\u1FC4]/ | " +
			        "/[\\\\u1FC6-\\\\u1FCC]/ | " +
			        "/[\\\\u1FD0-\\\\u1FD3]/ | " +
			        "/[\\\\u1FD6-\\\\u1FDB]/ | " +
			        "/[\\\\u1FE0-\\\\u1FEC]/ | " +
			        "/[\\\\u1FF2-\\\\u1FF4]/ | " +
			        "/[\\\\u1FF6-\\\\u1FFC]/ | " +
			        "/[\\\\u207F]/ | " +
			        "/[\\\\u2102]/ | " +
			        "/[\\\\u2107]/ | " +
			        "/[\\\\u210A-\\\\u2113]/ | " +
			        "/[\\\\u2115]/ | " +
			        "/[\\\\u2119-\\\\u211D]/ | " +
			        "/[\\\\u2124]/ | " +
			        "/[\\\\u2126]/ | " +
			        "/[\\\\u2128]/ | " +
			        "/[\\\\u212A-\\\\u212D]/ | " +
			        "/[\\\\u212F-\\\\u2131]/ | " +
			        "/[\\\\u2133-\\\\u2139]/ | " +
			        "/[\\\\u2160-\\\\u2183]/ | " +
			        "/[\\\\u3005-\\\\u3007]/ | " +
			        "/[\\\\u3021-\\\\u3029]/ | " +
			        "/[\\\\u3031-\\\\u3035]/ | " +
			        "/[\\\\u3038-\\\\u303A]/ | " +
			        "/[\\\\u3041-\\\\u3094]/ | " +
			        "/[\\\\u309D-\\\\u309E]/ | " +
			        "/[\\\\u30A1-\\\\u30FA]/ | " +
			        "/[\\\\u30FC-\\\\u30FE]/ | " +
			        "/[\\\\u3105-\\\\u312C]/ | " +
			        "/[\\\\u3131-\\\\u318E]/ | " +
			        "/[\\\\u31A0-\\\\u31B7]/ | " +
			        "/[\\\\u3400]/ | " +
			        "/[\\\\u4DB5]/ | " +
			        "/[\\\\u4E00]/ | " +
			        "/[\\\\u9FA5]/ | " +
			        "/[\\\\uA000-\\\\uA48C]/ | " +
			        "/[\\\\uAC00]/ | " +
			        "/[\\\\uD7A3]/ | " +
			        "/[\\\\uF900-\\\\uFA2D]/ | " +
			        "/[\\\\uFB00-\\\\uFB06]/ | " +
			        "/[\\\\uFB13-\\\\uFB17]/ | " +
			        "/[\\\\uFB1D]/ | " +
			        "/[\\\\uFB1F-\\\\uFB28]/ | " +
			        "/[\\\\uFB2A-\\\\uFB36]/ | " +
			        "/[\\\\uFB38-\\\\uFB3C]/ | " +
			        "/[\\\\uFB3E]/ | " +
			        "/[\\\\uFB40-\\\\uFB41]/ | " +
			        "/[\\\\uFB43-\\\\uFB44]/ | " +
			        "/[\\\\uFB46-\\\\uFBB1]/ | " +
			        "/[\\\\uFBD3-\\\\uFD3D]/ | " +
			        "/[\\\\uFD50-\\\\uFD8F]/ | " +
			        "/[\\\\uFD92-\\\\uFDC7]/ | " +
			        "/[\\\\uFDF0-\\\\uFDFB]/ | " +
			        "/[\\\\uFE70-\\\\uFE72]/ | " +
			        "/[\\\\uFE74]/ | " +
			        "/[\\\\uFE76-\\\\uFEFC]/ | " +
			        "/[\\\\uFF21-\\\\uFF3A]/ | " +
			        "/[\\\\uFF41-\\\\uFF5A]/ | " +
			        "/[\\\\uFF66-\\\\uFFBE]/ | " +
			        "/[\\\\uFFC2-\\\\uFFC7]/ | " +
			        "/[\\\\uFFCA-\\\\uFFCF]/ | " +
			        "/[\\\\uFFD2-\\\\uFFD7]/ | " +
			        "/[\\\\uFFDA-\\\\uFFDC]/ " + ";\n\n"
			        );
			    System.out.println("UnicodeCombiningMark = " +
			        "/[\\\\u0300-\\\\u034E]/ | " +
			        "/[\\\\u0360-\\\\u0362]/ | " +
			        "/[\\\\u0483-\\\\u0486]/ | " +
			        "/[\\\\u0591-\\\\u05A1]/ | " +
			        "/[\\\\u05A3-\\\\u05B9]/ | " +
			        "/[\\\\u05BB-\\\\u05BD]/ | " +
			        "/[\\\\u05BF]/ | " +
			        "/[\\\\u05C1-\\\\u05C2]/ | " +
			        "/[\\\\u05C4]/ | " +
			        "/[\\\\u064B-\\\\u0655]/ | " +
			        "/[\\\\u0670]/ | " +
			        "/[\\\\u06D6-\\\\u06DC]/ | " +
			        "/[\\\\u06DF-\\\\u06E4]/ | " +
			        "/[\\\\u06E7-\\\\u06E8]/ | " +
			        "/[\\\\u06EA-\\\\u06ED]/ | " +
			        "/[\\\\u0711]/ | " +
			        "/[\\\\u0730-\\\\u074A]/ | " +
			        "/[\\\\u07A6-\\\\u07B0]/ | " +
			        "/[\\\\u0901-\\\\u0903]/ | " +
			        "/[\\\\u093C]/ | " +
			        "/[\\\\u093E-\\\\u094D]/ | " +
			        "/[\\\\u0951-\\\\u0954]/ | " +
			        "/[\\\\u0962-\\\\u0963]/ | " +
			        "/[\\\\u0981-\\\\u0983]/ | " +
			        "/[\\\\u09BC-\\\\u09C4]/ | " +
			        "/[\\\\u09C7-\\\\u09C8]/ | " +
			        "/[\\\\u09CB-\\\\u09CD]/ | " +
			        "/[\\\\u09D7]/ | " +
			        "/[\\\\u09E2-\\\\u09E3]/ | " +
			        "/[\\\\u0A02]/ | " +
			        "/[\\\\u0A3C]/ | " +
			        "/[\\\\u0A3E-\\\\u0A42]/ | " +
			        "/[\\\\u0A47-\\\\u0A48]/ | " +
			        "/[\\\\u0A4B-\\\\u0A4D]/ | " +
			        "/[\\\\u0A70-\\\\u0A71]/ | " +
			        "/[\\\\u0A81-\\\\u0A83]/ | " +
			        "/[\\\\u0ABC]/ | " +
			        "/[\\\\u0ABE-\\\\u0AC5]/ | " +
			        "/[\\\\u0AC7-\\\\u0AC9]/ | " +
			        "/[\\\\u0ACB-\\\\u0ACD]/ | " +
			        "/[\\\\u0B01-\\\\u0B03]/ | " +
			        "/[\\\\u0B3C]/ | " +
			        "/[\\\\u0B3E-\\\\u0B43]/ | " +
			        "/[\\\\u0B47-\\\\u0B48]/ | " +
			        "/[\\\\u0B4B-\\\\u0B4D]/ | " +
			        "/[\\\\u0B56-\\\\u0B57]/ | " +
			        "/[\\\\u0B82-\\\\u0B83]/ | " +
			        "/[\\\\u0BBE-\\\\u0BC2]/ | " +
			        "/[\\\\u0BC6-\\\\u0BC8]/ | " +
			        "/[\\\\u0BCA-\\\\u0BCD]/ | " +
			        "/[\\\\u0BD7]/ | " +
			        "/[\\\\u0C01-\\\\u0C03]/ | " +
			        "/[\\\\u0C3E-\\\\u0C44]/ | " +
			        "/[\\\\u0C46-\\\\u0C48]/ | " +
			        "/[\\\\u0C4A-\\\\u0C4D]/ | " +
			        "/[\\\\u0C55-\\\\u0C56]/ | " +
			        "/[\\\\u0C82-\\\\u0C83]/ | " +
			        "/[\\\\u0CBE-\\\\u0CC4]/ | " +
			        "/[\\\\u0CC6-\\\\u0CC8]/ | " +
			        "/[\\\\u0CCA-\\\\u0CCD]/ | " +
			        "/[\\\\u0CD5-\\\\u0CD6]/ | " +
			        "/[\\\\u0D02-\\\\u0D03]/ | " +
			        "/[\\\\u0D3E-\\\\u0D43]/ | " +
			        "/[\\\\u0D46-\\\\u0D48]/ | " +
			        "/[\\\\u0D4A-\\\\u0D4D]/ | " +
			        "/[\\\\u0D57]/ | " +
			        "/[\\\\u0D82-\\\\u0D83]/ | " +
			        "/[\\\\u0DCA]/ | " +
			        "/[\\\\u0DCF-\\\\u0DD4]/ | " +
			        "/[\\\\u0DD6]/ | " +
			        "/[\\\\u0DD8-\\\\u0DDF]/ | " +
			        "/[\\\\u0DF2-\\\\u0DF3]/ | " +
			        "/[\\\\u0E31]/ | " +
			        "/[\\\\u0E34-\\\\u0E3A]/ | " +
			        "/[\\\\u0E47-\\\\u0E4E]/ | " +
			        "/[\\\\u0EB1]/ | " +
			        "/[\\\\u0EB4-\\\\u0EB9]/ | " +
			        "/[\\\\u0EBB-\\\\u0EBC]/ | " +
			        "/[\\\\u0EC8-\\\\u0ECD]/ | " +
			        "/[\\\\u0F18-\\\\u0F19]/ | " +
			        "/[\\\\u0F35]/ | " +
			        "/[\\\\u0F37]/ | " +
			        "/[\\\\u0F39]/ | " +
			        "/[\\\\u0F3E-\\\\u0F3F]/ | " +
			        "/[\\\\u0F71-\\\\u0F84]/ | " +
			        "/[\\\\u0F86-\\\\u0F87]/ | " +
			        "/[\\\\u0F90-\\\\u0F97]/ | " +
			        "/[\\\\u0F99-\\\\u0FBC]/ | " +
			        "/[\\\\u0FC6]/ | " +
			        "/[\\\\u102C-\\\\u1032]/ | " +
			        "/[\\\\u1036-\\\\u1039]/ | " +
			        "/[\\\\u1056-\\\\u1059]/ | " +
			        "/[\\\\u17B4-\\\\u17D3]/ | " +
			        "/[\\\\u18A9]/ | " +
			        "/[\\\\u20D0-\\\\u20DC]/ | " +
			        "/[\\\\u20E1]/ | " +
			        "/[\\\\u302A-\\\\u302F]/ | " +
			        "/[\\\\u3099-\\\\u309A]/ | " +
			        "/[\\\\uFB1E]/ | " +
			        "/[\\\\uFE20-\\\\uFE23]/ " +
			        ";\n\n");
			    System.out.println("UnicodeDigit = " +
			        "/[\\\\u0030-\\\\u0039]/ | " +
			        "/[\\\\u0660-\\\\u0669]/ | " +
			        "/[\\\\u06F0-\\\\u06F9]/ | " +
			        "/[\\\\u0966-\\\\u096F]/ | " +
			        "/[\\\\u09E6-\\\\u09EF]/ | " +
			        "/[\\\\u0A66-\\\\u0A6F]/ | " +
			        "/[\\\\u0AE6-\\\\u0AEF]/ | " +
			        "/[\\\\u0B66-\\\\u0B6F]/ | " +
			        "/[\\\\u0BE7-\\\\u0BEF]/ | " +
			        "/[\\\\u0C66-\\\\u0C6F]/ | " +
			        "/[\\\\u0CE6-\\\\u0CEF]/ | " +
			        "/[\\\\u0D66-\\\\u0D6F]/ | " +
			        "/[\\\\u0E50-\\\\u0E59]/ | " +
			        "/[\\\\u0ED0-\\\\u0ED9]/ | " +
			        "/[\\\\u0F20-\\\\u0F29]/ | " +
			        "/[\\\\u1040-\\\\u1049]/ | " +
			        "/[\\\\u1369-\\\\u1371]/ | " +
			        "/[\\\\u17E0-\\\\u17E9]/ | " +
			        "/[\\\\u1810-\\\\u1819]/ | " +
			        "/[\\\\uFF10-\\\\uFF19]/ " +
			        ";\n\n");
			    System.out.println("SemiColon = \";\" ;\n\n");
			    System.out.println("If = \"if\" ;\n\n");
			    System.out.println("Else = \"else\" ;\n\n");
			    System.out.println("StringLiteral = " +
			        "(\"\\\"\" DoubleStringCharacter* \"\\\"\" | \"'\" SingleStringCharacter* \"'\") " +
			        ";\n\n");
			    System.out.println("DoubleStringCharacter = " +
			        "/[^\\\"\\\\\\r\\n]/ | " +
			        " \"\\\\\" EscapeSequence | " +
			        "LineContinuation " +
			        ";\n\n");
			    System.out.println("EscapeSequence = " +
			        "CharacterEscapeSequence | " +
			        "\"0\" | " +
			        "HexEscapeSequence | " +
			        "UnicodeEscapeSequence | " +
			        "ExtendedUnicodeEscapeSequence " +
			        ";\n\n");
			    System.out.println("CharacterEscapeSequence = " +
			        "SingleEscapeCharacter | NonEscapeCharacter " +
			        ";\n\n");
			    System.out.println("SingleEscapeCharacter = " +
			        "/['\\\"\\\\\\n\\r\\t]/" +
			        ";\n\n");
			    System.out.println("NonEscapeCharacter = " +
			        "/[^'\\\"\\\\\n\\r\\tv0-9xu]/ " +    // WTF is this
			        ";\n\n");
			    System.out.println("HexEscapeSequence = " +
			        "\"x\" HexDigit HexDigit " +
			        ";\n\n");
			    System.out.println("ExtendedUnicodeEscapeSequence = " +
			        "\"u\" \"{\" HexDigit+ \"}\"" +
			        ";\n\n");
			    System.out.println("LineContinuation = " +
			        "\"\\\\\" /[\\r\\n\\\\u2028\\\\u2029]/" +
			        ";\n\n");
			    System.out.println("SingleStringCharacter = " +
			        "/[^'\\\\\\r\\n]/ | " +
			        "\"\\\\\" EscapeSequence | " +
			        "LineContinuation " +
			        ";\n\n");
			    System.out.println("NullLiteral = " +
			        "\"null\"" +
			        ";\n\n");
			    System.out.println("BooleanLiteral = " +
			        "\"true\" | " +
			        "\"false\"" +
			        ";\n\n");
			    System.out.println("TemplateStringLiteral = " +
			        " \"`\" (\"\\\\`\" | /[^`]/)* \"`\" " +
			        ";\n\n");
			    System.out.println("RegularExpressionLiteral = " +
			        "\"/\" RegularExpressionChar+ \"/\" IdentifierPart*" +
			        ";\n\n");
			    System.out.println("RegularExpressionChar = " +
			        "/[^\\r\\n\\\\u2028\\\\u2029\\/[]/ | " +
			        "RegularExpressionBackslashSequence | " +
			        "\"[\" RegularExpressionClassChar* \"]\"" +
			        ";\n\n");
			    System.out.println("RegularExpressionBackslashSequence = " +
			        "\"\\\\\" /[^\\r\\n\\\\u2028\\\\u2029]/" +
			        ";\n\n");
			    System.out.println("RegularExpressionClassChar = " +
			        "/[^\\r\\n\\\\u2028\\\\u2029]/ | " +
			        "RegularExpressionBackslashSequence" +
			        ";\n\n");
			    System.out.println("DecimalLiteral = " +
			        "DecimalIntegerLiteral \".\" /[0-9]/* ExponentPart? | " +
			        "\".\" /[0-9]/+ ExponentPart? | " +
			        "DecimalIntegerLiteral ExponentPart?" +
			        ";\n\n");
			    System.out.println("ExponentPart = " +
			        "/[eE]/ /[+-]/? /[0-9]/+" +
			        ";\n\n");
			    System.out.println("DecimalIntegerLiteral = " +
			        "\"0\" | " +
			        "/[1-9]/ /[0-9]/*" +
			        ";\n\n");
			    System.out.println("HexIntegerLiteral = " +
			        "\"0\" /[xX]/ HexDigit+" +
			        ";\n\n");
			    System.out.println("OctalIntegerLiteral = " +
			        "\"0\" /[0-7]/+" +
			        ";\n\n");
			    System.out.println("OctalIntegerLiteral2 = " +
			        "\"0\" /[oO]/ /[0-7]/+" +
			        ";\n\n");
			    System.out.println("BinaryIntegerLiteral = " +
			        "\"0\" /[bB]/ /[01]/+" +
			        ";\n\n");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaScriptParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(125);
				sourceElements();
				}
				break;
			}
			setState(128);
			match(EOF);
			 _var_program_0 ++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Export() { return getToken(JavaScriptParser.Export, 0); }
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitSourceElement(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sourceElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(131);
				match(Export);
				}
				break;
			}
			setState(134);
			statement();
			 _var_sourceElement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				block();
				 _var_statement_0++; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				variableStatement();
				 _var_statement_1++; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				emptyStatement();
				 _var_statement_2++; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				expressionStatement();
				 _var_statement_3++; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				ifStatement();
				 _var_statement_4++; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				iterationStatement();
				 _var_statement_5++; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				continueStatement();
				 _var_statement_6++; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				breakStatement();
				 _var_statement_7++; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				returnStatement();
				 _var_statement_8++; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				withStatement();
				 _var_statement_9++; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(167);
				labelledStatement();
				 _var_statement_10++; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(170);
				switchStatement();
				 _var_statement_11++; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(173);
				throwStatement();
				 _var_statement_12++; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(176);
				tryStatement();
				 _var_statement_13++; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(179);
				debuggerStatement();
				 _var_statement_14++; 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(182);
				functionDeclaration();
				 _var_statement_15++; 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(185);
				classDeclaration();
				 _var_statement_16++; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(OpenBrace);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(191);
				statementList();
				}
				break;
			}
			setState(194);
			match(CloseBrace);
			 _var_block_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(197);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			 _var_statementList_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			varModifier();
			setState(205);
			variableDeclarationList();
			setState(206);
			eos();
			 _var_variableStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			variableDeclaration();
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					match(Comma);
					setState(211);
					variableDeclaration();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			 _var_variableDeclarationList_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(219);
				match(Identifier);
				}
				break;
			case OpenBracket:
				{
				setState(220);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				setState(221);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(224);
				match(Assign);
				setState(225);
				singleExpression(0);
				}
				break;
			}
			 _var_variableDeclaration_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JavaScriptParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(SemiColon);
			 _var_emptyStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			if (!(notOpenBraceAndNotFunction())) throw new FailedPredicateException(this, "notOpenBraceAndNotFunction()");
			setState(234);
			expressionSequence();
			setState(235);
			eos();
			 _var_expressionStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JavaScriptParser.If, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(JavaScriptParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(If);
			setState(239);
			match(OpenParen);
			setState(240);
			expressionSequence();
			setState(241);
			match(CloseParen);
			setState(242);
			statement();
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(243);
				match(Else);
				setState(244);
				statement();
				}
				break;
			}
			 _var_ifStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(JavaScriptParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(JavaScriptParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitDoStatement(this);
		}
	}
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JavaScriptParser.For, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterForVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitForVarStatement(this);
		}
	}
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JavaScriptParser.For, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode In() { return getToken(JavaScriptParser.In, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterForVarInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitForVarInStatement(this);
		}
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(JavaScriptParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitWhileStatement(this);
		}
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JavaScriptParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitForStatement(this);
		}
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JavaScriptParser.For, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode In() { return getToken(JavaScriptParser.In, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitForInStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iterationStatement);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(Do);
				setState(250);
				statement();
				setState(251);
				match(While);
				setState(252);
				match(OpenParen);
				setState(253);
				expressionSequence();
				setState(254);
				match(CloseParen);
				setState(255);
				eos();
				 _var_iterationStatement_0++; 
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(While);
				setState(259);
				match(OpenParen);
				setState(260);
				expressionSequence();
				setState(261);
				match(CloseParen);
				setState(262);
				statement();
				 _var_iterationStatement_1++; 
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(For);
				setState(266);
				match(OpenParen);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << OctalIntegerLiteral2) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
					{
					setState(267);
					expressionSequence();
					}
				}

				setState(270);
				match(SemiColon);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << OctalIntegerLiteral2) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
					{
					setState(271);
					expressionSequence();
					}
				}

				setState(274);
				match(SemiColon);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << OctalIntegerLiteral2) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
					{
					setState(275);
					expressionSequence();
					}
				}

				setState(278);
				match(CloseParen);
				setState(279);
				statement();
				 _var_iterationStatement_2++; 
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(For);
				setState(283);
				match(OpenParen);
				setState(284);
				varModifier();
				setState(285);
				variableDeclarationList();
				setState(286);
				match(SemiColon);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << OctalIntegerLiteral2) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
					{
					setState(287);
					expressionSequence();
					}
				}

				setState(290);
				match(SemiColon);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << OctalIntegerLiteral2) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
					{
					setState(291);
					expressionSequence();
					}
				}

				setState(294);
				match(CloseParen);
				setState(295);
				statement();
				 _var_iterationStatement_3++; 
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				match(For);
				setState(299);
				match(OpenParen);
				setState(300);
				singleExpression(0);
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case In:
					{
					setState(301);
					match(In);
					}
					break;
				case Identifier:
					{
					setState(302);
					match(Identifier);
					setState(303);
					if (!(p("of"))) throw new FailedPredicateException(this, "p(\"of\")");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(306);
				expressionSequence();
				setState(307);
				match(CloseParen);
				setState(308);
				statement();
				 _var_iterationStatement_4++; 
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				match(For);
				setState(312);
				match(OpenParen);
				setState(313);
				varModifier();
				setState(314);
				variableDeclaration();
				setState(318);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case In:
					{
					setState(315);
					match(In);
					}
					break;
				case Identifier:
					{
					setState(316);
					match(Identifier);
					setState(317);
					if (!(p("of"))) throw new FailedPredicateException(this, "p(\"of\")");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320);
				expressionSequence();
				setState(321);
				match(CloseParen);
				setState(322);
				statement();
				 _var_iterationStatement_5++; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(JavaScriptParser.Var, 0); }
		public TerminalNode Let() { return getToken(JavaScriptParser.Let, 0); }
		public TerminalNode Const() { return getToken(JavaScriptParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitVarModifier(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varModifier);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(Var);
				 _var_varModifier_0++; 
				}
				break;
			case Let:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(Let);
				 _var_varModifier_1++; 
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(Const);
				 _var_varModifier_2++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(JavaScriptParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(Continue);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(336);
				if (!(notLineTerminator())) throw new FailedPredicateException(this, "notLineTerminator()");
				setState(337);
				match(Identifier);
				}
				break;
			}
			setState(340);
			eos();
			 _var_continueStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(JavaScriptParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(Break);
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(344);
				if (!(notLineTerminator())) throw new FailedPredicateException(this, "notLineTerminator()");
				setState(345);
				match(Identifier);
				}
				break;
			}
			setState(348);
			eos();
			 _var_breakStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JavaScriptParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(Return);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(352);
				if (!(notLineTerminator())) throw new FailedPredicateException(this, "notLineTerminator()");
				setState(353);
				expressionSequence();
				}
				break;
			}
			setState(356);
			eos();
			 _var_returnStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(JavaScriptParser.With, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitWithStatement(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(With);
			setState(360);
			match(OpenParen);
			setState(361);
			expressionSequence();
			setState(362);
			match(CloseParen);
			setState(363);
			statement();
			 _var_withStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(JavaScriptParser.Switch, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Switch);
			setState(367);
			match(OpenParen);
			setState(368);
			expressionSequence();
			setState(369);
			match(CloseParen);
			setState(370);
			caseBlock();
			 _var_switchStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitCaseBlock(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(OpenBrace);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(374);
				caseClauses();
				}
			}

			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(377);
				defaultClause();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(378);
					caseClauses();
					}
				}

				}
			}

			setState(383);
			match(CloseBrace);
			 _var_caseBlock_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitCaseClauses(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(386);
				caseClause();
				}
				}
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			 _var_caseClauses_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(JavaScriptParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitCaseClause(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(Case);
			setState(394);
			expressionSequence();
			setState(395);
			match(Colon);
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(396);
				statementList();
				}
				break;
			}
			 _var_caseClause_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(JavaScriptParser.Default, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitDefaultClause(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(Default);
			setState(402);
			match(Colon);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(403);
				statementList();
				}
				break;
			}
			 _var_defaultClause_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLabelledStatement(this);
		}
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(Identifier);
			setState(409);
			match(Colon);
			setState(410);
			statement();
			 _var_labelledStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(JavaScriptParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(Throw);
			setState(414);
			if (!(notLineTerminator())) throw new FailedPredicateException(this, "notLineTerminator()");
			setState(415);
			expressionSequence();
			setState(416);
			eos();
			 _var_throwStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(JavaScriptParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(Try);
			setState(420);
			block();
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(421);
				catchProduction();
				setState(423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(422);
					finallyProduction();
					}
					break;
				}
				}
				break;
			case Finally:
				{
				setState(425);
				finallyProduction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 _var_tryStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(JavaScriptParser.Catch, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitCatchProduction(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_catchProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(Catch);
			setState(431);
			match(OpenParen);
			setState(432);
			match(Identifier);
			setState(433);
			match(CloseParen);
			setState(434);
			block();
			 _var_catchProduction_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(JavaScriptParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFinallyProduction(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(Finally);
			setState(438);
			block();
			 _var_finallyProduction_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(JavaScriptParser.Debugger, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterDebuggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitDebuggerStatement(this);
		}
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(Debugger);
			setState(442);
			eos();
			 _var_debuggerStatement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(JavaScriptParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(Function);
			setState(446);
			match(Identifier);
			setState(447);
			match(OpenParen);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
				{
				setState(448);
				formalParameterList();
				}
			}

			setState(451);
			match(CloseParen);
			setState(452);
			match(OpenBrace);
			setState(453);
			functionBody();
			setState(454);
			match(CloseBrace);
			 _var_functionDeclaration_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(JavaScriptParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(Class);
			setState(458);
			match(Identifier);
			setState(459);
			classTail();
			 _var_classDeclaration_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTailContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(JavaScriptParser.Extends, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterClassTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitClassTail(this);
		}
	}

	public final ClassTailContext classTail() throws RecognitionException {
		ClassTailContext _localctx = new ClassTailContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(462);
				match(Extends);
				setState(463);
				singleExpression(0);
				}
			}

			setState(466);
			match(OpenBrace);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << OctalIntegerLiteral2) | (1L << BinaryIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Instanceof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(467);
				classElement();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(473);
			match(CloseBrace);
			 _var_classTail_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassElementContext extends ParserRuleContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public TerminalNode Static() { return getToken(JavaScriptParser.Static, 0); }
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterClassElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitClassElement(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(476);
				match(Static);
				}
				break;
			}
			setState(479);
			methodDefinition();
			 _var_classElement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public GeneratorMethodContext generatorMethod() {
			return getRuleContext(GeneratorMethodContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMethodDefinition(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_methodDefinition);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				propertyName();
				setState(483);
				match(OpenParen);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
					{
					setState(484);
					formalParameterList();
					}
				}

				setState(487);
				match(CloseParen);
				setState(488);
				match(OpenBrace);
				setState(489);
				functionBody();
				setState(490);
				match(CloseBrace);
				 _var_methodDefinition_0++; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				getter();
				setState(494);
				match(OpenParen);
				setState(495);
				match(CloseParen);
				setState(496);
				match(OpenBrace);
				setState(497);
				functionBody();
				setState(498);
				match(CloseBrace);
				 _var_methodDefinition_1++; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				setter();
				setState(502);
				match(OpenParen);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
					{
					setState(503);
					formalParameterList();
					}
				}

				setState(506);
				match(CloseParen);
				setState(507);
				match(OpenBrace);
				setState(508);
				functionBody();
				setState(509);
				match(CloseBrace);
				 _var_methodDefinition_2++; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				generatorMethod();
				 _var_methodDefinition_3++; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorMethodContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public GeneratorMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterGeneratorMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitGeneratorMethod(this);
		}
	}

	public final GeneratorMethodContext generatorMethod() throws RecognitionException {
		GeneratorMethodContext _localctx = new GeneratorMethodContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_generatorMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(517);
				match(Multiply);
				}
			}

			setState(520);
			match(Identifier);
			setState(521);
			match(OpenParen);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
				{
				setState(522);
				formalParameterList();
				}
			}

			setState(525);
			match(CloseParen);
			setState(526);
			match(OpenBrace);
			setState(527);
			functionBody();
			setState(528);
			match(CloseBrace);
			 _var_generatorMethod_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				formalParameterArg();
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(532);
						match(Comma);
						setState(533);
						formalParameterArg();
						}
						} 
					}
					setState(538);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(539);
					match(Comma);
					setState(540);
					lastFormalParameterArg();
					}
				}

				 _var_formalParameterList_0++; 
				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				lastFormalParameterArg();
				 _var_formalParameterList_1++; 
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				arrayLiteral();
				 _var_formalParameterList_2++; 
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				objectLiteral();
				 _var_formalParameterList_3++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFormalParameterArg(this);
		}
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(Identifier);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(557);
				match(Assign);
				setState(558);
				singleExpression(0);
				}
			}

			 _var_formalParameterArg_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(JavaScriptParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLastFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLastFormalParameterArg(this);
		}
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(Ellipsis);
			setState(564);
			match(Identifier);
			 _var_lastFormalParameterArg_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(567);
				sourceElements();
				}
				break;
			}
			 _var_functionBody_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitSourceElements(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sourceElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(572);
					sourceElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(575); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			 _var_sourceElements_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(OpenBracket);
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(580);
					match(Comma);
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << OctalIntegerLiteral2) | (1L << BinaryIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
				{
				setState(586);
				elementList();
				}
			}

			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(589);
				match(Comma);
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			match(CloseBracket);
			 _var_arrayLiteral_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LastElementContext lastElement() {
			return getRuleContext(LastElementContext.class,0);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_elementList);
		int _la;
		try {
			int _alt;
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case OpenBracket:
			case OpenParen:
			case OpenBrace:
			case PlusPlus:
			case MinusMinus:
			case Plus:
			case Minus:
			case BitNot:
			case Not:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
			case Typeof:
			case New:
			case Void:
			case Function:
			case This:
			case Delete:
			case Class:
			case Super:
			case Identifier:
			case StringLiteral:
			case TemplateStringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				singleExpression(0);
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(600); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(599);
							match(Comma);
							}
							}
							setState(602); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(604);
						singleExpression(0);
						}
						} 
					}
					setState(609);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(611); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(610);
						match(Comma);
						}
						}
						setState(613); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(615);
					lastElement();
					}
					break;
				}
				 _var_elementList_0++; 
				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				lastElement();
				 _var_elementList_1++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastElementContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(JavaScriptParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public LastElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLastElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLastElement(this);
		}
	}

	public final LastElementContext lastElement() throws RecognitionException {
		LastElementContext _localctx = new LastElementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_lastElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(Ellipsis);
			setState(626);
			match(Identifier);
			_var_lastElement_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(OpenBrace);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << Multiply) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << OctalIntegerLiteral2) | (1L << BinaryIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Instanceof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(630);
				propertyAssignment();
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(631);
						match(Comma);
						setState(632);
						propertyAssignment();
						}
						} 
					}
					setState(637);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				}
			}

			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(640);
				match(Comma);
				}
			}

			setState(643);
			match(CloseBrace);
			 _var_objectLiteral_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPropertyExpressionAssignment(this);
		}
	}
	public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterComputedPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitComputedPropertyExpressionAssignment(this);
		}
	}
	public static class PropertyShorthandContext extends PropertyAssignmentContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public PropertyShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPropertyShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPropertyShorthand(this);
		}
	}
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPropertySetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPropertySetter(this);
		}
	}
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPropertyGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPropertyGetter(this);
		}
	}
	public static class MethodPropertyContext extends PropertyAssignmentContext {
		public GeneratorMethodContext generatorMethod() {
			return getRuleContext(GeneratorMethodContext.class,0);
		}
		public MethodPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMethodProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMethodProperty(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_propertyAssignment);
		int _la;
		try {
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				propertyName();
				setState(647);
				_la = _input.LA(1);
				if ( !(_la==Assign || _la==Colon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(648);
				singleExpression(0);
				 _var_propertyAssignment_0++; 
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(OpenBracket);
				setState(652);
				singleExpression(0);
				setState(653);
				match(CloseBracket);
				setState(654);
				match(Colon);
				setState(655);
				singleExpression(0);
				 _var_propertyAssignment_1++; 
				}
				break;
			case 3:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				getter();
				setState(659);
				match(OpenParen);
				setState(660);
				match(CloseParen);
				setState(661);
				match(OpenBrace);
				setState(662);
				functionBody();
				setState(663);
				match(CloseBrace);
				 _var_propertyAssignment_2++; 
				}
				break;
			case 4:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(666);
				setter();
				setState(667);
				match(OpenParen);
				setState(668);
				match(Identifier);
				setState(669);
				match(CloseParen);
				setState(670);
				match(OpenBrace);
				setState(671);
				functionBody();
				setState(672);
				match(CloseBrace);
				 _var_propertyAssignment_3++; 
				}
				break;
			case 5:
				_localctx = new MethodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(675);
				generatorMethod();
				 _var_propertyAssignment_4++; 
				}
				break;
			case 6:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(678);
				match(Identifier);
				 _var_propertyAssignment_5++; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(JavaScriptParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPropertyName(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_propertyName);
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				identifierName();
				 _var_propertyName_0++; 
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				match(StringLiteral);
				 _var_propertyName_1++; 
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				numericLiteral();
				 _var_propertyName_2++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LastArgumentContext lastArgument() {
			return getRuleContext(LastArgumentContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(OpenParen);
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case OpenBracket:
			case OpenParen:
			case OpenBrace:
			case PlusPlus:
			case MinusMinus:
			case Plus:
			case Minus:
			case BitNot:
			case Not:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
			case Typeof:
			case New:
			case Void:
			case Function:
			case This:
			case Delete:
			case Class:
			case Super:
			case Identifier:
			case StringLiteral:
			case TemplateStringLiteral:
				{
				setState(693);
				singleExpression(0);
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(694);
						match(Comma);
						setState(695);
						singleExpression(0);
						}
						} 
					}
					setState(700);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(701);
					match(Comma);
					setState(702);
					lastArgument();
					}
				}

				}
				break;
			case Ellipsis:
				{
				setState(705);
				lastArgument();
				}
				break;
			case CloseParen:
				break;
			default:
				break;
			}
			setState(708);
			match(CloseParen);
			 _var_arguments_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastArgumentContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(JavaScriptParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public LastArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLastArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLastArgument(this);
		}
	}

	public final LastArgumentContext lastArgument() throws RecognitionException {
		LastArgumentContext _localctx = new LastArgumentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lastArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(Ellipsis);
			setState(712);
			match(Identifier);
			 _var_lastArgument_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitExpressionSequence(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			singleExpression(0);
			setState(720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(716);
					match(Comma);
					setState(717);
					singleExpression(0);
					}
					} 
				}
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			 _var_expressionSequence_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TemplateStringExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode TemplateStringLiteral() { return getToken(JavaScriptParser.TemplateStringLiteral, 0); }
		public TemplateStringExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterTemplateStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitTemplateStringExpression(this);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitTernaryExpression(this);
		}
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLogicalAndExpression(this);
		}
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPreIncrementExpression(this);
		}
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitObjectLiteralExpression(this);
		}
	}
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(JavaScriptParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitInExpression(this);
		}
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLogicalOrExpression(this);
		}
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNotExpression(this);
		}
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPreDecreaseExpression(this);
		}
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArgumentsExpression(this);
		}
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(JavaScriptParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitThisExpression(this);
		}
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public TerminalNode Function() { return getToken(JavaScriptParser.Function, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFunctionExpression(this);
		}
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitUnaryMinusExpression(this);
		}
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitAssignmentExpression(this);
		}
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPostDecreaseExpression(this);
		}
	}
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(JavaScriptParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitTypeofExpression(this);
		}
	}
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(JavaScriptParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterInstanceofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitInstanceofExpression(this);
		}
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitUnaryPlusExpression(this);
		}
	}
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(JavaScriptParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitDeleteExpression(this);
		}
	}
	public static class ArrowFunctionExpressionContext extends SingleExpressionContext {
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public ArrowFunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArrowFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArrowFunctionExpression(this);
		}
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitEqualityExpression(this);
		}
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBitXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBitXOrExpression(this);
		}
	}
	public static class SuperExpressionContext extends SingleExpressionContext {
		public TerminalNode Super() { return getToken(JavaScriptParser.Super, 0); }
		public SuperExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitSuperExpression(this);
		}
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMultiplicativeExpression(this);
		}
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBitShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBitShiftExpression(this);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitAdditiveExpression(this);
		}
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitRelationalExpression(this);
		}
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPostIncrementExpression(this);
		}
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBitNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBitNotExpression(this);
		}
	}
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(JavaScriptParser.New, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNewExpression(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLiteralExpression(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArrayLiteralExpression(this);
		}
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMemberDotExpression(this);
		}
	}
	public static class ClassExpressionContext extends SingleExpressionContext {
		public TerminalNode Class() { return getToken(JavaScriptParser.Class, 0); }
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public ClassExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterClassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitClassExpression(this);
		}
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMemberIndexExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBitAndExpression(this);
		}
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBitOrExpression(this);
		}
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitAssignmentOperatorExpression(this);
		}
	}
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(JavaScriptParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterVoidExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitVoidExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(726);
				match(Function);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(727);
					match(Identifier);
					}
				}

				setState(730);
				match(OpenParen);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
					{
					setState(731);
					formalParameterList();
					}
				}

				setState(734);
				match(CloseParen);
				setState(735);
				match(OpenBrace);
				setState(736);
				functionBody();
				setState(737);
				match(CloseBrace);
				 _var_singleExpression_0++; 
				}
				break;
			case 2:
				{
				_localctx = new ClassExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(740);
				match(Class);
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(741);
					match(Identifier);
					}
				}

				setState(744);
				classTail();
				 _var_singleExpression_1++; 
				}
				break;
			case 3:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(747);
				match(New);
				setState(748);
				singleExpression(0);
				setState(750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(749);
					arguments();
					}
					break;
				}
				 _var_singleExpression_5++; 
				}
				break;
			case 4:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(754);
				match(Delete);
				setState(755);
				singleExpression(33);
				 _var_singleExpression_8++; 
				}
				break;
			case 5:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(758);
				match(Void);
				setState(759);
				singleExpression(32);
				 _var_singleExpression_9++; 
				}
				break;
			case 6:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(762);
				match(Typeof);
				setState(763);
				singleExpression(31);
				 _var_singleExpression_10++; 
				}
				break;
			case 7:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(766);
				match(PlusPlus);
				setState(767);
				singleExpression(30);
				 _var_singleExpression_11++; 
				}
				break;
			case 8:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(770);
				match(MinusMinus);
				setState(771);
				singleExpression(29);
				 _var_singleExpression_12++; 
				}
				break;
			case 9:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(774);
				match(Plus);
				setState(775);
				singleExpression(28);
				 _var_singleExpression_13++; 
				}
				break;
			case 10:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(778);
				match(Minus);
				setState(779);
				singleExpression(27);
				 _var_singleExpression_14++; 
				}
				break;
			case 11:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(782);
				match(BitNot);
				setState(783);
				singleExpression(26);
				 _var_singleExpression_15++; 
				}
				break;
			case 12:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(786);
				match(Not);
				setState(787);
				singleExpression(25);
				 _var_singleExpression_16++; 
				}
				break;
			case 13:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(790);
				match(This);
				 _var_singleExpression_33++; 
				}
				break;
			case 14:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(792);
				match(Identifier);
				 _var_singleExpression_34++; 
				}
				break;
			case 15:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(794);
				match(Super);
				 _var_singleExpression_35++; 
				}
				break;
			case 16:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(796);
				literal();
				 _var_singleExpression_36++; 
				}
				break;
			case 17:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(799);
				arrayLiteral();
				 _var_singleExpression_37++; 
				}
				break;
			case 18:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(802);
				objectLiteral();
				 _var_singleExpression_38++; 
				}
				break;
			case 19:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(805);
				match(OpenParen);
				setState(806);
				expressionSequence();
				setState(807);
				match(CloseParen);
				 _var_singleExpression_39++; 
				}
				break;
			case 20:
				{
				_localctx = new ArrowFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(810);
				arrowFunctionParameters();
				setState(811);
				match(ARROW);
				setState(812);
				arrowFunctionBody();
				 _var_singleExpression_40++; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(920);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(817);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(818);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(819);
						singleExpression(25);
						 _var_singleExpression_17++; 
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(822);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(823);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(824);
						singleExpression(24);
						 _var_singleExpression_18++; 
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(827);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(828);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(829);
						singleExpression(23);
						 _var_singleExpression_19++; 
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(832);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(833);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(834);
						singleExpression(22);
						 _var_singleExpression_20++; 
						}
						break;
					case 5:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(837);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(838);
						match(Instanceof);
						setState(839);
						singleExpression(21);
						 _var_singleExpression_21++; 
						}
						break;
					case 6:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(842);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(843);
						match(In);
						setState(844);
						singleExpression(20);
						 _var_singleExpression_22++; 
						}
						break;
					case 7:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(847);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(848);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals_) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(849);
						singleExpression(19);
						 _var_singleExpression_23++; 
						}
						break;
					case 8:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(852);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(853);
						match(BitAnd);
						setState(854);
						singleExpression(18);
						 _var_singleExpression_24++; 
						}
						break;
					case 9:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(857);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(858);
						match(BitXOr);
						setState(859);
						singleExpression(17);
						 _var_singleExpression_25++; 
						}
						break;
					case 10:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(862);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(863);
						match(BitOr);
						setState(864);
						singleExpression(16);
						 _var_singleExpression_26++; 
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(867);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(868);
						match(And);
						setState(869);
						singleExpression(15);
						 _var_singleExpression_27++; 
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(872);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(873);
						match(Or);
						setState(874);
						singleExpression(14);
						 _var_singleExpression_28++; 
						}
						break;
					case 13:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(877);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(878);
						match(QuestionMark);
						setState(879);
						singleExpression(0);
						setState(880);
						match(Colon);
						setState(881);
						singleExpression(13);
						 _var_singleExpression_29++; 
						}
						break;
					case 14:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(884);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(885);
						match(Assign);
						setState(886);
						singleExpression(12);
						 _var_singleExpression_30++; 
						}
						break;
					case 15:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(889);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(890);
						assignmentOperator();
						setState(891);
						singleExpression(11);
						 _var_singleExpression_31++; 
						}
						break;
					case 16:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(894);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(895);
						match(OpenBracket);
						setState(896);
						expressionSequence();
						setState(897);
						match(CloseBracket);
						 _var_singleExpression_2++; 
						}
						break;
					case 17:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(900);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(901);
						match(Dot);
						setState(902);
						identifierName();
						 _var_singleExpression_3++; 
						}
						break;
					case 18:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(905);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(906);
						arguments();
						 _var_singleExpression_4++; 
						}
						break;
					case 19:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(909);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(910);
						if (!(notLineTerminator())) throw new FailedPredicateException(this, "notLineTerminator()");
						setState(911);
						match(PlusPlus);
						 _var_singleExpression_6++; 
						}
						break;
					case 20:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(913);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(914);
						if (!(notLineTerminator())) throw new FailedPredicateException(this, "notLineTerminator()");
						setState(915);
						match(MinusMinus);
						 _var_singleExpression_7++; 
						}
						break;
					case 21:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(917);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(918);
						match(TemplateStringLiteral);
						 _var_singleExpression_32++; 
						}
						break;
					}
					} 
				}
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrowFunctionParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArrowFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArrowFunctionParameters(this);
		}
	}

	public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
		ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				match(Identifier);
				 _var_arrowFunctionParameters_0++; 
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				match(OpenParen);
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
					{
					setState(928);
					formalParameterList();
					}
				}

				setState(931);
				match(CloseParen);
				 _var_arrowFunctionParameters_1++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionBodyContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArrowFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArrowFunctionBody(this);
		}
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrowFunctionBody);
		try {
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				singleExpression(0);
				 _var_arrowFunctionBody_0++; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(OpenBrace);
				setState(939);
				functionBody();
				setState(940);
				match(CloseBrace);
				 _var_arrowFunctionBody_1++; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignmentOperator);
		try {
			setState(967);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MultiplyAssign:
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
				match(MultiplyAssign);
				 _var_assignmentOperator_0++; 
				}
				break;
			case DivideAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				match(DivideAssign);
				 _var_assignmentOperator_1++; 
				}
				break;
			case ModulusAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(949);
				match(ModulusAssign);
				 _var_assignmentOperator_2++; 
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(951);
				match(PlusAssign);
				 _var_assignmentOperator_3++; 
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(953);
				match(MinusAssign);
				 _var_assignmentOperator_4++; 
				}
				break;
			case LeftShiftArithmeticAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(955);
				match(LeftShiftArithmeticAssign);
				 _var_assignmentOperator_5++; 
				}
				break;
			case RightShiftArithmeticAssign:
				enterOuterAlt(_localctx, 7);
				{
				setState(957);
				match(RightShiftArithmeticAssign);
				 _var_assignmentOperator_6++; 
				}
				break;
			case RightShiftLogicalAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(959);
				match(RightShiftLogicalAssign);
				 _var_assignmentOperator_7++; 
				}
				break;
			case BitAndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(961);
				match(BitAndAssign);
				 _var_assignmentOperator_8++; 
				}
				break;
			case BitXorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(963);
				match(BitXorAssign);
				 _var_assignmentOperator_9++; 
				}
				break;
			case BitOrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(965);
				match(BitOrAssign);
				 _var_assignmentOperator_10++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(JavaScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaScriptParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaScriptParser.StringLiteral, 0); }
		public TerminalNode TemplateStringLiteral() { return getToken(JavaScriptParser.TemplateStringLiteral, 0); }
		public TerminalNode RegularExpressionLiteral() { return getToken(JavaScriptParser.RegularExpressionLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal);
		try {
			setState(982);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(969);
				match(NullLiteral);
				 _var_literal_0++; 
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				match(BooleanLiteral);
				 _var_literal_1++; 
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(973);
				match(StringLiteral);
				 _var_literal_2++; 
				}
				break;
			case TemplateStringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(975);
				match(TemplateStringLiteral);
				 _var_literal_3++; 
				}
				break;
			case RegularExpressionLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(977);
				match(RegularExpressionLiteral);
				 _var_literal_4++; 
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(979);
				numericLiteral();
				 _var_literal_5++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(JavaScriptParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(JavaScriptParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(JavaScriptParser.OctalIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral2() { return getToken(JavaScriptParser.OctalIntegerLiteral2, 0); }
		public TerminalNode BinaryIntegerLiteral() { return getToken(JavaScriptParser.BinaryIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_numericLiteral);
		try {
			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				match(DecimalLiteral);
				 _var_numericLiteral_0++; 
				}
				break;
			case HexIntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(HexIntegerLiteral);
				 _var_numericLiteral_1++; 
				}
				break;
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(988);
				match(OctalIntegerLiteral);
				 _var_numericLiteral_2++; 
				}
				break;
			case OctalIntegerLiteral2:
				enterOuterAlt(_localctx, 4);
				{
				setState(990);
				match(OctalIntegerLiteral2);
				 _var_numericLiteral_3++; 
				}
				break;
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(992);
				match(BinaryIntegerLiteral);
				 _var_numericLiteral_4++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitIdentifierName(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierName);
		try {
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				match(Identifier);
				 _var_identifierName_0++; 
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				reservedWord();
				 _var_identifierName_1++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(JavaScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaScriptParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitReservedWord(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_reservedWord);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				keyword();
				 _var_reservedWord_0++; 
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(NullLiteral);
				 _var_reservedWord_1++; 
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1008);
				match(BooleanLiteral);
				 _var_reservedWord_2++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(JavaScriptParser.Break, 0); }
		public TerminalNode Do() { return getToken(JavaScriptParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(JavaScriptParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(JavaScriptParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(JavaScriptParser.Case, 0); }
		public TerminalNode Else() { return getToken(JavaScriptParser.Else, 0); }
		public TerminalNode New() { return getToken(JavaScriptParser.New, 0); }
		public TerminalNode Var() { return getToken(JavaScriptParser.Var, 0); }
		public TerminalNode Catch() { return getToken(JavaScriptParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(JavaScriptParser.Finally, 0); }
		public TerminalNode Return() { return getToken(JavaScriptParser.Return, 0); }
		public TerminalNode Void() { return getToken(JavaScriptParser.Void, 0); }
		public TerminalNode Continue() { return getToken(JavaScriptParser.Continue, 0); }
		public TerminalNode For() { return getToken(JavaScriptParser.For, 0); }
		public TerminalNode Switch() { return getToken(JavaScriptParser.Switch, 0); }
		public TerminalNode While() { return getToken(JavaScriptParser.While, 0); }
		public TerminalNode Debugger() { return getToken(JavaScriptParser.Debugger, 0); }
		public TerminalNode Function() { return getToken(JavaScriptParser.Function, 0); }
		public TerminalNode This() { return getToken(JavaScriptParser.This, 0); }
		public TerminalNode With() { return getToken(JavaScriptParser.With, 0); }
		public TerminalNode Default() { return getToken(JavaScriptParser.Default, 0); }
		public TerminalNode If() { return getToken(JavaScriptParser.If, 0); }
		public TerminalNode Throw() { return getToken(JavaScriptParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(JavaScriptParser.Delete, 0); }
		public TerminalNode In() { return getToken(JavaScriptParser.In, 0); }
		public TerminalNode Try() { return getToken(JavaScriptParser.Try, 0); }
		public TerminalNode Class() { return getToken(JavaScriptParser.Class, 0); }
		public TerminalNode Enum() { return getToken(JavaScriptParser.Enum, 0); }
		public TerminalNode Extends() { return getToken(JavaScriptParser.Extends, 0); }
		public TerminalNode Super() { return getToken(JavaScriptParser.Super, 0); }
		public TerminalNode Const() { return getToken(JavaScriptParser.Const, 0); }
		public TerminalNode Export() { return getToken(JavaScriptParser.Export, 0); }
		public TerminalNode Import() { return getToken(JavaScriptParser.Import, 0); }
		public TerminalNode Implements() { return getToken(JavaScriptParser.Implements, 0); }
		public TerminalNode Let() { return getToken(JavaScriptParser.Let, 0); }
		public TerminalNode Private() { return getToken(JavaScriptParser.Private, 0); }
		public TerminalNode Public() { return getToken(JavaScriptParser.Public, 0); }
		public TerminalNode Interface() { return getToken(JavaScriptParser.Interface, 0); }
		public TerminalNode Package() { return getToken(JavaScriptParser.Package, 0); }
		public TerminalNode Protected() { return getToken(JavaScriptParser.Protected, 0); }
		public TerminalNode Static() { return getToken(JavaScriptParser.Static, 0); }
		public TerminalNode Yield() { return getToken(JavaScriptParser.Yield, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_keyword);
		try {
			setState(1096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				match(Break);
				 _var_keyword_0++; 
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(Do);
				 _var_keyword_1++; 
				}
				break;
			case Instanceof:
				enterOuterAlt(_localctx, 3);
				{
				setState(1016);
				match(Instanceof);
				 _var_keyword_2++; 
				}
				break;
			case Typeof:
				enterOuterAlt(_localctx, 4);
				{
				setState(1018);
				match(Typeof);
				 _var_keyword_3++; 
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 5);
				{
				setState(1020);
				match(Case);
				 _var_keyword_4++; 
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 6);
				{
				setState(1022);
				match(Else);
				 _var_keyword_5++; 
				}
				break;
			case New:
				enterOuterAlt(_localctx, 7);
				{
				setState(1024);
				match(New);
				 _var_keyword_6++; 
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 8);
				{
				setState(1026);
				match(Var);
				 _var_keyword_7++; 
				}
				break;
			case Catch:
				enterOuterAlt(_localctx, 9);
				{
				setState(1028);
				match(Catch);
				 _var_keyword_8++; 
				}
				break;
			case Finally:
				enterOuterAlt(_localctx, 10);
				{
				setState(1030);
				match(Finally);
				 _var_keyword_9++; 
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 11);
				{
				setState(1032);
				match(Return);
				 _var_keyword_10++; 
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 12);
				{
				setState(1034);
				match(Void);
				 _var_keyword_11++; 
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 13);
				{
				setState(1036);
				match(Continue);
				 _var_keyword_12++; 
				}
				break;
			case For:
				enterOuterAlt(_localctx, 14);
				{
				setState(1038);
				match(For);
				 _var_keyword_13++; 
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 15);
				{
				setState(1040);
				match(Switch);
				 _var_keyword_14++; 
				}
				break;
			case While:
				enterOuterAlt(_localctx, 16);
				{
				setState(1042);
				match(While);
				 _var_keyword_15++; 
				}
				break;
			case Debugger:
				enterOuterAlt(_localctx, 17);
				{
				setState(1044);
				match(Debugger);
				 _var_keyword_16++; 
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 18);
				{
				setState(1046);
				match(Function);
				 _var_keyword_17++; 
				}
				break;
			case This:
				enterOuterAlt(_localctx, 19);
				{
				setState(1048);
				match(This);
				 _var_keyword_18++; 
				}
				break;
			case With:
				enterOuterAlt(_localctx, 20);
				{
				setState(1050);
				match(With);
				 _var_keyword_19++; 
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 21);
				{
				setState(1052);
				match(Default);
				 _var_keyword_20++; 
				}
				break;
			case If:
				enterOuterAlt(_localctx, 22);
				{
				setState(1054);
				match(If);
				 _var_keyword_21++; 
				}
				break;
			case Throw:
				enterOuterAlt(_localctx, 23);
				{
				setState(1056);
				match(Throw);
				 _var_keyword_22++; 
				}
				break;
			case Delete:
				enterOuterAlt(_localctx, 24);
				{
				setState(1058);
				match(Delete);
				 _var_keyword_23++; 
				}
				break;
			case In:
				enterOuterAlt(_localctx, 25);
				{
				setState(1060);
				match(In);
				 _var_keyword_24++; 
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 26);
				{
				setState(1062);
				match(Try);
				 _var_keyword_25++; 
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 27);
				{
				setState(1064);
				match(Class);
				 _var_keyword_26++; 
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 28);
				{
				setState(1066);
				match(Enum);
				 _var_keyword_27++; 
				}
				break;
			case Extends:
				enterOuterAlt(_localctx, 29);
				{
				setState(1068);
				match(Extends);
				 _var_keyword_28++; 
				}
				break;
			case Super:
				enterOuterAlt(_localctx, 30);
				{
				setState(1070);
				match(Super);
				 _var_keyword_29++; 
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 31);
				{
				setState(1072);
				match(Const);
				 _var_keyword_30++; 
				}
				break;
			case Export:
				enterOuterAlt(_localctx, 32);
				{
				setState(1074);
				match(Export);
				 _var_keyword_31++; 
				}
				break;
			case Import:
				enterOuterAlt(_localctx, 33);
				{
				setState(1076);
				match(Import);
				 _var_keyword_32++; 
				}
				break;
			case Implements:
				enterOuterAlt(_localctx, 34);
				{
				setState(1078);
				match(Implements);
				 _var_keyword_33++; 
				}
				break;
			case Let:
				enterOuterAlt(_localctx, 35);
				{
				setState(1080);
				match(Let);
				 _var_keyword_34++; 
				}
				break;
			case Private:
				enterOuterAlt(_localctx, 36);
				{
				setState(1082);
				match(Private);
				 _var_keyword_35++; 
				}
				break;
			case Public:
				enterOuterAlt(_localctx, 37);
				{
				setState(1084);
				match(Public);
				 _var_keyword_36++; 
				}
				break;
			case Interface:
				enterOuterAlt(_localctx, 38);
				{
				setState(1086);
				match(Interface);
				 _var_keyword_37++; 
				}
				break;
			case Package:
				enterOuterAlt(_localctx, 39);
				{
				setState(1088);
				match(Package);
				 _var_keyword_38++; 
				}
				break;
			case Protected:
				enterOuterAlt(_localctx, 40);
				{
				setState(1090);
				match(Protected);
				 _var_keyword_39++; 
				}
				break;
			case Static:
				enterOuterAlt(_localctx, 41);
				{
				setState(1092);
				match(Static);
				 _var_keyword_40++; 
				}
				break;
			case Yield:
				enterOuterAlt(_localctx, 42);
				{
				setState(1094);
				match(Yield);
				 _var_keyword_41++; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitGetter(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(Identifier);
			setState(1099);
			if (!(p("get"))) throw new FailedPredicateException(this, "p(\"get\")");
			setState(1100);
			propertyName();
			 _var_getter_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitSetter(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(Identifier);
			setState(1104);
			if (!(p("set"))) throw new FailedPredicateException(this, "p(\"set\")");
			setState(1105);
			propertyName();
			 _var_setter_0++; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JavaScriptParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(JavaScriptParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_eos);
		try {
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				match(SemiColon);
				 _var_eos_0++; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				match(EOF);
				 _var_eos_1++; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				 _var_eos_2++; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1114);
				if (!(closeBrace())) throw new FailedPredicateException(this, "closeBrace()");
				 _var_eos_3++; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		case 12:
			return iterationStatement_sempred((IterationStatementContext)_localctx, predIndex);
		case 14:
			return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
		case 15:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 16:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 24:
			return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
		case 49:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 58:
			return getter_sempred((GetterContext)_localctx, predIndex);
		case 59:
			return setter_sempred((SetterContext)_localctx, predIndex);
		case 60:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return notOpenBraceAndNotFunction();
		}
		return true;
	}
	private boolean iterationStatement_sempred(IterationStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return p("of");
		case 2:
			return p("of");
		}
		return true;
	}
	private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return notLineTerminator();
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return notLineTerminator();
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return notLineTerminator();
		}
		return true;
	}
	private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return notLineTerminator();
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 24);
		case 8:
			return precpred(_ctx, 23);
		case 9:
			return precpred(_ctx, 22);
		case 10:
			return precpred(_ctx, 21);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 16);
		case 16:
			return precpred(_ctx, 15);
		case 17:
			return precpred(_ctx, 14);
		case 18:
			return precpred(_ctx, 13);
		case 19:
			return precpred(_ctx, 12);
		case 20:
			return precpred(_ctx, 11);
		case 21:
			return precpred(_ctx, 10);
		case 22:
			return precpred(_ctx, 39);
		case 23:
			return precpred(_ctx, 38);
		case 24:
			return precpred(_ctx, 37);
		case 25:
			return precpred(_ctx, 35);
		case 26:
			return notLineTerminator();
		case 27:
			return precpred(_ctx, 34);
		case 28:
			return notLineTerminator();
		case 29:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean getter_sempred(GetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return p("get");
		}
		return true;
	}
	private boolean setter_sempred(SetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return p("set");
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return lineTerminatorAhead();
		case 33:
			return closeBrace();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3p\u0461\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\3\5\3\u0081\n\3\3\3\3\3\3\3\3\4\5\4\u0087\n\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u00bf\n\5\3\6\3\6\5\6\u00c3\n\6\3\6\3\6\3\6\3\7\6\7\u00c9\n\7\r"+
		"\7\16\7\u00ca\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00d7\n\t\f"+
		"\t\16\t\u00da\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u00e1\n\n\3\n\3\n\5\n\u00e5"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00f8\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010f\n\16"+
		"\3\16\3\16\5\16\u0113\n\16\3\16\3\16\5\16\u0117\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0123\n\16\3\16\3\16\5\16\u0127"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0133\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0141"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u0148\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0150\n\17\3\20\3\20\3\20\5\20\u0155\n\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\5\21\u015d\n\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0165"+
		"\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u017a\n\25\3\25\3\25\5\25\u017e\n"+
		"\25\5\25\u0180\n\25\3\25\3\25\3\25\3\26\6\26\u0186\n\26\r\26\16\26\u0187"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0190\n\27\3\27\3\27\3\30\3\30\3\30"+
		"\5\30\u0197\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u01aa\n\33\3\33\5\33\u01ad\n\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01c4\n\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\5!\u01d3\n!\3!\3!\7!\u01d7\n!\f!\16!\u01da"+
		"\13!\3!\3!\3!\3\"\5\"\u01e0\n\"\3\"\3\"\3\"\3#\3#\3#\5#\u01e8\n#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01fb\n#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\5#\u0206\n#\3$\5$\u0209\n$\3$\3$\3$\5$\u020e\n$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\7%\u0219\n%\f%\16%\u021c\13%\3%\3%\5%\u0220\n%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u022d\n%\3&\3&\3&\5&\u0232\n&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3(\5(\u023b\n(\3(\3(\3)\6)\u0240\n)\r)\16)\u0241\3"+
		")\3)\3*\3*\7*\u0248\n*\f*\16*\u024b\13*\3*\5*\u024e\n*\3*\7*\u0251\n*"+
		"\f*\16*\u0254\13*\3*\3*\3*\3+\3+\6+\u025b\n+\r+\16+\u025c\3+\7+\u0260"+
		"\n+\f+\16+\u0263\13+\3+\6+\u0266\n+\r+\16+\u0267\3+\5+\u026b\n+\3+\3+"+
		"\3+\3+\3+\5+\u0272\n+\3,\3,\3,\3,\3-\3-\3-\3-\7-\u027c\n-\f-\16-\u027f"+
		"\13-\5-\u0281\n-\3-\5-\u0284\n-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\5.\u02ab\n.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02b5\n/\3\60\3\60\3\60\3"+
		"\60\7\60\u02bb\n\60\f\60\16\60\u02be\13\60\3\60\3\60\5\60\u02c2\n\60\3"+
		"\60\5\60\u02c5\n\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\7\62\u02d1\n\62\f\62\16\62\u02d4\13\62\3\62\3\62\3\63\3\63\3\63\5\63"+
		"\u02db\n\63\3\63\3\63\5\63\u02df\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\5\63\u02e9\n\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02f1\n\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0332\n\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\7\63\u039b\n\63\f\63\16\63\u039e\13\63\3\64\3\64\3\64\3\64\5\64"+
		"\u03a4\n\64\3\64\3\64\5\64\u03a8\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u03b2\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u03ca\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u03d9\n\67\38\38\38\38\38\38\38\38\38\38\58\u03e5\n8\39\39"+
		"\39\39\39\59\u03ec\n9\3:\3:\3:\3:\3:\3:\3:\5:\u03f5\n:\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u044b\n;\3<\3<\3<\3<\3<\3=\3=\3=\3="+
		"\3=\3>\3>\3>\3>\3>\3>\3>\3>\5>\u045f\n>\3>\2\3d?\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz\2\b\4\2\16\16\20\20\3\2\31\33\3\2\25\26\3\2\34\36\3\2\37\"\3\2#"+
		"&\2\u04f0\2|\3\2\2\2\4\u0080\3\2\2\2\6\u0086\3\2\2\2\b\u00be\3\2\2\2\n"+
		"\u00c0\3\2\2\2\f\u00c8\3\2\2\2\16\u00ce\3\2\2\2\20\u00d3\3\2\2\2\22\u00e0"+
		"\3\2\2\2\24\u00e8\3\2\2\2\26\u00eb\3\2\2\2\30\u00f0\3\2\2\2\32\u0147\3"+
		"\2\2\2\34\u014f\3\2\2\2\36\u0151\3\2\2\2 \u0159\3\2\2\2\"\u0161\3\2\2"+
		"\2$\u0169\3\2\2\2&\u0170\3\2\2\2(\u0177\3\2\2\2*\u0185\3\2\2\2,\u018b"+
		"\3\2\2\2.\u0193\3\2\2\2\60\u019a\3\2\2\2\62\u019f\3\2\2\2\64\u01a5\3\2"+
		"\2\2\66\u01b0\3\2\2\28\u01b7\3\2\2\2:\u01bb\3\2\2\2<\u01bf\3\2\2\2>\u01cb"+
		"\3\2\2\2@\u01d2\3\2\2\2B\u01df\3\2\2\2D\u0205\3\2\2\2F\u0208\3\2\2\2H"+
		"\u022c\3\2\2\2J\u022e\3\2\2\2L\u0235\3\2\2\2N\u023a\3\2\2\2P\u023f\3\2"+
		"\2\2R\u0245\3\2\2\2T\u0271\3\2\2\2V\u0273\3\2\2\2X\u0277\3\2\2\2Z\u02aa"+
		"\3\2\2\2\\\u02b4\3\2\2\2^\u02b6\3\2\2\2`\u02c9\3\2\2\2b\u02cd\3\2\2\2"+
		"d\u0331\3\2\2\2f\u03a7\3\2\2\2h\u03b1\3\2\2\2j\u03c9\3\2\2\2l\u03d8\3"+
		"\2\2\2n\u03e4\3\2\2\2p\u03eb\3\2\2\2r\u03f4\3\2\2\2t\u044a\3\2\2\2v\u044c"+
		"\3\2\2\2x\u0451\3\2\2\2z\u045e\3\2\2\2|}\5\4\3\2}~\b\2\1\2~\3\3\2\2\2"+
		"\177\u0081\5P)\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0083\7\2\2\3\u0083\u0084\b\3\1\2\u0084\5\3\2\2\2\u0085\u0087"+
		"\7^\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\5\b\5\2\u0089\u008a\b\4\1\2\u008a\7\3\2\2\2\u008b\u008c\5\n\6\2"+
		"\u008c\u008d\b\5\1\2\u008d\u00bf\3\2\2\2\u008e\u008f\5\16\b\2\u008f\u0090"+
		"\b\5\1\2\u0090\u00bf\3\2\2\2\u0091\u0092\5\24\13\2\u0092\u0093\b\5\1\2"+
		"\u0093\u00bf\3\2\2\2\u0094\u0095\5\26\f\2\u0095\u0096\b\5\1\2\u0096\u00bf"+
		"\3\2\2\2\u0097\u0098\5\30\r\2\u0098\u0099\b\5\1\2\u0099\u00bf\3\2\2\2"+
		"\u009a\u009b\5\32\16\2\u009b\u009c\b\5\1\2\u009c\u00bf\3\2\2\2\u009d\u009e"+
		"\5\36\20\2\u009e\u009f\b\5\1\2\u009f\u00bf\3\2\2\2\u00a0\u00a1\5 \21\2"+
		"\u00a1\u00a2\b\5\1\2\u00a2\u00bf\3\2\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5"+
		"\b\5\1\2\u00a5\u00bf\3\2\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\b\5\1\2\u00a8"+
		"\u00bf\3\2\2\2\u00a9\u00aa\5\60\31\2\u00aa\u00ab\b\5\1\2\u00ab\u00bf\3"+
		"\2\2\2\u00ac\u00ad\5&\24\2\u00ad\u00ae\b\5\1\2\u00ae\u00bf\3\2\2\2\u00af"+
		"\u00b0\5\62\32\2\u00b0\u00b1\b\5\1\2\u00b1\u00bf\3\2\2\2\u00b2\u00b3\5"+
		"\64\33\2\u00b3\u00b4\b\5\1\2\u00b4\u00bf\3\2\2\2\u00b5\u00b6\5:\36\2\u00b6"+
		"\u00b7\b\5\1\2\u00b7\u00bf\3\2\2\2\u00b8\u00b9\5<\37\2\u00b9\u00ba\b\5"+
		"\1\2\u00ba\u00bf\3\2\2\2\u00bb\u00bc\5> \2\u00bc\u00bd\b\5\1\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u008b\3\2\2\2\u00be\u008e\3\2\2\2\u00be\u0091\3\2\2\2\u00be"+
		"\u0094\3\2\2\2\u00be\u0097\3\2\2\2\u00be\u009a\3\2\2\2\u00be\u009d\3\2"+
		"\2\2\u00be\u00a0\3\2\2\2\u00be\u00a3\3\2\2\2\u00be\u00a6\3\2\2\2\u00be"+
		"\u00a9\3\2\2\2\u00be\u00ac\3\2\2\2\u00be\u00af\3\2\2\2\u00be\u00b2\3\2"+
		"\2\2\u00be\u00b5\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf"+
		"\t\3\2\2\2\u00c0\u00c2\7\n\2\2\u00c1\u00c3\5\f\7\2\u00c2\u00c1\3\2\2\2"+
		"\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\13\2\2\u00c5\u00c6"+
		"\b\6\1\2\u00c6\13\3\2\2\2\u00c7\u00c9\5\b\5\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\b\7\1\2\u00cd\r\3\2\2\2\u00ce\u00cf\5\34\17\2\u00cf\u00d0"+
		"\5\20\t\2\u00d0\u00d1\5z>\2\u00d1\u00d2\b\b\1\2\u00d2\17\3\2\2\2\u00d3"+
		"\u00d8\5\22\n\2\u00d4\u00d5\7\r\2\2\u00d5\u00d7\5\22\n\2\u00d6\u00d4\3"+
		"\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\b\t\1\2\u00dc\21\3\2\2"+
		"\2\u00dd\u00e1\7i\2\2\u00de\u00e1\5R*\2\u00df\u00e1\5X-\2\u00e0\u00dd"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e3\7\16\2\2\u00e3\u00e5\5d\63\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\n\1\2\u00e7\23\3\2\2\2\u00e8"+
		"\u00e9\7\f\2\2\u00e9\u00ea\b\13\1\2\u00ea\25\3\2\2\2\u00eb\u00ec\6\f\2"+
		"\2\u00ec\u00ed\5b\62\2\u00ed\u00ee\5z>\2\u00ee\u00ef\b\f\1\2\u00ef\27"+
		"\3\2\2\2\u00f0\u00f1\7T\2\2\u00f1\u00f2\7\b\2\2\u00f2\u00f3\5b\62\2\u00f3"+
		"\u00f4\7\t\2\2\u00f4\u00f7\5\b\5\2\u00f5\u00f6\7D\2\2\u00f6\u00f8\5\b"+
		"\5\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\b\r\1\2\u00fa\31\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\5\b\5\2"+
		"\u00fd\u00fe\7N\2\2\u00fe\u00ff\7\b\2\2\u00ff\u0100\5b\62\2\u0100\u0101"+
		"\7\t\2\2\u0101\u0102\5z>\2\u0102\u0103\b\16\1\2\u0103\u0148\3\2\2\2\u0104"+
		"\u0105\7N\2\2\u0105\u0106\7\b\2\2\u0106\u0107\5b\62\2\u0107\u0108\7\t"+
		"\2\2\u0108\u0109\5\b\5\2\u0109\u010a\b\16\1\2\u010a\u0148\3\2\2\2\u010b"+
		"\u010c\7L\2\2\u010c\u010e\7\b\2\2\u010d\u010f\5b\62\2\u010e\u010d\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7\f\2\2\u0111"+
		"\u0113\5b\62\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0116\7\f\2\2\u0115\u0117\5b\62\2\u0116\u0115\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\t\2\2\u0119\u011a\5\b"+
		"\5\2\u011a\u011b\b\16\1\2\u011b\u0148\3\2\2\2\u011c\u011d\7L\2\2\u011d"+
		"\u011e\7\b\2\2\u011e\u011f\5\34\17\2\u011f\u0120\5\20\t\2\u0120\u0122"+
		"\7\f\2\2\u0121\u0123\5b\62\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\7\f\2\2\u0125\u0127\5b\62\2\u0126\u0125\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\t\2\2\u0129"+
		"\u012a\5\b\5\2\u012a\u012b\b\16\1\2\u012b\u0148\3\2\2\2\u012c\u012d\7"+
		"L\2\2\u012d\u012e\7\b\2\2\u012e\u0132\5d\63\2\u012f\u0133\7W\2\2\u0130"+
		"\u0131\7i\2\2\u0131\u0133\6\16\3\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5b\62\2\u0135\u0136\7\t\2\2\u0136"+
		"\u0137\5\b\5\2\u0137\u0138\b\16\1\2\u0138\u0148\3\2\2\2\u0139\u013a\7"+
		"L\2\2\u013a\u013b\7\b\2\2\u013b\u013c\5\34\17\2\u013c\u0140\5\22\n\2\u013d"+
		"\u0141\7W\2\2\u013e\u013f\7i\2\2\u013f\u0141\6\16\4\2\u0140\u013d\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\5b\62\2\u0143"+
		"\u0144\7\t\2\2\u0144\u0145\5\b\5\2\u0145\u0146\b\16\1\2\u0146\u0148\3"+
		"\2\2\2\u0147\u00fb\3\2\2\2\u0147\u0104\3\2\2\2\u0147\u010b\3\2\2\2\u0147"+
		"\u011c\3\2\2\2\u0147\u012c\3\2\2\2\u0147\u0139\3\2\2\2\u0148\33\3\2\2"+
		"\2\u0149\u014a\7F\2\2\u014a\u0150\b\17\1\2\u014b\u014c\7a\2\2\u014c\u0150"+
		"\b\17\1\2\u014d\u014e\7]\2\2\u014e\u0150\b\17\1\2\u014f\u0149\3\2\2\2"+
		"\u014f\u014b\3\2\2\2\u014f\u014d\3\2\2\2\u0150\35\3\2\2\2\u0151\u0154"+
		"\7K\2\2\u0152\u0153\6\20\5\2\u0153\u0155\7i\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\5z>\2\u0157\u0158\b\20"+
		"\1\2\u0158\37\3\2\2\2\u0159\u015c\7?\2\2\u015a\u015b\6\21\6\2\u015b\u015d"+
		"\7i\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\5z>\2\u015f\u0160\b\21\1\2\u0160!\3\2\2\2\u0161\u0164\7I\2\2\u0162"+
		"\u0163\6\22\7\2\u0163\u0165\5b\62\2\u0164\u0162\3\2\2\2\u0164\u0165\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5z>\2\u0167\u0168\b\22\1\2\u0168"+
		"#\3\2\2\2\u0169\u016a\7R\2\2\u016a\u016b\7\b\2\2\u016b\u016c\5b\62\2\u016c"+
		"\u016d\7\t\2\2\u016d\u016e\5\b\5\2\u016e\u016f\b\23\1\2\u016f%\3\2\2\2"+
		"\u0170\u0171\7M\2\2\u0171\u0172\7\b\2\2\u0172\u0173\5b\62\2\u0173\u0174"+
		"\7\t\2\2\u0174\u0175\5(\25\2\u0175\u0176\b\24\1\2\u0176\'\3\2\2\2\u0177"+
		"\u0179\7\n\2\2\u0178\u017a\5*\26\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017f\3\2\2\2\u017b\u017d\5.\30\2\u017c\u017e\5*\26\2\u017d"+
		"\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017b\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\13\2\2\u0182"+
		"\u0183\b\25\1\2\u0183)\3\2\2\2\u0184\u0186\5,\27\2\u0185\u0184\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\b\26\1\2\u018a+\3\2\2\2\u018b\u018c\7C\2\2\u018c"+
		"\u018d\5b\62\2\u018d\u018f\7\20\2\2\u018e\u0190\5\f\7\2\u018f\u018e\3"+
		"\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b\27\1\2\u0192"+
		"-\3\2\2\2\u0193\u0194\7S\2\2\u0194\u0196\7\20\2\2\u0195\u0197\5\f\7\2"+
		"\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199"+
		"\b\30\1\2\u0199/\3\2\2\2\u019a\u019b\7i\2\2\u019b\u019c\7\20\2\2\u019c"+
		"\u019d\5\b\5\2\u019d\u019e\b\31\1\2\u019e\61\3\2\2\2\u019f\u01a0\7U\2"+
		"\2\u01a0\u01a1\6\32\b\2\u01a1\u01a2\5b\62\2\u01a2\u01a3\5z>\2\u01a3\u01a4"+
		"\b\32\1\2\u01a4\63\3\2\2\2\u01a5\u01a6\7X\2\2\u01a6\u01ac\5\n\6\2\u01a7"+
		"\u01a9\5\66\34\2\u01a8\u01aa\58\35\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3"+
		"\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01ad\58\35\2\u01ac\u01a7\3\2\2\2\u01ac"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\b\33\1\2\u01af\65\3\2\2"+
		"\2\u01b0\u01b1\7G\2\2\u01b1\u01b2\7\b\2\2\u01b2\u01b3\7i\2\2\u01b3\u01b4"+
		"\7\t\2\2\u01b4\u01b5\5\n\6\2\u01b5\u01b6\b\34\1\2\u01b6\67\3\2\2\2\u01b7"+
		"\u01b8\7H\2\2\u01b8\u01b9\5\n\6\2\u01b9\u01ba\b\35\1\2\u01ba9\3\2\2\2"+
		"\u01bb\u01bc\7O\2\2\u01bc\u01bd\5z>\2\u01bd\u01be\b\36\1\2\u01be;\3\2"+
		"\2\2\u01bf\u01c0\7P\2\2\u01c0\u01c1\7i\2\2\u01c1\u01c3\7\b\2\2\u01c2\u01c4"+
		"\5H%\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c6\7\t\2\2\u01c6\u01c7\7\n\2\2\u01c7\u01c8\5N(\2\u01c8\u01c9\7\13"+
		"\2\2\u01c9\u01ca\b\37\1\2\u01ca=\3\2\2\2\u01cb\u01cc\7Y\2\2\u01cc\u01cd"+
		"\7i\2\2\u01cd\u01ce\5@!\2\u01ce\u01cf\b \1\2\u01cf?\3\2\2\2\u01d0\u01d1"+
		"\7[\2\2\u01d1\u01d3\5d\63\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d8\7\n\2\2\u01d5\u01d7\5B\"\2\u01d6\u01d5\3\2"+
		"\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7\13\2\2\u01dc\u01dd\b"+
		"!\1\2\u01ddA\3\2\2\2\u01de\u01e0\7g\2\2\u01df\u01de\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\5D#\2\u01e2\u01e3\b\"\1\2\u01e3"+
		"C\3\2\2\2\u01e4\u01e5\5\\/\2\u01e5\u01e7\7\b\2\2\u01e6\u01e8\5H%\2\u01e7"+
		"\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7\t"+
		"\2\2\u01ea\u01eb\7\n\2\2\u01eb\u01ec\5N(\2\u01ec\u01ed\7\13\2\2\u01ed"+
		"\u01ee\b#\1\2\u01ee\u0206\3\2\2\2\u01ef\u01f0\5v<\2\u01f0\u01f1\7\b\2"+
		"\2\u01f1\u01f2\7\t\2\2\u01f2\u01f3\7\n\2\2\u01f3\u01f4\5N(\2\u01f4\u01f5"+
		"\7\13\2\2\u01f5\u01f6\b#\1\2\u01f6\u0206\3\2\2\2\u01f7\u01f8\5x=\2\u01f8"+
		"\u01fa\7\b\2\2\u01f9\u01fb\5H%\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2"+
		"\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\7\t\2\2\u01fd\u01fe\7\n\2\2\u01fe\u01ff"+
		"\5N(\2\u01ff\u0200\7\13\2\2\u0200\u0201\b#\1\2\u0201\u0206\3\2\2\2\u0202"+
		"\u0203\5F$\2\u0203\u0204\b#\1\2\u0204\u0206\3\2\2\2\u0205\u01e4\3\2\2"+
		"\2\u0205\u01ef\3\2\2\2\u0205\u01f7\3\2\2\2\u0205\u0202\3\2\2\2\u0206E"+
		"\3\2\2\2\u0207\u0209\7\31\2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2"+
		"\u0209\u020a\3\2\2\2\u020a\u020b\7i\2\2\u020b\u020d\7\b\2\2\u020c\u020e"+
		"\5H%\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0210\7\t\2\2\u0210\u0211\7\n\2\2\u0211\u0212\5N(\2\u0212\u0213\7\13"+
		"\2\2\u0213\u0214\b$\1\2\u0214G\3\2\2\2\u0215\u021a\5J&\2\u0216\u0217\7"+
		"\r\2\2\u0217\u0219\5J&\2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021f\3\2\2\2\u021c\u021a\3\2"+
		"\2\2\u021d\u021e\7\r\2\2\u021e\u0220\5L\'\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\b%\1\2\u0222\u022d\3\2"+
		"\2\2\u0223\u0224\5L\'\2\u0224\u0225\b%\1\2\u0225\u022d\3\2\2\2\u0226\u0227"+
		"\5R*\2\u0227\u0228\b%\1\2\u0228\u022d\3\2\2\2\u0229\u022a\5X-\2\u022a"+
		"\u022b\b%\1\2\u022b\u022d\3\2\2\2\u022c\u0215\3\2\2\2\u022c\u0223\3\2"+
		"\2\2\u022c\u0226\3\2\2\2\u022c\u0229\3\2\2\2\u022dI\3\2\2\2\u022e\u0231"+
		"\7i\2\2\u022f\u0230\7\16\2\2\u0230\u0232\5d\63\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\b&\1\2\u0234K\3\2\2\2\u0235"+
		"\u0236\7\21\2\2\u0236\u0237\7i\2\2\u0237\u0238\b\'\1\2\u0238M\3\2\2\2"+
		"\u0239\u023b\5P)\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u023d\b(\1\2\u023dO\3\2\2\2\u023e\u0240\5\6\4\2\u023f\u023e"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0244\b)\1\2\u0244Q\3\2\2\2\u0245\u0249\7\6\2\2\u0246"+
		"\u0248\7\r\2\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u024e\5T+\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0252\3\2\2"+
		"\2\u024f\u0251\7\r\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255"+
		"\u0256\7\7\2\2\u0256\u0257\b*\1\2\u0257S\3\2\2\2\u0258\u0261\5d\63\2\u0259"+
		"\u025b\7\r\2\2\u025a\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2"+
		"\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\5d\63\2\u025f"+
		"\u025a\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u026a\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0266\7\r\2\2\u0265"+
		"\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\u026b\5V,\2\u026a\u0265\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\b+\1\2\u026d\u0272\3\2\2\2\u026e"+
		"\u026f\5V,\2\u026f\u0270\b+\1\2\u0270\u0272\3\2\2\2\u0271\u0258\3\2\2"+
		"\2\u0271\u026e\3\2\2\2\u0272U\3\2\2\2\u0273\u0274\7\21\2\2\u0274\u0275"+
		"\7i\2\2\u0275\u0276\b,\1\2\u0276W\3\2\2\2\u0277\u0280\7\n\2\2\u0278\u027d"+
		"\5Z.\2\u0279\u027a\7\r\2\2\u027a\u027c\5Z.\2\u027b\u0279\3\2\2\2\u027c"+
		"\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0281\3\2"+
		"\2\2\u027f\u027d\3\2\2\2\u0280\u0278\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0283\3\2\2\2\u0282\u0284\7\r\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7\13\2\2\u0286\u0287\b-\1\2\u0287"+
		"Y\3\2\2\2\u0288\u0289\5\\/\2\u0289\u028a\t\2\2\2\u028a\u028b\5d\63\2\u028b"+
		"\u028c\b.\1\2\u028c\u02ab\3\2\2\2\u028d\u028e\7\6\2\2\u028e\u028f\5d\63"+
		"\2\u028f\u0290\7\7\2\2\u0290\u0291\7\20\2\2\u0291\u0292\5d\63\2\u0292"+
		"\u0293\b.\1\2\u0293\u02ab\3\2\2\2\u0294\u0295\5v<\2\u0295\u0296\7\b\2"+
		"\2\u0296\u0297\7\t\2\2\u0297\u0298\7\n\2\2\u0298\u0299\5N(\2\u0299\u029a"+
		"\7\13\2\2\u029a\u029b\b.\1\2\u029b\u02ab\3\2\2\2\u029c\u029d\5x=\2\u029d"+
		"\u029e\7\b\2\2\u029e\u029f\7i\2\2\u029f\u02a0\7\t\2\2\u02a0\u02a1\7\n"+
		"\2\2\u02a1\u02a2\5N(\2\u02a2\u02a3\7\13\2\2\u02a3\u02a4\b.\1\2\u02a4\u02ab"+
		"\3\2\2\2\u02a5\u02a6\5F$\2\u02a6\u02a7\b.\1\2\u02a7\u02ab\3\2\2\2\u02a8"+
		"\u02a9\7i\2\2\u02a9\u02ab\b.\1\2\u02aa\u0288\3\2\2\2\u02aa\u028d\3\2\2"+
		"\2\u02aa\u0294\3\2\2\2\u02aa\u029c\3\2\2\2\u02aa\u02a5\3\2\2\2\u02aa\u02a8"+
		"\3\2\2\2\u02ab[\3\2\2\2\u02ac\u02ad\5p9\2\u02ad\u02ae\b/\1\2\u02ae\u02b5"+
		"\3\2\2\2\u02af\u02b0\7j\2\2\u02b0\u02b5\b/\1\2\u02b1\u02b2\5n8\2\u02b2"+
		"\u02b3\b/\1\2\u02b3\u02b5\3\2\2\2\u02b4\u02ac\3\2\2\2\u02b4\u02af\3\2"+
		"\2\2\u02b4\u02b1\3\2\2\2\u02b5]\3\2\2\2\u02b6\u02c4\7\b\2\2\u02b7\u02bc"+
		"\5d\63\2\u02b8\u02b9\7\r\2\2\u02b9\u02bb\5d\63\2\u02ba\u02b8\3\2\2\2\u02bb"+
		"\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c1\3\2"+
		"\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c0\7\r\2\2\u02c0\u02c2\5`\61\2\u02c1"+
		"\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c5\5`"+
		"\61\2\u02c4\u02b7\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6\u02c7\7\t\2\2\u02c7\u02c8\b\60\1\2\u02c8_\3\2\2\2"+
		"\u02c9\u02ca\7\21\2\2\u02ca\u02cb\7i\2\2\u02cb\u02cc\b\61\1\2\u02cca\3"+
		"\2\2\2\u02cd\u02d2\5d\63\2\u02ce\u02cf\7\r\2\2\u02cf\u02d1\5d\63\2\u02d0"+
		"\u02ce\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\b\62\1\2\u02d6"+
		"c\3\2\2\2\u02d7\u02d8\b\63\1\2\u02d8\u02da\7P\2\2\u02d9\u02db\7i\2\2\u02da"+
		"\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\7\b"+
		"\2\2\u02dd\u02df\5H%\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0"+
		"\3\2\2\2\u02e0\u02e1\7\t\2\2\u02e1\u02e2\7\n\2\2\u02e2\u02e3\5N(\2\u02e3"+
		"\u02e4\7\13\2\2\u02e4\u02e5\b\63\1\2\u02e5\u0332\3\2\2\2\u02e6\u02e8\7"+
		"Y\2\2\u02e7\u02e9\7i\2\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02eb\5@!\2\u02eb\u02ec\b\63\1\2\u02ec\u0332\3\2"+
		"\2\2\u02ed\u02ee\7E\2\2\u02ee\u02f0\5d\63\2\u02ef\u02f1\5^\60\2\u02f0"+
		"\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\b\63"+
		"\1\2\u02f3\u0332\3\2\2\2\u02f4\u02f5\7V\2\2\u02f5\u02f6\5d\63#\u02f6\u02f7"+
		"\b\63\1\2\u02f7\u0332\3\2\2\2\u02f8\u02f9\7J\2\2\u02f9\u02fa\5d\63\"\u02fa"+
		"\u02fb\b\63\1\2\u02fb\u0332\3\2\2\2\u02fc\u02fd\7B\2\2\u02fd\u02fe\5d"+
		"\63!\u02fe\u02ff\b\63\1\2\u02ff\u0332\3\2\2\2\u0300\u0301\7\23\2\2\u0301"+
		"\u0302\5d\63 \u0302\u0303\b\63\1\2\u0303\u0332\3\2\2\2\u0304\u0305\7\24"+
		"\2\2\u0305\u0306\5d\63\37\u0306\u0307\b\63\1\2\u0307\u0332\3\2\2\2\u0308"+
		"\u0309\7\25\2\2\u0309\u030a\5d\63\36\u030a\u030b\b\63\1\2\u030b\u0332"+
		"\3\2\2\2\u030c\u030d\7\26\2\2\u030d\u030e\5d\63\35\u030e\u030f\b\63\1"+
		"\2\u030f\u0332\3\2\2\2\u0310\u0311\7\27\2\2\u0311\u0312\5d\63\34\u0312"+
		"\u0313\b\63\1\2\u0313\u0332\3\2\2\2\u0314\u0315\7\30\2\2\u0315\u0316\5"+
		"d\63\33\u0316\u0317\b\63\1\2\u0317\u0332\3\2\2\2\u0318\u0319\7Q\2\2\u0319"+
		"\u0332\b\63\1\2\u031a\u031b\7i\2\2\u031b\u0332\b\63\1\2\u031c\u031d\7"+
		"\\\2\2\u031d\u0332\b\63\1\2\u031e\u031f\5l\67\2\u031f\u0320\b\63\1\2\u0320"+
		"\u0332\3\2\2\2\u0321\u0322\5R*\2\u0322\u0323\b\63\1\2\u0323\u0332\3\2"+
		"\2\2\u0324\u0325\5X-\2\u0325\u0326\b\63\1\2\u0326\u0332\3\2\2\2\u0327"+
		"\u0328\7\b\2\2\u0328\u0329\5b\62\2\u0329\u032a\7\t\2\2\u032a\u032b\b\63"+
		"\1\2\u032b\u0332\3\2\2\2\u032c\u032d\5f\64\2\u032d\u032e\7\67\2\2\u032e"+
		"\u032f\5h\65\2\u032f\u0330\b\63\1\2\u0330\u0332\3\2\2\2\u0331\u02d7\3"+
		"\2\2\2\u0331\u02e6\3\2\2\2\u0331\u02ed\3\2\2\2\u0331\u02f4\3\2\2\2\u0331"+
		"\u02f8\3\2\2\2\u0331\u02fc\3\2\2\2\u0331\u0300\3\2\2\2\u0331\u0304\3\2"+
		"\2\2\u0331\u0308\3\2\2\2\u0331\u030c\3\2\2\2\u0331\u0310\3\2\2\2\u0331"+
		"\u0314\3\2\2\2\u0331\u0318\3\2\2\2\u0331\u031a\3\2\2\2\u0331\u031c\3\2"+
		"\2\2\u0331\u031e\3\2\2\2\u0331\u0321\3\2\2\2\u0331\u0324\3\2\2\2\u0331"+
		"\u0327\3\2\2\2\u0331\u032c\3\2\2\2\u0332\u039c\3\2\2\2\u0333\u0334\f\32"+
		"\2\2\u0334\u0335\t\3\2\2\u0335\u0336\5d\63\33\u0336\u0337\b\63\1\2\u0337"+
		"\u039b\3\2\2\2\u0338\u0339\f\31\2\2\u0339\u033a\t\4\2\2\u033a\u033b\5"+
		"d\63\32\u033b\u033c\b\63\1\2\u033c\u039b\3\2\2\2\u033d\u033e\f\30\2\2"+
		"\u033e\u033f\t\5\2\2\u033f\u0340\5d\63\31\u0340\u0341\b\63\1\2\u0341\u039b"+
		"\3\2\2\2\u0342\u0343\f\27\2\2\u0343\u0344\t\6\2\2\u0344\u0345\5d\63\30"+
		"\u0345\u0346\b\63\1\2\u0346\u039b\3\2\2\2\u0347\u0348\f\26\2\2\u0348\u0349"+
		"\7A\2\2\u0349\u034a\5d\63\27\u034a\u034b\b\63\1\2\u034b\u039b\3\2\2\2"+
		"\u034c\u034d\f\25\2\2\u034d\u034e\7W\2\2\u034e\u034f\5d\63\26\u034f\u0350"+
		"\b\63\1\2\u0350\u039b\3\2\2\2\u0351\u0352\f\24\2\2\u0352\u0353\t\7\2\2"+
		"\u0353\u0354\5d\63\25\u0354\u0355\b\63\1\2\u0355\u039b\3\2\2\2\u0356\u0357"+
		"\f\23\2\2\u0357\u0358\7\'\2\2\u0358\u0359\5d\63\24\u0359\u035a\b\63\1"+
		"\2\u035a\u039b\3\2\2\2\u035b\u035c\f\22\2\2\u035c\u035d\7(\2\2\u035d\u035e"+
		"\5d\63\23\u035e\u035f\b\63\1\2\u035f\u039b\3\2\2\2\u0360\u0361\f\21\2"+
		"\2\u0361\u0362\7)\2\2\u0362\u0363\5d\63\22\u0363\u0364\b\63\1\2\u0364"+
		"\u039b\3\2\2\2\u0365\u0366\f\20\2\2\u0366\u0367\7*\2\2\u0367\u0368\5d"+
		"\63\21\u0368\u0369\b\63\1\2\u0369\u039b\3\2\2\2\u036a\u036b\f\17\2\2\u036b"+
		"\u036c\7+\2\2\u036c\u036d\5d\63\20\u036d\u036e\b\63\1\2\u036e\u039b\3"+
		"\2\2\2\u036f\u0370\f\16\2\2\u0370\u0371\7\17\2\2\u0371\u0372\5d\63\2\u0372"+
		"\u0373\7\20\2\2\u0373\u0374\5d\63\17\u0374\u0375\b\63\1\2\u0375\u039b"+
		"\3\2\2\2\u0376\u0377\f\r\2\2\u0377\u0378\7\16\2\2\u0378\u0379\5d\63\16"+
		"\u0379\u037a\b\63\1\2\u037a\u039b\3\2\2\2\u037b\u037c\f\f\2\2\u037c\u037d"+
		"\5j\66\2\u037d\u037e\5d\63\r\u037e\u037f\b\63\1\2\u037f\u039b\3\2\2\2"+
		"\u0380\u0381\f)\2\2\u0381\u0382\7\6\2\2\u0382\u0383\5b\62\2\u0383\u0384"+
		"\7\7\2\2\u0384\u0385\b\63\1\2\u0385\u039b\3\2\2\2\u0386\u0387\f(\2\2\u0387"+
		"\u0388\7\22\2\2\u0388\u0389\5p9\2\u0389\u038a\b\63\1\2\u038a\u039b\3\2"+
		"\2\2\u038b\u038c\f\'\2\2\u038c\u038d\5^\60\2\u038d\u038e\b\63\1\2\u038e"+
		"\u039b\3\2\2\2\u038f\u0390\f%\2\2\u0390\u0391\6\63\34\2\u0391\u0392\7"+
		"\23\2\2\u0392\u039b\b\63\1\2\u0393\u0394\f$\2\2\u0394\u0395\6\63\36\2"+
		"\u0395\u0396\7\24\2\2\u0396\u039b\b\63\1\2\u0397\u0398\f\13\2\2\u0398"+
		"\u0399\7k\2\2\u0399\u039b\b\63\1\2\u039a\u0333\3\2\2\2\u039a\u0338\3\2"+
		"\2\2\u039a\u033d\3\2\2\2\u039a\u0342\3\2\2\2\u039a\u0347\3\2\2\2\u039a"+
		"\u034c\3\2\2\2\u039a\u0351\3\2\2\2\u039a\u0356\3\2\2\2\u039a\u035b\3\2"+
		"\2\2\u039a\u0360\3\2\2\2\u039a\u0365\3\2\2\2\u039a\u036a\3\2\2\2\u039a"+
		"\u036f\3\2\2\2\u039a\u0376\3\2\2\2\u039a\u037b\3\2\2\2\u039a\u0380\3\2"+
		"\2\2\u039a\u0386\3\2\2\2\u039a\u038b\3\2\2\2\u039a\u038f\3\2\2\2\u039a"+
		"\u0393\3\2\2\2\u039a\u0397\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2"+
		"\2\2\u039c\u039d\3\2\2\2\u039de\3\2\2\2\u039e\u039c\3\2\2\2\u039f\u03a0"+
		"\7i\2\2\u03a0\u03a8\b\64\1\2\u03a1\u03a3\7\b\2\2\u03a2\u03a4\5H%\2\u03a3"+
		"\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\7\t"+
		"\2\2\u03a6\u03a8\b\64\1\2\u03a7\u039f\3\2\2\2\u03a7\u03a1\3\2\2\2\u03a8"+
		"g\3\2\2\2\u03a9\u03aa\5d\63\2\u03aa\u03ab\b\65\1\2\u03ab\u03b2\3\2\2\2"+
		"\u03ac\u03ad\7\n\2\2\u03ad\u03ae\5N(\2\u03ae\u03af\7\13\2\2\u03af\u03b0"+
		"\b\65\1\2\u03b0\u03b2\3\2\2\2\u03b1\u03a9\3\2\2\2\u03b1\u03ac\3\2\2\2"+
		"\u03b2i\3\2\2\2\u03b3\u03b4\7,\2\2\u03b4\u03ca\b\66\1\2\u03b5\u03b6\7"+
		"-\2\2\u03b6\u03ca\b\66\1\2\u03b7\u03b8\7.\2\2\u03b8\u03ca\b\66\1\2\u03b9"+
		"\u03ba\7/\2\2\u03ba\u03ca\b\66\1\2\u03bb\u03bc\7\60\2\2\u03bc\u03ca\b"+
		"\66\1\2\u03bd\u03be\7\61\2\2\u03be\u03ca\b\66\1\2\u03bf\u03c0\7\62\2\2"+
		"\u03c0\u03ca\b\66\1\2\u03c1\u03c2\7\63\2\2\u03c2\u03ca\b\66\1\2\u03c3"+
		"\u03c4\7\64\2\2\u03c4\u03ca\b\66\1\2\u03c5\u03c6\7\65\2\2\u03c6\u03ca"+
		"\b\66\1\2\u03c7\u03c8\7\66\2\2\u03c8\u03ca\b\66\1\2\u03c9\u03b3\3\2\2"+
		"\2\u03c9\u03b5\3\2\2\2\u03c9\u03b7\3\2\2\2\u03c9\u03b9\3\2\2\2\u03c9\u03bb"+
		"\3\2\2\2\u03c9\u03bd\3\2\2\2\u03c9\u03bf\3\2\2\2\u03c9\u03c1\3\2\2\2\u03c9"+
		"\u03c3\3\2\2\2\u03c9\u03c5\3\2\2\2\u03c9\u03c7\3\2\2\2\u03cak\3\2\2\2"+
		"\u03cb\u03cc\78\2\2\u03cc\u03d9\b\67\1\2\u03cd\u03ce\79\2\2\u03ce\u03d9"+
		"\b\67\1\2\u03cf\u03d0\7j\2\2\u03d0\u03d9\b\67\1\2\u03d1\u03d2\7k\2\2\u03d2"+
		"\u03d9\b\67\1\2\u03d3\u03d4\7\5\2\2\u03d4\u03d9\b\67\1\2\u03d5\u03d6\5"+
		"n8\2\u03d6\u03d7\b\67\1\2\u03d7\u03d9\3\2\2\2\u03d8\u03cb\3\2\2\2\u03d8"+
		"\u03cd\3\2\2\2\u03d8\u03cf\3\2\2\2\u03d8\u03d1\3\2\2\2\u03d8\u03d3\3\2"+
		"\2\2\u03d8\u03d5\3\2\2\2\u03d9m\3\2\2\2\u03da\u03db\7:\2\2\u03db\u03e5"+
		"\b8\1\2\u03dc\u03dd\7;\2\2\u03dd\u03e5\b8\1\2\u03de\u03df\7<\2\2\u03df"+
		"\u03e5\b8\1\2\u03e0\u03e1\7=\2\2\u03e1\u03e5\b8\1\2\u03e2\u03e3\7>\2\2"+
		"\u03e3\u03e5\b8\1\2\u03e4\u03da\3\2\2\2\u03e4\u03dc\3\2\2\2\u03e4\u03de"+
		"\3\2\2\2\u03e4\u03e0\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5o\3\2\2\2\u03e6"+
		"\u03e7\7i\2\2\u03e7\u03ec\b9\1\2\u03e8\u03e9\5r:\2\u03e9\u03ea\b9\1\2"+
		"\u03ea\u03ec\3\2\2\2\u03eb\u03e6\3\2\2\2\u03eb\u03e8\3\2\2\2\u03ecq\3"+
		"\2\2\2\u03ed\u03ee\5t;\2\u03ee\u03ef\b:\1\2\u03ef\u03f5\3\2\2\2\u03f0"+
		"\u03f1\78\2\2\u03f1\u03f5\b:\1\2\u03f2\u03f3\79\2\2\u03f3\u03f5\b:\1\2"+
		"\u03f4\u03ed\3\2\2\2\u03f4\u03f0\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5s\3"+
		"\2\2\2\u03f6\u03f7\7?\2\2\u03f7\u044b\b;\1\2\u03f8\u03f9\7@\2\2\u03f9"+
		"\u044b\b;\1\2\u03fa\u03fb\7A\2\2\u03fb\u044b\b;\1\2\u03fc\u03fd\7B\2\2"+
		"\u03fd\u044b\b;\1\2\u03fe\u03ff\7C\2\2\u03ff\u044b\b;\1\2\u0400\u0401"+
		"\7D\2\2\u0401\u044b\b;\1\2\u0402\u0403\7E\2\2\u0403\u044b\b;\1\2\u0404"+
		"\u0405\7F\2\2\u0405\u044b\b;\1\2\u0406\u0407\7G\2\2\u0407\u044b\b;\1\2"+
		"\u0408\u0409\7H\2\2\u0409\u044b\b;\1\2\u040a\u040b\7I\2\2\u040b\u044b"+
		"\b;\1\2\u040c\u040d\7J\2\2\u040d\u044b\b;\1\2\u040e\u040f\7K\2\2\u040f"+
		"\u044b\b;\1\2\u0410\u0411\7L\2\2\u0411\u044b\b;\1\2\u0412\u0413\7M\2\2"+
		"\u0413\u044b\b;\1\2\u0414\u0415\7N\2\2\u0415\u044b\b;\1\2\u0416\u0417"+
		"\7O\2\2\u0417\u044b\b;\1\2\u0418\u0419\7P\2\2\u0419\u044b\b;\1\2\u041a"+
		"\u041b\7Q\2\2\u041b\u044b\b;\1\2\u041c\u041d\7R\2\2\u041d\u044b\b;\1\2"+
		"\u041e\u041f\7S\2\2\u041f\u044b\b;\1\2\u0420\u0421\7T\2\2\u0421\u044b"+
		"\b;\1\2\u0422\u0423\7U\2\2\u0423\u044b\b;\1\2\u0424\u0425\7V\2\2\u0425"+
		"\u044b\b;\1\2\u0426\u0427\7W\2\2\u0427\u044b\b;\1\2\u0428\u0429\7X\2\2"+
		"\u0429\u044b\b;\1\2\u042a\u042b\7Y\2\2\u042b\u044b\b;\1\2\u042c\u042d"+
		"\7Z\2\2\u042d\u044b\b;\1\2\u042e\u042f\7[\2\2\u042f\u044b\b;\1\2\u0430"+
		"\u0431\7\\\2\2\u0431\u044b\b;\1\2\u0432\u0433\7]\2\2\u0433\u044b\b;\1"+
		"\2\u0434\u0435\7^\2\2\u0435\u044b\b;\1\2\u0436\u0437\7_\2\2\u0437\u044b"+
		"\b;\1\2\u0438\u0439\7`\2\2\u0439\u044b\b;\1\2\u043a\u043b\7a\2\2\u043b"+
		"\u044b\b;\1\2\u043c\u043d\7b\2\2\u043d\u044b\b;\1\2\u043e\u043f\7c\2\2"+
		"\u043f\u044b\b;\1\2\u0440\u0441\7d\2\2\u0441\u044b\b;\1\2\u0442\u0443"+
		"\7e\2\2\u0443\u044b\b;\1\2\u0444\u0445\7f\2\2\u0445\u044b\b;\1\2\u0446"+
		"\u0447\7g\2\2\u0447\u044b\b;\1\2\u0448\u0449\7h\2\2\u0449\u044b\b;\1\2"+
		"\u044a\u03f6\3\2\2\2\u044a\u03f8\3\2\2\2\u044a\u03fa\3\2\2\2\u044a\u03fc"+
		"\3\2\2\2\u044a\u03fe\3\2\2\2\u044a\u0400\3\2\2\2\u044a\u0402\3\2\2\2\u044a"+
		"\u0404\3\2\2\2\u044a\u0406\3\2\2\2\u044a\u0408\3\2\2\2\u044a\u040a\3\2"+
		"\2\2\u044a\u040c\3\2\2\2\u044a\u040e\3\2\2\2\u044a\u0410\3\2\2\2\u044a"+
		"\u0412\3\2\2\2\u044a\u0414\3\2\2\2\u044a\u0416\3\2\2\2\u044a\u0418\3\2"+
		"\2\2\u044a\u041a\3\2\2\2\u044a\u041c\3\2\2\2\u044a\u041e\3\2\2\2\u044a"+
		"\u0420\3\2\2\2\u044a\u0422\3\2\2\2\u044a\u0424\3\2\2\2\u044a\u0426\3\2"+
		"\2\2\u044a\u0428\3\2\2\2\u044a\u042a\3\2\2\2\u044a\u042c\3\2\2\2\u044a"+
		"\u042e\3\2\2\2\u044a\u0430\3\2\2\2\u044a\u0432\3\2\2\2\u044a\u0434\3\2"+
		"\2\2\u044a\u0436\3\2\2\2\u044a\u0438\3\2\2\2\u044a\u043a\3\2\2\2\u044a"+
		"\u043c\3\2\2\2\u044a\u043e\3\2\2\2\u044a\u0440\3\2\2\2\u044a\u0442\3\2"+
		"\2\2\u044a\u0444\3\2\2\2\u044a\u0446\3\2\2\2\u044a\u0448\3\2\2\2\u044b"+
		"u\3\2\2\2\u044c\u044d\7i\2\2\u044d\u044e\6< \2\u044e\u044f\5\\/\2\u044f"+
		"\u0450\b<\1\2\u0450w\3\2\2\2\u0451\u0452\7i\2\2\u0452\u0453\6=!\2\u0453"+
		"\u0454\5\\/\2\u0454\u0455\b=\1\2\u0455y\3\2\2\2\u0456\u0457\7\f\2\2\u0457"+
		"\u045f\b>\1\2\u0458\u0459\7\2\2\3\u0459\u045f\b>\1\2\u045a\u045b\6>\""+
		"\2\u045b\u045f\b>\1\2\u045c\u045d\6>#\2\u045d\u045f\b>\1\2\u045e\u0456"+
		"\3\2\2\2\u045e\u0458\3\2\2\2\u045e\u045a\3\2\2\2\u045e\u045c\3\2\2\2\u045f"+
		"{\3\2\2\2P\u0080\u0086\u00be\u00c2\u00ca\u00d8\u00e0\u00e4\u00f7\u010e"+
		"\u0112\u0116\u0122\u0126\u0132\u0140\u0147\u014f\u0154\u015c\u0164\u0179"+
		"\u017d\u017f\u0187\u018f\u0196\u01a9\u01ac\u01c3\u01d2\u01d8\u01df\u01e7"+
		"\u01fa\u0205\u0208\u020d\u021a\u021f\u022c\u0231\u023a\u0241\u0249\u024d"+
		"\u0252\u025c\u0261\u0267\u026a\u0271\u027d\u0280\u0283\u02aa\u02b4\u02bc"+
		"\u02c1\u02c4\u02d2\u02da\u02de\u02e8\u02f0\u0331\u039a\u039c\u03a3\u03a7"+
		"\u03b1\u03c9\u03d8\u03e4\u03eb\u03f4\u044a\u045e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}