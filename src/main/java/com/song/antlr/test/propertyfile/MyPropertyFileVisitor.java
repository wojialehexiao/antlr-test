package com.song.antlr.test.propertyfile;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyPropertyFileVisitor extends PropertyFileBaseVisitor<Void> {

    Map<String, String> props = new LinkedHashMap<>();

    @Override
    public Void visitProp(PropertyFileParser.PropContext ctx) {

        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();
        props.put(id,value);

        return null;
    }
}
