package com.java.design.patterns.vending.machine.patterns.builder.exercise;

public class ClassCodeBuilder extends CodeBuilder {
    public ClassCodeBuilder(Code code) {
        this.code = code;
    }

    public ClassCodeBuilder withClassName(String className){
        code.className = className;
        return this;
    }

}
