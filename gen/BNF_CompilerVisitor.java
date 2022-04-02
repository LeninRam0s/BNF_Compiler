// Generated from I:/PROYECTOS JAVA/BNF_Compiler/src\BNF_Compiler.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BNF_CompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BNF_CompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BNF_CompilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore(BNF_CompilerParser.IgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(BNF_CompilerParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(BNF_CompilerParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(BNF_CompilerParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#operadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadores(BNF_CompilerParser.OperadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#simbolos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimbolos(BNF_CompilerParser.SimbolosContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#equivalente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalente(BNF_CompilerParser.EquivalenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(BNF_CompilerParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#while_T}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_T(BNF_CompilerParser.While_TContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#for_T}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_T(BNF_CompilerParser.For_TContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#if_T}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_T(BNF_CompilerParser.If_TContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BNF_CompilerParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNF_CompilerParser#else_T}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_T(BNF_CompilerParser.Else_TContext ctx);
}