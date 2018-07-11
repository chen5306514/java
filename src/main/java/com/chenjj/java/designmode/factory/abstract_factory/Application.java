package com.chenjj.java.designmode.factory.abstract_factory;

public class Application {
    public static void main(String[] args) {
        System.out.println("使用广州造的面条烹饪机烹饪湖南口味的面条");
        AbstractNoodlesCookerFactory factory = new GuangZhouFactory();
        factory.createHunanNoodles().make();

        System.out.println("使用深圳造的面条烹饪机烹饪湖南口味的面条");
        AbstractNoodlesCookerFactory factorySZ = new ShenZhenFactory();
        factorySZ.createHunanNoodles().make();
    }
}
