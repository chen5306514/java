package com.chenjj.java.designmode.factory.general_factory;

public class Application {
    public static void main(String[] args) {
        //普通工厂
        System.out.println("想吃红烧牛肉面");
        NoodlesCookerFactory nrmFactory = new HsnrmFactory();
        nrmFactory.makeByCustmor("","").make();
        System.out.println("好辣...重新做一碗不辣的");
        nrmFactory.makeByCustmor("less","").make();
        System.out.println("想吃榨菜肉丝面");
        NoodlesCookerFactory zcrsmFactory = new ZcrsmFactory();
        zcrsmFactory.create().make();;

    }
}
