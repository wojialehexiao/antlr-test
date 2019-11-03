package com.song.antlr.test.propertyfile;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Test {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);

        PropertyFileLexer lexer = new PropertyFileLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);


        PropertyFileParser parser = new PropertyFileParser(tokens);

        ParseTree  tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();

        PropertyFileLoader loader = new PropertyFileLoader();
        walker.walk(loader, tree);

        System.out.println(loader.props);

        System.out.println("---------------------------");

        MyPropertyFileVisitor visitor = new MyPropertyFileVisitor();
        visitor.visit(tree);
        System.out.println(visitor.props);
    }
}
