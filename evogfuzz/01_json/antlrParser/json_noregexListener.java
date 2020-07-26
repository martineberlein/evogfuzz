// Generated from json_noregex.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link json_noregexParser}.
 */
public interface json_noregexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#main_dummy_rule_hope_for_no_collisions}.
	 * @param ctx the parse tree
	 */
	void enterMain_dummy_rule_hope_for_no_collisions(json_noregexParser.Main_dummy_rule_hope_for_no_collisionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#main_dummy_rule_hope_for_no_collisions}.
	 * @param ctx the parse tree
	 */
	void exitMain_dummy_rule_hope_for_no_collisions(json_noregexParser.Main_dummy_rule_hope_for_no_collisionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(json_noregexParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(json_noregexParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(json_noregexParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(json_noregexParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(json_noregexParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(json_noregexParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(json_noregexParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(json_noregexParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(json_noregexParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(json_noregexParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(json_noregexParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(json_noregexParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(json_noregexParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(json_noregexParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(json_noregexParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(json_noregexParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#chars}.
	 * @param ctx the parse tree
	 */
	void enterChars(json_noregexParser.CharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#chars}.
	 * @param ctx the parse tree
	 */
	void exitChars(json_noregexParser.CharsContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#char_}.
	 * @param ctx the parse tree
	 */
	void enterChar_(json_noregexParser.Char_Context ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#char_}.
	 * @param ctx the parse tree
	 */
	void exitChar_(json_noregexParser.Char_Context ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(json_noregexParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(json_noregexParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#unescapedspecial}.
	 * @param ctx the parse tree
	 */
	void enterUnescapedspecial(json_noregexParser.UnescapedspecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#unescapedspecial}.
	 * @param ctx the parse tree
	 */
	void exitUnescapedspecial(json_noregexParser.UnescapedspecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#escapedspecial}.
	 * @param ctx the parse tree
	 */
	void enterEscapedspecial(json_noregexParser.EscapedspecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#escapedspecial}.
	 * @param ctx the parse tree
	 */
	void exitEscapedspecial(json_noregexParser.EscapedspecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#hextwobyte}.
	 * @param ctx the parse tree
	 */
	void enterHextwobyte(json_noregexParser.HextwobyteContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#hextwobyte}.
	 * @param ctx the parse tree
	 */
	void exitHextwobyte(json_noregexParser.HextwobyteContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#hexdigit}.
	 * @param ctx the parse tree
	 */
	void enterHexdigit(json_noregexParser.HexdigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#hexdigit}.
	 * @param ctx the parse tree
	 */
	void exitHexdigit(json_noregexParser.HexdigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#hexletter}.
	 * @param ctx the parse tree
	 */
	void enterHexletter(json_noregexParser.HexletterContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#hexletter}.
	 * @param ctx the parse tree
	 */
	void exitHexletter(json_noregexParser.HexletterContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(json_noregexParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(json_noregexParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#int_}.
	 * @param ctx the parse tree
	 */
	void enterInt_(json_noregexParser.Int_Context ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#int_}.
	 * @param ctx the parse tree
	 */
	void exitInt_(json_noregexParser.Int_Context ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#frac}.
	 * @param ctx the parse tree
	 */
	void enterFrac(json_noregexParser.FracContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#frac}.
	 * @param ctx the parse tree
	 */
	void exitFrac(json_noregexParser.FracContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(json_noregexParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(json_noregexParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(json_noregexParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(json_noregexParser.DigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(json_noregexParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(json_noregexParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#nonzerodigit}.
	 * @param ctx the parse tree
	 */
	void enterNonzerodigit(json_noregexParser.NonzerodigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#nonzerodigit}.
	 * @param ctx the parse tree
	 */
	void exitNonzerodigit(json_noregexParser.NonzerodigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link json_noregexParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(json_noregexParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link json_noregexParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(json_noregexParser.EContext ctx);
}