package com.song.antlr.test.lexpr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexprParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(LexprParser.SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LexprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LexprParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link LexprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(LexprParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LexprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LexprParser.IntContext ctx);
}