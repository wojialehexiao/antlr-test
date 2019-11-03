package com.song.antlr.test.lexpr;

import org.antlr.v4.runtime.Token;

public class EvaluatorWithPropsVisitor extends LexprBaseVisitor<Integer> {

    @Override
    public Integer visitS(LexprParser.SContext ctx) {
        return visit(ctx.e());
    }

    @Override
    public Integer visitAdd(LexprParser.AddContext ctx) {
        Integer left = visit(ctx.e(0));
        Integer right = visit(ctx.e(1));
        Token symbol = ctx.ADD().getSymbol();
        return left + right;
    }

    @Override
    public Integer visitMult(LexprParser.MultContext ctx) {

        Integer left = visit(ctx.e(0));
        Integer right = visit(ctx.e(1));

        return left * right;
    }

    @Override
    public Integer visitInt(LexprParser.IntContext ctx) {
        String text = ctx.INT().getText();
        return Integer.parseInt(text);
    }
}
