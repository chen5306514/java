package com.chenjj.java.designmode.factory.abstract_factory;

import com.chenjj.java.designmode.factory.abstract_factory.product.AbstractHunanNoodlesCooker;
import com.chenjj.java.designmode.factory.abstract_factory.product.AbstractSichuanNoodlesCooker;
import com.chenjj.java.designmode.factory.product.NoodlesCooker;

public abstract class AbstractNoodlesCookerFactory {

    /**
     * 湖南面条烹饪
     * @return
     */
    public abstract AbstractHunanNoodlesCooker createHunanNoodles();

    /**
     * 四川面条烹饪
     * @return
     */
    public abstract AbstractSichuanNoodlesCooker createSichuanNoodles();

}
