package com.chenjj.java.designmode.observer.business;

import com.chenjj.java.designmode.observer.Observable;


/**
 * 公众号
 */
public abstract class GongZhongHao extends Observable {

    /**
     * 获取公众号的名字
     */
    public abstract String getName();

    /**
     * 发布消息
     * @param message
     */
    public abstract void publish(String message);
}
