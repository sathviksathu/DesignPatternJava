package com.java.design.patterns.vending.machine.patterns.builder.exercise;

import java.util.ArrayList;
import java.util.List;

public class Code {
    //class info
    public String className;
    //variable info
    public List<Variables> memberVariables = new ArrayList<>();

    private final String openBracket = "{";
    private final String closeBracket = "}";
    private final String semiColon = ";";
    private final String lineSeperator = System.lineSeparator();
    private final String lineTabSpace = "\t";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class "+ className).append(openBracket).append(lineSeperator);

        for(Variables var : memberVariables){
            sb.append(lineTabSpace);
            sb.append("public "+var.getVarType()+ " "+var.getVarValue()).append(lineSeperator);
        }
        sb.append(closeBracket);
        return sb.toString();
    }
}
