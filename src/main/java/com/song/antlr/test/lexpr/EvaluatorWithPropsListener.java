package com.song.antlr.test.lexpr;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class EvaluatorWithPropsListener extends LexprBaseListener {

    ParseTreeProperty<Integer> values = new ParseTreeProperty<>();

    public void setValue(ParseTree node, int value){
        values.put(node, value);
    }

    public int getValue(ParseTree node){
        return values.get(node);
    }

    @Override
    public void exitInt(LexprParser.IntContext ctx) {
        String intText = ctx.INT().getText();
        System.out.println("#1#:" + intText);
        setValue(ctx, Integer.valueOf(intText));
    }

    @Override
    public void exitAdd(LexprParser.AddContext ctx) {
        System.out.println("#2#");
        int left = getValue(ctx.e(0));
        int right = getValue(ctx.e(1));
        setValue(ctx, left+right);
    }

    @Override
    public void exitMult(LexprParser.MultContext ctx) {
        System.out.println("#3#");
        int left = getValue(ctx.e(0));
        int right = getValue(ctx.e(1));
        setValue(ctx, left*right);
    }

    @Override
    public void exitS(LexprParser.SContext ctx) {
        System.out.println("#4#");
        setValue(ctx, getValue(ctx.e()));
    }
}
