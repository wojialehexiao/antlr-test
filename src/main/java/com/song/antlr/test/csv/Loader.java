package com.song.antlr.test.csv;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Loader extends CSVBaseListener {

    public static final String EMPTY = "";

    List<Map<String, String>> rows = new ArrayList<>();

    List<String> header;

    List<String> currentRowFieldValues;

    @Override
    public void exitText(CSVParser.TextContext ctx) {

        System.out.println("exitText");
        currentRowFieldValues.add(ctx.TEXT().getText());
    }

    @Override
    public void exitString(CSVParser.StringContext ctx) {
        System.out.println("exitString");
        currentRowFieldValues.add(ctx.STRING().getText());
    }

    @Override
    public void exitEmpty(CSVParser.EmptyContext ctx) {
        System.out.println("exitEmpty");
        currentRowFieldValues.add(EMPTY);
    }

    @Override
    public void exitHdr(CSVParser.HdrContext ctx) {
        System.out.println("exitHdr");
        header = new ArrayList<>();
        header.addAll(currentRowFieldValues);
    }

    @Override
    public void enterHdr(CSVParser.HdrContext ctx) {
        System.out.println("enterHdr");
    }

    @Override
    public void enterRow(CSVParser.RowContext ctx) {
        System.out.println("enterRow");
        currentRowFieldValues = new ArrayList<>();
    }

    @Override
    public void exitRow(CSVParser.RowContext ctx) {
        System.out.println("exitRow");
        if(ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr){
            return;
        }

        Map<String,String> m = new LinkedHashMap<>();
        int i = 0;

        for (String value : currentRowFieldValues) {
            m.put(header.get(i), value);
            i++;
        }
        rows.add(m);
    }
}
