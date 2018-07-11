package com.chenjj.java.designmode.factory.general_factory;

import com.chenjj.java.designmode.factory.product.NoodlesCooker;
import com.chenjj.java.designmode.factory.product.NoodlesCookerZCRSM;

/**
 * 榨菜肉丝面工厂
 */
public class ZcrsmFactory extends NoodlesCookerFactory {
    public NoodlesCooker create() {
        return new NoodlesCookerZCRSM();
    }

    public NoodlesCooker createLessPepper() {
        return new NoodlesCookerZCRSM(true);
    }
}
