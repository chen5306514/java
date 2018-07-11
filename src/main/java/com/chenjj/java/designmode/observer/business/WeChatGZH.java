package com.chenjj.java.designmode.observer.business;

import com.chenjj.java.designmode.observer.Observer;

import java.util.Vector;

/**
 * 微信公众号
 */
public class WeChatGZH extends GongZhongHao {

    private String gzhName = null;

    private WeChatGZH(){}

    public WeChatGZH(String name){
        this.gzhName = name;
    }

    public String getName() {
        return gzhName;
    }

    public void publish(String message) {
        System.out.println("公众号["+getName() +"]发布了消息:"+message);
        notifyObserver(message);
    }
}
