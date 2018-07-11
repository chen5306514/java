package com.chenjj.java.designmode.factory.abstract_factory;

import com.chenjj.java.designmode.factory.abstract_factory.product.AbstractHunanNoodlesCooker;
import com.chenjj.java.designmode.factory.abstract_factory.product.AbstractSichuanNoodlesCooker;

/**
 * 广州工厂
 */
public class GuangZhouFactory extends AbstractNoodlesCookerFactory {

    public AbstractHunanNoodlesCooker createHunanNoodles() {
        return null;
    }

    public AbstractSichuanNoodlesCooker createSichuanNoodles() {
        return null;
    }
}
