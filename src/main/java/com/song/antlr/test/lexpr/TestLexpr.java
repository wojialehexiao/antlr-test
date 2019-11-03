package com.song.antlr.test.lexpr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;


public class TestLexpr {



    public static void main(String[] args) throws IOException {
        testVisitor(getTree());
//        testListner(getTree());
    }

    public static ParseTree getTree() throws IOException {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);

        LexprLexer lexer = new LexprLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LexprParser parser = new LexprParser(tokens);

        return  parser.e();
    }

    public static void testListner(ParseTree tree) throws IOException {

        ParseTreeWalker walker = new ParseTreeWalker();

        EvaluatorWithPropsListener evaluatorWithProps = new EvaluatorWithPropsListener();
        walker.walk(evaluatorWithProps, tree);

        System.out.println(evaluatorWithProps.getValue(tree));
    }



    public static void testVisitor(ParseTree tree) throws IOException {

        EvaluatorWithPropsVisitor visitor = new EvaluatorWithPropsVisitor();

        Integer result = visitor.visit(tree);
        System.out.println(result);
    }




}
