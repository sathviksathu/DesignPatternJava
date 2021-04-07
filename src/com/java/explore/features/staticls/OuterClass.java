package com.java.explore.features.staticls;

public class OuterClass  {

    private static MethodCls methodCls;
    private static InnerStaticClass innerStaticClass;

    public static void main(String[] args) {
       methodCls = new MethodCls();
       innerStaticClass = new InnerStaticClass();
       methodCls.printString(innerStaticClass);
       methodCls.printString(getInnerClassInstance());
    }


    public static class InnerStaticClass implements DummyInterface{
        @Override
        public String getString() {
            return InnerStaticClass.class.getName();
        }
    }

    public static class InnerClass implements DummyInterface{

        @Override
        public String getString() {
            return InnerClass.class.getName();
        }
    }

    public static InnerClass getInnerClassInstance(){
        return new InnerClass();
    }

}
