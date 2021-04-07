package com.java.design.patterns.patterns.builder.exercise;

public class VariableCodeBuilder extends CodeBuilder {

    public VariableCodeBuilder(Code code) {
        this.code = code;
    }

    public VariableCodeBuilder addField(String varType, String varName){
       code.memberVariables.add(new Variables(varType,varName));
       return this;
    }
}
