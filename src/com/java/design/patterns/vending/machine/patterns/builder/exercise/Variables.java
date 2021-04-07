package com.java.design.patterns.vending.machine.patterns.builder.exercise;

public class Variables {
    private String varType;
    private String varValue;

    public Variables(String varType, String varValue) {
        this.varType = varType;
        this.varValue = varValue;
    }

    public String getVarType() {
        return varType;
    }

    public String getVarValue() {
        return varValue;
    }
}
