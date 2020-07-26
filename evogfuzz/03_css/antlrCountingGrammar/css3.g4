//grammar css3Parser;

parser grammar css3Parser;

options { tokenVocab = css3Lexer; superClass = css3BaseParser; }

//entryPoint: stylesheet { System.out.println("Counts: " + counters.toString()); } ;
entryPoint: Var { System.out.println("Counts: " + counters.toString()); } ;


// This grammar follows the formal CSS2.2 grammar closely https://www.w3.org/TR/CSS22/grammar.html
// and adds some extent of error handling from https://www.w3.org/TR/CSS22/syndata.html#parsing-errors
// CSS3 modifications are then applied
// IE and vendor specific rules are added for real world usage

@parser::members{

//initialise counts for terminals - necessary for Z3 
double count_Var = 0.0;
double count_Charset, count_SubstringMatch, count_Calc, count_Plus;
double count_Minus, count_Space, count_Hex, count_SuffixMatch, count_Cdo;
double count_PrefixMatch, count_Cdc, count_Includes, count_Comma, count_Tilde;
double count_Greater, count_DashMatch;


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

}

/*
*/

main_dummy_rule_hope_for_no_collisions : stylesheet
{
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

+ "charset = Charset ws String ws \";\" ws @@ " + count_charset_0 +
    " | Charset ws String ws  @@ " + count_charset_1 + " ;\n"

+ "imports = Import ws ( String | Uri ) ws mediaQueryList \";\" ws @@ " + count_imports_1 +
    " | Import ws ( String | Uri ) ws \";\" ws @@ " + count_imports_3 +
    " | Import ws ( String | Uri ) ws mediaQueryList @@ " + count_imports_5 +
    " | Import ws ( String | Uri ) ws @@ " + count_imports_7 + " ;\n"

+ "namespace = Namespace ws (namespacePrefix ws)? ( String | Uri ) ws \";\" ws @@ " +
    count_namespace_1 + " | Namespace ws (namespacePrefix ws)? ( String | Uri ) ws @@ " +
    count_namespace_3 + " ;\n"

+ "namespacePrefix = ident ;\n"

+ "media = Media ws mediaQueryList groupRuleBody ws ;\n"

+ "mediaQueryList = ( mediaQuery ( Comma ws mediaQuery )* )? ws ;\n"

+ "mediaQuery = ( MediaOnly |  Not )? ws mediaType ws ( And ws mediaExpression )* @@ " +
    count_mediaQuery_1 + " | mediaExpression ( And ws mediaExpression )* @@ " +
    count_mediaQuery_2 + " ;\n"

+ "mediaType = ident ;\n"

+ "mediaExpression = \"(\" ws mediaFeature ( \":\" ws expr )? \")\" ws ;\n"

+ "mediaFeature = ident ws ;\n"

+ "page = Page ws pseudoPage? \"{\" ws declaration? ( \";\" ws declaration? )* \"}\" ws ;\n"

+ "pseudoPage = \":\" ident ws ;\n"

+ "selectorGroup = selector ( Comma ws selector )* ;\n"

+ "selector = simpleSelectorSequence ws ( combinator simpleSelectorSequence ws )* ;\n"

+ "combinator =  Plus ws @@ " + count_combinator_0 + " | Greater ws @@ " +
    count_combinator_1 + " | Tilde ws @@ " + count_combinator_2 +
    " | Space ws @@ " + count_combinator_3 + " ;\n"

+ "simpleSelectorSequence = ( typeSelector | universal ) ( Hash | className | attrib | pseudo | negation )* @@ " +
    count_simpleSelectorSequence_5 + " | ( Hash | className | attrib | pseudo | negation )+ @@ " +
    count_simpleSelectorSequence_10 + " ;\n"

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

+ "negationArg = typeSelector @@ " + count_negationArg_0 + " | universal @@ " +
    count_negationArg_1 + " | Hash @@ " + count_negationArg_2 + " | className @@ " +
    count_negationArg_3 + " | attrib @@ " + count_negationArg_4 + " | pseudo @@ " +
    count_negationArg_5 +  " ;\n"

+ "operator =  \"/\" ws @@ " + count_operator_0 + " | Comma ws @@ " + count_operator_1 +
    " | Space ws @@ " + count_operator_2 + " | \"=\" ws @@ " + count_operator_3 + " ;\n"

+ "property = ident ws @@ " + count_property_0 + " | Variable ws @@ " + count_property_1 +
    " | \"*\" ident @@ " + count_property_2 + " | \"_\" ident @@ " + count_property_3 + " ;\n"

+ "ruleset = selectorGroup \"{\" ws declarationList? \"}\" ws @@ " + count_ruleset_0 +
    " | any* \"{\" ws declarationList? \"}\" ws @@ " + count_ruleset_1 + " ;\n"

+ "declarationList = ( \";\" ws )* declaration ws ( \";\" ws declaration? )* ;\n"

+ "declaration = property \":\" ws expr prio? @@ " + count_declaration_0 +" | property \":\" ws value @@ " + count_declaration_1 +  " ;\n"

+ "prio = Important ws ;\n"

+ "value = ( any | block | atKeyword ws )+ ;\n"

+ "expr = term ( operator? term )* ;\n"

+ "term = number ws @@ " + count_term_0 + " | percentage ws @@ " + count_term_1 +
    " | dimension ws @@ " + count_term_2 + " | String ws @@ " + count_term_3 +
    " | UnicodeRange ws @@ " + count_term_4 + " | ident ws @@ " + count_term_5 +
    " | var @@ " + count_term_6 + " | Uri ws @@ " + count_term_7 + " | hexcolor @@ " +
    count_term_8 + " | calc @@ " + count_term_9 + " | function @@ " + count_term_10 +
    " | unknownDimension ws @@ " + count_term_11 + " | dxImageTransform @@ " + count_term_12 +  " ;\n"

+ "function = Function ws expr \")\" ws ;\n"

+ "dxImageTransform = DxImageTransform ws expr \")\" ws  ;\n"

+ "hexcolor = Hash ws ;\n"

+ "number = ( Plus | Minus )? Number ;\n"

+ "percentage = ( Plus | Minus )? Percentage ;\n"

+ "dimension =( Plus | Minus )? Dimension ;\n"

+ "unknownDimension = ( Plus | Minus )? UnknownDimension ;\n"

+ "any = ident ws @@ " + count_any_0 + " | number ws @@ " + count_any_1 + " | percentage ws @@ " +
    count_any_2 + " | dimension ws @@ " + count_any_3 + " | unknownDimension ws @@ " + count_any_4 +
    " | String ws @@ " + count_any_5 + " | Uri ws @@ " + count_any_6 + " | Hash ws @@ " +
    count_any_7 + " | UnicodeRange ws @@ " + count_any_8 + " | Includes ws @@ " + count_any_9 +
    " | DashMatch ws @@ " + count_any_10 + " | \":\" ws @@ " + count_any_11 +
    " | Function ws ( any | unused )* \")\" ws @@ " + count_any_13 +
    " | \"(\" ws ( any | unused )* \")\" ws @@ " + count_any_14 +
    " | \"[\" ws ( any | unused )* \"]\" ws @@ " + count_any_16 + " ;\n"

+ "atRule = atKeyword ws any* ( block  | \";\" ws ) ;\n"

+ "atKeyword = \"@\" ident  ;\n"

+ "unused = block @@ " + count_unused_0 + " | atKeyword ws @@ " + count_unused_1 +
    " | \";\" ws @@ " + count_unused_2 +" | Cdo ws @@ " + count_unused_3 + " | Cdc ws @@ " +
    count_unused_4 + " ;\n"

+ "block = \"{\" ws (  declarationList | nestedStatement | any | block | atKeyword ws | \";\" ws )* \"}\" ws ;\n"

+ "nestedStatement = ruleset @@ " + count_nestedStatement_0 + " | media @@ " + count_nestedStatement_1 +
    " | page @@ " + count_nestedStatement_2 + " | fontFaceRule @@ " + count_nestedStatement_3 +
    " | keyframesRule @@ " + count_nestedStatement_4 + " | supportsRule @@ " + count_nestedStatement_5 +
    " | viewport @@ " + count_nestedStatement_6 + " | counterStyle @@ " + count_nestedStatement_7 +
    " | fontFeatureValuesRule @@ " + count_nestedStatement_8 + " | atRule @@ " + count_nestedStatement_9 + " ;\n"

+ "groupRuleBody = \"{\" ws nestedStatement* \"}\" ws ;\n"

+ "supportsRule = Supports ws supportsCondition ws groupRuleBody  ;\n"

+ "supportsCondition = supportsNegation @@ " + count_supportsCondition_0 + " | supportsConjunction @@ " +
    count_supportsCondition_1 + " | supportsDisjunction @@ " + count_supportsCondition_2 +
    " | supportsConditionInParens @@ " + count_supportsCondition_3 + " ;\n"

+ "supportsConditionInParens = \"(\" ws supportsCondition ws \")\" @@ " + count_supportsConditionInParens_0 +
    " | supportsDeclarationCondition @@ " + count_supportsConditionInParens_1 +
    " | generalEnclosed @@ " + count_supportsConditionInParens_2 + " ;\n"

+ "supportsNegation = Not ws Space ws supportsConditionInParens  ;\n"

+ "supportsConjunction = supportsConditionInParens ( ws Space ws And ws Space ws supportsConditionInParens ) ;\n"

+ "supportsDisjunction = supportsConditionInParens ( ws Space ws Or ws Space ws supportsConditionInParens ) ;\n"

+ "supportsDeclarationCondition = \"(\" ws declaration \")\" ;\n"

+ "generalEnclosed = ( Function | \"(\" ) ( any | unused )* \")\" ;\n"

+ "var = Var ws Variable ws \")\" ws ;\n"

+ "calc = Calc ws calcSum \")\" ws ;\n"

+ "calcSum = calcProduct ( Space ws ( Plus | Minus ) ws Space ws calcProduct )* ;\n"

+ "calcProduct = calcValue ( \"*\" ws calcValue | \"/\" ws number ws )* ;\n"

+ "calcValue = number ws @@ " + count_calcValue_0 + " | dimension ws @@ " + count_calcValue_1 +
    " | unknownDimension ws @@ " + count_calcValue_2 + "| percentage ws @@ " + count_calcValue_3 +
    " | \"(\" ws calcSum \")\" ws @@ " + count_calcValue_4 + ";\n"

+ "fontFaceRule = FontFace ws \"{\" ws fontFaceDeclaration? ( \";\" ws fontFaceDeclaration? )* \"}\" ws ;\n"

+ "fontFaceDeclaration = property \":\" ws expr @@ " + count_fontFaceDeclaration_0 +
    " | property \":\" ws value @@ " + count_fontFaceDeclaration_1 +  " ;\n"

+ "keyframesRule = Keyframes ws Space ws ident ws \"{\" ws keyframesBlocks \"}\" ws ;\n"

+ "keyframesBlocks = ( keyframeSelector \"{\" ws declarationList? \"}\" ws )*  ;\n"

+ "keyframeSelector = ( From | To | Percentage ) ws ( Comma ws ( From | To | Percentage ) ws )* ;\n"

+ "viewport =  Viewport ws \"{\" ws declarationList? \"}\" ws ;\n"

+ "counterStyle = CounterStyle ws ident ws \"{\" ws declarationList? \"}\" ws ;\n"

+ "fontFeatureValuesRule = FontFeatureValues ws fontFamilyNameList ws \"{\" ws featureValueBlock* \"}\" ws ;\n"

+ "fontFamilyNameList = fontFamilyName ( ws Comma ws fontFamilyName )* ;\n"

+ "fontFamilyName = String @@ " + count_fontFamilyName_0 + " | ident ( ws ident )* @@ " + count_fontFamilyName_1 + " ;\n"

+ "featureValueBlock = featureType ws \"{\" ws featureValueDefinition? ( ws \";\" ws featureValueDefinition? )* \"}\" ws ;\n"

+ "featureType = atKeyword ;\n"

+ "featureValueDefinition = ident ws \":\" ws number ( ws number )* ;\n"

+ "ident = Ident @@ " + count_ident_0 + " | MediaOnly @@ " + count_ident_1 + " | Not @@ " +
    count_ident_2 + " | And @@ " + count_ident_3 + " | Or @@ " + count_ident_4 +
    " | From @@ " + count_ident_5 + " | To @@ " + count_ident_6 + " ;\n"

+ "ws = ( Comment | Space )* ;\n"

+ "Hex = /[0-9a-fA-F]/ @@ " + count_Hex + " ;\n"

+ "NewlineOrSpace = \"\\\\r\\\\n\" | /[ \\\\t\\\\r\\\\n\\\\f ]?/;\n"

+ "Unicode = \"\\\\\\\\\" Hex Hex? Hex? Hex? Hex? Hex? NewlineOrSpace  ;\n"

+ "Escape = Unicode | \"\\\\\\\\\" /~[\\\\r\\\\n\\\\f0-9a-fA-F]/ ;\n"

+ "Nmstart = /[_a-zA-Z]/ | Nonascii | Escape  ;\n"

+ "Nmchar = /[_a-zA-Z0-9\\\\-]/ | Nonascii | Escape ;\n"

+ "Comment = \"/*\" /(~[*])*/ /[*]+/ ( /~[\\/*]/ /(~[*])*/ /[*]+/ )* \"/\" ;\n"

+ "Name =  Nmchar+ ;\n"
+ "Url = ( /[!#$%&*-~]/ | Nonascii | Escape )*  ;\n"
+ "Space = /[\\\\t\\\\r\\\\n\\\\f ]+/ @@ " + count_Space + " ;\n"
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
+ "Cdo = \"<!--\" @@ " + count_Cdo + " ;\n"
+ "Cdc = \"-->\" @@ " + count_Cdc + " ;\n"
+ "Includes = \"~=\" @@ " + count_Includes + " ;\n"
+ "DashMatch = \"|=\" @@ " + count_DashMatch + " ;\n"
+ "Hash = \"#\" Name ;\n"
+ "Import = \"@\" I M P O R T ;\n"
+ "Page = \"@\" P A G E ;\n"
+ "Media = \"@\" M E D I A ;\n"
+ "Namespace = \"@\" N A M E S P A C E ;\n"
+ "Charset = \"@charset \" @@ " + count_Charset + " ;\n"
+ "Important = \"!\" ( Space | Comment )* I M P O R T A N T ;\n"
+ "FontRelative  = Number E M | Number E X | Number C H | Number R E M ;\n"
+ "ViewportRelative = Number V W | Number V H | Number V M I N | Number V M A X ;\n"
+ "AbsLength = Number P X | Number C M | Number M M | Number I N | Number P T | Number P C | Number Q ;\n"
+ "Angle = Number D E G | Number R A D | Number G R A D | Number T U R N ;\n"
+ "Time = Number M S | Number S ;\n"
+ "Freq = Number H Z | Number K H Z ;\n"
+ "Percentage = Number \"%\" ;\n"

/*
+ "Uri = U R L \"(\" Whitespace String Whitespace \")\" @@ " + count_Uri_0 + " | U R L \"(\" Whitespace Url Whitespace \")\" @@ " + count_Uri_1 + " ;\n"
*/
+ "Uri = U R L \"(\" Whitespace String Whitespace \")\" | U R L \"(\" Whitespace Url Whitespace \")\" ;\n"

/*
+ "UnicodeRange = [u|U] \"+?\" \"?\"? \"?\"? \"?\"? \"?\"? \"?\"? @@ " + count_UnicodeRange_1 + " | [u|U] \"+\" Hex \"?\"? \"?\"? \"?\"? \"?\"? \"?\"? @@ " + count_UnicodeRange_3 + " | [u|U] \"+\" Hex Hex \"?\"? \"?\"? \"?\"? \"?\"? @@ " + count_UnicodeRange_5 + " | [u|U] \"+\" Hex Hex Hex \"?\"? \"?\"? \"?\"? @@ " + count_UnicodeRange_7 + " | [u|U] \"+\" Hex Hex Hex Hex \"?\"? \"?\"? @@ " + count_UnicodeRange_9
    + " | [u|U] \"+\" Hex Hex Hex Hex Hex \"?\"? @@ " + count_UnicodeRange_11 + " ;\n"
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
+ "Dimension = Length @@ " + count_Dimension_0 + " | Time @@ " + count_Dimension_1 + " | Freq @@ " + count_Dimension_2 + " | Resolution @@ " + count_Dimension_3 + " | Angle @@ " + count_Dimension_4 + " ;\n"
*/
+ "Dimension = Length | Time | Freq | Resolution | Angle ;\n"


+ "UnknownDimension = Number Ident ;\n"
+ "Nonascii = /~[\\\\u0000-\\\\u007f]/ ;\n"
+ "Plus = \"+\" @@ " + count_Plus + "  ;\n"
+ "Minus = \"-\" @@ " + count_Minus + " ;\n"
+ "Greater =  \">\" @@ " + count_Greater + " ;\n"
+ "Comma = \",\" @@ " + count_Comma + " ;\n"
+ "Tilde = \"~\" @@ " + count_Tilde + " ;\n" 
+ "PseudoNot = \":\" N O T \"(\" ;\n"

/*
+ "Number = [0-9]+ @@ " + count_Number_0 + " | [0-9]* \".\" [0-9]+ @@ " + count_Number_1 + " ;\n"
*/
+ "Number = /[0-9]+/ | /[0-9]*/ \".\" /[0-9]+/ ;\n"


// TODO I'm quite certain this rule is not properly escaped for printing...
/*
+ "String = '\"' ( ~[\n\r\f\\\"] | '\\' Newline | Nonascii | Escape )* '\"' @@ " + count_String_3 +
    " | '\'' ( ~[\n\r\f\\'] | '\\' Newline | Nonascii | Escape )* '\'' @@ " + count_String_7 + " ;\n"
+ "String = '\"' ( ~[\n\r\f\\\"] | '\\\' Newline | Nonascii | Escape )* '\"' | '\'' ( ~[\n\r\f\\\'] " +
    " | '\\\' Newline | Nonascii | Escape )* '\'' ;\n"
*/
+ "String = \"\\\"\" ( /~[\\\\n\\\\r\\\\f\\\\\\\\\\\"]/ | \"\\\\\\\\\" Newline | Nonascii | Escape )* \"\\\"\" | \"'\" ( /~[\\\\n\\\\r\\\\f\\\\\\\\']/ " +
    " | \"\\\\\\\\\" Newline | Nonascii | Escape )* \"'\" ;\n"

+ "PrefixMatch = \"^=\" @@ " + count_PrefixMatch + " ;\n"
+ "SuffixMatch = \"$=\" @@ " + count_SuffixMatch + " ;\n"
+ "SubstringMatch = \"*=\" @@ " + count_SubstringMatch  + " ;\n"
+ "FontFace = \"@\" F O N T DashChar F A C E ;\n"
+ "Supports = \"@\" S U P P O R T S ;\n"
+ "Or = O R ;\n"
+ "VendorPrefix = \"-\" M O Z \"-\" | \"-\" W E B K I T \"-\" | \"-\" O \"-\"  ;\n"
+ "Keyframes = \"@\" VendorPrefix? K E Y F R A M E S ;\n"
+ "From = F R O M ;\n"
+ "To = T O ;\n"
+ "Calc = \"calc(\" @@ " + count_Calc + " ;\n"
+ "Viewport = \"@\" V I E W P O R T ;\n"
+ "CounterStyle =  \"@\" C O U N T E R DashChar S T Y L E  ;\n"
+ "FontFeatureValues = \"@\" F O N T DashChar F E A T U R E DashChar V A L U E S ;\n"
+ "DxImageTransform = \"progid:DXImageTransform.Microsoft.\" Function ;\n"
+ "Variable = \"--\" Nmstart Nmchar* ;\n"
+ "Var = \"var(\" @@ " + count_Var + " ;\n"
+ "Ident = \"-\"? Nmstart Nmchar* ;\n"
+ "Function = Ident \"(\" ;\n"

);

};


stylesheet
    : ws ( charset ( Comment | Space | Cdo | Cdc )* )*
         ( imports ( Comment | Space | Cdo | Cdc )* )*
         ( namespace ( Comment | Space | Cdo | Cdc )* )*
         ( nestedStatement ( Comment | Space | Cdo | Cdc )* )*
    ;

charset
    : Charset ws String ws ';' ws  {count_charset_0++; }  # goodCharset
    | Charset ws String ws     {count_charset_1++; }      # badCharset
    ;

imports
    : Import ws ( String | Uri ) ws mediaQueryList ';' ws {count_imports_1++; }    # goodImport
    | Import ws ( String | Uri ) ws ';' ws {count_imports_3++; }                   # goodImport
    | Import ws ( String | Uri ) ws mediaQueryList {count_imports_5++; }           # badImport
    | Import ws ( String | Uri ) ws {count_imports_7++; }                          # badImport
    ;

// Namespaces
// https://www.w3.org/TR/css-namespaces-3/
namespace
    : Namespace ws (namespacePrefix ws)? ( String | Uri ) ws ';' ws {count_namespace_1++; }   # goodNamespace
    | Namespace ws (namespacePrefix ws)? ( String | Uri ) ws {count_namespace_3++; }           # badNamespace
    ;

namespacePrefix
    : ident
    ;

// Media queries
// https://www.w3.org/TR/css3-mediaqueries/
media
    : Media ws mediaQueryList groupRuleBody ws
    ;


mediaQueryList
    : ( mediaQuery ( Comma ws mediaQuery )* )? ws
    ;

mediaQuery
    : ( MediaOnly | Not )? ws mediaType ws ( And ws mediaExpression )* {count_mediaQuery_1++; }
    | mediaExpression ( And ws mediaExpression )* {count_mediaQuery_2++; }
    ;

mediaType
    : ident
    ;

mediaExpression
    : '(' ws mediaFeature ( ':' ws expr )? ')' ws    // Grammar allows for 'and(', which gets tokenized as Function. In practice, people always insert space before '(' to have it work on Chrome.
    ;

mediaFeature
    : ident ws
    ;

// Page
page
    : Page ws pseudoPage? '{' ws declaration? ( ';' ws declaration? )* '}' ws
    ;

pseudoPage
    : ':' ident ws
    ;

// Selectors
// https://www.w3.org/TR/css3-selectors/
selectorGroup
    : selector ( Comma ws selector )*
    ;

selector
    : simpleSelectorSequence ws ( combinator simpleSelectorSequence ws )*
    ;

combinator
    : Plus ws {count_combinator_0++; }
    | Greater ws {count_combinator_1++; }
    | Tilde ws {count_combinator_2++; }
    | Space ws {count_combinator_3++; }
    ;

simpleSelectorSequence
    : ( typeSelector | universal ) ( Hash | className | attrib | pseudo | negation )* {count_simpleSelectorSequence_5++; }
    | ( Hash | className | attrib | pseudo | negation )+ {count_simpleSelectorSequence_10++; }
    ;

typeSelector
    : typeNamespacePrefix? elementName
    ;

typeNamespacePrefix
    : ( ident | '*' )? '|'
    ;

elementName
    : ident
    ;

universal
    : typeNamespacePrefix? '*'
    ;

className
    : '.' ident
    ;

attrib
    : '[' ws typeNamespacePrefix? ident ws
        ( ( PrefixMatch | SuffixMatch | SubstringMatch | '=' | Includes | DashMatch ) ws ( ident | String ) ws )? ']'
    ;

pseudo
    /* '::' starts a pseudo-element, ':' a pseudo-class */
    /* Exceptions: :first-line, :first-letter, :before And :after. */
    /* Note that pseudo-elements are restricted to one per selector And */
    /* occur MediaOnly in the last simple_selector_sequence. */
    : ':' ':'? ( ident | functionalPseudo )
    ;

functionalPseudo
    : Function ws expression ')'
    ;


expression
    /* In CSS3, the expressions are identifiers, strings, */
    /* or of the form "an+b" */
    : ( ( Plus | Minus | Dimension | UnknownDimension | Number | String | ident ) ws )+
    ;


negation
    : PseudoNot ws negationArg ws ')'
    ;


negationArg
    : typeSelector  {count_negationArg_0++; }
    | universal {count_negationArg_1++; }
    | Hash {count_negationArg_2++; }
    | className {count_negationArg_3++; }
    | attrib {count_negationArg_4++; }
    | pseudo {count_negationArg_5++; }
    ;


// Rules
operator
    : '/' ws {count_operator_0++; }     # goodOperator
    | Comma ws {count_operator_1++; }   # goodOperator
    | Space ws {count_operator_2++; }   # goodOperator
    | '=' ws {count_operator_3++; }     # badOperator  // IE filter and DXImageTransform function
    ;


property
    : ident ws {count_property_0++; }      # goodProperty
    | Variable ws {count_property_1++; }  # goodProperty
    | '*' ident  {count_property_2++; }    # badProperty  // IE hacks
    | '_' ident  {count_property_3++; }    # badProperty  // IE hacks
    ;


ruleset
    : selectorGroup '{' ws declarationList? '}' ws {count_ruleset_0++; }   # knownRuleset
    | any* '{' ws declarationList? '}' ws {count_ruleset_1++; }            # unknownRuleset
    ;


declarationList
    : ( ';' ws )* declaration ws ( ';' ws declaration? )*
    ;

declaration
    : property ':' ws expr prio? {count_declaration_0++; }   # knownDeclaration
    | property ':' ws value {count_declaration_1++; }        # unknownDeclaration
    ;

prio
    : Important ws
    ;

value
    : ( any | block | atKeyword ws )+
    ;

expr
    : term ( operator? term )*
    ;


term
    : number ws {count_term_0++; }             # knownTerm
    | percentage ws {count_term_1++; }          # knownTerm
    | dimension ws {count_term_2++; }           # knownTerm
    | String ws {count_term_3++; }              # knownTerm
    | UnicodeRange ws {count_term_4++; }         # knownTerm
    | ident ws {count_term_5++; }               # knownTerm
    | var {count_term_6++; }                    # knownTerm
    | Uri ws {count_term_7++; }                 # knownTerm
    | hexcolor {count_term_8++; }               # knownTerm
    | calc {count_term_9++; }                   # knownTerm
    | function {count_term_10++; }               # knownTerm
    | unknownDimension ws {count_term_11++; }    # unknownTerm
    | dxImageTransform {count_term_12++; }       # badTerm
    ;


function
    : Function ws expr ')' ws
    ;

dxImageTransform
    : DxImageTransform ws expr ')' ws    // IE DXImageTransform function
    ;


hexcolor
    : Hash ws
    ;


number
    : ( Plus | Minus )? Number
    ;

percentage
    : ( Plus | Minus )? Percentage
    ;

dimension
    : ( Plus | Minus )? Dimension
    ;

unknownDimension
    : ( Plus | Minus )? UnknownDimension
    ;


// Error handling
any
    : ident ws {count_any_0++; }
    | number ws {count_any_1++; }
    | percentage ws {count_any_2++; }
    | dimension ws {count_any_3++; }
    | unknownDimension ws {count_any_4++; }
    | String ws {count_any_5++; }
    //| Delim ws    // Not implemented yet
    | Uri ws {count_any_6++; }
    | Hash ws {count_any_7++; }
    | UnicodeRange ws {count_any_8++; }
    | Includes ws {count_any_9++; }
    | DashMatch ws {count_any_10++; }
    | ':' ws {count_any_11++; }
    | Function ws ( any | unused )* ')' ws {count_any_13++; }
    | '(' ws ( any | unused )* ')' ws {count_any_14++; }
    | '[' ws ( any | unused )* ']' ws {count_any_16++; }
    ;

atRule
    : atKeyword ws any* ( block | ';' ws ) # unknownAtRule
    ;

atKeyword
    : '@' ident
    ;


unused
    : block {count_unused_0++; }
    | atKeyword ws {count_unused_1++; }
    | ';' ws {count_unused_2++; }
    | Cdo ws {count_unused_3++; }
    | Cdc ws {count_unused_4++; }
    ;

block
    : '{' ws (  declarationList | nestedStatement | any | block | atKeyword ws | ';' ws )* '}' ws
    ;

// Conditional
// https://www.w3.org/TR/css3-conditional/
nestedStatement
    : ruleset {count_nestedStatement_0++; }
    | media {count_nestedStatement_1++; }
    | page {count_nestedStatement_2++; }
    | fontFaceRule {count_nestedStatement_3++; }
    | keyframesRule {count_nestedStatement_4++; }
    | supportsRule {count_nestedStatement_5++; }
    | viewport {count_nestedStatement_6++; }
    | counterStyle {count_nestedStatement_7++; }
    | fontFeatureValuesRule {count_nestedStatement_8++; }
    | atRule {count_nestedStatement_9++;}
    ;

groupRuleBody
    : '{' ws nestedStatement* '}' ws
    ;

supportsRule
    : Supports ws supportsCondition ws groupRuleBody
    ;

supportsCondition
    : supportsNegation {count_supportsCondition_0++; }
    | supportsConjunction {count_supportsCondition_1++; }
    | supportsDisjunction {count_supportsCondition_2++; }
    | supportsConditionInParens {count_supportsCondition_3++; }
    ;

supportsConditionInParens
    : '(' ws supportsCondition ws ')' {count_supportsConditionInParens_0++; }
    | supportsDeclarationCondition {count_supportsConditionInParens_1++; }
    | generalEnclosed {count_supportsConditionInParens_2++; }
    ;


supportsNegation
    : Not ws Space ws supportsConditionInParens
    ;

supportsConjunction
    : supportsConditionInParens ( ws Space ws And ws Space ws supportsConditionInParens )+
    ;

supportsDisjunction
    : supportsConditionInParens ( ws Space ws Or ws Space ws supportsConditionInParens )+
    ;

supportsDeclarationCondition
    : '(' ws declaration ')'
    ;

generalEnclosed
    : ( Function | '(' ) ( any | unused )* ')'
    ;

var
    : Var ws Variable ws ')' ws
    ;

// Calc
// https://www.w3.org/TR/css3-values/#calc-syntax
calc
    : Calc ws calcSum ')' ws
    ;

calcSum
    : calcProduct ( Space ws ( Plus | Minus ) ws Space ws calcProduct )*
    ;

calcProduct
    : calcValue ( '*' ws calcValue | '/' ws number ws )*
    ;

calcValue
    : number ws {count_calcValue_0++;}
    | dimension ws {count_calcValue_1++;}
    | unknownDimension ws {count_calcValue_2++;}
    | percentage ws {count_calcValue_3++;}
    | '(' ws calcSum ')' ws {count_calcValue_4++;}
    ;

fontFaceRule
    : FontFace ws '{' ws fontFaceDeclaration? ( ';' ws fontFaceDeclaration? )* '}' ws
    ;

fontFaceDeclaration
    : property ':' ws expr {count_fontFaceDeclaration_0++; }    # knownFontFaceDeclaration
    | property ':' ws value {count_fontFaceDeclaration_1++; }   # unknownFontFaceDeclaration
    ;

// Animations
// https://www.w3.org/TR/css3-animations/
keyframesRule
    : Keyframes ws Space ws ident ws '{' ws keyframesBlocks '}' ws
    ;

keyframesBlocks
    : ( keyframeSelector '{' ws declarationList? '}' ws )*
    ;

keyframeSelector
    : ( From | To | Percentage ) ws ( Comma ws ( From | To | Percentage ) ws )*
    ;

// Viewport
// https://www.w3.org/TR/css-device-adapt-1/
viewport
    : Viewport ws '{' ws declarationList? '}' ws
    ;

// Counter style
// https://www.w3.org/TR/css-counter-styles-3/
counterStyle
    : CounterStyle ws ident ws '{' ws declarationList? '}' ws
    ;

// Font feature values
// https://www.w3.org/TR/css-fonts-3/
fontFeatureValuesRule
    : FontFeatureValues ws fontFamilyNameList ws '{' ws featureValueBlock* '}' ws
    ;

fontFamilyNameList
    : fontFamilyName ( ws Comma ws fontFamilyName )*
    ;

fontFamilyName
    : String {count_fontFamilyName_0++; }
    | ident ( ws ident )* {count_fontFamilyName_1++; }
    ;

featureValueBlock
    : featureType ws '{' ws featureValueDefinition? ( ws ';' ws featureValueDefinition? )* '}' ws
    ;

featureType
    : atKeyword
    ;

featureValueDefinition
    : ident ws ':' ws number ( ws number )*
    ;

// The specific words can be identifiers too
ident
    : Ident {count_ident_0++; }
    | MediaOnly {count_ident_1++; }
    | Not {count_ident_2++; }
    | And {count_ident_3++; }
    | Or {count_ident_4++; }
    | From {count_ident_5++; }
    | To {count_ident_6++; }
    ;

// Comments might be part of CSS hacks, thus pass them to visitor to decide whether to skip
// Spaces are significant around '+' '-' '(', thus they should not be skipped
ws
    : ( Comment | Space )*
    ;


// Tokens
fragment Hex
    : [0-9a-fA-F] 
    ;

fragment NewlineOrSpace
    : '\r\n'
    | [ \t\r\n\f]
    |
    ;

fragment Unicode
    : '\\' Hex Hex? Hex? Hex? Hex? Hex? NewlineOrSpace
    ;

fragment Escape
    : Unicode
    | '\\' ~[\r\n\f0-9a-fA-F]
    ;

fragment Nmstart
    : [_a-zA-Z]
    | Nonascii
    | Escape
    ;

fragment Nmchar
    : [_a-zA-Z0-9\-]
    | Nonascii
    | Escape
    ;

// CSS2.2 Grammar defines the following, but I'm not sure how to add them to parser for error handling
// BadString :
// BadUri :
// BadComment :
// BadUri :

Comment
    : '/*' ~'*'* '*'+ ( ~[/*] ~'*'* '*'+ )* '/'
    ;

fragment Name
    : Nmchar+
    ;

fragment Url
    : ( [!#$%&*-~] | Nonascii | Escape )*
    ;

Space
    : [ \t\r\n\f]+ 
    ;

fragment Whitespace
    : Space
    |
    ;

fragment Newline
    : '\n'
    | '\r\n'
    | '\r'
    | '\f'
    ;

fragment ZeroToFourZeros
    : '0'? '0'? '0'? '0'?
    ;

fragment A
    : 'a'
    | 'A'
    | '\\' ZeroToFourZeros ('41'|'61') NewlineOrSpace
    ;

fragment B
    : 'b'
    | 'B'
    | '\\' ZeroToFourZeros ('42'|'62') NewlineOrSpace
    ;

fragment C
    : 'c'
    | 'C'
    | '\\' ZeroToFourZeros ('43'|'63') NewlineOrSpace
    ;

fragment D
    : 'd'
    | 'D'
    | '\\' ZeroToFourZeros ('44'|'64') NewlineOrSpace
    ;

fragment E
    : 'e'
    | 'E'
    | '\\' ZeroToFourZeros ('45'|'65') NewlineOrSpace
    ;


fragment F
    : 'f'
    | 'F'
    | '\\' ZeroToFourZeros ('46'|'66') NewlineOrSpace
    ;

fragment G
    : 'g'
    | 'G'
    | '\\' ZeroToFourZeros ('47'|'67') NewlineOrSpace
    | '\\g'
    | '\\G'
    ;

fragment H
    : 'h'
    | 'H'
    | '\\' ZeroToFourZeros ('48'|'68') NewlineOrSpace
    | '\\h'
    | '\\H'
    ;

fragment I
    : 'i'
    | 'I'
    | '\\' ZeroToFourZeros ('49'|'69') NewlineOrSpace
    | '\\i'
    | '\\I'
    ;

fragment K
    : 'k'
    | 'K'
    | '\\' ZeroToFourZeros ('4b'|'6b') NewlineOrSpace
    | '\\k'
    | '\\K'
    ;

fragment L
    : 'l'
    | 'L'
    | '\\' ZeroToFourZeros ('4c'|'6c') NewlineOrSpace
    | '\\l'
    | '\\L'
    ;

fragment M
    : 'm'
    | 'M'
    | '\\' ZeroToFourZeros ('4d'|'6d') NewlineOrSpace
    | '\\m'
    | '\\M'
    ;

fragment N
    : 'n'
    | 'N'
    | '\\' ZeroToFourZeros ('4e'|'6e') NewlineOrSpace
    | '\\n'
    | '\\N'
    ;

fragment O
    : 'o'
    | 'O'
    | '\\' ZeroToFourZeros ('4f'|'6f') NewlineOrSpace
    | '\\o'
    | '\\O'
    ;

fragment P
    : 'p'
    | 'P'
    | '\\' ZeroToFourZeros ('50'|'70') NewlineOrSpace
    | '\\p'
    | '\\P'
    ;

fragment Q
    : 'q'
    | 'Q'
    | '\\' ZeroToFourZeros ('51'|'71') NewlineOrSpace
    | '\\q'
    | '\\Q'
    ;

fragment R
    : 'r'
    | 'R'
    | '\\' ZeroToFourZeros ('52'|'72') NewlineOrSpace
    | '\\r'
    | '\\R'
    ;

fragment S
    : 's'
    | 'S'
    | '\\' ZeroToFourZeros ('53'|'73') NewlineOrSpace
    | '\\s'
    | '\\S'
    ;

fragment T
    : 't'
    | 'T'
    | '\\' ZeroToFourZeros ('54'|'74') NewlineOrSpace
    | '\\t'
    | '\\T'
    ;

fragment U
    : 'u'
    | 'U'
    | '\\' ZeroToFourZeros ('55'|'75') NewlineOrSpace
    | '\\u'
    | '\\U'
    ;

fragment V
    : 'v'
    | 'V'
    | '\\' ZeroToFourZeros ('56'|'76') NewlineOrSpace
    | '\\v'
    | '\\V'
    ;

fragment W
    : 'w'
    | 'W'
    | '\\' ZeroToFourZeros ('57'|'77') NewlineOrSpace
    | '\\w'
    | '\\W'
    ;

fragment X
    : 'x'
    | 'X'
    | '\\' ZeroToFourZeros ('58'|'78') NewlineOrSpace
    | '\\x'
    | '\\X'
    ;

fragment Y
    : 'y'
    | 'Y'
    | '\\' ZeroToFourZeros ('59'|'79') NewlineOrSpace
    | '\\y'
    | '\\Y'
    ;

fragment Z
    : 'z'
    | 'Z'
    | '\\' ZeroToFourZeros ('5a'|'7a') NewlineOrSpace
    | '\\z'
    | '\\Z'
    ;

fragment DashChar
    : '-'
    | '\\' ZeroToFourZeros '2d' NewlineOrSpace
    ;

Cdo
    : '<!--' 
    ;

Cdc
    : '-->' 
    ;

Includes
    : '~=' 
    ;

DashMatch
    : '|=' 
    ;

Hash
    : '#' Name
    ;

Import
    : '@' I M P O R T
    ;

Page
    : '@' P A G E
    ;

Media
    : '@' M E D I A
    ;

Namespace
    : '@' N A M E S P A C E
    ;

//fragment AtKeyword
//    : '@' Ident
//    ;

Charset
    : '@charset ' 
    ;

Important
    : '!' ( Space | Comment )* I M P O R T A N T
    ;


fragment FontRelative
    : Number E M
    | Number E X
    | Number C H
    | Number R E M
    ;

// https://www.w3.org/TR/css3-values/#viewport-relative-lengths
fragment ViewportRelative
    : Number V W
    | Number V H
    | Number V M I N
    | Number V M A X
    ;

fragment AbsLength
    : Number P X
    | Number C M
    | Number M M
    | Number I N
    | Number P T
    | Number P C
    | Number Q
    ;

fragment Angle
    : Number D E G
    | Number R A D
    | Number G R A D
    | Number T U R N
    ;

fragment Time
    : Number M S
    | Number S
    ;

fragment Freq
    : Number H Z
    | Number K H Z
    ;

Percentage
    : Number '%'
    ;

/*
Uri
    : U R L '(' Whitespace String Whitespace ')' {count_Uri_0++; }
    | U R L '(' Whitespace Url Whitespace ')' {count_Uri_1++; }
    ;
*/
Uri
    : U R L '(' Whitespace String Whitespace ')'
    | U R L '(' Whitespace Url Whitespace ')'
    ;


/*
UnicodeRange
    : [u|U] '+?' '?'? '?'? '?'? '?'? '?'? {count_UnicodeRange_1++; }
    | [u|U] '+' Hex '?'? '?'? '?'? '?'? '?'? {count_UnicodeRange_3++; }
    | [u|U] '+' Hex Hex '?'? '?'? '?'? '?'? {count_UnicodeRange_5++; }
    | [u|U] '+' Hex Hex Hex '?'? '?'? '?'? {count_UnicodeRange_7++; }
    | [u|U] '+' Hex Hex Hex Hex '?'? '?'? {count_UnicodeRange_9++; }
    | [u|U] '+' Hex Hex Hex Hex Hex '?'? {count_UnicodeRange_11++; }
    ;
*/
UnicodeRange
    : [u|U] '+?' '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' Hex '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' Hex Hex '?'? '?'? '?'? '?'?
    | [u|U] '+' Hex Hex Hex '?'? '?'? '?'?
    | [u|U] '+' Hex Hex Hex Hex '?'? '?'?
    | [u|U] '+' Hex Hex Hex Hex Hex '?'?
    ;



// https://www.w3.org/TR/css3-mediaqueries/
MediaOnly
    : O N L Y
    ;

Not
    : N O T
    ;

And
    : A N D
    ;

fragment Resolution
    : Number D P I
    | Number D P C M
    | Number D P P X
    ;

fragment Length
    : AbsLength
    | FontRelative
    | ViewportRelative
    ;

/*
Dimension
    : Length {count_Dimension_0++; }
    | Time {count_Dimension_1++; }
    | Freq {count_Dimension_2++; }
    | Resolution {count_Dimension_3++; }
    | Angle {count_Dimension_4++; }
    ;
*/
Dimension
    : Length
    | Time
    | Freq
    | Resolution
    | Angle
    ;

UnknownDimension
    : Number Ident
    ;

// https://www.w3.org/TR/css3-selectors/
fragment Nonascii
    : ~[\u0000-\u007f]
    ;

Plus
    : '+' 
    ;

Minus
    : '-' 
    ;

Greater
    : '>' 
    ;

Comma
    : ',' 
    ;

Tilde
    : '~' 
    ;

PseudoNot
    : ':' N O T '('
    ;

/*
Number
    : [0-9]+ {count_Number_0++; }
    | [0-9]* '.' [0-9]+ {count_Number_1++; }
    ;
*/
Number
    : [0-9]+
    | [0-9]* '.' [0-9]+
    ;


/*
String
    : '"' ( ~[\n\r\f\\"] | '\\' Newline | Nonascii | Escape )* '"' {count_String_3++; }
    | '\'' ( ~[\n\r\f\\'] | '\\' Newline | Nonascii | Escape )* '\'' {count_String_7++; }
    ;
*/
String
    : '"' ( ~[\n\r\f\\"] | '\\' Newline | Nonascii | Escape )* '"'
    | '\'' ( ~[\n\r\f\\'] | '\\' Newline | Nonascii | Escape )* '\''
    ;

PrefixMatch
    : '^=' 
    ;

SuffixMatch
    : '$=' 
    ;

SubstringMatch
    : '*=' 
    ;

// https://www.w3.org/TR/css-fonts-3/#font-face-rule
FontFace
    : '@' F O N T DashChar F A C E
    ;

// https://www.w3.org/TR/css3-conditional/
Supports
    : '@' S U P P O R T S
    ;

Or
    : O R
    ;

// https://www.w3.org/TR/css3-animations/
fragment VendorPrefix
    : '-' M O Z '-'
    | '-' W E B K I T '-'
    | '-' O '-'
    ;

Keyframes
    : '@' VendorPrefix? K E Y F R A M E S
    ;

From
    : F R O M
    ;

To
    : T O
    ;

// https://www.w3.org/TR/css3-values/#calc-syntax
Calc
    : 'calc(' 
    ;

// https://www.w3.org/TR/css-device-adapt-1/
Viewport
    : '@' V I E W P O R T
    ;

// https://www.w3.org/TR/css-counter-styles-3/
CounterStyle
    : '@' C O U N T E R DashChar S T Y L E
    ;

// https://www.w3.org/TR/css-fonts-3/
FontFeatureValues
    : '@' F O N T DashChar F E A T U R E DashChar V A L U E S
    ;

// https://msdn.microsoft.com/en-us/library/ms532847.aspx
DxImageTransform
    : 'progid:DXImageTransform.Microsoft.' Function
    ;

// Variables
// https://www.w3.org/TR/css-variables-1
Variable
    : '--' Nmstart Nmchar*
    ;

Var
    : 'var(' 
    ;

// Give Ident least priority so that more specific rules matches first
Ident
    : '-'? Nmstart Nmchar*
    ;

Function
    : Ident '('
    ;
