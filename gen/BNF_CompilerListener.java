// Generated from I:/PROYECTOS JAVA/BNF_Compiler/src\BNF_Compiler.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BNF_CompilerParser}.
 */
public interface BNF_CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BNF_CompilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BNF_CompilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(BNF_CompilerParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(BNF_CompilerParser.IgnoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(BNF_CompilerParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(BNF_CompilerParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(BNF_CompilerParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(BNF_CompilerParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(BNF_CompilerParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(BNF_CompilerParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#operadores}.
	 * @param ctx the parse tree
	 */
	void enterOperadores(BNF_CompilerParser.OperadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#operadores}.
	 * @param ctx the parse tree
	 */
	void exitOperadores(BNF_CompilerParser.OperadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#simbolos}.
	 * @param ctx the parse tree
	 */
	void enterSimbolos(BNF_CompilerParser.SimbolosContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#simbolos}.
	 * @param ctx the parse tree
	 */
	void exitSimbolos(BNF_CompilerParser.SimbolosContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#equivalente}.
	 * @param ctx the parse tree
	 */
	void enterEquivalente(BNF_CompilerParser.EquivalenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#equivalente}.
	 * @param ctx the parse tree
	 */
	void exitEquivalente(BNF_CompilerParser.EquivalenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(BNF_CompilerParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(BNF_CompilerParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#while_T}.
	 * @param ctx the parse tree
	 */
	void enterWhile_T(BNF_CompilerParser.While_TContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#while_T}.
	 * @param ctx the parse tree
	 */
	void exitWhile_T(BNF_CompilerParser.While_TContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#for_T}.
	 * @param ctx the parse tree
	 */
	void enterFor_T(BNF_CompilerParser.For_TContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#for_T}.
	 * @param ctx the parse tree
	 */
	void exitFor_T(BNF_CompilerParser.For_TContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#if_T}.
	 * @param ctx the parse tree
	 */
	void enterIf_T(BNF_CompilerParser.If_TContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#if_T}.
	 * @param ctx the parse tree
	 */
	void exitIf_T(BNF_CompilerParser.If_TContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BNF_CompilerParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BNF_CompilerParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNF_CompilerParser#else_T}.
	 * @param ctx the parse tree
	 */
	void enterElse_T(BNF_CompilerParser.Else_TContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNF_CompilerParser#else_T}.
	 * @param ctx the parse tree
	 */
	void exitElse_T(BNF_CompilerParser.Else_TContext ctx);
}