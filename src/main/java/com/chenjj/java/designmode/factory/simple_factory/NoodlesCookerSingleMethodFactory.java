package com.chenjj.java.designmode.factory.simple_factory;

import com.chenjj.java.designmode.factory.product.NoodlesCooker;
import com.chenjj.java.designmode.factory.product.NoodlesCookerHSNRM;
import com.chenjj.java.designmode.factory.product.NoodlesCookerType;
import com.chenjj.java.designmode.factory.product.NoodlesCookerZCRSM;

/**
 * 面条烹饪工厂
 *
 * <br>把if else交给自己 -- 单静态方法工厂
 *
 * <br>特点<br>
 * 1 它是一个具体的类，非接口 抽象类。有一个重要的create()方法，利用if或者 switch创建产品并返回。<br>
 * 2 create()方法通常是静态的，所以也称之为静态工厂。<br>
 * 缺点<br>
 * 1 扩展性差（我想增加一种面条，除了新增一个面条产品类，还需要修改工厂类方法，违背了开闭原则）<br>
 * 2 不同的产品需要不同额外参数的时候 不支持。<br>
 */
public class NoodlesCookerSingleMethodFactory {
    /**
     * 提供面条烹饪
     * @param noodlesType 面条类型
     * @return
     */
    public static NoodlesCooker create(NoodlesCookerType noodlesType){
        //如果我想吃少辣的红烧牛肉面，就无法生产(除非修改方法签名)
        //如果我想新增一个清汤面，需要修改此方法
        switch (noodlesType){
            case HSNRM:return new NoodlesCookerHSNRM();
            case ZCRSM:return new NoodlesCookerZCRSM();
            default: return  null;
        }

    }
}
