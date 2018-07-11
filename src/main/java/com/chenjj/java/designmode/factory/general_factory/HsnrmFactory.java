package com.chenjj.java.designmode.factory.general_factory;

import com.chenjj.java.designmode.factory.product.NoodlesCooker;
import com.chenjj.java.designmode.factory.product.NoodlesCookerHSNRM;

/**
 * 红烧牛肉面工厂
 */
public class HsnrmFactory extends NoodlesCookerFactory {

    public NoodlesCooker create() {
        return new NoodlesCookerHSNRM();
    }

    public NoodlesCooker createLessPepper() {
        return new NoodlesCookerHSNRM(true);
    }
}
