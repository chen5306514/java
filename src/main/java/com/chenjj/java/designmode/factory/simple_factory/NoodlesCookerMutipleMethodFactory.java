package com.chenjj.java.designmode.factory.simple_factory;

import com.chenjj.java.designmode.factory.product.NoodlesCooker;
import com.chenjj.java.designmode.factory.product.NoodlesCookerHSNRM;
import com.chenjj.java.designmode.factory.product.NoodlesCookerZCRSM;

/**
 * 面条烹饪工厂
 *
 * <br>把if else交给调用方 -- 多方法静态工厂
 * <br>java.util.concurrent.Executors就是一个多方法静态工厂
 * 如果我想吃少辣的红烧牛肉面，新加一个方法即可
 * 如果我想新增一个清汤面，新加一个方法即可
 * 开闭原则，修改的粒度越大越好，修改粒度：方法修改<方法新增<类新增
 */
public class NoodlesCookerMutipleMethodFactory {

    public static NoodlesCooker createHSNRM(){
        return new NoodlesCookerHSNRM();
    }

    public static NoodlesCooker createHSNRMlessPepper(){
        return new NoodlesCookerHSNRM(true);
    }

    public static NoodlesCooker createZCRSM(){
        return new NoodlesCookerZCRSM();
    }
}
