package com.chenjj.java.designmode.template;

public abstract class AbstractTemplate {

    public void doSomething(){
        String name = getName();
        System.out.println("Hello: " + name);
    }

    public abstract String getName();

}
