package com.song.antlr.test.json;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class XmlEmitter extends JSONBaseListener {

    ParseTreeProperty<String> xml = new ParseTreeProperty<>();

    String stripQuotes(String source){
        return source.replace("\"","");
    }

    String getXml(ParseTree ctx){
        return xml.get(ctx);
    }

    void setXML(ParseTree ctx, String s){
        xml.put(ctx,s);
    }

    @Override
    public void exitAtom(JSONParser.AtomContext ctx) {
        setXML(ctx, ctx.getText());
    }

    @Override
    public void exitString(JSONParser.StringContext ctx) {
        setXML(ctx, stripQuotes(ctx.getText()));
    }


    @Override
    public void exitObjectValue(JSONParser.ObjectValueContext ctx) {
        setXML(ctx, getXml(ctx.object()));
    }

    @Override
    public void exitPair(JSONParser.PairContext ctx) {
        String tag = stripQuotes(ctx.STRING().getText());
        JSONParser.ValueContext vctx = ctx.value();
        String x = String.format("<%s>%s</%s>\n", tag, getXml(vctx), tag);
        setXML(ctx,x);
    }

    @Override
    public void exitAnObject(JSONParser.AnObjectContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("\n");
        for (JSONParser.PairContext pairContext : ctx.pair()) {
            buf.append(getXml(pairContext));
        }

        setXML(ctx, buf.toString());
    }

    @Override
    public void exitEmptyObject(JSONParser.EmptyObjectContext ctx) {
        setXML(ctx, "");
    }

    @Override
    public void exitArrayOfValues(JSONParser.ArrayOfValuesContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("\n");

        for (JSONParser.ValueContext valueContext : ctx.value()) {

            buf.append("<element>");
            buf.append(getXml(valueContext));
            buf.append("</element>");
            buf.append("\n");
        }
        setXML(ctx, buf.toString());
    }

    @Override
    public void exitEmptyArray(JSONParser.EmptyArrayContext ctx) {
        setXML(ctx, "");
    }

    @Override
    public void exitJson(JSONParser.JsonContext ctx) {
        String xml = getXml(ctx.getChild(0));
        setXML(ctx, String.format("<project>%s</project>\n",xml));
    }


}
