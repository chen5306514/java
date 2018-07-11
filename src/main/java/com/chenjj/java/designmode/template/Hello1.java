package com.chenjj.java.designmode.template;

public class Hello1 extends AbstractTemplate {

    @Override
    public void doSomething() {
        System.out.println("Hello" + getName() +",我已经重载的父类方法了！");
    }

    public String getName() {
        return "cjj";
    }
}
