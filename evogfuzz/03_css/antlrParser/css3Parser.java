// Generated from css3.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class css3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Comment=16, 
		Space=17, Cdo=18, Cdc=19, Includes=20, DashMatch=21, Hash=22, Import=23, 
		Page=24, Media=25, Namespace=26, Charset=27, Important=28, Percentage=29, 
		Uri=30, UnicodeRange=31, MediaOnly=32, Not=33, And=34, Dimension=35, UnknownDimension=36, 
		Plus=37, Minus=38, Greater=39, Comma=40, Tilde=41, PseudoNot=42, Number=43, 
		String=44, PrefixMatch=45, SuffixMatch=46, SubstringMatch=47, FontFace=48, 
		Supports=49, Or=50, Keyframes=51, From=52, To=53, Calc=54, Viewport=55, 
		CounterStyle=56, FontFeatureValues=57, DxImageTransform=58, Variable=59, 
		Var=60, Ident=61, Function=62;
	public static final int
		RULE_main_dummy_rule_hope_for_no_collisions = 0, RULE_stylesheet = 1, 
		RULE_charset = 2, RULE_imports = 3, RULE_namespace = 4, RULE_namespacePrefix = 5, 
		RULE_media = 6, RULE_mediaQueryList = 7, RULE_mediaQuery = 8, RULE_mediaType = 9, 
		RULE_mediaExpression = 10, RULE_mediaFeature = 11, RULE_page = 12, RULE_pseudoPage = 13, 
		RULE_selectorGroup = 14, RULE_selector = 15, RULE_combinator = 16, RULE_simpleSelectorSequence = 17, 
		RULE_typeSelector = 18, RULE_typeNamespacePrefix = 19, RULE_elementName = 20, 
		RULE_universal = 21, RULE_className = 22, RULE_attrib = 23, RULE_pseudo = 24, 
		RULE_functionalPseudo = 25, RULE_expression = 26, RULE_negation = 27, 
		RULE_negationArg = 28, RULE_operator = 29, RULE_property = 30, RULE_ruleset = 31, 
		RULE_declarationList = 32, RULE_declaration = 33, RULE_prio = 34, RULE_value = 35, 
		RULE_expr = 36, RULE_term = 37, RULE_function = 38, RULE_dxImageTransform = 39, 
		RULE_hexcolor = 40, RULE_number = 41, RULE_percentage = 42, RULE_dimension = 43, 
		RULE_unknownDimension = 44, RULE_any = 45, RULE_atRule = 46, RULE_atKeyword = 47, 
		RULE_unused = 48, RULE_block = 49, RULE_nestedStatement = 50, RULE_groupRuleBody = 51, 
		RULE_supportsRule = 52, RULE_supportsCondition = 53, RULE_supportsConditionInParens = 54, 
		RULE_supportsNegation = 55, RULE_supportsConjunction = 56, RULE_supportsDisjunction = 57, 
		RULE_supportsDeclarationCondition = 58, RULE_generalEnclosed = 59, RULE_var = 60, 
		RULE_calc = 61, RULE_calcSum = 62, RULE_calcProduct = 63, RULE_calcValue = 64, 
		RULE_fontFaceRule = 65, RULE_fontFaceDeclaration = 66, RULE_keyframesRule = 67, 
		RULE_keyframesBlocks = 68, RULE_keyframeSelector = 69, RULE_viewport = 70, 
		RULE_counterStyle = 71, RULE_fontFeatureValuesRule = 72, RULE_fontFamilyNameList = 73, 
		RULE_fontFamilyName = 74, RULE_featureValueBlock = 75, RULE_featureType = 76, 
		RULE_featureValueDefinition = 77, RULE_ident = 78, RULE_ws = 79;
	public static final String[] ruleNames = {
		"main_dummy_rule_hope_for_no_collisions", "stylesheet", "charset", "imports", 
		"namespace", "namespacePrefix", "media", "mediaQueryList", "mediaQuery", 
		"mediaType", "mediaExpression", "mediaFeature", "page", "pseudoPage", 
		"selectorGroup", "selector", "combinator", "simpleSelectorSequence", "typeSelector", 
		"typeNamespacePrefix", "elementName", "universal", "className", "attrib", 
		"pseudo", "functionalPseudo", "expression", "negation", "negationArg", 
		"operator", "property", "ruleset", "declarationList", "declaration", "prio", 
		"value", "expr", "term", "function", "dxImageTransform", "hexcolor", "number", 
		"percentage", "dimension", "unknownDimension", "any", "atRule", "atKeyword", 
		"unused", "block", "nestedStatement", "groupRuleBody", "supportsRule", 
		"supportsCondition", "supportsConditionInParens", "supportsNegation", 
		"supportsConjunction", "supportsDisjunction", "supportsDeclarationCondition", 
		"generalEnclosed", "var", "calc", "calcSum", "calcProduct", "calcValue", 
		"fontFaceRule", "fontFaceDeclaration", "keyframesRule", "keyframesBlocks", 
		"keyframeSelector", "viewport", "counterStyle", "fontFeatureValuesRule", 
		"fontFamilyNameList", "fontFamilyName", "featureValueBlock", "featureType", 
		"featureValueDefinition", "ident", "ws"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "':'", "')'", "'{'", "'}'", "'*'", "'|'", "'.'", "'['", 
		"'='", "']'", "'/'", "'_'", "'@'", null, null, "'<!--'", "'-->'", "'~='", 
		"'|='", null, null, null, null, null, "'@charset '", null, null, null, 
		null, null, null, null, null, null, "'+'", "'-'", "'>'", "','", "'~'", 
		null, null, null, "'^='", "'$='", "'*='", null, null, null, null, null, 
		null, "'calc('", null, null, null, null, null, "'var('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "Comment", "Space", "Cdo", "Cdc", "Includes", 
		"DashMatch", "Hash", "Import", "Page", "Media", "Namespace", "Charset", 
		"Important", "Percentage", "Uri", "UnicodeRange", "MediaOnly", "Not", 
		"And", "Dimension", "UnknownDimension", "Plus", "Minus", "Greater", "Comma", 
		"Tilde", "PseudoNot", "Number", "String", "PrefixMatch", "SuffixMatch", 
		"SubstringMatch", "FontFace", "Supports", "Or", "Keyframes", "From", "To", 
		"Calc", "Viewport", "CounterStyle", "FontFeatureValues", "DxImageTransform", 
		"Variable", "Var", "Ident", "Function"
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
	public String getGrammarFileName() { return "css3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	double count_charset_0 = 0.0;
	double count_charset_1 = 0.0;

	double prob_charset_0 = 0.0;
	double prob_charset_1 = 0.0;


	double count_imports_1 = 0.0;
	double count_imports_3 = 0.0;
	double count_imports_5 = 0.0;
	double count_imports_7 = 0.0;

	double prob_imports_1 = 0.0;
	double prob_imports_3 = 0.0;
	double prob_imports_5 = 0.0;
	double prob_imports_7 = 0.0;

	double count_namespace_1 = 0.0;
	double count_namespace_3 = 0.0;

	double prob_namespace_1 = 0.0;
	double prob_namespace_3 = 0.0;

	double count_mediaQuery_1 = 0.0;
	double count_mediaQuery_2 = 0.0;

	double prob_mediaQuery_1 = 0.0;
	double prob_mediaQuery_2 = 0.0;

	double count_combinator_0 = 0.0;
	double count_combinator_1 = 0.0;
	double count_combinator_2 = 0.0;
	double count_combinator_3 = 0.0;

	double prob_combinator_0 = 0.0;
	double prob_combinator_1 = 0.0;
	double prob_combinator_2 = 0.0;
	double prob_combinator_3 = 0.0;

	double count_simpleSelectorSequence_5, count_simpleSelectorSequence_10;

	double prob_simpleSelectorSequence_5, prob_simpleSelectorSequence_10;

	double count_negationArg_0, count_negationArg_1, count_negationArg_2, count_negationArg_3, count_negationArg_4, count_negationArg_5;
	double prob_negationArg_0, prob_negationArg_1, prob_negationArg_2, prob_negationArg_3, prob_negationArg_4, prob_negationArg_5;

	double count_operator_0, count_operator_1, count_operator_2, count_operator_3;
	double prob_operator_0, prob_operator_1, prob_operator_2, prob_operator_3;

	double count_property_0, count_property_1, count_property_2, count_property_3;
	double prob_property_0, prob_property_1, prob_property_2,  prob_property_3;

	double count_ruleset_0, count_ruleset_1, prob_ruleset_0, prob_ruleset_1;

	double count_declaration_0, count_declaration_1, prob_declaration_0, prob_declaration_1;

	double count_term_0, count_term_1, count_term_2, count_term_3, count_term_4, count_term_5, count_term_6, count_term_7, count_term_8, count_term_9, count_term_10, count_term_11, count_term_12;
	double prob_term_0, prob_term_1, prob_term_2, prob_term_3, prob_term_4, prob_term_5, prob_term_6, prob_term_7, prob_term_8, prob_term_9, prob_term_10, prob_term_11, prob_term_12;

	double count_any_0, count_any_1, count_any_2, count_any_3, count_any_4, count_any_5, count_any_6, count_any_7, count_any_8, count_any_9, count_any_10, count_any_11, count_any_13, count_any_14, count_any_16;
	double prob_any_0, prob_any_1, prob_any_2, prob_any_3, prob_any_4, prob_any_5, prob_any_6, prob_any_7, prob_any_8, prob_any_9, prob_any_10, prob_any_11, prob_any_13, prob_any_14, prob_any_16;

	double count_unused_0, count_unused_1, count_unused_2, count_unused_3, count_unused_4, prob_unused_0, prob_unused_1, prob_unused_2, prob_unused_3, prob_unused_4;

	double count_nestedStatement_0, count_nestedStatement_1, count_nestedStatement_2, count_nestedStatement_3, count_nestedStatement_4, count_nestedStatement_5, count_nestedStatement_6, count_nestedStatement_7, count_nestedStatement_8, count_nestedStatement_9;
	double prob_nestedStatement_0, prob_nestedStatement_1, prob_nestedStatement_2, prob_nestedStatement_3, prob_nestedStatement_4, prob_nestedStatement_5, prob_nestedStatement_6, prob_nestedStatement_7, prob_nestedStatement_8, prob_nestedStatement_9;

	double count_supportsCondition_0, count_supportsCondition_1, count_supportsCondition_2, count_supportsCondition_3, prob_supportsCondition_0, prob_supportsCondition_1, prob_supportsCondition_2, prob_supportsCondition_3;

	double count_supportsConditionInParens_0, count_supportsConditionInParens_1, count_supportsConditionInParens_2, prob_supportsConditionInParens_0, prob_supportsConditionInParens_1, prob_supportsConditionInParens_2;

	double count_calcValue_0, count_calcValue_1, count_calcValue_2, count_calcValue_3, count_calcValue_4;
	double prob_calcValue_0, prob_calcValue_1, prob_calcValue_2, prob_calcValue_3, prob_calcValue_4;

	double count_fontFaceDeclaration_0, count_fontFaceDeclaration_1, prob_fontFaceDeclaration_0, prob_fontFaceDeclaration_1;

	double count_fontFamilyName_0, count_fontFamilyName_1, prob_fontFamilyName_0, prob_fontFamilyName_1;

	double count_ident_0, count_ident_1, count_ident_2, count_ident_3, count_ident_4, count_ident_5, count_ident_6;
	double prob_ident_0, prob_ident_1, prob_ident_2, prob_ident_3, prob_ident_4, prob_ident_5, prob_ident_6;

	/*
	double count_Uri_0, count_Uri_1, prob_Uri_0, prob_Uri_1;
	*/

	/*
	double count_UnicodeRange_1, count_UnicodeRange_3, count_UnicodeRange_5, count_UnicodeRange_7, count_UnicodeRange_9, count_UnicodeRange_11;
	double prob_UnicodeRange_1, prob_UnicodeRange_3, prob_UnicodeRange_5, prob_UnicodeRange_7, prob_UnicodeRange_9, prob_UnicodeRange_11;
	*/

	/*
	double count_Dimension_0, count_Dimension_1, count_Dimension_2, count_Dimension_3, count_Dimension_4;
	double prob_Dimension_0, prob_Dimension_1, prob_Dimension_2, prob_Dimension_3, prob_Dimension_4;
	*/

	/*
	double count_Number_0, count_Number_1, prob_Number_0, prob_Number_1;
	*/

	/*
	double count_String_3, count_String_7;
	double prob_String_3, prob_String_7;
	*/


	public css3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Main_dummy_rule_hope_for_no_collisionsContext extends ParserRuleContext {
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public Main_dummy_rule_hope_for_no_collisionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_dummy_rule_hope_for_no_collisions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMain_dummy_rule_hope_for_no_collisions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMain_dummy_rule_hope_for_no_collisions(this);
		}
	}

	public final Main_dummy_rule_hope_for_no_collisionsContext main_dummy_rule_hope_for_no_collisions() throws RecognitionException {
		Main_dummy_rule_hope_for_no_collisionsContext _localctx = new Main_dummy_rule_hope_for_no_collisionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main_dummy_rule_hope_for_no_collisions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			stylesheet();

			prob_charset_0 = (count_charset_0 + count_charset_1) != 0 ?
			count_charset_0/(count_charset_0 + count_charset_1) : 1.0/2;

			prob_charset_1 = (count_charset_0 + count_charset_1) != 0 ?
			count_charset_1/(count_charset_0 + count_charset_1) : 1.0/2;

			prob_imports_1 = (count_imports_1 + count_imports_3 + count_imports_5 + count_imports_7) != 0 ?
			count_imports_1/(count_imports_1 + count_imports_3 + count_imports_5 + count_imports_7) : 1.0/4;

			prob_imports_3 = (count_imports_1 + count_imports_3 + count_imports_5 + count_imports_7) != 0 ?
			count_imports_3/(count_imports_1 + count_imports_3 + count_imports_5 + count_imports_7) : 1.0/4;

			prob_imports_5 = (count_imports_1 + count_imports_3 + count_imports_5 + count_imports_7) != 0 ?
			count_imports_5/(count_imports_1 + count_imports_3 + count_imports_5 + count_imports_7) : 1.0/4;

			prob_imports_7 = (count_imports_1 + count_imports_3 + count_imports_5 + count_imports_7) != 0 ?
			count_imports_7/(count_imports_1 + count_imports_3 + count_imports_5 + count_imports_7) : 1.0/4;

			prob_namespace_1 = (count_namespace_1 + count_namespace_3) != 0 ?
			count_namespace_1/(count_namespace_1 + count_namespace_3) : 1.0/2;

			prob_namespace_3 = (count_namespace_1 + count_namespace_3) != 0 ?
			count_namespace_3/(count_namespace_1 + count_namespace_3) : 1.0/2;

			prob_mediaQuery_1 = (count_mediaQuery_1 + count_mediaQuery_2) != 0 ?
			count_mediaQuery_1/(count_mediaQuery_1 + count_mediaQuery_2) : 1.0/2;

			prob_mediaQuery_2 = (count_mediaQuery_1 + count_mediaQuery_2) != 0 ?
			count_mediaQuery_2/(count_mediaQuery_1 + count_mediaQuery_2) : 1.0/2;


			prob_combinator_0 = (count_combinator_0 + count_combinator_1 + count_combinator_2 + count_combinator_3) != 0 ?
			count_combinator_0/(count_combinator_0 + count_combinator_1 + count_combinator_2 + count_combinator_3) : 1.0/4;

			prob_combinator_1 = (count_combinator_0 + count_combinator_1 + count_combinator_2 + count_combinator_3) != 0 ?
			count_combinator_1/(count_combinator_0 + count_combinator_1 + count_combinator_2 + count_combinator_3) : 1.0/4;

			prob_combinator_2 = (count_combinator_0 + count_combinator_1 + count_combinator_2 + count_combinator_3) != 0 ?
			count_combinator_2/(count_combinator_0 + count_combinator_1 + count_combinator_2 + count_combinator_3) : 1.0/4;

			prob_combinator_3 = (count_combinator_0 + count_combinator_1 + count_combinator_2 + count_combinator_3) != 0 ?
			count_combinator_3/(count_combinator_0 + count_combinator_1 + count_combinator_2 + count_combinator_3) : 1.0/4;


			prob_simpleSelectorSequence_5 = (count_simpleSelectorSequence_5 + count_simpleSelectorSequence_10 ) != 0 ?
			count_simpleSelectorSequence_5/(count_simpleSelectorSequence_5 + count_simpleSelectorSequence_10 ) : 1.0/2;

			prob_simpleSelectorSequence_10 = (count_simpleSelectorSequence_5 + count_simpleSelectorSequence_10 ) != 0 ?
			count_simpleSelectorSequence_10/(count_simpleSelectorSequence_5 + count_simpleSelectorSequence_10 ) : 1.0/2;

			prob_negationArg_0 = (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) != 0 ?
			count_negationArg_0/ (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) : 1.0/6;

			prob_negationArg_1 = (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) != 0 ?
			count_negationArg_1/ (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) : 1.0/6;

			prob_negationArg_2 = (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) != 0 ?
			count_negationArg_2/ (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) : 1.0/6;

			prob_negationArg_3 = (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) != 0 ?
			count_negationArg_3/ (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) : 1.0/6;

			prob_negationArg_4 = (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) != 0 ?
			count_negationArg_4/ (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) : 1.0/6;

			prob_negationArg_5 = (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) != 0 ?
			count_negationArg_5/ (count_negationArg_0 + count_negationArg_1 + count_negationArg_2 + count_negationArg_3 + count_negationArg_4 + count_negationArg_5) : 1.0/6;

			prob_operator_0 = (count_operator_0 + count_operator_1 + count_operator_2 + count_operator_3) != 0 ?
			count_operator_0/ (count_operator_0 + count_operator_1 + count_operator_2 + count_operator_3) : 1.0/4;

			prob_operator_1 = (count_operator_0 + count_operator_1 + count_operator_2 + count_operator_3) != 0 ?
			count_operator_1/ (count_operator_0 + count_operator_1 + count_operator_2 + count_operator_3) : 1.0/4;

			prob_operator_2 = (count_operator_0 + count_operator_1 + count_operator_2 + count_operator_3) != 0 ?
			count_operator_2/ (count_operator_0 + count_operator_1 + count_operator_2 + count_operator_3) : 1.0/4;

			prob_operator_3 = (count_operator_0 + count_operator_1 + count_operator_2 + count_operator_3) != 0 ?
			count_operator_3/ (count_operator_0 + count_operator_1 + count_operator_2 + count_operator_3) : 1.0/4;


			prob_property_0 = (count_property_0 + count_property_1 + count_property_2 + count_property_3) != 0 ?
			count_property_0/ (count_property_0 + count_property_1 + count_property_2 + count_property_3) : 1.0/4;

			prob_property_1 = (count_property_0 + count_property_1 + count_property_2 + count_property_3) != 0 ?
			count_property_1/ (count_property_0 + count_property_1 + count_property_2 + count_property_3) : 1.0/4;

			prob_property_2 = (count_property_0 + count_property_1 + count_property_2 + count_property_3) != 0 ?
			count_property_2/ (count_property_0 + count_property_1 + count_property_2 + count_property_3) : 1.0/4;

			prob_property_3 = (count_property_0 + count_property_1 + count_property_2 + count_property_3) != 0 ?
			count_property_3/ (count_property_0 + count_property_1 + count_property_2 + count_property_3) : 1.0/4;

			prob_ruleset_0 = (count_ruleset_0 + count_ruleset_1) != 0 ?
			count_ruleset_0/ (count_ruleset_0 + count_ruleset_1) : 1.0/2;

			prob_ruleset_1 = (count_ruleset_0 + count_ruleset_1) != 0 ?
			count_ruleset_1/ (count_ruleset_0 + count_ruleset_1) : 1.0/2;


			prob_declaration_0 = (count_declaration_0 + count_declaration_1) != 0 ?
			count_declaration_0/ (count_declaration_0 + count_declaration_1) : 1.0/2;

			prob_declaration_1 = (count_declaration_0 + count_declaration_1) != 0 ?
			count_declaration_1/ (count_declaration_0 + count_declaration_1) : 1.0/2;

			prob_term_0 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_0/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_1 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_1/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_2 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_2/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_3 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_3/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_4 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_4/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_5 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_5/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_6 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_6/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_7 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_7/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_8 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_8/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_9 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_9/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_10 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_10/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_11 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_11/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_term_12 = (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12) != 0 ?
			count_term_12/ (count_term_0 + count_term_1 + count_term_2 + count_term_3 + count_term_4 + count_term_5 + count_term_6 + count_term_7 + count_term_8 + count_term_9 + count_term_10 + count_term_11 + count_term_12): 1.0/13;

			prob_any_0 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_0/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_1 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_1/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_2 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_2/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_3 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_3/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_4 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_4/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_5 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_5/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_6 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_6/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_7 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_7/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_8 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_8/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_9 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_9/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_10 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_10/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_11 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_11/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_13 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_13/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_14 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_14/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_any_16 = (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) != 0 ?
			count_any_16/ (count_any_0 + count_any_1 + count_any_2 + count_any_3 + count_any_4 + count_any_5 + count_any_6 + count_any_7 + count_any_8 + count_any_9 + count_any_10 + count_any_11 + count_any_13 + count_any_14 + count_any_16) : 1.0/15;

			prob_unused_0 = (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) != 0 ?
			count_unused_0/ (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) : 1.0/5;

			prob_unused_1 = (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) != 0 ?
			count_unused_1/ (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) : 1.0/5;

			prob_unused_2 = (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) != 0 ?
			count_unused_2/ (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) : 1.0/5;

			prob_unused_3 = (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) != 0 ?
			count_unused_3/ (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) : 1.0/5;

			prob_unused_4 = (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) != 0 ?
			count_unused_4/ (count_unused_0 + count_unused_1 + count_unused_2 + count_unused_3 + count_unused_4) : 1.0/5;

			prob_nestedStatement_0 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_0/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_nestedStatement_1 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_1/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_nestedStatement_2 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_2/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_nestedStatement_3 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_3/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_nestedStatement_4 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_4/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_nestedStatement_5 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_5/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_nestedStatement_6 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_6/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_nestedStatement_7 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_7/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_nestedStatement_8 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_8/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_nestedStatement_9 = (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) != 0 ?
			count_nestedStatement_9/ (count_nestedStatement_0 + count_nestedStatement_1 + count_nestedStatement_2 + count_nestedStatement_3 + count_nestedStatement_4 + count_nestedStatement_5 + count_nestedStatement_6 + count_nestedStatement_7 + count_nestedStatement_8 + count_nestedStatement_9) : 1.0/10;

			prob_supportsCondition_0 = (count_supportsCondition_0 + count_supportsCondition_1 + count_supportsCondition_2 + count_supportsCondition_3) != 0 ?
			count_supportsCondition_0/ (count_supportsCondition_0 + count_supportsCondition_1 + count_supportsCondition_2 + count_supportsCondition_3) : 1.0/4;

			prob_supportsCondition_1 =  (count_supportsCondition_0 + count_supportsCondition_1 + count_supportsCondition_2 + count_supportsCondition_3) != 0 ?
			count_supportsCondition_1/ (count_supportsCondition_0 + count_supportsCondition_1 + count_supportsCondition_2 + count_supportsCondition_3) : 1.0/4;

			prob_supportsCondition_2 =  (count_supportsCondition_0 + count_supportsCondition_1 + count_supportsCondition_2 + count_supportsCondition_3) != 0 ?
			count_supportsCondition_2/ (count_supportsCondition_0 + count_supportsCondition_1 + count_supportsCondition_2 + count_supportsCondition_3) : 1.0/4;

			prob_supportsCondition_3 =  (count_supportsCondition_0 + count_supportsCondition_1 + count_supportsCondition_2 + count_supportsCondition_3) != 0 ?
			count_supportsCondition_3/ (count_supportsCondition_0 + count_supportsCondition_1 + count_supportsCondition_2 + count_supportsCondition_3) : 1.0/4;

			prob_supportsConditionInParens_0 = (count_supportsConditionInParens_0 + count_supportsConditionInParens_1 + count_supportsConditionInParens_2) != 0 ?
			count_supportsConditionInParens_0/ (count_supportsConditionInParens_0 + count_supportsConditionInParens_1 + count_supportsConditionInParens_2) : 1.0/3;

			prob_supportsConditionInParens_1 = (count_supportsConditionInParens_0 + count_supportsConditionInParens_1 + count_supportsConditionInParens_2) != 0 ?
			count_supportsConditionInParens_1/ (count_supportsConditionInParens_0 + count_supportsConditionInParens_1 + count_supportsConditionInParens_2) : 1.0/3;

			prob_supportsConditionInParens_2 = (count_supportsConditionInParens_0 + count_supportsConditionInParens_1 + count_supportsConditionInParens_2) != 0 ?
			count_supportsConditionInParens_2/ (count_supportsConditionInParens_0 + count_supportsConditionInParens_1 + count_supportsConditionInParens_2) : 1.0/3;

			prob_calcValue_0 = (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) != 0 ?
			    count_calcValue_0 / (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) : 1.0/5;
			prob_calcValue_1 = (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) != 0 ?
			    count_calcValue_1 / (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) : 1.0/5;
			prob_calcValue_2 = (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) != 0 ?
			    count_calcValue_2 / (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) : 1.0/5;
			prob_calcValue_3 = (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) != 0 ?
			    count_calcValue_3 / (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) : 1.0/5;
			prob_calcValue_4 = (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) != 0 ?
			    count_calcValue_4 / (count_calcValue_0 + count_calcValue_1 + count_calcValue_2 + count_calcValue_3 + count_calcValue_4) : 1.0/5;

			prob_fontFaceDeclaration_0 = (count_fontFaceDeclaration_0 + count_fontFaceDeclaration_1) != 0 ? count_fontFaceDeclaration_0/ (count_fontFaceDeclaration_0 + count_fontFaceDeclaration_1) : 1.0/2;;
			prob_fontFaceDeclaration_1 = (count_fontFaceDeclaration_0 + count_fontFaceDeclaration_1) != 0 ? count_fontFaceDeclaration_1/ (count_fontFaceDeclaration_0 + count_fontFaceDeclaration_1) : 1.0/2;;

			prob_fontFamilyName_0 = (count_fontFamilyName_0 + count_fontFamilyName_1) != 0 ? count_fontFamilyName_0/ (count_fontFamilyName_0 + count_fontFamilyName_1) : 1.0/2;
			prob_fontFamilyName_1 = (count_fontFamilyName_0 + count_fontFamilyName_1) != 0 ? count_fontFamilyName_1/ (count_fontFamilyName_0 + count_fontFamilyName_1) : 1.0/2;


			prob_ident_0 = (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) != 0 ?
			count_ident_0/ (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) : 1.0/7;

			prob_ident_1 = (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) != 0 ?
			count_ident_1/ (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) : 1.0/7;

			prob_ident_2 = (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) != 0 ?
			count_ident_2/ (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) : 1.0/7;

			prob_ident_3 = (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) != 0 ?
			count_ident_3/ (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) : 1.0/7;

			prob_ident_4 = (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) != 0 ?
			count_ident_4/ (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) : 1.0/7;

			prob_ident_5 = (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) != 0 ?
			count_ident_5/ (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) : 1.0/7;

			prob_ident_6 = (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) != 0 ?
			count_ident_6/ (count_ident_0 + count_ident_1 + count_ident_2 + count_ident_3 + count_ident_4 + count_ident_5 + count_ident_6) : 1.0/7;

			/*
			prob_Uri_0 = (count_Uri_0 + count_Uri_1) != 0 ? count_Uri_0/ (count_Uri_0 + count_Uri_1): 1.0/2;
			prob_Uri_1 = (count_Uri_0 + count_Uri_1) != 0 ? count_Uri_1/ (count_Uri_0 + count_Uri_1): 1.0/2;
			*/

			/*
			prob_UnicodeRange_1 = (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) != 0 ?
			count_UnicodeRange_1/ (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) : 1.0/6;

			prob_UnicodeRange_3 = (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) != 0 ?
			count_UnicodeRange_3/ (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) : 1.0/6;

			prob_UnicodeRange_5 = (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) != 0 ?
			count_UnicodeRange_5/ (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) : 1.0/6;

			prob_UnicodeRange_7 = (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) != 0 ?
			count_UnicodeRange_7/ (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) : 1.0/6;

			prob_UnicodeRange_9 = (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) != 0 ?
			count_UnicodeRange_9/ (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) : 1.0/6;

			prob_UnicodeRange_11 = (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) != 0 ?
			count_UnicodeRange_11/ (count_UnicodeRange_1 + count_UnicodeRange_3 + count_UnicodeRange_5 + count_UnicodeRange_7 + count_UnicodeRange_9 + count_UnicodeRange_11) : 1.0/6;
			*/

			/*
			prob_Dimension_0 = (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) != 0 ?
			count_Dimension_0/ (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) : 1.0/5;

			prob_Dimension_1 = (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) != 0 ?
			count_Dimension_1/ (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) : 1.0/5;

			prob_Dimension_2 = (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) != 0 ?
			count_Dimension_2/ (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) : 1.0/5;

			prob_Dimension_3 = (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) != 0 ?
			count_Dimension_3/ (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) : 1.0/5;

			prob_Dimension_4 = (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) != 0 ?
			count_Dimension_4/ (count_Dimension_0 + count_Dimension_1 + count_Dimension_2 + count_Dimension_3 + count_Dimension_4) : 1.0/5;
			*/

			/*
			prob_Number_0 = (count_Number_0 + count_Number_1) != 0 ? count_Number_0/ (count_Number_0 + count_Number_1) : 1.0/2;
			prob_Number_1 = (count_Number_0 + count_Number_1) != 0 ? count_Number_1/ (count_Number_0 + count_Number_1) : 1.0/2;
			*/

			/*
			prob_String_3 = (count_String_3 + count_String_7) != 0 ?
			count_String_3/ (count_String_3 + count_String_7) : 1.0/2;

			prob_String_7  = (count_String_3 + count_String_7) != 0 ?
			count_String_7/ (count_String_3 + count_String_7) : 1.0/2;
			*/

			System.out.println(
			"stylesheet = ws ( charset ( Comment | Space | Cdo  | Cdc )* )* " +
			    "( imports ( Comment | Space | Cdo | Cdc )* )* ( namespace ( Comment | Space | " +
			    "Cdo | Cdc )* )* ( nestedStatement ( Comment | Space | Cdo | Cdc )* )* ;\n"

			+ "charset = Charset ws String ws \";\" ws @@ " + prob_charset_0 +
			    " | Charset ws String ws  @@ " + prob_charset_1 + " ;\n"

			+ "imports = Import ws ( String | Uri ) ws mediaQueryList \";\" ws @@ " + prob_imports_1 +
			    " | Import ws ( String | Uri ) ws \";\" ws @@ " + prob_imports_3 +
			    " | Import ws ( String | Uri ) ws mediaQueryList @@ " + prob_imports_5 +
			    " | Import ws ( String | Uri ) ws @@ " + prob_imports_7 + " ;\n"

			+ "namespace = Namespace ws (namespacePrefix ws)? ( String | Uri ) ws \";\" ws @@ " +
			    prob_namespace_1 + " | Namespace ws (namespacePrefix ws)? ( String | Uri ) ws @@ " +
			    prob_namespace_3 + " ;\n"

			+ "namespacePrefix = ident ;\n"

			+ "media = Media ws mediaQueryList groupRuleBody ws ;\n"

			+ "mediaQueryList = ( mediaQuery ( Comma ws mediaQuery )* )? ws ;\n"

			+ "mediaQuery = ( MediaOnly |  Not )? ws mediaType ws ( And ws mediaExpression )* @@ " +
			    prob_mediaQuery_1 + " | mediaExpression ( And ws mediaExpression )* @@ " +
			    prob_mediaQuery_2 + " ;\n"

			+ "mediaType = ident ;\n"

			+ "mediaExpression = \"(\" ws mediaFeature ( \":\" ws expr )? \")\" ws ;\n"

			+ "mediaFeature = ident ws ;\n"

			+ "page = Page ws pseudoPage? \"{\" ws declaration? ( \";\" ws declaration? )* \"}\" ws ;\n"

			+ "pseudoPage = \":\" ident ws ;\n"

			+ "selectorGroup = selector ( Comma ws selector )* ;\n"

			+ "selector = simpleSelectorSequence ws ( combinator simpleSelectorSequence ws )* ;\n"

			+ "combinator =  Plus ws @@ " + prob_combinator_0 + " | Greater ws @@ " +
			    prob_combinator_1 + " | Tilde ws @@ " + prob_combinator_2 +
			    " | Space ws @@ " + prob_combinator_3 + " ;\n"

			+ "simpleSelectorSequence = ( typeSelector | universal ) ( Hash | className | attrib | pseudo | negation )* @@ " +
			    prob_simpleSelectorSequence_5 + " | ( Hash | className | attrib | pseudo | negation )+ @@ " +
			    prob_simpleSelectorSequence_10 + " ;\n"

			+ "typeSelector = typeNamespacePrefix? elementName ;\n"

			+ "typeNamespacePrefix = ( ident | \"*\" )? \"|\" ;\n"

			+ "elementName = ident ;\n"

			+ "universal = typeNamespacePrefix? \"*\" ;\n"

			+ "className = \".\" ident ;\n"

			+ "attrib = \"[\" ws typeNamespacePrefix? ident ws ( ( PrefixMatch | SuffixMatch | SubstringMatch | \"=\" | Includes | DashMatch ) ws ( ident | String ) ws )? \"]\" ;\n"

			+ "pseudo =  \":\" \":\"? ( ident | functionalPseudo ) ;\n"

			+ "functionalPseudo = Function ws expression \")\" ;\n"

			+ "expression = ( ( Plus | Minus | Dimension | UnknownDimension | Number | String | ident ) ws )+ ;\n"

			+ "negation = PseudoNot ws negationArg ws \")\" ;\n"

			+ "negationArg = typeSelector @@ " + prob_negationArg_0 + " | universal @@ " +
			    prob_negationArg_1 + " | Hash @@ " + prob_negationArg_2 + " | className @@ " +
			    prob_negationArg_3 + " | attrib @@ " + prob_negationArg_4 + " | pseudo @@ " +
			    prob_negationArg_5 +  " ;\n"

			+ "operator =  \"/\" ws @@ " + prob_operator_0 + " | Comma ws @@ " + prob_operator_1 +
			    " | Space ws @@ " + prob_operator_2 + " | \"=\" ws @@ " + prob_operator_3 + " ;\n"

			+ "property = ident ws @@ " + prob_property_0 + " | Variable ws @@ " + prob_property_1 +
			    " | \"*\" ident @@ " + prob_property_2 + " | \"_\" ident @@ " + prob_property_3 + " ;\n"

			+ "ruleset = selectorGroup \"{\" ws declarationList? \"}\" ws @@ " + prob_ruleset_0 +
			    " | any* \"{\" ws declarationList? \"}\" ws @@ " + prob_ruleset_1 + " ;\n"

			+ "declarationList = ( \";\" ws )* declaration ws ( \";\" ws declaration? )* ;\n"

			+ "declaration = property \":\" ws expr prio? @@ " + prob_declaration_0 +" | property \":\" ws value @@ " + prob_declaration_1 +  " ;\n"

			+ "prio = Important ws ;\n"

			+ "value = ( any | block | atKeyword ws )+ ;\n"

			+ "expr = term ( operator? term )* ;\n"

			+ "term = number ws @@ " + prob_term_0 + " | percentage ws @@ " + prob_term_1 +
			    " | dimension ws @@ " + prob_term_2 + " | String ws @@ " + prob_term_3 +
			    " | UnicodeRange ws @@ " + prob_term_4 + " | ident ws @@ " + prob_term_5 +
			    " | var @@ " + prob_term_6 + " | Uri ws @@ " + prob_term_7 + " | hexcolor @@ " +
			    prob_term_8 + " | calc @@ " + prob_term_9 + " | function @@ " + prob_term_10 +
			    " | unknownDimension ws @@ " + prob_term_11 + " | dxImageTransform @@ " + prob_term_12 +  " ;\n"

			+ "function = Function ws expr \")\" ws ;\n"

			+ "dxImageTransform = DxImageTransform ws expr \")\" ws  ;\n"

			+ "hexcolor = Hash ws ;\n"

			+ "number = ( Plus | Minus )? Number ;\n"

			+ "percentage = ( Plus | Minus )? Percentage ;\n"

			+ "dimension =( Plus | Minus )? Dimension ;\n"

			+ "unknownDimension = ( Plus | Minus )? UnknownDimension ;\n"

			+ "any = ident ws @@ " + prob_any_0 + " | number ws @@ " + prob_any_1 + " | percentage ws @@ " +
			    prob_any_2 + " | dimension ws @@ " + prob_any_3 + " | unknownDimension ws @@ " + prob_any_4 +
			    " | String ws @@ " + prob_any_5 + " | Uri ws @@ " + prob_any_6 + " | Hash ws @@ " +
			    prob_any_7 + " | UnicodeRange ws @@ " + prob_any_8 + " | Includes ws @@ " + prob_any_9 +
			    " | DashMatch ws @@ " + prob_any_10 + " | \":\" ws @@ " + prob_any_11 +
			    " | Function ws ( any | unused )* \")\" ws @@ " + prob_any_13 +
			    " | \"(\" ws ( any | unused )* \")\" ws @@ " + prob_any_14 +
			    " | \"[\" ws ( any | unused )* \"]\" ws @@ " + prob_any_16 + " ;\n"

			+ "atRule = atKeyword ws any* ( block  | \";\" ws ) ;\n"

			+ "atKeyword = \"@\" ident  ;\n"

			+ "unused = block @@ " + prob_unused_0 + " | atKeyword ws @@ " + prob_unused_1 +
			    " | \";\" ws @@ " + prob_unused_2 +" | Cdo ws @@ " + prob_unused_3 + " | Cdc ws @@ " +
			    prob_unused_4 + " ;\n"

			+ "block = \"{\" ws (  declarationList | nestedStatement | any | block | atKeyword ws | \";\" ws )* \"}\" ws ;\n"

			+ "nestedStatement = ruleset @@ " + prob_nestedStatement_0 + " | media @@ " + prob_nestedStatement_1 +
			    " | page @@ " + prob_nestedStatement_2 + " | fontFaceRule @@ " + prob_nestedStatement_3 +
			    " | keyframesRule @@ " + prob_nestedStatement_4 + " | supportsRule @@ " + prob_nestedStatement_5 +
			    " | viewport @@ " + prob_nestedStatement_6 + " | counterStyle @@ " + prob_nestedStatement_7 +
			    " | fontFeatureValuesRule @@ " + prob_nestedStatement_8 + " | atRule @@ " + prob_nestedStatement_9 + " ;\n"

			+ "groupRuleBody = \"{\" ws nestedStatement* \"}\" ws ;\n"

			+ "supportsRule = Supports ws supportsCondition ws groupRuleBody  ;\n"

			+ "supportsCondition = supportsNegation @@ " + prob_supportsCondition_0 + " | supportsConjunction @@ " +
			    prob_supportsCondition_1 + " | supportsDisjunction @@ " + prob_supportsCondition_2 +
			    " | supportsConditionInParens @@ " + prob_supportsCondition_3 + " ;\n"

			+ "supportsConditionInParens = \"(\" ws supportsCondition ws \")\" @@ " + prob_supportsConditionInParens_0 +
			    " | supportsDeclarationCondition @@ " + prob_supportsConditionInParens_1 +
			    " | generalEnclosed @@ " + prob_supportsConditionInParens_2 + " ;\n"

			+ "supportsNegation = Not ws Space ws supportsConditionInParens  ;\n"

			+ "supportsConjunction = supportsConditionInParens ( ws Space ws And ws Space ws supportsConditionInParens ) ;\n"

			+ "supportsDisjunction = supportsConditionInParens ( ws Space ws Or ws Space ws supportsConditionInParens ) ;\n"

			+ "supportsDeclarationCondition = \"(\" ws declaration \")\" ;\n"

			+ "generalEnclosed = ( Function | \"(\" ) ( any | unused )* \")\" ;\n"

			+ "var = Var ws Variable ws \")\" ws ;\n"

			+ "calc = Calc ws calcSum \")\" ws ;\n"

			+ "calcSum = calcProduct ( Space ws ( Plus | Minus ) ws Space ws calcProduct )* ;\n"

			+ "calcProduct = calcValue ( \"*\" ws calcValue | \"/\" ws number ws )* ;\n"

			+ "calcValue = number ws @@ " + prob_calcValue_0 + " | dimension ws @@ " + prob_calcValue_1 +
			    " | unknownDimension ws @@ " + prob_calcValue_2 + "| percentage ws @@ " + prob_calcValue_3 +
			    " | \"(\" ws calcSum \")\" ws @@ " + prob_calcValue_4 + ";\n"

			+ "fontFaceRule = FontFace ws \"{\" ws fontFaceDeclaration? ( \";\" ws fontFaceDeclaration? )* \"}\" ws ;\n"

			+ "fontFaceDeclaration = property \":\" ws expr @@ " + prob_fontFaceDeclaration_0 +
			    " | property \":\" ws value @@ " + prob_fontFaceDeclaration_1 +  " ;\n"

			+ "keyframesRule = Keyframes ws Space ws ident ws \"{\" ws keyframesBlocks \"}\" ws ;\n"

			+ "keyframesBlocks = ( keyframeSelector \"{\" ws declarationList? \"}\" ws )*  ;\n"

			+ "keyframeSelector = ( From | To | Percentage ) ws ( Comma ws ( From | To | Percentage ) ws )* ;\n"

			+ "viewport =  Viewport ws \"{\" ws declarationList? \"}\" ws ;\n"

			+ "counterStyle = CounterStyle ws ident ws \"{\" ws declarationList? \"}\" ws ;\n"

			+ "fontFeatureValuesRule = FontFeatureValues ws fontFamilyNameList ws \"{\" ws featureValueBlock* \"}\" ws ;\n"

			+ "fontFamilyNameList = fontFamilyName ( ws Comma ws fontFamilyName )* ;\n"

			+ "fontFamilyName = String @@ " + prob_fontFamilyName_0 + " | ident ( ws ident )* @@ " + prob_fontFamilyName_1 + " ;\n"

			+ "featureValueBlock = featureType ws \"{\" ws featureValueDefinition? ( ws \";\" ws featureValueDefinition? )* \"}\" ws ;\n"

			+ "featureType = atKeyword ;\n"

			+ "featureValueDefinition = ident ws \":\" ws number ( ws number )* ;\n"

			+ "ident = Ident @@ " + prob_ident_0 + " | MediaOnly @@ " + prob_ident_1 + " | Not @@ " +
			    prob_ident_2 + " | And @@ " + prob_ident_3 + " | Or @@ " + prob_ident_4 +
			    " | From @@ " + prob_ident_5 + " | To @@ " + prob_ident_6 + " ;\n"

			+ "ws = ( Comment | Space )* ;\n"

			+ "Hex = /[0-9a-fA-F]/ ;\n"

			+ "NewlineOrSpace = \"\\\\r\\\\n\" | /[ \\\\t\\\\r\\\\n\\\\f ]?/;\n"

			+ "Unicode = \"\\\\\\\\\" Hex Hex? Hex? Hex? Hex? Hex? NewlineOrSpace  ;\n"

			+ "Escape = Unicode | \"\\\\\\\\\" /~[\\\\r\\\\n\\\\f0-9a-fA-F]/ ;\n"

			+ "Nmstart = /[_a-zA-Z]/ | Nonascii | Escape  ;\n"

			+ "Nmchar = /[_a-zA-Z0-9\\\\-]/ | Nonascii | Escape ;\n"

			+ "Comment = \"/*\" /(~[*])*/ /[*]+/ ( /~[\\/*]/ /(~[*])*/ /[*]+/ )* \"/\" ;\n"

			+ "Name =  Nmchar+ ;\n"
			+ "Url = ( /[!#$%&*-~]/ | Nonascii | Escape )*  ;\n"
			+ "Space = /[\\\\t\\\\r\\\\n\\\\f ]+/  ;\n"
			+ "Whitespace = Space? ;\n"
			+ "Newline = \"\\\\n\" | \"\\\\r\\\\n\" | \"\\\\r\" | \"\\\\f\" ;\n"
			+ "ZeroToFourZeros = \"0\"? \"0\"? \"0\"? \"0\"?  ;\n"
			+ "A = \"a\" | \"A\" | \"\\\\\\\\\" ZeroToFourZeros (\"41\"|\"61\") NewlineOrSpace ;\n"
			+ "B = \"b\" | \"B\" | \"\\\\\\\\\" ZeroToFourZeros (\"42\"|\"62\") NewlineOrSpace ;\n"
			+ "C = \"c\" | \"C\" | \"\\\\\\\\\" ZeroToFourZeros (\"43\"|\"63\") NewlineOrSpace  ;\n"
			+ "D = \"d\" | \"D\" | \"\\\\\\\\\" ZeroToFourZeros (\"44\"|\"64\") NewlineOrSpace  ;\n"
			+ "E = \"e\" | \"E\" | \"\\\\\\\\\" ZeroToFourZeros (\"45\"|\"65\") NewlineOrSpace  ;\n"
			+ "F = \"f\" | \"F\" | \"\\\\\\\\\" ZeroToFourZeros (\"46\"|\"66\") NewlineOrSpace  ;\n"
			+ "G = \"g\" | \"G\" | \"\\\\\\\\\" ZeroToFourZeros (\"47\"|\"67\") NewlineOrSpace | \"\\\\\\\\g\" | \"\\\\\\\\G\" ;\n"
			+ "H = \"h\" | \"H\" | \"\\\\\\\\\" ZeroToFourZeros (\"48\"|\"68\") NewlineOrSpace | \"\\\\\\\\h\" | \"\\\\\\\\H\" ;\n"
			+ "I = \"i\" | \"I\" | \"\\\\\\\\\" ZeroToFourZeros (\"49\"|\"69\") NewlineOrSpace | \"\\\\\\\\i\" | \"\\\\\\\\I\" ;\n"
			+ "K = \"k\" | \"K\" | \"\\\\\\\\\" ZeroToFourZeros (\"4b\"|\"6b\") NewlineOrSpace | \"\\\\\\\\k\" | \"\\\\\\\\K\" ;\n"
			+ "L = \"l\" | \"L\" | \"\\\\\\\\\" ZeroToFourZeros (\"4c\"|\"6c\") NewlineOrSpace | \"\\\\\\\\l\" | \"\\\\\\\\L\" ;\n"
			+ "M = \"m\" | \"M\" | \"\\\\\\\\\" ZeroToFourZeros (\"4d\"|\"6d\") NewlineOrSpace | \"\\\\\\\\m\" | \"\\\\\\\\M\" ;\n"
			+ "N = \"n\" | \"N\" | \"\\\\\\\\\" ZeroToFourZeros (\"4e\"|\"6e\") NewlineOrSpace | \"\\\\\\\\n\" | \"\\\\\\\\N\" ;\n"
			+ "O = \"o\" | \"O\" | \"\\\\\\\\\" ZeroToFourZeros (\"4f\"|\"6f\") NewlineOrSpace | \"\\\\\\\\o\" | \"\\\\\\\\O\" ;\n"
			+ "P = \"p\" | \"P\" | \"\\\\\\\\\" ZeroToFourZeros (\"50\"|\"70\") NewlineOrSpace | \"\\\\\\\\p\" | \"\\\\\\\\P\" ;\n"
			+ "Q = \"q\" | \"Q\" | \"\\\\\\\\\" ZeroToFourZeros (\"51\"|\"71\") NewlineOrSpace | \"\\\\\\\\q\" | \"\\\\\\\\Q\" ;\n"
			+ "R = \"r\" | \"R\" | \"\\\\\\\\\" ZeroToFourZeros (\"52\"|\"72\") NewlineOrSpace | \"\\\\\\\\r\" | \"\\\\\\\\R\" ;\n"
			+ "S = \"s\" | \"S\" | \"\\\\\\\\\" ZeroToFourZeros (\"53\"|\"73\") NewlineOrSpace | \"\\\\\\\\s\" | \"\\\\\\\\S\" ;\n"
			+ "T = \"t\" | \"T\" | \"\\\\\\\\\" ZeroToFourZeros (\"54\"|\"74\") NewlineOrSpace | \"\\\\\\\\t\" | \"\\\\\\\\T\" ;\n"
			+ "U = \"u\" | \"U\" | \"\\\\\\\\\" ZeroToFourZeros (\"55\"|\"75\") NewlineOrSpace | \"\\\\\\\\u\" | \"\\\\\\\\U\" ;\n"
			+ "V = \"v\" | \"V\" | \"\\\\\\\\\" ZeroToFourZeros (\"56\"|\"76\") NewlineOrSpace | \"\\\\\\\\v\" | \"\\\\\\\\V\" ;\n"
			+ "W = \"w\" | \"W\" | \"\\\\\\\\\" ZeroToFourZeros (\"57\"|\"77\") NewlineOrSpace | \"\\\\\\\\w\" | \"\\\\\\\\W\" ;\n"
			+ "X = \"x\" | \"X\" | \"\\\\\\\\\" ZeroToFourZeros (\"58\"|\"78\") NewlineOrSpace | \"\\\\\\\\x\" | \"\\\\\\\\X\" ;\n"
			+ "Y = \"y\" | \"Y\" | \"\\\\\\\\\" ZeroToFourZeros (\"59\"|\"79\") NewlineOrSpace | \"\\\\\\\\y\" | \"\\\\\\\\Y\" ;\n"
			+ "Z = \"z\" | \"Z\" | \"\\\\\\\\\" ZeroToFourZeros (\"5a\"|\"7a\") NewlineOrSpace | \"\\\\\\\\z\" | \"\\\\\\\\Z\" ;\n"
			+ "DashChar = \"-\" | \"\\\\\\\\\" ZeroToFourZeros \"2d\" NewlineOrSpace ;\n"
			+ "Cdo = \"<!--\" ;\n"
			+ "Cdc = \"-->\" ;\n"
			+ "Includes = \"~=\" ;\n"
			+ "DashMatch = \"|=\" ;\n"
			+ "Hash = \"#\" Name ;\n"
			+ "Import = \"@\" I M P O R T ;\n"
			+ "Page = \"@\" P A G E ;\n"
			+ "Media = \"@\" M E D I A ;\n"
			+ "Namespace = \"@\" N A M E S P A C E ;\n"
			+ "Charset = \"@charset \" ;\n"

			+ "Important = \"!\" ( Space | Comment )* I M P O R T A N T ;\n"
			+ "FontRelative  = Number E M | Number E X | Number C H | Number R E M ;\n"
			+ "ViewportRelative = Number V W | Number V H | Number V M I N | Number V M A X ;\n"
			+ "AbsLength = Number P X | Number C M | Number M M | Number I N | Number P T | Number P C | Number Q ;\n"
			+ "Angle = Number D E G | Number R A D | Number G R A D | Number T U R N ;\n"
			+ "Time = Number M S | Number S ;\n"
			+ "Freq = Number H Z | Number K H Z ;\n"
			+ "Percentage = Number \"%\" ;\n"

			/*
			+ "Uri = U R L \"(\" Whitespace String Whitespace \")\" @@ " + prob_Uri_0 + " | U R L \"(\" Whitespace Url Whitespace \")\" @@ " + prob_Uri_1 + " ;\n"
			*/
			+ "Uri = U R L \"(\" Whitespace String Whitespace \")\" | U R L \"(\" Whitespace Url Whitespace \")\" ;\n"

			/*
			+ "UnicodeRange = [u|U] \"+?\" \"?\"? \"?\"? \"?\"? \"?\"? \"?\"? @@ " + prob_UnicodeRange_1 + " | [u|U] \"+\" Hex \"?\"? \"?\"? \"?\"? \"?\"? \"?\"? @@ " + prob_UnicodeRange_3 + " | [u|U] \"+\" Hex Hex \"?\"? \"?\"? \"?\"? \"?\"? @@ " + prob_UnicodeRange_5 + " | [u|U] \"+\" Hex Hex Hex \"?\"? \"?\"? \"?\"? @@ " + prob_UnicodeRange_7 + " | [u|U] \"+\" Hex Hex Hex Hex \"?\"? \"?\"? @@ " + prob_UnicodeRange_9
			    + " | [u|U] \"+\" Hex Hex Hex Hex Hex \"?\"? @@ " + prob_UnicodeRange_11 + " ;\n"
			*/
			+ "UnicodeRange = /[u|U]/ \"+?\" \"?\"? \"?\"? \"?\"? \"?\"? \"?\"? " +
			    "| /[u|U]/ \"+\" Hex \"?\"? \"?\"? \"?\"? \"?\"? \"?\"? " +
			    "| /[u|U]/ \"+\" Hex Hex \"?\"? \"?\"? \"?\"? \"?\"? " +
			    "| /[u|U]/ \"+\" Hex Hex Hex \"?\"? \"?\"? \"?\"? " +
			    "| /[u|U]/ \"+\" Hex Hex Hex Hex \"?\"? \"?\"? " +
			    "| /[u|U]/ \"+\" Hex Hex Hex Hex Hex \"?\"? ;\n"


			+ "MediaOnly = O N L Y ;\n"
			+ "Not = N O T ;\n"
			+ "And = A N D ;\n"
			+ "Resolution = Number D P I | Number D P C M | Number D P P X  ;\n"
			+ "Length = AbsLength | FontRelative | ViewportRelative  ;\n"

			/*
			+ "Dimension = Length @@ " + prob_Dimension_0 + " | Time @@ " + prob_Dimension_1 + " | Freq @@ " + prob_Dimension_2 + " | Resolution @@ " + prob_Dimension_3 + " | Angle @@ " + prob_Dimension_4 + " ;\n"
			*/
			+ "Dimension = Length | Time | Freq | Resolution | Angle ;\n"


			+ "UnknownDimension = Number Ident ;\n"
			+ "Nonascii = /~[\\\\u0000-\\\\u007f]/ ;\n"
			+ "Plus = \"+\"  ;\n"
			+ "Minus = \"-\" ;\n"
			+ "Greater =  \">\" ;\n"
			+ "Comma = \",\" ;\n"
			+ "Tilde = \"~\" ;\n" 
			+ "PseudoNot = \":\" N O T \"(\" ;\n"

			/*
			+ "Number = [0-9]+ @@ " + prob_Number_0 + " | [0-9]* \".\" [0-9]+ @@ " + prob_Number_1 + " ;\n"
			*/
			+ "Number = /[0-9]+/ | /[0-9]*/ \".\" /[0-9]+/ ;\n"


			// TODO I'm quite certain this rule is not properly escaped for printing...
			/*
			+ "String = '\"' ( ~[\n\r\f\\\"] | '\\' Newline | Nonascii | Escape )* '\"' @@ " + prob_String_3 +
			    " | '\'' ( ~[\n\r\f\\'] | '\\' Newline | Nonascii | Escape )* '\'' @@ " + prob_String_7 + " ;\n"
			+ "String = '\"' ( ~[\n\r\f\\\"] | '\\\' Newline | Nonascii | Escape )* '\"' | '\'' ( ~[\n\r\f\\\'] " +
			    " | '\\\' Newline | Nonascii | Escape )* '\'' ;\n"
			*/
			+ "String = \"\\\"\" ( /~[\\\\n\\\\r\\\\f\\\\\\\\\\\"]/ | \"\\\\\\\\\" Newline | Nonascii | Escape )* \"\\\"\" | \"'\" ( /~[\\\\n\\\\r\\\\f\\\\\\\\']/ " +
			    " | \"\\\\\\\\\" Newline | Nonascii | Escape )* \"'\" ;\n"

			+ "PrefixMatch = \"^=\" ;\n"
			+ "SuffixMatch = \"$=\" ;\n"
			+ "SubstringMatch = \"*=\" ;\n"
			+ "FontFace = \"@\" F O N T DashChar F A C E ;\n"
			+ "Supports = \"@\" S U P P O R T S ;\n"
			+ "Or = O R ;\n"
			+ "VendorPrefix = \"-\" M O Z \"-\" | \"-\" W E B K I T \"-\" | \"-\" O \"-\"  ;\n"
			+ "Keyframes = \"@\" VendorPrefix? K E Y F R A M E S ;\n"
			+ "From = F R O M ;\n"
			+ "To = T O ;\n"
			+ "Calc = \"calc(\" ;\n"
			+ "Viewport = \"@\" V I E W P O R T ;\n"
			+ "CounterStyle =  \"@\" C O U N T E R DashChar S T Y L E  ;\n"
			+ "FontFeatureValues = \"@\" F O N T DashChar F E A T U R E DashChar V A L U E S ;\n"
			+ "DxImageTransform = \"progid:DXImageTransform.Microsoft.\" Function ;\n"
			+ "Variable = \"--\" Nmstart Nmchar* ;\n"
			+ "Var = \"var(\" ;\n"
			+ "Ident = \"-\"? Nmstart Nmchar* ;\n"
			+ "Function = Ident \"(\" ;\n"

			);


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

	public static class StylesheetContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public List<CharsetContext> charset() {
			return getRuleContexts(CharsetContext.class);
		}
		public CharsetContext charset(int i) {
			return getRuleContext(CharsetContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public List<TerminalNode> Comment() { return getTokens(css3Parser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(css3Parser.Comment, i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public List<TerminalNode> Cdo() { return getTokens(css3Parser.Cdo); }
		public TerminalNode Cdo(int i) {
			return getToken(css3Parser.Cdo, i);
		}
		public List<TerminalNode> Cdc() { return getTokens(css3Parser.Cdc); }
		public TerminalNode Cdc(int i) {
			return getToken(css3Parser.Cdc, i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitStylesheet(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			ws();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Charset) {
				{
				{
				setState(164);
				charset();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) {
					{
					{
					setState(165);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(176);
				imports();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) {
					{
					{
					setState(177);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Namespace) {
				{
				{
				setState(188);
				namespace();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) {
					{
					{
					setState(189);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__14) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Page) | (1L << Media) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << PseudoNot) | (1L << Number) | (1L << String) | (1L << FontFace) | (1L << Supports) | (1L << Or) | (1L << Keyframes) | (1L << From) | (1L << To) | (1L << Viewport) | (1L << CounterStyle) | (1L << FontFeatureValues) | (1L << Ident) | (1L << Function))) != 0)) {
				{
				{
				setState(200);
				nestedStatement();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) {
					{
					{
					setState(201);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << Space) | (1L << Cdo) | (1L << Cdc))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class CharsetContext extends ParserRuleContext {
		public CharsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset; }
	 
		public CharsetContext() { }
		public void copyFrom(CharsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadCharsetContext extends CharsetContext {
		public TerminalNode Charset() { return getToken(css3Parser.Charset, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public BadCharsetContext(CharsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadCharset(this);
		}
	}
	public static class GoodCharsetContext extends CharsetContext {
		public TerminalNode Charset() { return getToken(css3Parser.Charset, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public GoodCharsetContext(CharsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodCharset(this);
		}
	}

	public final CharsetContext charset() throws RecognitionException {
		CharsetContext _localctx = new CharsetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_charset);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new GoodCharsetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(Charset);
				setState(213);
				ws();
				setState(214);
				match(String);
				setState(215);
				ws();
				setState(216);
				match(T__0);
				setState(217);
				ws();
				count_charset_0++; 
				}
				break;
			case 2:
				_localctx = new BadCharsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(Charset);
				setState(221);
				ws();
				setState(222);
				match(String);
				setState(223);
				ws();
				count_charset_1++; 
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

	public static class ImportsContext extends ParserRuleContext {
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	 
		public ImportsContext() { }
		public void copyFrom(ImportsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadImportContext extends ImportsContext {
		public TerminalNode Import() { return getToken(css3Parser.Import, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public BadImportContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadImport(this);
		}
	}
	public static class GoodImportContext extends ImportsContext {
		public TerminalNode Import() { return getToken(css3Parser.Import, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public GoodImportContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodImport(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_imports);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(Import);
				setState(229);
				ws();
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				ws();
				setState(232);
				mediaQueryList();
				setState(233);
				match(T__0);
				setState(234);
				ws();
				count_imports_1++; 
				}
				break;
			case 2:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(Import);
				setState(238);
				ws();
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				ws();
				setState(241);
				match(T__0);
				setState(242);
				ws();
				count_imports_3++; 
				}
				break;
			case 3:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(Import);
				setState(246);
				ws();
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(248);
				ws();
				setState(249);
				mediaQueryList();
				count_imports_5++; 
				}
				break;
			case 4:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(Import);
				setState(253);
				ws();
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				ws();
				count_imports_7++; 
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

	public static class NamespaceContext extends ParserRuleContext {
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	 
		public NamespaceContext() { }
		public void copyFrom(NamespaceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GoodNamespaceContext extends NamespaceContext {
		public TerminalNode Namespace() { return getToken(css3Parser.Namespace, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public GoodNamespaceContext(NamespaceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodNamespace(this);
		}
	}
	public static class BadNamespaceContext extends NamespaceContext {
		public TerminalNode Namespace() { return getToken(css3Parser.Namespace, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public BadNamespaceContext(NamespaceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namespace);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new GoodNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(Namespace);
				setState(261);
				ws();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0)) {
					{
					setState(262);
					namespacePrefix();
					setState(263);
					ws();
					}
				}

				setState(267);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				ws();
				setState(269);
				match(T__0);
				setState(270);
				ws();
				count_namespace_1++; 
				}
				break;
			case 2:
				_localctx = new BadNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(Namespace);
				setState(274);
				ws();
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0)) {
					{
					setState(275);
					namespacePrefix();
					setState(276);
					ws();
					}
				}

				setState(280);
				_la = _input.LA(1);
				if ( !(_la==Uri || _la==String) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				ws();
				count_namespace_3++; 
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

	public static class NamespacePrefixContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public NamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNamespacePrefix(this);
		}
	}

	public final NamespacePrefixContext namespacePrefix() throws RecognitionException {
		NamespacePrefixContext _localctx = new NamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_namespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			ident();
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

	public static class MediaContext extends ParserRuleContext {
		public TerminalNode Media() { return getToken(css3Parser.Media, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMedia(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(Media);
			setState(289);
			ws();
			setState(290);
			mediaQueryList();
			setState(291);
			groupRuleBody();
			setState(292);
			ws();
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

	public static class MediaQueryListContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(css3Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(css3Parser.Comma, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaQueryList(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(294);
				mediaQuery();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(295);
					match(Comma);
					setState(296);
					ws();
					setState(297);
					mediaQuery();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(306);
			ws();
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

	public static class MediaQueryContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaTypeContext mediaType() {
			return getRuleContext(MediaTypeContext.class,0);
		}
		public List<TerminalNode> And() { return getTokens(css3Parser.And); }
		public TerminalNode And(int i) {
			return getToken(css3Parser.And, i);
		}
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public TerminalNode MediaOnly() { return getToken(css3Parser.MediaOnly, 0); }
		public TerminalNode Not() { return getToken(css3Parser.Not, 0); }
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaQuery(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mediaQuery);
		int _la;
		try {
			int _alt;
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comment:
			case Space:
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(308);
					_la = _input.LA(1);
					if ( !(_la==MediaOnly || _la==Not) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(311);
				ws();
				setState(312);
				mediaType();
				setState(313);
				ws();
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314);
						match(And);
						setState(315);
						ws();
						setState(316);
						mediaExpression();
						}
						} 
					}
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				count_mediaQuery_1++; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				mediaExpression();
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(326);
						match(And);
						setState(327);
						ws();
						setState(328);
						mediaExpression();
						}
						} 
					}
					setState(334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				count_mediaQuery_2++; 
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

	public static class MediaTypeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MediaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaType(this);
		}
	}

	public final MediaTypeContext mediaType() throws RecognitionException {
		MediaTypeContext _localctx = new MediaTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mediaType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			ident();
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

	public static class MediaExpressionContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaFeatureContext mediaFeature() {
			return getRuleContext(MediaFeatureContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MediaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaExpression(this);
		}
	}

	public final MediaExpressionContext mediaExpression() throws RecognitionException {
		MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mediaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__1);
			setState(342);
			ws();
			setState(343);
			mediaFeature();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(344);
				match(T__2);
				setState(345);
				ws();
				setState(346);
				expr();
				}
			}

			setState(350);
			match(T__3);
			setState(351);
			ws();
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

	public static class MediaFeatureContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public MediaFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterMediaFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitMediaFeature(this);
		}
	}

	public final MediaFeatureContext mediaFeature() throws RecognitionException {
		MediaFeatureContext _localctx = new MediaFeatureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mediaFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			ident();
			setState(354);
			ws();
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

	public static class PageContext extends ParserRuleContext {
		public TerminalNode Page() { return getToken(css3Parser.Page, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public PseudoPageContext pseudoPage() {
			return getRuleContext(PseudoPageContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPage(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(Page);
			setState(357);
			ws();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(358);
				pseudoPage();
				}
			}

			setState(361);
			match(T__4);
			setState(362);
			ws();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
				{
				setState(363);
				declaration();
				}
			}

			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(366);
				match(T__0);
				setState(367);
				ws();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(368);
					declaration();
					}
				}

				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(T__5);
			setState(377);
			ws();
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

	public static class PseudoPageContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public PseudoPageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoPage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPseudoPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPseudoPage(this);
		}
	}

	public final PseudoPageContext pseudoPage() throws RecognitionException {
		PseudoPageContext _localctx = new PseudoPageContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pseudoPage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__2);
			setState(380);
			ident();
			setState(381);
			ws();
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

	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(css3Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(css3Parser.Comma, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSelectorGroup(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			selector();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(384);
				match(Comma);
				setState(385);
				ws();
				setState(386);
				selector();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorSequenceContext> simpleSelectorSequence() {
			return getRuleContexts(SimpleSelectorSequenceContext.class);
		}
		public SimpleSelectorSequenceContext simpleSelectorSequence(int i) {
			return getRuleContext(SimpleSelectorSequenceContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			simpleSelectorSequence();
			setState(394);
			ws();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Space) | (1L << Plus) | (1L << Greater) | (1L << Tilde))) != 0)) {
				{
				{
				setState(395);
				combinator();
				setState(396);
				simpleSelectorSequence();
				setState(397);
				ws();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Greater() { return getToken(css3Parser.Greater, 0); }
		public TerminalNode Tilde() { return getToken(css3Parser.Tilde, 0); }
		public TerminalNode Space() { return getToken(css3Parser.Space, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCombinator(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_combinator);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(Plus);
				setState(405);
				ws();
				count_combinator_0++; 
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(Greater);
				setState(409);
				ws();
				count_combinator_1++; 
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(Tilde);
				setState(413);
				ws();
				count_combinator_2++; 
				}
				break;
			case Space:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				match(Space);
				setState(417);
				ws();
				count_combinator_3++; 
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

	public static class SimpleSelectorSequenceContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public List<TerminalNode> Hash() { return getTokens(css3Parser.Hash); }
		public TerminalNode Hash(int i) {
			return getToken(css3Parser.Hash, i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public SimpleSelectorSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectorSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSimpleSelectorSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSimpleSelectorSequence(this);
		}
	}

	public final SimpleSelectorSequenceContext simpleSelectorSequence() throws RecognitionException {
		SimpleSelectorSequenceContext _localctx = new SimpleSelectorSequenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(422);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(423);
					universal();
					}
					break;
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << Hash) | (1L << PseudoNot))) != 0)) {
					{
					setState(431);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(426);
						match(Hash);
						}
						break;
					case T__8:
						{
						setState(427);
						className();
						}
						break;
					case T__9:
						{
						setState(428);
						attrib();
						}
						break;
					case T__2:
						{
						setState(429);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(430);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				count_simpleSelectorSequence_5++; 
				}
				break;
			case T__2:
			case T__8:
			case T__9:
			case Hash:
			case PseudoNot:
				enterOuterAlt(_localctx, 2);
				{
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(443);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(438);
						match(Hash);
						}
						break;
					case T__8:
						{
						setState(439);
						className();
						}
						break;
					case T__9:
						{
						setState(440);
						attrib();
						}
						break;
					case T__2:
						{
						setState(441);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(442);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(445); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << Hash) | (1L << PseudoNot))) != 0) );
				count_simpleSelectorSequence_10++; 
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

	public static class TypeSelectorContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitTypeSelector(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(450);
				typeNamespacePrefix();
				}
				break;
			}
			setState(453);
			elementName();
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

	public static class TypeNamespacePrefixContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeNamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterTypeNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitTypeNamespacePrefix(this);
		}
	}

	public final TypeNamespacePrefixContext typeNamespacePrefix() throws RecognitionException {
		TypeNamespacePrefixContext _localctx = new TypeNamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeNamespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				{
				setState(455);
				ident();
				}
				break;
			case T__6:
				{
				setState(456);
				match(T__6);
				}
				break;
			case T__7:
				break;
			default:
				break;
			}
			setState(459);
			match(T__7);
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

	public static class ElementNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitElementName(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			ident();
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

	public static class UniversalContext extends ParserRuleContext {
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUniversal(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(463);
				typeNamespacePrefix();
				}
				break;
			}
			setState(466);
			match(T__6);
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

	public static class ClassNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__8);
			setState(469);
			ident();
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

	public static class AttribContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TerminalNode PrefixMatch() { return getToken(css3Parser.PrefixMatch, 0); }
		public TerminalNode SuffixMatch() { return getToken(css3Parser.SuffixMatch, 0); }
		public TerminalNode SubstringMatch() { return getToken(css3Parser.SubstringMatch, 0); }
		public TerminalNode Includes() { return getToken(css3Parser.Includes, 0); }
		public TerminalNode DashMatch() { return getToken(css3Parser.DashMatch, 0); }
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitAttrib(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__9);
			setState(472);
			ws();
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(473);
				typeNamespacePrefix();
				}
				break;
			}
			setState(476);
			ident();
			setState(477);
			ws();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << Includes) | (1L << DashMatch) | (1L << PrefixMatch) | (1L << SuffixMatch) | (1L << SubstringMatch))) != 0)) {
				{
				setState(478);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << Includes) | (1L << DashMatch) | (1L << PrefixMatch) | (1L << SuffixMatch) | (1L << SubstringMatch))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				ws();
				setState(482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MediaOnly:
				case Not:
				case And:
				case Or:
				case From:
				case To:
				case Ident:
					{
					setState(480);
					ident();
					}
					break;
				case String:
					{
					setState(481);
					match(String);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(484);
				ws();
				}
			}

			setState(488);
			match(T__11);
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

	public static class PseudoContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FunctionalPseudoContext functionalPseudo() {
			return getRuleContext(FunctionalPseudoContext.class,0);
		}
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPseudo(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__2);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(491);
				match(T__2);
				}
			}

			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				{
				setState(494);
				ident();
				}
				break;
			case Function:
				{
				setState(495);
				functionalPseudo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class FunctionalPseudoContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(css3Parser.Function, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionalPseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalPseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFunctionalPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFunctionalPseudo(this);
		}
	}

	public final FunctionalPseudoContext functionalPseudo() throws RecognitionException {
		FunctionalPseudoContext _localctx = new FunctionalPseudoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionalPseudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(Function);
			setState(499);
			ws();
			setState(500);
			expression();
			setState(501);
			match(T__3);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(css3Parser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(css3Parser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(css3Parser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(css3Parser.Minus, i);
		}
		public List<TerminalNode> Dimension() { return getTokens(css3Parser.Dimension); }
		public TerminalNode Dimension(int i) {
			return getToken(css3Parser.Dimension, i);
		}
		public List<TerminalNode> UnknownDimension() { return getTokens(css3Parser.UnknownDimension); }
		public TerminalNode UnknownDimension(int i) {
			return getToken(css3Parser.UnknownDimension, i);
		}
		public List<TerminalNode> Number() { return getTokens(css3Parser.Number); }
		public TerminalNode Number(int i) {
			return getToken(css3Parser.Number, i);
		}
		public List<TerminalNode> String() { return getTokens(css3Parser.String); }
		public TerminalNode String(int i) {
			return getToken(css3Parser.String, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(510);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(503);
					match(Plus);
					}
					break;
				case Minus:
					{
					setState(504);
					match(Minus);
					}
					break;
				case Dimension:
					{
					setState(505);
					match(Dimension);
					}
					break;
				case UnknownDimension:
					{
					setState(506);
					match(UnknownDimension);
					}
					break;
				case Number:
					{
					setState(507);
					match(Number);
					}
					break;
				case String:
					{
					setState(508);
					match(String);
					}
					break;
				case MediaOnly:
				case Not:
				case And:
				case Or:
				case From:
				case To:
				case Ident:
					{
					setState(509);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(512);
				ws();
				}
				}
				setState(515); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0) );
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

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode PseudoNot() { return getToken(css3Parser.PseudoNot, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public NegationArgContext negationArg() {
			return getRuleContext(NegationArgContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNegation(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(PseudoNot);
			setState(518);
			ws();
			setState(519);
			negationArg();
			setState(520);
			ws();
			setState(521);
			match(T__3);
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

	public static class NegationArgContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public TerminalNode Hash() { return getToken(css3Parser.Hash, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public NegationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNegationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNegationArg(this);
		}
	}

	public final NegationArgContext negationArg() throws RecognitionException {
		NegationArgContext _localctx = new NegationArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_negationArg);
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				typeSelector();
				count_negationArg_0++; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				universal();
				count_negationArg_1++; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				match(Hash);
				count_negationArg_2++; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				className();
				count_negationArg_3++; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534);
				attrib();
				count_negationArg_4++; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(537);
				pseudo();
				count_negationArg_5++; 
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	 
		public OperatorContext() { }
		public void copyFrom(OperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadOperatorContext extends OperatorContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public BadOperatorContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadOperator(this);
		}
	}
	public static class GoodOperatorContext extends OperatorContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Comma() { return getToken(css3Parser.Comma, 0); }
		public TerminalNode Space() { return getToken(css3Parser.Space, 0); }
		public GoodOperatorContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operator);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(T__12);
				setState(543);
				ws();
				count_operator_0++; 
				}
				break;
			case Comma:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(Comma);
				setState(547);
				ws();
				count_operator_1++; 
				}
				break;
			case Space:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				match(Space);
				setState(551);
				ws();
				count_operator_2++; 
				}
				break;
			case T__10:
				_localctx = new BadOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(554);
				match(T__10);
				setState(555);
				ws();
				count_operator_3++; 
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

	public static class PropertyContext extends ParserRuleContext {
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	 
		public PropertyContext() { }
		public void copyFrom(PropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadPropertyContext extends PropertyContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public BadPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadProperty(this);
		}
	}
	public static class GoodPropertyContext extends PropertyContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Variable() { return getToken(css3Parser.Variable, 0); }
		public GoodPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGoodProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGoodProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_property);
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				ident();
				setState(561);
				ws();
				count_property_0++; 
				}
				break;
			case Variable:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(Variable);
				setState(565);
				ws();
				count_property_1++; 
				}
				break;
			case T__6:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				match(T__6);
				setState(569);
				ident();
				count_property_2++; 
				}
				break;
			case T__13:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				match(T__13);
				setState(573);
				ident();
				count_property_3++; 
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

	public static class RulesetContext extends ParserRuleContext {
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
	 
		public RulesetContext() { }
		public void copyFrom(RulesetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnknownRulesetContext extends RulesetContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public UnknownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownRuleset(this);
		}
	}
	public static class KnownRulesetContext extends RulesetContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public KnownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKnownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKnownRuleset(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ruleset);
		int _la;
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new KnownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				selectorGroup();
				setState(579);
				match(T__4);
				setState(580);
				ws();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(581);
					declarationList();
					}
				}

				setState(584);
				match(T__5);
				setState(585);
				ws();
				count_ruleset_0++; 
				}
				break;
			case 2:
				_localctx = new UnknownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function))) != 0)) {
					{
					{
					setState(588);
					any();
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				match(T__4);
				setState(595);
				ws();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(596);
					declarationList();
					}
				}

				setState(599);
				match(T__5);
				setState(600);
				ws();
				count_ruleset_1++; 
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

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(605);
				match(T__0);
				setState(606);
				ws();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			declaration();
			setState(613);
			ws();
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(614);
					match(T__0);
					setState(615);
					ws();
					setState(617);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(616);
						declaration();
						}
						break;
					}
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnknownDeclarationContext extends DeclarationContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownDeclaration(this);
		}
	}
	public static class KnownDeclarationContext extends DeclarationContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public KnownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKnownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKnownDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declaration);
		int _la;
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new KnownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				property();
				setState(625);
				match(T__2);
				setState(626);
				ws();
				setState(627);
				expr();
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Important) {
					{
					setState(628);
					prio();
					}
				}

				count_declaration_0++; 
				}
				break;
			case 2:
				_localctx = new UnknownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				property();
				setState(634);
				match(T__2);
				setState(635);
				ws();
				setState(636);
				value();
				count_declaration_1++; 
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

	public static class PrioContext extends ParserRuleContext {
		public TerminalNode Important() { return getToken(css3Parser.Important, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public PrioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPrio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPrio(this);
		}
	}

	public final PrioContext prio() throws RecognitionException {
		PrioContext _localctx = new PrioContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_prio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(Important);
			setState(642);
			ws();
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

	public static class ValueContext extends ParserRuleContext {
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<AtKeywordContext> atKeyword() {
			return getRuleContexts(AtKeywordContext.class);
		}
		public AtKeywordContext atKeyword(int i) {
			return getRuleContext(AtKeywordContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(649);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__9:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Uri:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Plus:
					case Minus:
					case Number:
					case String:
					case Or:
					case From:
					case To:
					case Ident:
					case Function:
						{
						setState(644);
						any();
						}
						break;
					case T__4:
						{
						setState(645);
						block();
						}
						break;
					case T__14:
						{
						setState(646);
						atKeyword();
						setState(647);
						ws();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(651); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			term();
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << Space) | (1L << Comma))) != 0)) {
						{
						setState(654);
						operator();
						}
					}

					setState(657);
					term();
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BadTermContext extends TermContext {
		public DxImageTransformContext dxImageTransform() {
			return getRuleContext(DxImageTransformContext.class,0);
		}
		public BadTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBadTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBadTerm(this);
		}
	}
	public static class KnownTermContext extends TermContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public TerminalNode UnicodeRange() { return getToken(css3Parser.UnicodeRange, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public HexcolorContext hexcolor() {
			return getRuleContext(HexcolorContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public KnownTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKnownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKnownTerm(this);
		}
	}
	public static class UnknownTermContext extends TermContext {
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public UnknownTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_term);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				number();
				setState(664);
				ws();
				count_term_0++; 
				}
				break;
			case 2:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				percentage();
				setState(668);
				ws();
				count_term_1++; 
				}
				break;
			case 3:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				dimension();
				setState(672);
				ws();
				count_term_2++; 
				}
				break;
			case 4:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(675);
				match(String);
				setState(676);
				ws();
				count_term_3++; 
				}
				break;
			case 5:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				match(UnicodeRange);
				setState(680);
				ws();
				count_term_4++; 
				}
				break;
			case 6:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(683);
				ident();
				setState(684);
				ws();
				count_term_5++; 
				}
				break;
			case 7:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(687);
				var();
				count_term_6++; 
				}
				break;
			case 8:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(690);
				match(Uri);
				setState(691);
				ws();
				count_term_7++; 
				}
				break;
			case 9:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(694);
				hexcolor();
				count_term_8++; 
				}
				break;
			case 10:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(697);
				calc();
				count_term_9++; 
				}
				break;
			case 11:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(700);
				function();
				count_term_10++; 
				}
				break;
			case 12:
				_localctx = new UnknownTermContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(703);
				unknownDimension();
				setState(704);
				ws();
				count_term_11++; 
				}
				break;
			case 13:
				_localctx = new BadTermContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(707);
				dxImageTransform();
				count_term_12++; 
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(css3Parser.Function, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(Function);
			setState(713);
			ws();
			setState(714);
			expr();
			setState(715);
			match(T__3);
			setState(716);
			ws();
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

	public static class DxImageTransformContext extends ParserRuleContext {
		public TerminalNode DxImageTransform() { return getToken(css3Parser.DxImageTransform, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DxImageTransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dxImageTransform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterDxImageTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitDxImageTransform(this);
		}
	}

	public final DxImageTransformContext dxImageTransform() throws RecognitionException {
		DxImageTransformContext _localctx = new DxImageTransformContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dxImageTransform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(DxImageTransform);
			setState(719);
			ws();
			setState(720);
			expr();
			setState(721);
			match(T__3);
			setState(722);
			ws();
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

	public static class HexcolorContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(css3Parser.Hash, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public HexcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterHexcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitHexcolor(this);
		}
	}

	public final HexcolorContext hexcolor() throws RecognitionException {
		HexcolorContext _localctx = new HexcolorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hexcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(Hash);
			setState(725);
			ws();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(css3Parser.Number, 0); }
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(css3Parser.Minus, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(727);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(730);
			match(Number);
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

	public static class PercentageContext extends ParserRuleContext {
		public TerminalNode Percentage() { return getToken(css3Parser.Percentage, 0); }
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(css3Parser.Minus, 0); }
		public PercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitPercentage(this);
		}
	}

	public final PercentageContext percentage() throws RecognitionException {
		PercentageContext _localctx = new PercentageContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_percentage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(732);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(735);
			match(Percentage);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode Dimension() { return getToken(css3Parser.Dimension, 0); }
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(css3Parser.Minus, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(737);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(740);
			match(Dimension);
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

	public static class UnknownDimensionContext extends ParserRuleContext {
		public TerminalNode UnknownDimension() { return getToken(css3Parser.UnknownDimension, 0); }
		public TerminalNode Plus() { return getToken(css3Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(css3Parser.Minus, 0); }
		public UnknownDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownDimension(this);
		}
	}

	public final UnknownDimensionContext unknownDimension() throws RecognitionException {
		UnknownDimensionContext _localctx = new UnknownDimensionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unknownDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(742);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(745);
			match(UnknownDimension);
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

	public static class AnyContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public TerminalNode Uri() { return getToken(css3Parser.Uri, 0); }
		public TerminalNode Hash() { return getToken(css3Parser.Hash, 0); }
		public TerminalNode UnicodeRange() { return getToken(css3Parser.UnicodeRange, 0); }
		public TerminalNode Includes() { return getToken(css3Parser.Includes, 0); }
		public TerminalNode DashMatch() { return getToken(css3Parser.DashMatch, 0); }
		public TerminalNode Function() { return getToken(css3Parser.Function, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitAny(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_any);
		int _la;
		try {
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				ident();
				setState(748);
				ws();
				count_any_0++; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				number();
				setState(752);
				ws();
				count_any_1++; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(755);
				percentage();
				setState(756);
				ws();
				count_any_2++; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(759);
				dimension();
				setState(760);
				ws();
				count_any_3++; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(763);
				unknownDimension();
				setState(764);
				ws();
				count_any_4++; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(767);
				match(String);
				setState(768);
				ws();
				count_any_5++; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(771);
				match(Uri);
				setState(772);
				ws();
				count_any_6++; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(775);
				match(Hash);
				setState(776);
				ws();
				count_any_7++; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(779);
				match(UnicodeRange);
				setState(780);
				ws();
				count_any_8++; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(783);
				match(Includes);
				setState(784);
				ws();
				count_any_9++; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(787);
				match(DashMatch);
				setState(788);
				ws();
				count_any_10++; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(791);
				match(T__2);
				setState(792);
				ws();
				count_any_11++; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(795);
				match(Function);
				setState(796);
				ws();
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << Cdo) | (1L << Cdc) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function))) != 0)) {
					{
					setState(799);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__9:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Uri:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Plus:
					case Minus:
					case Number:
					case String:
					case Or:
					case From:
					case To:
					case Ident:
					case Function:
						{
						setState(797);
						any();
						}
						break;
					case T__0:
					case T__4:
					case T__14:
					case Cdo:
					case Cdc:
						{
						setState(798);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(804);
				match(T__3);
				setState(805);
				ws();
				count_any_13++; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(808);
				match(T__1);
				setState(809);
				ws();
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << Cdo) | (1L << Cdc) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function))) != 0)) {
					{
					setState(812);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__9:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Uri:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Plus:
					case Minus:
					case Number:
					case String:
					case Or:
					case From:
					case To:
					case Ident:
					case Function:
						{
						setState(810);
						any();
						}
						break;
					case T__0:
					case T__4:
					case T__14:
					case Cdo:
					case Cdc:
						{
						setState(811);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(817);
				match(T__3);
				setState(818);
				ws();
				count_any_14++; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(821);
				match(T__9);
				setState(822);
				ws();
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << Cdo) | (1L << Cdc) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function))) != 0)) {
					{
					setState(825);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__9:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Uri:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Plus:
					case Minus:
					case Number:
					case String:
					case Or:
					case From:
					case To:
					case Ident:
					case Function:
						{
						setState(823);
						any();
						}
						break;
					case T__0:
					case T__4:
					case T__14:
					case Cdo:
					case Cdc:
						{
						setState(824);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(830);
				match(T__11);
				setState(831);
				ws();
				count_any_16++; 
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

	public static class AtRuleContext extends ParserRuleContext {
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
	 
		public AtRuleContext() { }
		public void copyFrom(AtRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnknownAtRuleContext extends AtRuleContext {
		public AtKeywordContext atKeyword() {
			return getRuleContext(AtKeywordContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public UnknownAtRuleContext(AtRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownAtRule(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_atRule);
		int _la;
		try {
			_localctx = new UnknownAtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			atKeyword();
			setState(837);
			ws();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function))) != 0)) {
				{
				{
				setState(838);
				any();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(844);
				block();
				}
				break;
			case T__0:
				{
				setState(845);
				match(T__0);
				setState(846);
				ws();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class AtKeywordContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public AtKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterAtKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitAtKeyword(this);
		}
	}

	public final AtKeywordContext atKeyword() throws RecognitionException {
		AtKeywordContext _localctx = new AtKeywordContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_atKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(T__14);
			setState(850);
			ident();
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

	public static class UnusedContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AtKeywordContext atKeyword() {
			return getRuleContext(AtKeywordContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Cdo() { return getToken(css3Parser.Cdo, 0); }
		public TerminalNode Cdc() { return getToken(css3Parser.Cdc, 0); }
		public UnusedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unused; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnused(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnused(this);
		}
	}

	public final UnusedContext unused() throws RecognitionException {
		UnusedContext _localctx = new UnusedContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unused);
		try {
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				block();
				count_unused_0++; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				atKeyword();
				setState(856);
				ws();
				count_unused_1++; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				match(T__0);
				setState(860);
				ws();
				count_unused_2++; 
				}
				break;
			case Cdo:
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				match(Cdo);
				setState(864);
				ws();
				count_unused_3++; 
				}
				break;
			case Cdc:
				enterOuterAlt(_localctx, 5);
				{
				setState(867);
				match(Cdc);
				setState(868);
				ws();
				count_unused_4++; 
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

	public static class BlockContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<DeclarationListContext> declarationList() {
			return getRuleContexts(DeclarationListContext.class);
		}
		public DeclarationListContext declarationList(int i) {
			return getRuleContext(DeclarationListContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<AtKeywordContext> atKeyword() {
			return getRuleContexts(AtKeywordContext.class);
		}
		public AtKeywordContext atKeyword(int i) {
			return getRuleContext(AtKeywordContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(T__4);
			setState(874);
			ws();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Page) | (1L << Media) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << PseudoNot) | (1L << Number) | (1L << String) | (1L << FontFace) | (1L << Supports) | (1L << Or) | (1L << Keyframes) | (1L << From) | (1L << To) | (1L << Viewport) | (1L << CounterStyle) | (1L << FontFeatureValues) | (1L << Variable) | (1L << Ident) | (1L << Function))) != 0)) {
				{
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(875);
					declarationList();
					}
					break;
				case 2:
					{
					setState(876);
					nestedStatement();
					}
					break;
				case 3:
					{
					setState(877);
					any();
					}
					break;
				case 4:
					{
					setState(878);
					block();
					}
					break;
				case 5:
					{
					setState(879);
					atKeyword();
					setState(880);
					ws();
					}
					break;
				case 6:
					{
					setState(882);
					match(T__0);
					setState(883);
					ws();
					}
					break;
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(889);
			match(T__5);
			setState(890);
			ws();
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

	public static class NestedStatementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public FontFaceRuleContext fontFaceRule() {
			return getRuleContext(FontFaceRuleContext.class,0);
		}
		public KeyframesRuleContext keyframesRule() {
			return getRuleContext(KeyframesRuleContext.class,0);
		}
		public SupportsRuleContext supportsRule() {
			return getRuleContext(SupportsRuleContext.class,0);
		}
		public ViewportContext viewport() {
			return getRuleContext(ViewportContext.class,0);
		}
		public CounterStyleContext counterStyle() {
			return getRuleContext(CounterStyleContext.class,0);
		}
		public FontFeatureValuesRuleContext fontFeatureValuesRule() {
			return getRuleContext(FontFeatureValuesRuleContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public NestedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterNestedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitNestedStatement(this);
		}
	}

	public final NestedStatementContext nestedStatement() throws RecognitionException {
		NestedStatementContext _localctx = new NestedStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_nestedStatement);
		try {
			setState(922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case Includes:
			case DashMatch:
			case Hash:
			case Percentage:
			case Uri:
			case UnicodeRange:
			case MediaOnly:
			case Not:
			case And:
			case Dimension:
			case UnknownDimension:
			case Plus:
			case Minus:
			case PseudoNot:
			case Number:
			case String:
			case Or:
			case From:
			case To:
			case Ident:
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				ruleset();
				count_nestedStatement_0++; 
				}
				break;
			case Media:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				media();
				count_nestedStatement_1++; 
				}
				break;
			case Page:
				enterOuterAlt(_localctx, 3);
				{
				setState(898);
				page();
				count_nestedStatement_2++; 
				}
				break;
			case FontFace:
				enterOuterAlt(_localctx, 4);
				{
				setState(901);
				fontFaceRule();
				count_nestedStatement_3++; 
				}
				break;
			case Keyframes:
				enterOuterAlt(_localctx, 5);
				{
				setState(904);
				keyframesRule();
				count_nestedStatement_4++; 
				}
				break;
			case Supports:
				enterOuterAlt(_localctx, 6);
				{
				setState(907);
				supportsRule();
				count_nestedStatement_5++; 
				}
				break;
			case Viewport:
				enterOuterAlt(_localctx, 7);
				{
				setState(910);
				viewport();
				count_nestedStatement_6++; 
				}
				break;
			case CounterStyle:
				enterOuterAlt(_localctx, 8);
				{
				setState(913);
				counterStyle();
				count_nestedStatement_7++; 
				}
				break;
			case FontFeatureValues:
				enterOuterAlt(_localctx, 9);
				{
				setState(916);
				fontFeatureValuesRule();
				count_nestedStatement_8++; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 10);
				{
				setState(919);
				atRule();
				count_nestedStatement_9++;
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

	public static class GroupRuleBodyContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public GroupRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupRuleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGroupRuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGroupRuleBody(this);
		}
	}

	public final GroupRuleBodyContext groupRuleBody() throws RecognitionException {
		GroupRuleBodyContext _localctx = new GroupRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_groupRuleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(T__4);
			setState(925);
			ws();
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__14) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Page) | (1L << Media) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << PseudoNot) | (1L << Number) | (1L << String) | (1L << FontFace) | (1L << Supports) | (1L << Or) | (1L << Keyframes) | (1L << From) | (1L << To) | (1L << Viewport) | (1L << CounterStyle) | (1L << FontFeatureValues) | (1L << Ident) | (1L << Function))) != 0)) {
				{
				{
				setState(926);
				nestedStatement();
				}
				}
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(932);
			match(T__5);
			setState(933);
			ws();
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

	public static class SupportsRuleContext extends ParserRuleContext {
		public TerminalNode Supports() { return getToken(css3Parser.Supports, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public SupportsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsRule(this);
		}
	}

	public final SupportsRuleContext supportsRule() throws RecognitionException {
		SupportsRuleContext _localctx = new SupportsRuleContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_supportsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(Supports);
			setState(936);
			ws();
			setState(937);
			supportsCondition();
			setState(938);
			ws();
			setState(939);
			groupRuleBody();
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

	public static class SupportsConditionContext extends ParserRuleContext {
		public SupportsNegationContext supportsNegation() {
			return getRuleContext(SupportsNegationContext.class,0);
		}
		public SupportsConjunctionContext supportsConjunction() {
			return getRuleContext(SupportsConjunctionContext.class,0);
		}
		public SupportsDisjunctionContext supportsDisjunction() {
			return getRuleContext(SupportsDisjunctionContext.class,0);
		}
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsCondition(this);
		}
	}

	public final SupportsConditionContext supportsCondition() throws RecognitionException {
		SupportsConditionContext _localctx = new SupportsConditionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_supportsCondition);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				supportsNegation();
				count_supportsCondition_0++; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				supportsConjunction();
				count_supportsCondition_1++; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(947);
				supportsDisjunction();
				count_supportsCondition_2++; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(950);
				supportsConditionInParens();
				count_supportsCondition_3++; 
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

	public static class SupportsConditionInParensContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public SupportsDeclarationConditionContext supportsDeclarationCondition() {
			return getRuleContext(SupportsDeclarationConditionContext.class,0);
		}
		public GeneralEnclosedContext generalEnclosed() {
			return getRuleContext(GeneralEnclosedContext.class,0);
		}
		public SupportsConditionInParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConditionInParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsConditionInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsConditionInParens(this);
		}
	}

	public final SupportsConditionInParensContext supportsConditionInParens() throws RecognitionException {
		SupportsConditionInParensContext _localctx = new SupportsConditionInParensContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_supportsConditionInParens);
		try {
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				match(T__1);
				setState(956);
				ws();
				setState(957);
				supportsCondition();
				setState(958);
				ws();
				setState(959);
				match(T__3);
				count_supportsConditionInParens_0++; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				supportsDeclarationCondition();
				count_supportsConditionInParens_1++; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				generalEnclosed();
				count_supportsConditionInParens_2++; 
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

	public static class SupportsNegationContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(css3Parser.Not, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode Space() { return getToken(css3Parser.Space, 0); }
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsNegation(this);
		}
	}

	public final SupportsNegationContext supportsNegation() throws RecognitionException {
		SupportsNegationContext _localctx = new SupportsNegationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_supportsNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(Not);
			setState(971);
			ws();
			setState(972);
			match(Space);
			setState(973);
			ws();
			setState(974);
			supportsConditionInParens();
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

	public static class SupportsConjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public List<TerminalNode> And() { return getTokens(css3Parser.And); }
		public TerminalNode And(int i) {
			return getToken(css3Parser.And, i);
		}
		public SupportsConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsConjunction(this);
		}
	}

	public final SupportsConjunctionContext supportsConjunction() throws RecognitionException {
		SupportsConjunctionContext _localctx = new SupportsConjunctionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_supportsConjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			supportsConditionInParens();
			setState(986); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(977);
					ws();
					setState(978);
					match(Space);
					setState(979);
					ws();
					setState(980);
					match(And);
					setState(981);
					ws();
					setState(982);
					match(Space);
					setState(983);
					ws();
					setState(984);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(988); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SupportsDisjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public List<TerminalNode> Or() { return getTokens(css3Parser.Or); }
		public TerminalNode Or(int i) {
			return getToken(css3Parser.Or, i);
		}
		public SupportsDisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDisjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsDisjunction(this);
		}
	}

	public final SupportsDisjunctionContext supportsDisjunction() throws RecognitionException {
		SupportsDisjunctionContext _localctx = new SupportsDisjunctionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_supportsDisjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			supportsConditionInParens();
			setState(1000); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(991);
					ws();
					setState(992);
					match(Space);
					setState(993);
					ws();
					setState(994);
					match(Or);
					setState(995);
					ws();
					setState(996);
					match(Space);
					setState(997);
					ws();
					setState(998);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1002); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SupportsDeclarationConditionContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SupportsDeclarationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDeclarationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterSupportsDeclarationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitSupportsDeclarationCondition(this);
		}
	}

	public final SupportsDeclarationConditionContext supportsDeclarationCondition() throws RecognitionException {
		SupportsDeclarationConditionContext _localctx = new SupportsDeclarationConditionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_supportsDeclarationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(T__1);
			setState(1005);
			ws();
			setState(1006);
			declaration();
			setState(1007);
			match(T__3);
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

	public static class GeneralEnclosedContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(css3Parser.Function, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public GeneralEnclosedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalEnclosed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterGeneralEnclosed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitGeneralEnclosed(this);
		}
	}

	public final GeneralEnclosedContext generalEnclosed() throws RecognitionException {
		GeneralEnclosedContext _localctx = new GeneralEnclosedContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_generalEnclosed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==Function) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << Cdo) | (1L << Cdc) | (1L << Includes) | (1L << DashMatch) | (1L << Hash) | (1L << Percentage) | (1L << Uri) | (1L << UnicodeRange) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Dimension) | (1L << UnknownDimension) | (1L << Plus) | (1L << Minus) | (1L << Number) | (1L << String) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident) | (1L << Function))) != 0)) {
				{
				setState(1012);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__9:
				case Includes:
				case DashMatch:
				case Hash:
				case Percentage:
				case Uri:
				case UnicodeRange:
				case MediaOnly:
				case Not:
				case And:
				case Dimension:
				case UnknownDimension:
				case Plus:
				case Minus:
				case Number:
				case String:
				case Or:
				case From:
				case To:
				case Ident:
				case Function:
					{
					setState(1010);
					any();
					}
					break;
				case T__0:
				case T__4:
				case T__14:
				case Cdo:
				case Cdc:
					{
					setState(1011);
					unused();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1017);
			match(T__3);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(css3Parser.Var, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode Variable() { return getToken(css3Parser.Variable, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(Var);
			setState(1020);
			ws();
			setState(1021);
			match(Variable);
			setState(1022);
			ws();
			setState(1023);
			match(T__3);
			setState(1024);
			ws();
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

	public static class CalcContext extends ParserRuleContext {
		public TerminalNode Calc() { return getToken(css3Parser.Calc, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCalc(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(Calc);
			setState(1027);
			ws();
			setState(1028);
			calcSum();
			setState(1029);
			match(T__3);
			setState(1030);
			ws();
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

	public static class CalcSumContext extends ParserRuleContext {
		public List<CalcProductContext> calcProduct() {
			return getRuleContexts(CalcProductContext.class);
		}
		public CalcProductContext calcProduct(int i) {
			return getRuleContext(CalcProductContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(css3Parser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(css3Parser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(css3Parser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(css3Parser.Minus, i);
		}
		public CalcSumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcSum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCalcSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCalcSum(this);
		}
	}

	public final CalcSumContext calcSum() throws RecognitionException {
		CalcSumContext _localctx = new CalcSumContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_calcSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			calcProduct();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(1033);
				match(Space);
				setState(1034);
				ws();
				setState(1035);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1036);
				ws();
				setState(1037);
				match(Space);
				setState(1038);
				ws();
				setState(1039);
				calcProduct();
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class CalcProductContext extends ParserRuleContext {
		public List<CalcValueContext> calcValue() {
			return getRuleContexts(CalcValueContext.class);
		}
		public CalcValueContext calcValue(int i) {
			return getRuleContext(CalcValueContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public CalcProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCalcProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCalcProduct(this);
		}
	}

	public final CalcProductContext calcProduct() throws RecognitionException {
		CalcProductContext _localctx = new CalcProductContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_calcProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			calcValue();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__12) {
				{
				setState(1056);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(1047);
					match(T__6);
					setState(1048);
					ws();
					setState(1049);
					calcValue();
					}
					break;
				case T__12:
					{
					setState(1051);
					match(T__12);
					setState(1052);
					ws();
					setState(1053);
					number();
					setState(1054);
					ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class CalcValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public CalcValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCalcValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCalcValue(this);
		}
	}

	public final CalcValueContext calcValue() throws RecognitionException {
		CalcValueContext _localctx = new CalcValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_calcValue);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				number();
				setState(1062);
				ws();
				count_calcValue_0++;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				dimension();
				setState(1066);
				ws();
				count_calcValue_1++;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1069);
				unknownDimension();
				setState(1070);
				ws();
				count_calcValue_2++;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1073);
				percentage();
				setState(1074);
				ws();
				count_calcValue_3++;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1077);
				match(T__1);
				setState(1078);
				ws();
				setState(1079);
				calcSum();
				setState(1080);
				match(T__3);
				setState(1081);
				ws();
				count_calcValue_4++;
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

	public static class FontFaceRuleContext extends ParserRuleContext {
		public TerminalNode FontFace() { return getToken(css3Parser.FontFace, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<FontFaceDeclarationContext> fontFaceDeclaration() {
			return getRuleContexts(FontFaceDeclarationContext.class);
		}
		public FontFaceDeclarationContext fontFaceDeclaration(int i) {
			return getRuleContext(FontFaceDeclarationContext.class,i);
		}
		public FontFaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFontFaceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFontFaceRule(this);
		}
	}

	public final FontFaceRuleContext fontFaceRule() throws RecognitionException {
		FontFaceRuleContext _localctx = new FontFaceRuleContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_fontFaceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(FontFace);
			setState(1087);
			ws();
			setState(1088);
			match(T__4);
			setState(1089);
			ws();
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
				{
				setState(1090);
				fontFaceDeclaration();
				}
			}

			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1093);
				match(T__0);
				setState(1094);
				ws();
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(1095);
					fontFaceDeclaration();
					}
				}

				}
				}
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1103);
			match(T__5);
			setState(1104);
			ws();
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

	public static class FontFaceDeclarationContext extends ParserRuleContext {
		public FontFaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceDeclaration; }
	 
		public FontFaceDeclarationContext() { }
		public void copyFrom(FontFaceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KnownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KnownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKnownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKnownFontFaceDeclaration(this);
		}
	}
	public static class UnknownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterUnknownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitUnknownFontFaceDeclaration(this);
		}
	}

	public final FontFaceDeclarationContext fontFaceDeclaration() throws RecognitionException {
		FontFaceDeclarationContext _localctx = new FontFaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_fontFaceDeclaration);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new KnownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				property();
				setState(1107);
				match(T__2);
				setState(1108);
				ws();
				setState(1109);
				expr();
				count_fontFaceDeclaration_0++; 
				}
				break;
			case 2:
				_localctx = new UnknownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				property();
				setState(1113);
				match(T__2);
				setState(1114);
				ws();
				setState(1115);
				value();
				count_fontFaceDeclaration_1++; 
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

	public static class KeyframesRuleContext extends ParserRuleContext {
		public TerminalNode Keyframes() { return getToken(css3Parser.Keyframes, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode Space() { return getToken(css3Parser.Space, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public KeyframesBlocksContext keyframesBlocks() {
			return getRuleContext(KeyframesBlocksContext.class,0);
		}
		public KeyframesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKeyframesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKeyframesRule(this);
		}
	}

	public final KeyframesRuleContext keyframesRule() throws RecognitionException {
		KeyframesRuleContext _localctx = new KeyframesRuleContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_keyframesRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(Keyframes);
			setState(1121);
			ws();
			setState(1122);
			match(Space);
			setState(1123);
			ws();
			setState(1124);
			ident();
			setState(1125);
			ws();
			setState(1126);
			match(T__4);
			setState(1127);
			ws();
			setState(1128);
			keyframesBlocks();
			setState(1129);
			match(T__5);
			setState(1130);
			ws();
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

	public static class KeyframesBlocksContext extends ParserRuleContext {
		public List<KeyframeSelectorContext> keyframeSelector() {
			return getRuleContexts(KeyframeSelectorContext.class);
		}
		public KeyframeSelectorContext keyframeSelector(int i) {
			return getRuleContext(KeyframeSelectorContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<DeclarationListContext> declarationList() {
			return getRuleContexts(DeclarationListContext.class);
		}
		public DeclarationListContext declarationList(int i) {
			return getRuleContext(DeclarationListContext.class,i);
		}
		public KeyframesBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesBlocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKeyframesBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKeyframesBlocks(this);
		}
	}

	public final KeyframesBlocksContext keyframesBlocks() throws RecognitionException {
		KeyframesBlocksContext _localctx = new KeyframesBlocksContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_keyframesBlocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Percentage) | (1L << From) | (1L << To))) != 0)) {
				{
				{
				setState(1132);
				keyframeSelector();
				setState(1133);
				match(T__4);
				setState(1134);
				ws();
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
					{
					setState(1135);
					declarationList();
					}
				}

				setState(1138);
				match(T__5);
				setState(1139);
				ws();
				}
				}
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class KeyframeSelectorContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> From() { return getTokens(css3Parser.From); }
		public TerminalNode From(int i) {
			return getToken(css3Parser.From, i);
		}
		public List<TerminalNode> To() { return getTokens(css3Parser.To); }
		public TerminalNode To(int i) {
			return getToken(css3Parser.To, i);
		}
		public List<TerminalNode> Percentage() { return getTokens(css3Parser.Percentage); }
		public TerminalNode Percentage(int i) {
			return getToken(css3Parser.Percentage, i);
		}
		public List<TerminalNode> Comma() { return getTokens(css3Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(css3Parser.Comma, i);
		}
		public KeyframeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterKeyframeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitKeyframeSelector(this);
		}
	}

	public final KeyframeSelectorContext keyframeSelector() throws RecognitionException {
		KeyframeSelectorContext _localctx = new KeyframeSelectorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_keyframeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Percentage) | (1L << From) | (1L << To))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1147);
			ws();
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1148);
				match(Comma);
				setState(1149);
				ws();
				setState(1150);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Percentage) | (1L << From) | (1L << To))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1151);
				ws();
				}
				}
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ViewportContext extends ParserRuleContext {
		public TerminalNode Viewport() { return getToken(css3Parser.Viewport, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public ViewportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterViewport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitViewport(this);
		}
	}

	public final ViewportContext viewport() throws RecognitionException {
		ViewportContext _localctx = new ViewportContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_viewport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(Viewport);
			setState(1159);
			ws();
			setState(1160);
			match(T__4);
			setState(1161);
			ws();
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
				{
				setState(1162);
				declarationList();
				}
			}

			setState(1165);
			match(T__5);
			setState(1166);
			ws();
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

	public static class CounterStyleContext extends ParserRuleContext {
		public TerminalNode CounterStyle() { return getToken(css3Parser.CounterStyle, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public CounterStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_counterStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterCounterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitCounterStyle(this);
		}
	}

	public final CounterStyleContext counterStyle() throws RecognitionException {
		CounterStyleContext _localctx = new CounterStyleContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_counterStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(CounterStyle);
			setState(1169);
			ws();
			setState(1170);
			ident();
			setState(1171);
			ws();
			setState(1172);
			match(T__4);
			setState(1173);
			ws();
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__13) | (1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Variable) | (1L << Ident))) != 0)) {
				{
				setState(1174);
				declarationList();
				}
			}

			setState(1177);
			match(T__5);
			setState(1178);
			ws();
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

	public static class FontFeatureValuesRuleContext extends ParserRuleContext {
		public TerminalNode FontFeatureValues() { return getToken(css3Parser.FontFeatureValues, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public FontFamilyNameListContext fontFamilyNameList() {
			return getRuleContext(FontFamilyNameListContext.class,0);
		}
		public List<FeatureValueBlockContext> featureValueBlock() {
			return getRuleContexts(FeatureValueBlockContext.class);
		}
		public FeatureValueBlockContext featureValueBlock(int i) {
			return getRuleContext(FeatureValueBlockContext.class,i);
		}
		public FontFeatureValuesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFeatureValuesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFontFeatureValuesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFontFeatureValuesRule(this);
		}
	}

	public final FontFeatureValuesRuleContext fontFeatureValuesRule() throws RecognitionException {
		FontFeatureValuesRuleContext _localctx = new FontFeatureValuesRuleContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_fontFeatureValuesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(FontFeatureValues);
			setState(1181);
			ws();
			setState(1182);
			fontFamilyNameList();
			setState(1183);
			ws();
			setState(1184);
			match(T__4);
			setState(1185);
			ws();
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(1186);
				featureValueBlock();
				}
				}
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1192);
			match(T__5);
			setState(1193);
			ws();
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

	public static class FontFamilyNameListContext extends ParserRuleContext {
		public List<FontFamilyNameContext> fontFamilyName() {
			return getRuleContexts(FontFamilyNameContext.class);
		}
		public FontFamilyNameContext fontFamilyName(int i) {
			return getRuleContext(FontFamilyNameContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(css3Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(css3Parser.Comma, i);
		}
		public FontFamilyNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFontFamilyNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFontFamilyNameList(this);
		}
	}

	public final FontFamilyNameListContext fontFamilyNameList() throws RecognitionException {
		FontFamilyNameListContext _localctx = new FontFamilyNameListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_fontFamilyNameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			fontFamilyName();
			setState(1203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1196);
					ws();
					setState(1197);
					match(Comma);
					setState(1198);
					ws();
					setState(1199);
					fontFamilyName();
					}
					} 
				}
				setState(1205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
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

	public static class FontFamilyNameContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(css3Parser.String, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public FontFamilyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFontFamilyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFontFamilyName(this);
		}
	}

	public final FontFamilyNameContext fontFamilyName() throws RecognitionException {
		FontFamilyNameContext _localctx = new FontFamilyNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_fontFamilyName);
		try {
			int _alt;
			setState(1219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				match(String);
				count_fontFamilyName_0++; 
				}
				break;
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				ident();
				setState(1214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1209);
						ws();
						setState(1210);
						ident();
						}
						} 
					}
					setState(1216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				count_fontFamilyName_1++; 
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

	public static class FeatureValueBlockContext extends ParserRuleContext {
		public FeatureTypeContext featureType() {
			return getRuleContext(FeatureTypeContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<FeatureValueDefinitionContext> featureValueDefinition() {
			return getRuleContexts(FeatureValueDefinitionContext.class);
		}
		public FeatureValueDefinitionContext featureValueDefinition(int i) {
			return getRuleContext(FeatureValueDefinitionContext.class,i);
		}
		public FeatureValueBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFeatureValueBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFeatureValueBlock(this);
		}
	}

	public final FeatureValueBlockContext featureValueBlock() throws RecognitionException {
		FeatureValueBlockContext _localctx = new FeatureValueBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_featureValueBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			featureType();
			setState(1222);
			ws();
			setState(1223);
			match(T__4);
			setState(1224);
			ws();
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0)) {
				{
				setState(1225);
				featureValueDefinition();
				}
			}

			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Comment) | (1L << Space))) != 0)) {
				{
				{
				setState(1228);
				ws();
				setState(1229);
				match(T__0);
				setState(1230);
				ws();
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MediaOnly) | (1L << Not) | (1L << And) | (1L << Or) | (1L << From) | (1L << To) | (1L << Ident))) != 0)) {
					{
					setState(1231);
					featureValueDefinition();
					}
				}

				}
				}
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1239);
			match(T__5);
			setState(1240);
			ws();
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

	public static class FeatureTypeContext extends ParserRuleContext {
		public AtKeywordContext atKeyword() {
			return getRuleContext(AtKeywordContext.class,0);
		}
		public FeatureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFeatureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFeatureType(this);
		}
	}

	public final FeatureTypeContext featureType() throws RecognitionException {
		FeatureTypeContext _localctx = new FeatureTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_featureType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			atKeyword();
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

	public static class FeatureValueDefinitionContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public FeatureValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterFeatureValueDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitFeatureValueDefinition(this);
		}
	}

	public final FeatureValueDefinitionContext featureValueDefinition() throws RecognitionException {
		FeatureValueDefinitionContext _localctx = new FeatureValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_featureValueDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			ident();
			setState(1245);
			ws();
			setState(1246);
			match(T__2);
			setState(1247);
			ws();
			setState(1248);
			number();
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1249);
					ws();
					setState(1250);
					number();
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(css3Parser.Ident, 0); }
		public TerminalNode MediaOnly() { return getToken(css3Parser.MediaOnly, 0); }
		public TerminalNode Not() { return getToken(css3Parser.Not, 0); }
		public TerminalNode And() { return getToken(css3Parser.And, 0); }
		public TerminalNode Or() { return getToken(css3Parser.Or, 0); }
		public TerminalNode From() { return getToken(css3Parser.From, 0); }
		public TerminalNode To() { return getToken(css3Parser.To, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ident);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				match(Ident);
				count_ident_0++; 
				}
				break;
			case MediaOnly:
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				match(MediaOnly);
				count_ident_1++; 
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 3);
				{
				setState(1261);
				match(Not);
				count_ident_2++; 
				}
				break;
			case And:
				enterOuterAlt(_localctx, 4);
				{
				setState(1263);
				match(And);
				count_ident_3++; 
				}
				break;
			case Or:
				enterOuterAlt(_localctx, 5);
				{
				setState(1265);
				match(Or);
				count_ident_4++; 
				}
				break;
			case From:
				enterOuterAlt(_localctx, 6);
				{
				setState(1267);
				match(From);
				count_ident_5++; 
				}
				break;
			case To:
				enterOuterAlt(_localctx, 7);
				{
				setState(1269);
				match(To);
				count_ident_6++; 
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

	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> Comment() { return getTokens(css3Parser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(css3Parser.Comment, i);
		}
		public List<TerminalNode> Space() { return getTokens(css3Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(css3Parser.Space, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof css3Listener ) ((css3Listener)listener).exitWs(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_ws);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1273);
					_la = _input.LA(1);
					if ( !(_la==Comment || _la==Space) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0502\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\7\3\u00a9\n\3\f\3\16\3\u00ac\13\3\7\3\u00ae\n\3\f\3\16\3\u00b1"+
		"\13\3\3\3\3\3\7\3\u00b5\n\3\f\3\16\3\u00b8\13\3\7\3\u00ba\n\3\f\3\16\3"+
		"\u00bd\13\3\3\3\3\3\7\3\u00c1\n\3\f\3\16\3\u00c4\13\3\7\3\u00c6\n\3\f"+
		"\3\16\3\u00c9\13\3\3\3\3\3\7\3\u00cd\n\3\f\3\16\3\u00d0\13\3\7\3\u00d2"+
		"\n\3\f\3\16\3\u00d5\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\u00e5\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0105\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u010c\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0119\n\6\3\6\3\6\3\6\3\6\5\6\u011f\n\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u012e\n\t\f\t"+
		"\16\t\u0131\13\t\5\t\u0133\n\t\3\t\3\t\3\n\5\n\u0138\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u0141\n\n\f\n\16\n\u0144\13\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u014d\n\n\f\n\16\n\u0150\13\n\3\n\3\n\5\n\u0154\n\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u015f\n\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\5\16\u016a\n\16\3\16\3\16\3\16\5\16\u016f\n\16\3\16\3"+
		"\16\3\16\5\16\u0174\n\16\7\16\u0176\n\16\f\16\16\16\u0179\13\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u0187\n\20"+
		"\f\20\16\20\u018a\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0192\n\21"+
		"\f\21\16\21\u0195\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01a7\n\22\3\23\3\23\5\23\u01ab"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u01b2\n\23\f\23\16\23\u01b5\13\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u01be\n\23\r\23\16\23\u01bf\3"+
		"\23\5\23\u01c3\n\23\3\24\5\24\u01c6\n\24\3\24\3\24\3\25\3\25\5\25\u01cc"+
		"\n\25\3\25\3\25\3\26\3\26\3\27\5\27\u01d3\n\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\5\31\u01dd\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01e5"+
		"\n\31\3\31\3\31\5\31\u01e9\n\31\3\31\3\31\3\32\3\32\5\32\u01ef\n\32\3"+
		"\32\3\32\5\32\u01f3\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0201\n\34\3\34\6\34\u0204\n\34\r\34\16\34\u0205"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u021f\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0231\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0243"+
		"\n \3!\3!\3!\3!\5!\u0249\n!\3!\3!\3!\3!\3!\7!\u0250\n!\f!\16!\u0253\13"+
		"!\3!\3!\3!\5!\u0258\n!\3!\3!\3!\3!\5!\u025e\n!\3\"\3\"\7\"\u0262\n\"\f"+
		"\"\16\"\u0265\13\"\3\"\3\"\3\"\3\"\3\"\5\"\u026c\n\"\7\"\u026e\n\"\f\""+
		"\16\"\u0271\13\"\3#\3#\3#\3#\3#\5#\u0278\n#\3#\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u0282\n#\3$\3$\3$\3%\3%\3%\3%\3%\6%\u028c\n%\r%\16%\u028d\3&\3&\5&\u0292"+
		"\n&\3&\7&\u0295\n&\f&\16&\u0298\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u02c9\n\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3+\5+\u02db\n+\3+\3+\3,\5,\u02e0\n,\3,\3,\3-\5-\u02e5\n-\3-\3-\3"+
		".\5.\u02ea\n.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0322\n/\f/\16/\u0325\13/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\7/\u032f\n/\f/\16/\u0332\13/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\7/\u033c\n/\f/\16/\u033f\13/\3/\3/\3/\3/\5/\u0345\n/\3\60\3\60\3"+
		"\60\7\60\u034a\n\60\f\60\16\60\u034d\13\60\3\60\3\60\3\60\5\60\u0352\n"+
		"\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u036a\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0377\n\63\f\63\16"+
		"\63\u037a\13\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u039d\n\64\3\65\3\65\3\65"+
		"\7\65\u03a2\n\65\f\65\16\65\u03a5\13\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u03bc\n\67\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u03cb"+
		"\n8\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\6:\u03dd\n:\r:\16"+
		":\u03de\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\6;\u03eb\n;\r;\16;\u03ec\3<\3<\3"+
		"<\3<\3<\3=\3=\3=\7=\u03f7\n=\f=\16=\u03fa\13=\3=\3=\3>\3>\3>\3>\3>\3>"+
		"\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u0414\n@\f@\16@\u0417"+
		"\13@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u0423\nA\fA\16A\u0426\13A\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u043f"+
		"\nB\3C\3C\3C\3C\3C\5C\u0446\nC\3C\3C\3C\5C\u044b\nC\7C\u044d\nC\fC\16"+
		"C\u0450\13C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0461\nD\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\5F\u0473\nF\3F\3F\3F\7"+
		"F\u0478\nF\fF\16F\u047b\13F\3G\3G\3G\3G\3G\3G\3G\7G\u0484\nG\fG\16G\u0487"+
		"\13G\3H\3H\3H\3H\3H\5H\u048e\nH\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\5I\u049a"+
		"\nI\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\7J\u04a6\nJ\fJ\16J\u04a9\13J\3J\3J\3"+
		"J\3K\3K\3K\3K\3K\3K\7K\u04b4\nK\fK\16K\u04b7\13K\3L\3L\3L\3L\3L\3L\7L"+
		"\u04bf\nL\fL\16L\u04c2\13L\3L\3L\5L\u04c6\nL\3M\3M\3M\3M\3M\5M\u04cd\n"+
		"M\3M\3M\3M\3M\5M\u04d3\nM\7M\u04d5\nM\fM\16M\u04d8\13M\3M\3M\3M\3N\3N"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\7O\u04e7\nO\fO\16O\u04ea\13O\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u04fa\nP\3Q\7Q\u04fd\nQ\fQ\16Q\u0500\13Q"+
		"\3Q\2\2R\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\2\n"+
		"\3\2\22\25\4\2  ..\3\2\"#\5\2\r\r\26\27/\61\3\2\'(\4\2\4\4@@\4\2\37\37"+
		"\66\67\3\2\22\23\2\u0567\2\u00a2\3\2\2\2\4\u00a5\3\2\2\2\6\u00e4\3\2\2"+
		"\2\b\u0104\3\2\2\2\n\u011e\3\2\2\2\f\u0120\3\2\2\2\16\u0122\3\2\2\2\20"+
		"\u0132\3\2\2\2\22\u0153\3\2\2\2\24\u0155\3\2\2\2\26\u0157\3\2\2\2\30\u0163"+
		"\3\2\2\2\32\u0166\3\2\2\2\34\u017d\3\2\2\2\36\u0181\3\2\2\2 \u018b\3\2"+
		"\2\2\"\u01a6\3\2\2\2$\u01c2\3\2\2\2&\u01c5\3\2\2\2(\u01cb\3\2\2\2*\u01cf"+
		"\3\2\2\2,\u01d2\3\2\2\2.\u01d6\3\2\2\2\60\u01d9\3\2\2\2\62\u01ec\3\2\2"+
		"\2\64\u01f4\3\2\2\2\66\u0203\3\2\2\28\u0207\3\2\2\2:\u021e\3\2\2\2<\u0230"+
		"\3\2\2\2>\u0242\3\2\2\2@\u025d\3\2\2\2B\u0263\3\2\2\2D\u0281\3\2\2\2F"+
		"\u0283\3\2\2\2H\u028b\3\2\2\2J\u028f\3\2\2\2L\u02c8\3\2\2\2N\u02ca\3\2"+
		"\2\2P\u02d0\3\2\2\2R\u02d6\3\2\2\2T\u02da\3\2\2\2V\u02df\3\2\2\2X\u02e4"+
		"\3\2\2\2Z\u02e9\3\2\2\2\\\u0344\3\2\2\2^\u0346\3\2\2\2`\u0353\3\2\2\2"+
		"b\u0369\3\2\2\2d\u036b\3\2\2\2f\u039c\3\2\2\2h\u039e\3\2\2\2j\u03a9\3"+
		"\2\2\2l\u03bb\3\2\2\2n\u03ca\3\2\2\2p\u03cc\3\2\2\2r\u03d2\3\2\2\2t\u03e0"+
		"\3\2\2\2v\u03ee\3\2\2\2x\u03f3\3\2\2\2z\u03fd\3\2\2\2|\u0404\3\2\2\2~"+
		"\u040a\3\2\2\2\u0080\u0418\3\2\2\2\u0082\u043e\3\2\2\2\u0084\u0440\3\2"+
		"\2\2\u0086\u0460\3\2\2\2\u0088\u0462\3\2\2\2\u008a\u0479\3\2\2\2\u008c"+
		"\u047c\3\2\2\2\u008e\u0488\3\2\2\2\u0090\u0492\3\2\2\2\u0092\u049e\3\2"+
		"\2\2\u0094\u04ad\3\2\2\2\u0096\u04c5\3\2\2\2\u0098\u04c7\3\2\2\2\u009a"+
		"\u04dc\3\2\2\2\u009c\u04de\3\2\2\2\u009e\u04f9\3\2\2\2\u00a0\u04fe\3\2"+
		"\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4\b\2\1\2\u00a4\3\3\2\2\2\u00a5\u00af"+
		"\5\u00a0Q\2\u00a6\u00aa\5\6\4\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2\2"+
		"\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00bb\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b6\5\b\5\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b2\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c7\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c2\5\n\6\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00be\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d3\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00ce\5f\64\2\u00cb\u00cd\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\5\3\2\2\2\u00d5\u00d3\3\2\2\2"+
		"\u00d6\u00d7\7\35\2\2\u00d7\u00d8\5\u00a0Q\2\u00d8\u00d9\7.\2\2\u00d9"+
		"\u00da\5\u00a0Q\2\u00da\u00db\7\3\2\2\u00db\u00dc\5\u00a0Q\2\u00dc\u00dd"+
		"\b\4\1\2\u00dd\u00e5\3\2\2\2\u00de\u00df\7\35\2\2\u00df\u00e0\5\u00a0"+
		"Q\2\u00e0\u00e1\7.\2\2\u00e1\u00e2\5\u00a0Q\2\u00e2\u00e3\b\4\1\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00d6\3\2\2\2\u00e4\u00de\3\2\2\2\u00e5\7\3\2\2\2"+
		"\u00e6\u00e7\7\31\2\2\u00e7\u00e8\5\u00a0Q\2\u00e8\u00e9\t\3\2\2\u00e9"+
		"\u00ea\5\u00a0Q\2\u00ea\u00eb\5\20\t\2\u00eb\u00ec\7\3\2\2\u00ec\u00ed"+
		"\5\u00a0Q\2\u00ed\u00ee\b\5\1\2\u00ee\u0105\3\2\2\2\u00ef\u00f0\7\31\2"+
		"\2\u00f0\u00f1\5\u00a0Q\2\u00f1\u00f2\t\3\2\2\u00f2\u00f3\5\u00a0Q\2\u00f3"+
		"\u00f4\7\3\2\2\u00f4\u00f5\5\u00a0Q\2\u00f5\u00f6\b\5\1\2\u00f6\u0105"+
		"\3\2\2\2\u00f7\u00f8\7\31\2\2\u00f8\u00f9\5\u00a0Q\2\u00f9\u00fa\t\3\2"+
		"\2\u00fa\u00fb\5\u00a0Q\2\u00fb\u00fc\5\20\t\2\u00fc\u00fd\b\5\1\2\u00fd"+
		"\u0105\3\2\2\2\u00fe\u00ff\7\31\2\2\u00ff\u0100\5\u00a0Q\2\u0100\u0101"+
		"\t\3\2\2\u0101\u0102\5\u00a0Q\2\u0102\u0103\b\5\1\2\u0103\u0105\3\2\2"+
		"\2\u0104\u00e6\3\2\2\2\u0104\u00ef\3\2\2\2\u0104\u00f7\3\2\2\2\u0104\u00fe"+
		"\3\2\2\2\u0105\t\3\2\2\2\u0106\u0107\7\34\2\2\u0107\u010b\5\u00a0Q\2\u0108"+
		"\u0109\5\f\7\2\u0109\u010a\5\u00a0Q\2\u010a\u010c\3\2\2\2\u010b\u0108"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\t\3\2\2\u010e"+
		"\u010f\5\u00a0Q\2\u010f\u0110\7\3\2\2\u0110\u0111\5\u00a0Q\2\u0111\u0112"+
		"\b\6\1\2\u0112\u011f\3\2\2\2\u0113\u0114\7\34\2\2\u0114\u0118\5\u00a0"+
		"Q\2\u0115\u0116\5\f\7\2\u0116\u0117\5\u00a0Q\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\t\3"+
		"\2\2\u011b\u011c\5\u00a0Q\2\u011c\u011d\b\6\1\2\u011d\u011f\3\2\2\2\u011e"+
		"\u0106\3\2\2\2\u011e\u0113\3\2\2\2\u011f\13\3\2\2\2\u0120\u0121\5\u009e"+
		"P\2\u0121\r\3\2\2\2\u0122\u0123\7\33\2\2\u0123\u0124\5\u00a0Q\2\u0124"+
		"\u0125\5\20\t\2\u0125\u0126\5h\65\2\u0126\u0127\5\u00a0Q\2\u0127\17\3"+
		"\2\2\2\u0128\u012f\5\22\n\2\u0129\u012a\7*\2\2\u012a\u012b\5\u00a0Q\2"+
		"\u012b\u012c\5\22\n\2\u012c\u012e\3\2\2\2\u012d\u0129\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0135\5\u00a0Q\2\u0135\21\3\2\2\2\u0136\u0138\t\4\2\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\5\u00a0"+
		"Q\2\u013a\u013b\5\24\13\2\u013b\u0142\5\u00a0Q\2\u013c\u013d\7$\2\2\u013d"+
		"\u013e\5\u00a0Q\2\u013e\u013f\5\26\f\2\u013f\u0141\3\2\2\2\u0140\u013c"+
		"\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\b\n\1\2\u0146\u0154\3\2"+
		"\2\2\u0147\u014e\5\26\f\2\u0148\u0149\7$\2\2\u0149\u014a\5\u00a0Q\2\u014a"+
		"\u014b\5\26\f\2\u014b\u014d\3\2\2\2\u014c\u0148\3\2\2\2\u014d\u0150\3"+
		"\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0152\b\n\1\2\u0152\u0154\3\2\2\2\u0153\u0137\3\2"+
		"\2\2\u0153\u0147\3\2\2\2\u0154\23\3\2\2\2\u0155\u0156\5\u009eP\2\u0156"+
		"\25\3\2\2\2\u0157\u0158\7\4\2\2\u0158\u0159\5\u00a0Q\2\u0159\u015e\5\30"+
		"\r\2\u015a\u015b\7\5\2\2\u015b\u015c\5\u00a0Q\2\u015c\u015d\5J&\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\7\6\2\2\u0161\u0162\5\u00a0Q\2\u0162\27\3\2\2\2\u0163"+
		"\u0164\5\u009eP\2\u0164\u0165\5\u00a0Q\2\u0165\31\3\2\2\2\u0166\u0167"+
		"\7\32\2\2\u0167\u0169\5\u00a0Q\2\u0168\u016a\5\34\17\2\u0169\u0168\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7\7\2\2\u016c"+
		"\u016e\5\u00a0Q\2\u016d\u016f\5D#\2\u016e\u016d\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0177\3\2\2\2\u0170\u0171\7\3\2\2\u0171\u0173\5\u00a0Q\2"+
		"\u0172\u0174\5D#\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176"+
		"\3\2\2\2\u0175\u0170\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\b"+
		"\2\2\u017b\u017c\5\u00a0Q\2\u017c\33\3\2\2\2\u017d\u017e\7\5\2\2\u017e"+
		"\u017f\5\u009eP\2\u017f\u0180\5\u00a0Q\2\u0180\35\3\2\2\2\u0181\u0188"+
		"\5 \21\2\u0182\u0183\7*\2\2\u0183\u0184\5\u00a0Q\2\u0184\u0185\5 \21\2"+
		"\u0185\u0187\3\2\2\2\u0186\u0182\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\37\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"\u018c\5$\23\2\u018c\u0193\5\u00a0Q\2\u018d\u018e\5\"\22\2\u018e\u018f"+
		"\5$\23\2\u018f\u0190\5\u00a0Q\2\u0190\u0192\3\2\2\2\u0191\u018d\3\2\2"+
		"\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194!"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\'\2\2\u0197\u0198\5\u00a0Q"+
		"\2\u0198\u0199\b\22\1\2\u0199\u01a7\3\2\2\2\u019a\u019b\7)\2\2\u019b\u019c"+
		"\5\u00a0Q\2\u019c\u019d\b\22\1\2\u019d\u01a7\3\2\2\2\u019e\u019f\7+\2"+
		"\2\u019f\u01a0\5\u00a0Q\2\u01a0\u01a1\b\22\1\2\u01a1\u01a7\3\2\2\2\u01a2"+
		"\u01a3\7\23\2\2\u01a3\u01a4\5\u00a0Q\2\u01a4\u01a5\b\22\1\2\u01a5\u01a7"+
		"\3\2\2\2\u01a6\u0196\3\2\2\2\u01a6\u019a\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6"+
		"\u01a2\3\2\2\2\u01a7#\3\2\2\2\u01a8\u01ab\5&\24\2\u01a9\u01ab\5,\27\2"+
		"\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01b3\3\2\2\2\u01ac\u01b2"+
		"\7\30\2\2\u01ad\u01b2\5.\30\2\u01ae\u01b2\5\60\31\2\u01af\u01b2\5\62\32"+
		"\2\u01b0\u01b2\58\35\2\u01b1\u01ac\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01ae"+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b6\u01b7\b\23\1\2\u01b7\u01c3\3\2\2\2\u01b8\u01be\7\30\2\2\u01b9"+
		"\u01be\5.\30\2\u01ba\u01be\5\60\31\2\u01bb\u01be\5\62\32\2\u01bc\u01be"+
		"\58\35\2\u01bd\u01b8\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd\u01ba\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\b\23\1\2\u01c2"+
		"\u01aa\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c3%\3\2\2\2\u01c4\u01c6\5(\25\2"+
		"\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8"+
		"\5*\26\2\u01c8\'\3\2\2\2\u01c9\u01cc\5\u009eP\2\u01ca\u01cc\7\t\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01ce\7\n\2\2\u01ce)\3\2\2\2\u01cf\u01d0\5\u009eP\2\u01d0+"+
		"\3\2\2\2\u01d1\u01d3\5(\25\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\7\t\2\2\u01d5-\3\2\2\2\u01d6\u01d7\7\13\2\2"+
		"\u01d7\u01d8\5\u009eP\2\u01d8/\3\2\2\2\u01d9\u01da\7\f\2\2\u01da\u01dc"+
		"\5\u00a0Q\2\u01db\u01dd\5(\25\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01de\3\2\2\2\u01de\u01df\5\u009eP\2\u01df\u01e8\5\u00a0Q\2\u01e0"+
		"\u01e1\t\5\2\2\u01e1\u01e4\5\u00a0Q\2\u01e2\u01e5\5\u009eP\2\u01e3\u01e5"+
		"\7.\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e7\5\u00a0Q\2\u01e7\u01e9\3\2\2\2\u01e8\u01e0\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\7\16\2\2\u01eb\61\3\2\2\2\u01ec"+
		"\u01ee\7\5\2\2\u01ed\u01ef\7\5\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01f3\5\u009eP\2\u01f1\u01f3\5\64\33\2"+
		"\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\63\3\2\2\2\u01f4\u01f5"+
		"\7@\2\2\u01f5\u01f6\5\u00a0Q\2\u01f6\u01f7\5\66\34\2\u01f7\u01f8\7\6\2"+
		"\2\u01f8\65\3\2\2\2\u01f9\u0201\7\'\2\2\u01fa\u0201\7(\2\2\u01fb\u0201"+
		"\7%\2\2\u01fc\u0201\7&\2\2\u01fd\u0201\7-\2\2\u01fe\u0201\7.\2\2\u01ff"+
		"\u0201\5\u009eP\2\u0200\u01f9\3\2\2\2\u0200\u01fa\3\2\2\2\u0200\u01fb"+
		"\3\2\2\2\u0200\u01fc\3\2\2\2\u0200\u01fd\3\2\2\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\5\u00a0Q\2\u0203\u0200"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\67\3\2\2\2\u0207\u0208\7,\2\2\u0208\u0209\5\u00a0Q\2\u0209\u020a\5:\36"+
		"\2\u020a\u020b\5\u00a0Q\2\u020b\u020c\7\6\2\2\u020c9\3\2\2\2\u020d\u020e"+
		"\5&\24\2\u020e\u020f\b\36\1\2\u020f\u021f\3\2\2\2\u0210\u0211\5,\27\2"+
		"\u0211\u0212\b\36\1\2\u0212\u021f\3\2\2\2\u0213\u0214\7\30\2\2\u0214\u021f"+
		"\b\36\1\2\u0215\u0216\5.\30\2\u0216\u0217\b\36\1\2\u0217\u021f\3\2\2\2"+
		"\u0218\u0219\5\60\31\2\u0219\u021a\b\36\1\2\u021a\u021f\3\2\2\2\u021b"+
		"\u021c\5\62\32\2\u021c\u021d\b\36\1\2\u021d\u021f\3\2\2\2\u021e\u020d"+
		"\3\2\2\2\u021e\u0210\3\2\2\2\u021e\u0213\3\2\2\2\u021e\u0215\3\2\2\2\u021e"+
		"\u0218\3\2\2\2\u021e\u021b\3\2\2\2\u021f;\3\2\2\2\u0220\u0221\7\17\2\2"+
		"\u0221\u0222\5\u00a0Q\2\u0222\u0223\b\37\1\2\u0223\u0231\3\2\2\2\u0224"+
		"\u0225\7*\2\2\u0225\u0226\5\u00a0Q\2\u0226\u0227\b\37\1\2\u0227\u0231"+
		"\3\2\2\2\u0228\u0229\7\23\2\2\u0229\u022a\5\u00a0Q\2\u022a\u022b\b\37"+
		"\1\2\u022b\u0231\3\2\2\2\u022c\u022d\7\r\2\2\u022d\u022e\5\u00a0Q\2\u022e"+
		"\u022f\b\37\1\2\u022f\u0231\3\2\2\2\u0230\u0220\3\2\2\2\u0230\u0224\3"+
		"\2\2\2\u0230\u0228\3\2\2\2\u0230\u022c\3\2\2\2\u0231=\3\2\2\2\u0232\u0233"+
		"\5\u009eP\2\u0233\u0234\5\u00a0Q\2\u0234\u0235\b \1\2\u0235\u0243\3\2"+
		"\2\2\u0236\u0237\7=\2\2\u0237\u0238\5\u00a0Q\2\u0238\u0239\b \1\2\u0239"+
		"\u0243\3\2\2\2\u023a\u023b\7\t\2\2\u023b\u023c\5\u009eP\2\u023c\u023d"+
		"\b \1\2\u023d\u0243\3\2\2\2\u023e\u023f\7\20\2\2\u023f\u0240\5\u009eP"+
		"\2\u0240\u0241\b \1\2\u0241\u0243\3\2\2\2\u0242\u0232\3\2\2\2\u0242\u0236"+
		"\3\2\2\2\u0242\u023a\3\2\2\2\u0242\u023e\3\2\2\2\u0243?\3\2\2\2\u0244"+
		"\u0245\5\36\20\2\u0245\u0246\7\7\2\2\u0246\u0248\5\u00a0Q\2\u0247\u0249"+
		"\5B\"\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\7\b\2\2\u024b\u024c\5\u00a0Q\2\u024c\u024d\b!\1\2\u024d\u025e\3"+
		"\2\2\2\u024e\u0250\5\\/\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0254\u0255\7\7\2\2\u0255\u0257\5\u00a0Q\2\u0256\u0258\5B\"\2\u0257"+
		"\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\7\b"+
		"\2\2\u025a\u025b\5\u00a0Q\2\u025b\u025c\b!\1\2\u025c\u025e\3\2\2\2\u025d"+
		"\u0244\3\2\2\2\u025d\u0251\3\2\2\2\u025eA\3\2\2\2\u025f\u0260\7\3\2\2"+
		"\u0260\u0262\5\u00a0Q\2\u0261\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0266\u0267\5D#\2\u0267\u026f\5\u00a0Q\2\u0268\u0269\7\3\2\2\u0269"+
		"\u026b\5\u00a0Q\2\u026a\u026c\5D#\2\u026b\u026a\3\2\2\2\u026b\u026c\3"+
		"\2\2\2\u026c\u026e\3\2\2\2\u026d\u0268\3\2\2\2\u026e\u0271\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270C\3\2\2\2\u0271\u026f\3\2\2\2"+
		"\u0272\u0273\5> \2\u0273\u0274\7\5\2\2\u0274\u0275\5\u00a0Q\2\u0275\u0277"+
		"\5J&\2\u0276\u0278\5F$\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027a\b#\1\2\u027a\u0282\3\2\2\2\u027b\u027c\5> "+
		"\2\u027c\u027d\7\5\2\2\u027d\u027e\5\u00a0Q\2\u027e\u027f\5H%\2\u027f"+
		"\u0280\b#\1\2\u0280\u0282\3\2\2\2\u0281\u0272\3\2\2\2\u0281\u027b\3\2"+
		"\2\2\u0282E\3\2\2\2\u0283\u0284\7\36\2\2\u0284\u0285\5\u00a0Q\2\u0285"+
		"G\3\2\2\2\u0286\u028c\5\\/\2\u0287\u028c\5d\63\2\u0288\u0289\5`\61\2\u0289"+
		"\u028a\5\u00a0Q\2\u028a\u028c\3\2\2\2\u028b\u0286\3\2\2\2\u028b\u0287"+
		"\3\2\2\2\u028b\u0288\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028eI\3\2\2\2\u028f\u0296\5L\'\2\u0290\u0292\5<\37\2\u0291"+
		"\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\5L"+
		"\'\2\u0294\u0291\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297K\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\5T+\2\u029a"+
		"\u029b\5\u00a0Q\2\u029b\u029c\b\'\1\2\u029c\u02c9\3\2\2\2\u029d\u029e"+
		"\5V,\2\u029e\u029f\5\u00a0Q\2\u029f\u02a0\b\'\1\2\u02a0\u02c9\3\2\2\2"+
		"\u02a1\u02a2\5X-\2\u02a2\u02a3\5\u00a0Q\2\u02a3\u02a4\b\'\1\2\u02a4\u02c9"+
		"\3\2\2\2\u02a5\u02a6\7.\2\2\u02a6\u02a7\5\u00a0Q\2\u02a7\u02a8\b\'\1\2"+
		"\u02a8\u02c9\3\2\2\2\u02a9\u02aa\7!\2\2\u02aa\u02ab\5\u00a0Q\2\u02ab\u02ac"+
		"\b\'\1\2\u02ac\u02c9\3\2\2\2\u02ad\u02ae\5\u009eP\2\u02ae\u02af\5\u00a0"+
		"Q\2\u02af\u02b0\b\'\1\2\u02b0\u02c9\3\2\2\2\u02b1\u02b2\5z>\2\u02b2\u02b3"+
		"\b\'\1\2\u02b3\u02c9\3\2\2\2\u02b4\u02b5\7 \2\2\u02b5\u02b6\5\u00a0Q\2"+
		"\u02b6\u02b7\b\'\1\2\u02b7\u02c9\3\2\2\2\u02b8\u02b9\5R*\2\u02b9\u02ba"+
		"\b\'\1\2\u02ba\u02c9\3\2\2\2\u02bb\u02bc\5|?\2\u02bc\u02bd\b\'\1\2\u02bd"+
		"\u02c9\3\2\2\2\u02be\u02bf\5N(\2\u02bf\u02c0\b\'\1\2\u02c0\u02c9\3\2\2"+
		"\2\u02c1\u02c2\5Z.\2\u02c2\u02c3\5\u00a0Q\2\u02c3\u02c4\b\'\1\2\u02c4"+
		"\u02c9\3\2\2\2\u02c5\u02c6\5P)\2\u02c6\u02c7\b\'\1\2\u02c7\u02c9\3\2\2"+
		"\2\u02c8\u0299\3\2\2\2\u02c8\u029d\3\2\2\2\u02c8\u02a1\3\2\2\2\u02c8\u02a5"+
		"\3\2\2\2\u02c8\u02a9\3\2\2\2\u02c8\u02ad\3\2\2\2\u02c8\u02b1\3\2\2\2\u02c8"+
		"\u02b4\3\2\2\2\u02c8\u02b8\3\2\2\2\u02c8\u02bb\3\2\2\2\u02c8\u02be\3\2"+
		"\2\2\u02c8\u02c1\3\2\2\2\u02c8\u02c5\3\2\2\2\u02c9M\3\2\2\2\u02ca\u02cb"+
		"\7@\2\2\u02cb\u02cc\5\u00a0Q\2\u02cc\u02cd\5J&\2\u02cd\u02ce\7\6\2\2\u02ce"+
		"\u02cf\5\u00a0Q\2\u02cfO\3\2\2\2\u02d0\u02d1\7<\2\2\u02d1\u02d2\5\u00a0"+
		"Q\2\u02d2\u02d3\5J&\2\u02d3\u02d4\7\6\2\2\u02d4\u02d5\5\u00a0Q\2\u02d5"+
		"Q\3\2\2\2\u02d6\u02d7\7\30\2\2\u02d7\u02d8\5\u00a0Q\2\u02d8S\3\2\2\2\u02d9"+
		"\u02db\t\6\2\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2"+
		"\2\2\u02dc\u02dd\7-\2\2\u02ddU\3\2\2\2\u02de\u02e0\t\6\2\2\u02df\u02de"+
		"\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7\37\2\2"+
		"\u02e2W\3\2\2\2\u02e3\u02e5\t\6\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3"+
		"\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\7%\2\2\u02e7Y\3\2\2\2\u02e8\u02ea"+
		"\t\6\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ec\7&\2\2\u02ec[\3\2\2\2\u02ed\u02ee\5\u009eP\2\u02ee\u02ef\5\u00a0"+
		"Q\2\u02ef\u02f0\b/\1\2\u02f0\u0345\3\2\2\2\u02f1\u02f2\5T+\2\u02f2\u02f3"+
		"\5\u00a0Q\2\u02f3\u02f4\b/\1\2\u02f4\u0345\3\2\2\2\u02f5\u02f6\5V,\2\u02f6"+
		"\u02f7\5\u00a0Q\2\u02f7\u02f8\b/\1\2\u02f8\u0345\3\2\2\2\u02f9\u02fa\5"+
		"X-\2\u02fa\u02fb\5\u00a0Q\2\u02fb\u02fc\b/\1\2\u02fc\u0345\3\2\2\2\u02fd"+
		"\u02fe\5Z.\2\u02fe\u02ff\5\u00a0Q\2\u02ff\u0300\b/\1\2\u0300\u0345\3\2"+
		"\2\2\u0301\u0302\7.\2\2\u0302\u0303\5\u00a0Q\2\u0303\u0304\b/\1\2\u0304"+
		"\u0345\3\2\2\2\u0305\u0306\7 \2\2\u0306\u0307\5\u00a0Q\2\u0307\u0308\b"+
		"/\1\2\u0308\u0345\3\2\2\2\u0309\u030a\7\30\2\2\u030a\u030b\5\u00a0Q\2"+
		"\u030b\u030c\b/\1\2\u030c\u0345\3\2\2\2\u030d\u030e\7!\2\2\u030e\u030f"+
		"\5\u00a0Q\2\u030f\u0310\b/\1\2\u0310\u0345\3\2\2\2\u0311\u0312\7\26\2"+
		"\2\u0312\u0313\5\u00a0Q\2\u0313\u0314\b/\1\2\u0314\u0345\3\2\2\2\u0315"+
		"\u0316\7\27\2\2\u0316\u0317\5\u00a0Q\2\u0317\u0318\b/\1\2\u0318\u0345"+
		"\3\2\2\2\u0319\u031a\7\5\2\2\u031a\u031b\5\u00a0Q\2\u031b\u031c\b/\1\2"+
		"\u031c\u0345\3\2\2\2\u031d\u031e\7@\2\2\u031e\u0323\5\u00a0Q\2\u031f\u0322"+
		"\5\\/\2\u0320\u0322\5b\62\2\u0321\u031f\3\2\2\2\u0321\u0320\3\2\2\2\u0322"+
		"\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2"+
		"\2\2\u0325\u0323\3\2\2\2\u0326\u0327\7\6\2\2\u0327\u0328\5\u00a0Q\2\u0328"+
		"\u0329\b/\1\2\u0329\u0345\3\2\2\2\u032a\u032b\7\4\2\2\u032b\u0330\5\u00a0"+
		"Q\2\u032c\u032f\5\\/\2\u032d\u032f\5b\62\2\u032e\u032c\3\2\2\2\u032e\u032d"+
		"\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\7\6\2\2\u0334\u0335\5\u00a0"+
		"Q\2\u0335\u0336\b/\1\2\u0336\u0345\3\2\2\2\u0337\u0338\7\f\2\2\u0338\u033d"+
		"\5\u00a0Q\2\u0339\u033c\5\\/\2\u033a\u033c\5b\62\2\u033b\u0339\3\2\2\2"+
		"\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e"+
		"\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0341\7\16\2\2"+
		"\u0341\u0342\5\u00a0Q\2\u0342\u0343\b/\1\2\u0343\u0345\3\2\2\2\u0344\u02ed"+
		"\3\2\2\2\u0344\u02f1\3\2\2\2\u0344\u02f5\3\2\2\2\u0344\u02f9\3\2\2\2\u0344"+
		"\u02fd\3\2\2\2\u0344\u0301\3\2\2\2\u0344\u0305\3\2\2\2\u0344\u0309\3\2"+
		"\2\2\u0344\u030d\3\2\2\2\u0344\u0311\3\2\2\2\u0344\u0315\3\2\2\2\u0344"+
		"\u0319\3\2\2\2\u0344\u031d\3\2\2\2\u0344\u032a\3\2\2\2\u0344\u0337\3\2"+
		"\2\2\u0345]\3\2\2\2\u0346\u0347\5`\61\2\u0347\u034b\5\u00a0Q\2\u0348\u034a"+
		"\5\\/\2\u0349\u0348\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u0351\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0352\5d"+
		"\63\2\u034f\u0350\7\3\2\2\u0350\u0352\5\u00a0Q\2\u0351\u034e\3\2\2\2\u0351"+
		"\u034f\3\2\2\2\u0352_\3\2\2\2\u0353\u0354\7\21\2\2\u0354\u0355\5\u009e"+
		"P\2\u0355a\3\2\2\2\u0356\u0357\5d\63\2\u0357\u0358\b\62\1\2\u0358\u036a"+
		"\3\2\2\2\u0359\u035a\5`\61\2\u035a\u035b\5\u00a0Q\2\u035b\u035c\b\62\1"+
		"\2\u035c\u036a\3\2\2\2\u035d\u035e\7\3\2\2\u035e\u035f\5\u00a0Q\2\u035f"+
		"\u0360\b\62\1\2\u0360\u036a\3\2\2\2\u0361\u0362\7\24\2\2\u0362\u0363\5"+
		"\u00a0Q\2\u0363\u0364\b\62\1\2\u0364\u036a\3\2\2\2\u0365\u0366\7\25\2"+
		"\2\u0366\u0367\5\u00a0Q\2\u0367\u0368\b\62\1\2\u0368\u036a\3\2\2\2\u0369"+
		"\u0356\3\2\2\2\u0369\u0359\3\2\2\2\u0369\u035d\3\2\2\2\u0369\u0361\3\2"+
		"\2\2\u0369\u0365\3\2\2\2\u036ac\3\2\2\2\u036b\u036c\7\7\2\2\u036c\u0378"+
		"\5\u00a0Q\2\u036d\u0377\5B\"\2\u036e\u0377\5f\64\2\u036f\u0377\5\\/\2"+
		"\u0370\u0377\5d\63\2\u0371\u0372\5`\61\2\u0372\u0373\5\u00a0Q\2\u0373"+
		"\u0377\3\2\2\2\u0374\u0375\7\3\2\2\u0375\u0377\5\u00a0Q\2\u0376\u036d"+
		"\3\2\2\2\u0376\u036e\3\2\2\2\u0376\u036f\3\2\2\2\u0376\u0370\3\2\2\2\u0376"+
		"\u0371\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2"+
		"\2\2\u0378\u0379\3\2\2\2\u0379\u037b\3\2\2\2\u037a\u0378\3\2\2\2\u037b"+
		"\u037c\7\b\2\2\u037c\u037d\5\u00a0Q\2\u037de\3\2\2\2\u037e\u037f\5@!\2"+
		"\u037f\u0380\b\64\1\2\u0380\u039d\3\2\2\2\u0381\u0382\5\16\b\2\u0382\u0383"+
		"\b\64\1\2\u0383\u039d\3\2\2\2\u0384\u0385\5\32\16\2\u0385\u0386\b\64\1"+
		"\2\u0386\u039d\3\2\2\2\u0387\u0388\5\u0084C\2\u0388\u0389\b\64\1\2\u0389"+
		"\u039d\3\2\2\2\u038a\u038b\5\u0088E\2\u038b\u038c\b\64\1\2\u038c\u039d"+
		"\3\2\2\2\u038d\u038e\5j\66\2\u038e\u038f\b\64\1\2\u038f\u039d\3\2\2\2"+
		"\u0390\u0391\5\u008eH\2\u0391\u0392\b\64\1\2\u0392\u039d\3\2\2\2\u0393"+
		"\u0394\5\u0090I\2\u0394\u0395\b\64\1\2\u0395\u039d\3\2\2\2\u0396\u0397"+
		"\5\u0092J\2\u0397\u0398\b\64\1\2\u0398\u039d\3\2\2\2\u0399\u039a\5^\60"+
		"\2\u039a\u039b\b\64\1\2\u039b\u039d\3\2\2\2\u039c\u037e\3\2\2\2\u039c"+
		"\u0381\3\2\2\2\u039c\u0384\3\2\2\2\u039c\u0387\3\2\2\2\u039c\u038a\3\2"+
		"\2\2\u039c\u038d\3\2\2\2\u039c\u0390\3\2\2\2\u039c\u0393\3\2\2\2\u039c"+
		"\u0396\3\2\2\2\u039c\u0399\3\2\2\2\u039dg\3\2\2\2\u039e\u039f\7\7\2\2"+
		"\u039f\u03a3\5\u00a0Q\2\u03a0\u03a2\5f\64\2\u03a1\u03a0\3\2\2\2\u03a2"+
		"\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2"+
		"\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a7\7\b\2\2\u03a7\u03a8\5\u00a0Q\2\u03a8"+
		"i\3\2\2\2\u03a9\u03aa\7\63\2\2\u03aa\u03ab\5\u00a0Q\2\u03ab\u03ac\5l\67"+
		"\2\u03ac\u03ad\5\u00a0Q\2\u03ad\u03ae\5h\65\2\u03aek\3\2\2\2\u03af\u03b0"+
		"\5p9\2\u03b0\u03b1\b\67\1\2\u03b1\u03bc\3\2\2\2\u03b2\u03b3\5r:\2\u03b3"+
		"\u03b4\b\67\1\2\u03b4\u03bc\3\2\2\2\u03b5\u03b6\5t;\2\u03b6\u03b7\b\67"+
		"\1\2\u03b7\u03bc\3\2\2\2\u03b8\u03b9\5n8\2\u03b9\u03ba\b\67\1\2\u03ba"+
		"\u03bc\3\2\2\2\u03bb\u03af\3\2\2\2\u03bb\u03b2\3\2\2\2\u03bb\u03b5\3\2"+
		"\2\2\u03bb\u03b8\3\2\2\2\u03bcm\3\2\2\2\u03bd\u03be\7\4\2\2\u03be\u03bf"+
		"\5\u00a0Q\2\u03bf\u03c0\5l\67\2\u03c0\u03c1\5\u00a0Q\2\u03c1\u03c2\7\6"+
		"\2\2\u03c2\u03c3\b8\1\2\u03c3\u03cb\3\2\2\2\u03c4\u03c5\5v<\2\u03c5\u03c6"+
		"\b8\1\2\u03c6\u03cb\3\2\2\2\u03c7\u03c8\5x=\2\u03c8\u03c9\b8\1\2\u03c9"+
		"\u03cb\3\2\2\2\u03ca\u03bd\3\2\2\2\u03ca\u03c4\3\2\2\2\u03ca\u03c7\3\2"+
		"\2\2\u03cbo\3\2\2\2\u03cc\u03cd\7#\2\2\u03cd\u03ce\5\u00a0Q\2\u03ce\u03cf"+
		"\7\23\2\2\u03cf\u03d0\5\u00a0Q\2\u03d0\u03d1\5n8\2\u03d1q\3\2\2\2\u03d2"+
		"\u03dc\5n8\2\u03d3\u03d4\5\u00a0Q\2\u03d4\u03d5\7\23\2\2\u03d5\u03d6\5"+
		"\u00a0Q\2\u03d6\u03d7\7$\2\2\u03d7\u03d8\5\u00a0Q\2\u03d8\u03d9\7\23\2"+
		"\2\u03d9\u03da\5\u00a0Q\2\u03da\u03db\5n8\2\u03db\u03dd\3\2\2\2\u03dc"+
		"\u03d3\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2"+
		"\2\2\u03dfs\3\2\2\2\u03e0\u03ea\5n8\2\u03e1\u03e2\5\u00a0Q\2\u03e2\u03e3"+
		"\7\23\2\2\u03e3\u03e4\5\u00a0Q\2\u03e4\u03e5\7\64\2\2\u03e5\u03e6\5\u00a0"+
		"Q\2\u03e6\u03e7\7\23\2\2\u03e7\u03e8\5\u00a0Q\2\u03e8\u03e9\5n8\2\u03e9"+
		"\u03eb\3\2\2\2\u03ea\u03e1\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ea\3\2"+
		"\2\2\u03ec\u03ed\3\2\2\2\u03edu\3\2\2\2\u03ee\u03ef\7\4\2\2\u03ef\u03f0"+
		"\5\u00a0Q\2\u03f0\u03f1\5D#\2\u03f1\u03f2\7\6\2\2\u03f2w\3\2\2\2\u03f3"+
		"\u03f8\t\7\2\2\u03f4\u03f7\5\\/\2\u03f5\u03f7\5b\62\2\u03f6\u03f4\3\2"+
		"\2\2\u03f6\u03f5\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u03fc\7\6"+
		"\2\2\u03fcy\3\2\2\2\u03fd\u03fe\7>\2\2\u03fe\u03ff\5\u00a0Q\2\u03ff\u0400"+
		"\7=\2\2\u0400\u0401\5\u00a0Q\2\u0401\u0402\7\6\2\2\u0402\u0403\5\u00a0"+
		"Q\2\u0403{\3\2\2\2\u0404\u0405\78\2\2\u0405\u0406\5\u00a0Q\2\u0406\u0407"+
		"\5~@\2\u0407\u0408\7\6\2\2\u0408\u0409\5\u00a0Q\2\u0409}\3\2\2\2\u040a"+
		"\u0415\5\u0080A\2\u040b\u040c\7\23\2\2\u040c\u040d\5\u00a0Q\2\u040d\u040e"+
		"\t\6\2\2\u040e\u040f\5\u00a0Q\2\u040f\u0410\7\23\2\2\u0410\u0411\5\u00a0"+
		"Q\2\u0411\u0412\5\u0080A\2\u0412\u0414\3\2\2\2\u0413\u040b\3\2\2\2\u0414"+
		"\u0417\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\177\3\2\2"+
		"\2\u0417\u0415\3\2\2\2\u0418\u0424\5\u0082B\2\u0419\u041a\7\t\2\2\u041a"+
		"\u041b\5\u00a0Q\2\u041b\u041c\5\u0082B\2\u041c\u0423\3\2\2\2\u041d\u041e"+
		"\7\17\2\2\u041e\u041f\5\u00a0Q\2\u041f\u0420\5T+\2\u0420\u0421\5\u00a0"+
		"Q\2\u0421\u0423\3\2\2\2\u0422\u0419\3\2\2\2\u0422\u041d\3\2\2\2\u0423"+
		"\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0081\3\2"+
		"\2\2\u0426\u0424\3\2\2\2\u0427\u0428\5T+\2\u0428\u0429\5\u00a0Q\2\u0429"+
		"\u042a\bB\1\2\u042a\u043f\3\2\2\2\u042b\u042c\5X-\2\u042c\u042d\5\u00a0"+
		"Q\2\u042d\u042e\bB\1\2\u042e\u043f\3\2\2\2\u042f\u0430\5Z.\2\u0430\u0431"+
		"\5\u00a0Q\2\u0431\u0432\bB\1\2\u0432\u043f\3\2\2\2\u0433\u0434\5V,\2\u0434"+
		"\u0435\5\u00a0Q\2\u0435\u0436\bB\1\2\u0436\u043f\3\2\2\2\u0437\u0438\7"+
		"\4\2\2\u0438\u0439\5\u00a0Q\2\u0439\u043a\5~@\2\u043a\u043b\7\6\2\2\u043b"+
		"\u043c\5\u00a0Q\2\u043c\u043d\bB\1\2\u043d\u043f\3\2\2\2\u043e\u0427\3"+
		"\2\2\2\u043e\u042b\3\2\2\2\u043e\u042f\3\2\2\2\u043e\u0433\3\2\2\2\u043e"+
		"\u0437\3\2\2\2\u043f\u0083\3\2\2\2\u0440\u0441\7\62\2\2\u0441\u0442\5"+
		"\u00a0Q\2\u0442\u0443\7\7\2\2\u0443\u0445\5\u00a0Q\2\u0444\u0446\5\u0086"+
		"D\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u044e\3\2\2\2\u0447"+
		"\u0448\7\3\2\2\u0448\u044a\5\u00a0Q\2\u0449\u044b\5\u0086D\2\u044a\u0449"+
		"\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044d\3\2\2\2\u044c\u0447\3\2\2\2\u044d"+
		"\u0450\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0451\3\2"+
		"\2\2\u0450\u044e\3\2\2\2\u0451\u0452\7\b\2\2\u0452\u0453\5\u00a0Q\2\u0453"+
		"\u0085\3\2\2\2\u0454\u0455\5> \2\u0455\u0456\7\5\2\2\u0456\u0457\5\u00a0"+
		"Q\2\u0457\u0458\5J&\2\u0458\u0459\bD\1\2\u0459\u0461\3\2\2\2\u045a\u045b"+
		"\5> \2\u045b\u045c\7\5\2\2\u045c\u045d\5\u00a0Q\2\u045d\u045e\5H%\2\u045e"+
		"\u045f\bD\1\2\u045f\u0461\3\2\2\2\u0460\u0454\3\2\2\2\u0460\u045a\3\2"+
		"\2\2\u0461\u0087\3\2\2\2\u0462\u0463\7\65\2\2\u0463\u0464\5\u00a0Q\2\u0464"+
		"\u0465\7\23\2\2\u0465\u0466\5\u00a0Q\2\u0466\u0467\5\u009eP\2\u0467\u0468"+
		"\5\u00a0Q\2\u0468\u0469\7\7\2\2\u0469\u046a\5\u00a0Q\2\u046a\u046b\5\u008a"+
		"F\2\u046b\u046c\7\b\2\2\u046c\u046d\5\u00a0Q\2\u046d\u0089\3\2\2\2\u046e"+
		"\u046f\5\u008cG\2\u046f\u0470\7\7\2\2\u0470\u0472\5\u00a0Q\2\u0471\u0473"+
		"\5B\"\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0475\7\b\2\2\u0475\u0476\5\u00a0Q\2\u0476\u0478\3\2\2\2\u0477\u046e"+
		"\3\2\2\2\u0478\u047b\3\2\2\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a"+
		"\u008b\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u047d\t\b\2\2\u047d\u0485\5\u00a0"+
		"Q\2\u047e\u047f\7*\2\2\u047f\u0480\5\u00a0Q\2\u0480\u0481\t\b\2\2\u0481"+
		"\u0482\5\u00a0Q\2\u0482\u0484\3\2\2\2\u0483\u047e\3\2\2\2\u0484\u0487"+
		"\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u008d\3\2\2\2\u0487"+
		"\u0485\3\2\2\2\u0488\u0489\79\2\2\u0489\u048a\5\u00a0Q\2\u048a\u048b\7"+
		"\7\2\2\u048b\u048d\5\u00a0Q\2\u048c\u048e\5B\"\2\u048d\u048c\3\2\2\2\u048d"+
		"\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\7\b\2\2\u0490\u0491\5\u00a0"+
		"Q\2\u0491\u008f\3\2\2\2\u0492\u0493\7:\2\2\u0493\u0494\5\u00a0Q\2\u0494"+
		"\u0495\5\u009eP\2\u0495\u0496\5\u00a0Q\2\u0496\u0497\7\7\2\2\u0497\u0499"+
		"\5\u00a0Q\2\u0498\u049a\5B\"\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2"+
		"\u049a\u049b\3\2\2\2\u049b\u049c\7\b\2\2\u049c\u049d\5\u00a0Q\2\u049d"+
		"\u0091\3\2\2\2\u049e\u049f\7;\2\2\u049f\u04a0\5\u00a0Q\2\u04a0\u04a1\5"+
		"\u0094K\2\u04a1\u04a2\5\u00a0Q\2\u04a2\u04a3\7\7\2\2\u04a3\u04a7\5\u00a0"+
		"Q\2\u04a4\u04a6\5\u0098M\2\u04a5\u04a4\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7"+
		"\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u04a7\3\2"+
		"\2\2\u04aa\u04ab\7\b\2\2\u04ab\u04ac\5\u00a0Q\2\u04ac\u0093\3\2\2\2\u04ad"+
		"\u04b5\5\u0096L\2\u04ae\u04af\5\u00a0Q\2\u04af\u04b0\7*\2\2\u04b0\u04b1"+
		"\5\u00a0Q\2\u04b1\u04b2\5\u0096L\2\u04b2\u04b4\3\2\2\2\u04b3\u04ae\3\2"+
		"\2\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6"+
		"\u0095\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8\u04b9\7.\2\2\u04b9\u04c6\bL\1"+
		"\2\u04ba\u04c0\5\u009eP\2\u04bb\u04bc\5\u00a0Q\2\u04bc\u04bd\5\u009eP"+
		"\2\u04bd\u04bf\3\2\2\2\u04be\u04bb\3\2\2\2\u04bf\u04c2\3\2\2\2\u04c0\u04be"+
		"\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c3"+
		"\u04c4\bL\1\2\u04c4\u04c6\3\2\2\2\u04c5\u04b8\3\2\2\2\u04c5\u04ba\3\2"+
		"\2\2\u04c6\u0097\3\2\2\2\u04c7\u04c8\5\u009aN\2\u04c8\u04c9\5\u00a0Q\2"+
		"\u04c9\u04ca\7\7\2\2\u04ca\u04cc\5\u00a0Q\2\u04cb\u04cd\5\u009cO\2\u04cc"+
		"\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04d6\3\2\2\2\u04ce\u04cf\5\u00a0"+
		"Q\2\u04cf\u04d0\7\3\2\2\u04d0\u04d2\5\u00a0Q\2\u04d1\u04d3\5\u009cO\2"+
		"\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04ce"+
		"\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7"+
		"\u04d9\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04da\7\b\2\2\u04da\u04db\5\u00a0"+
		"Q\2\u04db\u0099\3\2\2\2\u04dc\u04dd\5`\61\2\u04dd\u009b\3\2\2\2\u04de"+
		"\u04df\5\u009eP\2\u04df\u04e0\5\u00a0Q\2\u04e0\u04e1\7\5\2\2\u04e1\u04e2"+
		"\5\u00a0Q\2\u04e2\u04e8\5T+\2\u04e3\u04e4\5\u00a0Q\2\u04e4\u04e5\5T+\2"+
		"\u04e5\u04e7\3\2\2\2\u04e6\u04e3\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6"+
		"\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u009d\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb"+
		"\u04ec\7?\2\2\u04ec\u04fa\bP\1\2\u04ed\u04ee\7\"\2\2\u04ee\u04fa\bP\1"+
		"\2\u04ef\u04f0\7#\2\2\u04f0\u04fa\bP\1\2\u04f1\u04f2\7$\2\2\u04f2\u04fa"+
		"\bP\1\2\u04f3\u04f4\7\64\2\2\u04f4\u04fa\bP\1\2\u04f5\u04f6\7\66\2\2\u04f6"+
		"\u04fa\bP\1\2\u04f7\u04f8\7\67\2\2\u04f8\u04fa\bP\1\2\u04f9\u04eb\3\2"+
		"\2\2\u04f9\u04ed\3\2\2\2\u04f9\u04ef\3\2\2\2\u04f9\u04f1\3\2\2\2\u04f9"+
		"\u04f3\3\2\2\2\u04f9\u04f5\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u009f\3\2"+
		"\2\2\u04fb\u04fd\t\t\2\2\u04fc\u04fb\3\2\2\2\u04fd\u0500\3\2\2\2\u04fe"+
		"\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u00a1\3\2\2\2\u0500\u04fe\3\2"+
		"\2\2m\u00aa\u00af\u00b6\u00bb\u00c2\u00c7\u00ce\u00d3\u00e4\u0104\u010b"+
		"\u0118\u011e\u012f\u0132\u0137\u0142\u014e\u0153\u015e\u0169\u016e\u0173"+
		"\u0177\u0188\u0193\u01a6\u01aa\u01b1\u01b3\u01bd\u01bf\u01c2\u01c5\u01cb"+
		"\u01d2\u01dc\u01e4\u01e8\u01ee\u01f2\u0200\u0205\u021e\u0230\u0242\u0248"+
		"\u0251\u0257\u025d\u0263\u026b\u026f\u0277\u0281\u028b\u028d\u0291\u0296"+
		"\u02c8\u02da\u02df\u02e4\u02e9\u0321\u0323\u032e\u0330\u033b\u033d\u0344"+
		"\u034b\u0351\u0369\u0376\u0378\u039c\u03a3\u03bb\u03ca\u03de\u03ec\u03f6"+
		"\u03f8\u0415\u0422\u0424\u043e\u0445\u044a\u044e\u0460\u0472\u0479\u0485"+
		"\u048d\u0499\u04a7\u04b5\u04c0\u04c5\u04cc\u04d2\u04d6\u04e8\u04f9\u04fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}