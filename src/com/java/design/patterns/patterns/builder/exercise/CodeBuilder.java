package com.java.design.patterns.patterns.builder.exercise;

public class CodeBuilder {
    protected Code code = new Code();

    public ClassCodeBuilder classBuilder(){
        return new ClassCodeBuilder(code);
    }

    public VariableCodeBuilder variableBuilder(){
        return new VariableCodeBuilder(code);
    }

    public Code build(){
        return code;
    }
}
