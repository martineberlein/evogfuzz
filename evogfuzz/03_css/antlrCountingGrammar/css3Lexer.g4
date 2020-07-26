lexer grammar css3Lexer;

options { superClass= css3BaseLexer; }

// Tokens
/*
fragment Hex
    : [0-9a-fA-F] //{count_Hex++; }
    ;
*/
fragment NewlineOrSpace
    : '\r\n'
    | [ \t\r\n\f]
    |
    ;

fragment Unicode
    : '\\' HEX HEX? HEX? HEX? HEX? HEX? NewlineOrSpace
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
/*
Space
    : [ \t\r\n\f]+ //{count_Space++; }
    ;
*/

fragment Whitespace
    : SPACE
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
/*
Cdo
    : '<!--' {count_Cdo++; }
    ;

Cdc
    : '-->' {count_Cdc++; }
    ;

Includes
    : '~=' {count_Includes++; }
    ;

DashMatch
    : '|=' {count_DashMatch++; }
    ;
*/
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
/*
Charset
    : '@charset ' {count_Charset++; }
    ;
*/
Important
    : '!' ( SPACE | Comment )* I M P O R T A N T
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
    | [u|U] '+' HEX '?'? '?'? '?'? '?'? '?'? {count_UnicodeRange_3++; }
    | [u|U] '+' HEX HEX '?'? '?'? '?'? '?'? {count_UnicodeRange_5++; }
    | [u|U] '+' HEX HEX HEX '?'? '?'? '?'? {count_UnicodeRange_7++; }
    | [u|U] '+' HEX HEX HEX HEX '?'? '?'? {count_UnicodeRange_9++; }
    | [u|U] '+' HEX HEX HEX HEX HEX '?'? {count_UnicodeRange_11++; }
    ;
*/
UnicodeRange
    : [u|U] '+?' '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' HEX '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' HEX HEX '?'? '?'? '?'? '?'?
    | [u|U] '+' HEX HEX HEX '?'? '?'? '?'?
    | [u|U] '+' HEX HEX HEX HEX '?'? '?'?
    | [u|U] '+' HEX HEX HEX HEX HEX '?'?
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
/*
Plus
    : '+' {count_Plus++; }
    ;

Minus
    : '-' {count_Minus++; }
    ;

Greater
    : '>' {count_Greater++; }
    ;

Comma
    : ',' {count_Comma++; }
    ;

Tilde
    : '~' {count_Tilde++; }
    ;
*/
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
/*
PrefixMatch
    : '^=' {count_PrefixMatch++; }
    ;

SuffixMatch
    : '$=' {count_SuffixMatch++; }
    ;

SubstringMatch
    : '*=' {count_SubStringMatch++; }
    ;
*/
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
/*
Calc
    : 'calc(' {count_Calc++; }
    ;
*/

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
/*
Var
    : 'var(' { counters.put("VAR", counters.get("VAR") != null ? counters.get("VAR") + 1 : 1); }
    ;
*/
// Give Ident least priority so that more specific rules matches first
Ident
    : '-'? Nmstart Nmchar*
    ;

Function
    : Ident '('
    ;


VAR: 'var('  { counters.put("VAR", counters.get("VAR") != null ? counters.get("VAR") + 1 : 1);  } ;
CHARSET: '@charset '  { counters.put("CHARSET", counters.get("CHARSET") != null ? counters.get("CHARSET") + 1 : 1);  } ;
SUBSTRINGMATCH: '*='  { counters.put("SUBSTRINGMATCH", counters.get("SUBSTRINGMATCH") != null ? counters.get("SUBSTRINGMATCH") + 1 : 1);  } ;
CALC: 'calc('  { counters.put("CALC", counters.get("CALC") != null ? counters.get("CALC") + 1 : 1);  } ;
PLUS: '+' { counters.put("PLUS", counters.get("PLUS") != null ? counters.get("PLUS") + 1 : 1);  } ;
MINUS: '-' { counters.put("MINUS", counters.get("MINUS") != null ? counters.get("MINUS") + 1 : 1);  } ;
SPACE: [\t\r\n\f ]+ { counters.put("SPACE", counters.get("SPACE") != null ? counters.get("SPACE") + 1 : 1);  } ;
HEX: [0-9a-fA-F]  { counters.put("HEX", counters.get("HEX") != null ? counters.get("HEX") + 1 : 1);  } ;
SUFFIXMATCH: '$='  { counters.put("SUFFIXMATCH", counters.get("SUFFIXMATCH") != null ? counters.get("SUFFIXMATCH") + 1 : 1);  } ;
CDO: '<!--'  { counters.put("CDO", counters.get("CDO") != null ? counters.get("CDO") + 1 : 1);  } ;
PREFIXMATCH: '^='  { counters.put("PREFIXMATCH", counters.get("PREFIXMATCH") != null ? counters.get("PREFIXMATCH") + 1 : 1);  } ;
CDC: '-->'  { counters.put("CDC", counters.get("CDC") != null ? counters.get("CDC") + 1 : 1);  } ;
INCLUDES: '~='  { counters.put("INCLUDES", counters.get("INCLUDES") != null ? counters.get("INCLUDES") + 1 : 1);  } ;
COMMA: ','  { counters.put("COMMA", counters.get("COMMA") != null ? counters.get("COMMA") + 1 : 1);  } ;
TILDE: '~'   { counters.put("TILDE", counters.get("TILDE") != null ? counters.get("TILDE") + 1 : 1);  } ;
GREATER: '>'  { counters.put("GREATER", counters.get("GREATER") != null ? counters.get("GREATER") + 1 : 1);  } ;
DASHMATCH: '|=' { counters.put("DASHMATCH", counters.get("DASHMATCH") != null ? counters.get("DASHMATCH") + 1 : 1);  } ;
OpenBracket:                    '[';
CloseBracket:                   ']';
OpenParen:                      '(';
CloseParen:                     ')';
OpenBrace:                      '{';
CloseBrace:                     '}';
SemiColon:                      ';';
Assign:                         '=';
Colon:                          ':';
BitOr:                          '|';
Divide:                         '/';
Multiply:                       '*';
At:                             '@';
Dot:                            '.';
Underscore:                     '_';
