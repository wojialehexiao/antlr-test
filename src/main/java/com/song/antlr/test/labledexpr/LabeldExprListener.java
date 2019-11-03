package com.song.antlr.test.labledexpr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeldExprParser}.
 */
public interface LabeldExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeldExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LabeldExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeldExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LabeldExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeldExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(LabeldExprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeldExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(LabeldExprParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeldExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LabeldExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeldExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LabeldExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeldExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LabeldExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeldExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LabeldExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LabeldExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LabeldExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LabeldExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LabeldExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LabeldExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LabeldExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LabeldExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LabeldExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LabeldExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeldExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LabeldExprParser.IntContext ctx);
}