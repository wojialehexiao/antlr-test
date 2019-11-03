package com.song.antlr.test.csv;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Test {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);

        CSVLexer lexer = new CSVLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CSVParser parser = new CSVParser(tokens);

        ParseTree  tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();


        Loader loader = new Loader();
        walker.walk(loader, tree);

        System.out.println(loader.rows);
    }
}
