package com.song.antlr.test.labledexpr;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeldExprBaseVisitor<Integer> {

    Map<String, Integer> memory = new HashMap<>();

    @Override
    public Integer visitProg(LabeldExprParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Integer visitPrintExpr(LabeldExprParser.PrintExprContext ctx) {

        Integer value = visit(ctx.expr());
        System.out.println(value);
        return 0;
    }

    @Override
    public Integer visitAssign(LabeldExprParser.AssignContext ctx) {

        String id = ctx.ID().getText();
        Integer value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitBlank(LabeldExprParser.BlankContext ctx) {
        return super.visitBlank(ctx);
    }

    @Override
    public Integer visitParens(LabeldExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitMulDiv(LabeldExprParser.MulDivContext ctx) {

        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));
        if(ctx.op.getType() == LabeldExprParser.MUL){
            return left * right;
        }
        return left / right;
    }

    @Override
    public Integer visitAddSub(LabeldExprParser.AddSubContext ctx) {

        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));
        if(ctx.op.getType() == LabeldExprParser.ADD){
            return left + right;
        }
        return left - right;
    }

    @Override
    public Integer visitId(LabeldExprParser.IdContext ctx) {

        String id = ctx.ID().getText();
        if(memory.containsKey(id)){
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitInt(LabeldExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }
}
