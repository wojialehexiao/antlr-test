package com.song.antlr.test.labledexpr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Clac {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);

        LabeldExprLexer lexer = new LabeldExprLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LabeldExprParser parser = new LabeldExprParser(tokens);

        ParseTree  tree = parser.prog();

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);

        System.out.println(tree.toStringTree(parser));
    }
}
