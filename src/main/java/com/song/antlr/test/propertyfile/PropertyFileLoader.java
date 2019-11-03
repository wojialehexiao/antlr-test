package com.song.antlr.test.propertyfile;

import org.antlr.v4.runtime.Token;

import java.util.LinkedHashMap;
import java.util.Map;

public class PropertyFileLoader extends PropertyFileBaseListener {

    Map<String, String> props = new LinkedHashMap<>();

    @Override
    public void exitProp(PropertyFileParser.PropContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();
        Token symbol = ctx.STRING().getSymbol();
        props.put(id,value);
    }
}
