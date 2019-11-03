package com.song.antlr.test.lexpr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexprParser}.
 */
public interface LexprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexprParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(LexprParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexprParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(LexprParser.SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LexprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LexprParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LexprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LexprParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link LexprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(LexprParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link LexprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(LexprParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LexprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(LexprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LexprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(LexprParser.IntContext ctx);
}