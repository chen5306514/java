package com.chenjj.java.designmode.factory.simple_factory;

import com.chenjj.java.designmode.factory.product.NoodlesCookerType;

public class Application {
    public static void main(String[] args) {


        //单方法简单工厂
        System.out.println("购买了一个面条烹饪机NoodlesCookerSingleMethodFactory");
        System.out.println("想吃红烧牛肉面");
        NoodlesCookerSingleMethodFactory.create(NoodlesCookerType.HSNRM).make();
        System.out.println("好辣...重新做一碗不辣的");
        System.out.println("臣妾做不到");
        System.out.println("想吃榨菜肉丝面");
        NoodlesCookerSingleMethodFactory.create(NoodlesCookerType.ZCRSM).make();

        System.out.println("---------------------------------------------------");

        //多方法简单工厂
        System.out.println("之前的不好用，又购买了一个面条烹饪机NoodlesCookerMutipleMethodFactory");
        System.out.println("想吃红烧牛肉面");
        NoodlesCookerMutipleMethodFactory.createHSNRM().make();
        System.out.println("好辣...重新做一碗不辣的");
        NoodlesCookerMutipleMethodFactory.createHSNRMlessPepper().make();
        System.out.println("想吃榨菜肉丝面");
        NoodlesCookerSingleMethodFactory.create(NoodlesCookerType.ZCRSM).make();

    }
}
