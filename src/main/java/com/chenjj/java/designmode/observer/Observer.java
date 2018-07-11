package com.chenjj.java.designmode.observer;

/**
 * 观察者
 */
public interface Observer {

    /**
     * 接受消息
     * @param subject 发送消息的主题（当一个观察者订阅了多个主题，需要能够识别是哪个主题发送的消息）
     * @param message 被观察中发送的消息内容
     */
    public void update(Subject subject, String message);
}
