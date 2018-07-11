package com.chenjj.java.designmode.observer;

/**
 * 主题
 */
public interface Subject {
    /**
     * 添加观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    public void notifyObserver(String message);

}
