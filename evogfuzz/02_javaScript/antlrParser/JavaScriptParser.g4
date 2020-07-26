// TODO
// EOF token

/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers (original author) and Alexandre Vitorelli (contributor -> ported to CSharp)
 * Copyright (c) 2017 by Ivan Kochurkin (Positive Technologies):
    added ECMAScript 6 support, cleared and transformed to the universal grammar.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
parser grammar JavaScriptParser;

options {
    tokenVocab=JavaScriptLexer;
    superClass=JavaScriptBaseParser;
}

@parser::members {
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
}

main_dummy_rule_hope_for_no_collisions : program {
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
};

program
    : sourceElements? EOF { _var_program_0 ++; }
    ;

sourceElement
    : Export? statement { _var_sourceElement_0++; }
    ;

statement
    : block { _var_statement_0++; }
    | variableStatement { _var_statement_1++; }
    | emptyStatement { _var_statement_2++; }
    | expressionStatement { _var_statement_3++; }
    | ifStatement { _var_statement_4++; }
    | iterationStatement { _var_statement_5++; }
    | continueStatement { _var_statement_6++; }
    | breakStatement { _var_statement_7++; }
    | returnStatement { _var_statement_8++; }
    | withStatement { _var_statement_9++; }
    | labelledStatement { _var_statement_10++; }
    | switchStatement { _var_statement_11++; }
    | throwStatement { _var_statement_12++; }
    | tryStatement { _var_statement_13++; }
    | debuggerStatement { _var_statement_14++; }
    | functionDeclaration { _var_statement_15++; }
    | classDeclaration { _var_statement_16++; }
    ;

block
    : '{' statementList? '}' { _var_block_0++; }
    ;

statementList
    : statement+ { _var_statementList_0++; }
    ;

variableStatement
    : varModifier variableDeclarationList eos { _var_variableStatement_0++; }
    ;

variableDeclarationList
    : variableDeclaration (',' variableDeclaration)* { _var_variableDeclarationList_0++; }
    ;

variableDeclaration
    : (Identifier | arrayLiteral | objectLiteral) ('=' singleExpression)? { _var_variableDeclaration_0++; } // ECMAScript 6: Array & Object Matching
    ;

emptyStatement
    : SemiColon { _var_emptyStatement_0++; }
    ;

expressionStatement
    : {notOpenBraceAndNotFunction()}? expressionSequence eos { _var_expressionStatement_0++; }
    ;

ifStatement
    : If '(' expressionSequence ')' statement (Else statement)? { _var_ifStatement_0++; }
    ;


iterationStatement
    : Do statement While '(' expressionSequence ')' eos { _var_iterationStatement_0++; } # DoStatement
    | While '(' expressionSequence ')' statement { _var_iterationStatement_1++; } # WhileStatement
    | For '(' expressionSequence? ';' expressionSequence? ';' expressionSequence? ')' statement { _var_iterationStatement_2++; } # ForStatement
    | For '(' varModifier variableDeclarationList ';' expressionSequence? ';' expressionSequence? ')'
          statement { _var_iterationStatement_3++; } # ForVarStatement
    | For '(' singleExpression (In | Identifier{p("of")}?) expressionSequence ')' statement { _var_iterationStatement_4++; } # ForInStatement
    | For '(' varModifier variableDeclaration (In | Identifier{p("of")}?) expressionSequence ')' statement { _var_iterationStatement_5++; } # ForVarInStatement
    ;

varModifier  // let, const - ECMAScript 6
    : Var { _var_varModifier_0++; }
    | Let { _var_varModifier_1++; }
    | Const { _var_varModifier_2++; }
    ;

continueStatement
    : Continue ({notLineTerminator()}? Identifier)? eos { _var_continueStatement_0++; }
    ;

breakStatement
    : Break ({notLineTerminator()}? Identifier)? eos { _var_breakStatement_0++; }
    ;

returnStatement
    : Return ({notLineTerminator()}? expressionSequence)? eos { _var_returnStatement_0++; }
    ;

withStatement
    : With '(' expressionSequence ')' statement { _var_withStatement_0++; }
    ;

switchStatement
    : Switch '(' expressionSequence ')' caseBlock { _var_switchStatement_0++; }
    ;

caseBlock
    : '{' caseClauses? (defaultClause caseClauses?)? '}' { _var_caseBlock_0++; }
    ;

caseClauses
    : caseClause+ { _var_caseClauses_0++; }
    ;

caseClause
    : Case expressionSequence ':' statementList? { _var_caseClause_0++; }
    ;

defaultClause
    : Default ':' statementList? { _var_defaultClause_0++; }
    ;

labelledStatement
    : Identifier ':' statement { _var_labelledStatement_0++; }
    ;

throwStatement
    : Throw {notLineTerminator()}? expressionSequence eos { _var_throwStatement_0++; }
    ;

tryStatement
    : Try block (catchProduction finallyProduction? | finallyProduction) { _var_tryStatement_0++; }
    ;

catchProduction
    : Catch '(' Identifier ')' block { _var_catchProduction_0++; }
    ;

finallyProduction
    : Finally block { _var_finallyProduction_0++; }
    ;

debuggerStatement
    : Debugger eos { _var_debuggerStatement_0++; }
    ;

functionDeclaration
    : Function Identifier '(' formalParameterList? ')' '{' functionBody '}' { _var_functionDeclaration_0++; }
    ;

classDeclaration
    : Class Identifier classTail { _var_classDeclaration_0++; }
    ;

classTail
    : (Extends singleExpression)? '{' classElement* '}' { _var_classTail_0++; }
    ;

classElement
    : Static? methodDefinition { _var_classElement_0++; }
    ;

methodDefinition
    : propertyName '(' formalParameterList? ')' '{' functionBody '}' { _var_methodDefinition_0++; }
    | getter '(' ')' '{' functionBody '}' { _var_methodDefinition_1++; }
    | setter '(' formalParameterList? ')' '{' functionBody '}' { _var_methodDefinition_2++; }
    | generatorMethod { _var_methodDefinition_3++; }
    ;

generatorMethod
    : '*'? Identifier '(' formalParameterList? ')' '{' functionBody '}' { _var_generatorMethod_0++; }
    ;

formalParameterList
    : formalParameterArg (',' formalParameterArg)* (',' lastFormalParameterArg)? { _var_formalParameterList_0++; }
    | lastFormalParameterArg { _var_formalParameterList_1++; }
    | arrayLiteral { _var_formalParameterList_2++; }                           // ECMAScript 6: Parameter Context Matching
    | objectLiteral { _var_formalParameterList_3++; }                          // ECMAScript 6: Parameter Context Matching
    ;

formalParameterArg
    : Identifier ('=' singleExpression)? { _var_formalParameterArg_0++; }      // ECMAScript 6: Initialization
    ;

lastFormalParameterArg                        // ECMAScript 6: Rest Parameter
    : Ellipsis Identifier { _var_lastFormalParameterArg_0++; }
    ;

functionBody
    : sourceElements? { _var_functionBody_0++; }
    ;

sourceElements
    : sourceElement+  { _var_sourceElements_0++; }
    ;

arrayLiteral
    : '[' ','* elementList? ','* ']' { _var_arrayLiteral_0++; }
    ;

elementList
    : singleExpression (','+ singleExpression)* (','+ lastElement)? { _var_elementList_0++; }
    | lastElement { _var_elementList_1++; }
    ;

lastElement                      // ECMAScript 6: Spread Operator
    : Ellipsis Identifier {_var_lastElement_0++; }
    ;

objectLiteral
    : '{' (propertyAssignment (',' propertyAssignment)*)? ','? '}' { _var_objectLiteral_0++; }
    ;

propertyAssignment
    : propertyName (':' |'=') singleExpression { _var_propertyAssignment_0++; }       # PropertyExpressionAssignment
    | '[' singleExpression ']' ':' singleExpression { _var_propertyAssignment_1++; } # ComputedPropertyExpressionAssignment
    | getter '(' ')' '{' functionBody '}' { _var_propertyAssignment_2++; }           # PropertyGetter
    | setter '(' Identifier ')' '{' functionBody '}' { _var_propertyAssignment_3++; } # PropertySetter
    | generatorMethod { _var_propertyAssignment_4++; }  # MethodProperty
    | Identifier { _var_propertyAssignment_5++; } # PropertyShorthand
    ;

propertyName
    : identifierName { _var_propertyName_0++; }
    | StringLiteral { _var_propertyName_1++; }
    | numericLiteral { _var_propertyName_2++; }
    ;

arguments
    : '('(
          singleExpression (',' singleExpression)* (',' lastArgument)? |
          lastArgument
       )?')' { _var_arguments_0++; }
    ;

lastArgument                                  // ECMAScript 6: Spread Operator
    : Ellipsis Identifier { _var_lastArgument_0++; }
    ;

expressionSequence
    : singleExpression (',' singleExpression)* { _var_expressionSequence_0++; }
    ;

singleExpression
    : Function Identifier? '(' formalParameterList? ')' '{' functionBody '}' { _var_singleExpression_0++; } # FunctionExpression
    | Class Identifier? classTail { _var_singleExpression_1++; } # ClassExpression
    | singleExpression '[' expressionSequence ']' { _var_singleExpression_2++; } # MemberIndexExpression
    | singleExpression '.' identifierName { _var_singleExpression_3++; } # MemberDotExpression
    | singleExpression arguments { _var_singleExpression_4++; } # ArgumentsExpression
    | New singleExpression arguments? { _var_singleExpression_5++; } # NewExpression
    | singleExpression {notLineTerminator()}? '++' { _var_singleExpression_6++; } # PostIncrementExpression
    | singleExpression {notLineTerminator()}? '--' { _var_singleExpression_7++; } # PostDecreaseExpression
    | Delete singleExpression { _var_singleExpression_8++; } # DeleteExpression
    | Void singleExpression { _var_singleExpression_9++; } # VoidExpression
    | Typeof singleExpression { _var_singleExpression_10++; } # TypeofExpression
    | '++' singleExpression { _var_singleExpression_11++; } # PreIncrementExpression
    | '--' singleExpression { _var_singleExpression_12++; } # PreDecreaseExpression
    | '+' singleExpression { _var_singleExpression_13++; } # UnaryPlusExpression
    | '-' singleExpression { _var_singleExpression_14++; } # UnaryMinusExpression
    | '~' singleExpression { _var_singleExpression_15++; } # BitNotExpression
    | '!' singleExpression { _var_singleExpression_16++; } # NotExpression
    | singleExpression ('*' | '/' | '%') singleExpression { _var_singleExpression_17++; } # MultiplicativeExpression
    | singleExpression ('+' | '-') singleExpression { _var_singleExpression_18++; } # AdditiveExpression
    | singleExpression ('<<' | '>>' | '>>>') singleExpression { _var_singleExpression_19++; } # BitShiftExpression
    | singleExpression ('<' | '>' | '<=' | '>=') singleExpression { _var_singleExpression_20++; } # RelationalExpression
    | singleExpression Instanceof singleExpression { _var_singleExpression_21++; } # InstanceofExpression
    | singleExpression In singleExpression { _var_singleExpression_22++; } # InExpression
    | singleExpression ('==' | '!=' | '===' | '!==') singleExpression { _var_singleExpression_23++; } # EqualityExpression
    | singleExpression '&' singleExpression { _var_singleExpression_24++; } # BitAndExpression
    | singleExpression '^' singleExpression { _var_singleExpression_25++; } # BitXOrExpression
    | singleExpression '|' singleExpression { _var_singleExpression_26++; } # BitOrExpression
    | singleExpression '&&' singleExpression { _var_singleExpression_27++; } # LogicalAndExpression
    | singleExpression '||' singleExpression { _var_singleExpression_28++; } # LogicalOrExpression
    | singleExpression '?' singleExpression ':' singleExpression { _var_singleExpression_29++; } # TernaryExpression
    | singleExpression '=' singleExpression { _var_singleExpression_30++; } # AssignmentExpression
    | singleExpression assignmentOperator singleExpression { _var_singleExpression_31++; } # AssignmentOperatorExpression
    | singleExpression TemplateStringLiteral { _var_singleExpression_32++; } # TemplateStringExpression  // ECMAScript 6
    | This { _var_singleExpression_33++; } # ThisExpression
    | Identifier { _var_singleExpression_34++; } # IdentifierExpression
    | Super { _var_singleExpression_35++; } # SuperExpression
    | literal { _var_singleExpression_36++; } # LiteralExpression
    | arrayLiteral { _var_singleExpression_37++; } # ArrayLiteralExpression
    | objectLiteral { _var_singleExpression_38++; } # ObjectLiteralExpression
    | '(' expressionSequence ')' { _var_singleExpression_39++; } # ParenthesizedExpression
    | arrowFunctionParameters '=>' arrowFunctionBody { _var_singleExpression_40++; } # ArrowFunctionExpression   // ECMAScript 6
    ;
arrowFunctionParameters
    : Identifier { _var_arrowFunctionParameters_0++; }
    | '(' formalParameterList? ')' { _var_arrowFunctionParameters_1++; }
    ;

arrowFunctionBody
    : singleExpression { _var_arrowFunctionBody_0++; }
    | '{' functionBody '}' { _var_arrowFunctionBody_1++; }
    ;
assignmentOperator
    : '*=' { _var_assignmentOperator_0++; }
    | '/=' { _var_assignmentOperator_1++; }
    | '%=' { _var_assignmentOperator_2++; }
    | '+=' { _var_assignmentOperator_3++; }
    | '-=' { _var_assignmentOperator_4++; }
    | '<<=' { _var_assignmentOperator_5++; }
    | '>>=' { _var_assignmentOperator_6++; }
    | '>>>=' { _var_assignmentOperator_7++; }
    | '&=' { _var_assignmentOperator_8++; }
    | '^=' { _var_assignmentOperator_9++; }
    | '|=' { _var_assignmentOperator_10++; }
    ;
literal
    : NullLiteral { _var_literal_0++; }
    | BooleanLiteral { _var_literal_1++; }
    | StringLiteral { _var_literal_2++; }
    | TemplateStringLiteral { _var_literal_3++; }
    | RegularExpressionLiteral { _var_literal_4++; }
    | numericLiteral { _var_literal_5++; }
    ;
numericLiteral
    : DecimalLiteral { _var_numericLiteral_0++; }
    | HexIntegerLiteral { _var_numericLiteral_1++; }
    | OctalIntegerLiteral { _var_numericLiteral_2++; }
    | OctalIntegerLiteral2 { _var_numericLiteral_3++; }
    | BinaryIntegerLiteral { _var_numericLiteral_4++; }
    ;
identifierName
    : Identifier { _var_identifierName_0++; }
    | reservedWord { _var_identifierName_1++; }
    ;
reservedWord
    : keyword { _var_reservedWord_0++; }
    | NullLiteral { _var_reservedWord_1++; }
    | BooleanLiteral { _var_reservedWord_2++; }
    ;
keyword
    : Break { _var_keyword_0++; }
    | Do { _var_keyword_1++; }
    | Instanceof { _var_keyword_2++; }
    | Typeof { _var_keyword_3++; }
    | Case { _var_keyword_4++; }
    | Else { _var_keyword_5++; }
    | New { _var_keyword_6++; }
    | Var { _var_keyword_7++; }
    | Catch { _var_keyword_8++; }
    | Finally { _var_keyword_9++; }
    | Return { _var_keyword_10++; }
    | Void { _var_keyword_11++; }
    | Continue { _var_keyword_12++; }
    | For { _var_keyword_13++; }
    | Switch { _var_keyword_14++; }
    | While { _var_keyword_15++; }
    | Debugger { _var_keyword_16++; }
    | Function { _var_keyword_17++; }
    | This { _var_keyword_18++; }
    | With { _var_keyword_19++; }
    | Default { _var_keyword_20++; }
    | If { _var_keyword_21++; }
    | Throw { _var_keyword_22++; }
    | Delete { _var_keyword_23++; }
    | In { _var_keyword_24++; }
    | Try { _var_keyword_25++; }
    | Class { _var_keyword_26++; }
    | Enum { _var_keyword_27++; }
    | Extends { _var_keyword_28++; }
    | Super { _var_keyword_29++; }
    | Const { _var_keyword_30++; }
    | Export { _var_keyword_31++; }
    | Import { _var_keyword_32++; }
    | Implements { _var_keyword_33++; }
    | Let { _var_keyword_34++; }
    | Private { _var_keyword_35++; }
    | Public { _var_keyword_36++; }
    | Interface { _var_keyword_37++; }
    | Package { _var_keyword_38++; }
    | Protected { _var_keyword_39++; }
    | Static { _var_keyword_40++; }
    | Yield { _var_keyword_41++; }
    ;
getter
    : Identifier{p("get")}? propertyName { _var_getter_0++; }
    ;
setter
    : Identifier{p("set")}? propertyName { _var_setter_0++; }
    ;
eos
    : SemiColon { _var_eos_0++; }
    | EOF { _var_eos_1++; }
    | {lineTerminatorAhead()}? { _var_eos_2++; }
    | {closeBrace()}? { _var_eos_3++; }
    ;
