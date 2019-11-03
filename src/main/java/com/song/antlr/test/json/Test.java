package com.song.antlr.test.json;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Test {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);

        JSONLexer lexer = new JSONLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);


        JSONParser parser = new JSONParser(tokens);

        ParseTree  tree = parser.json();

        ParseTreeWalker walker = new ParseTreeWalker();

        XmlEmitter loader = new XmlEmitter();
        walker.walk(loader, tree);

        System.out.println(loader.getXml(tree));

    }
}
