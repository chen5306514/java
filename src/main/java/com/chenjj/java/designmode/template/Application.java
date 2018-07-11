package com.chenjj.java.designmode.template;

public class Application {
    public static void main(String[] args) {
        AbstractTemplate template = new Hello();
        template.doSomething();

        AbstractTemplate template1 = new Hello1();
        template1.doSomething();
    }
}
