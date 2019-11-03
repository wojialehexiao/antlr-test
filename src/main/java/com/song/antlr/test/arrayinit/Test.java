package com.song.antlr.test.arrayinit;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Test {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);

        ArrayInitLexer lexer = new ArrayInitLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree  tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new ShortToUnicodeString(), tree);

        System.out.println(tree.toStringTree(parser));
    }
}
