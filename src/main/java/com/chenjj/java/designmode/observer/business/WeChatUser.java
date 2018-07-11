package com.chenjj.java.designmode.observer.business;

import com.chenjj.java.designmode.observer.Observable;
import com.chenjj.java.designmode.observer.Subject;

/**
 * 微信用户
 */
public class WeChatUser implements User {

    private GongZhongHao gzh = null;

    private String userName;

    private WeChatUser(){}

    public WeChatUser(String _userName){
        this.userName = _userName;
    }


    private void readMessage(GongZhongHao gzh,String message){
        System.out.println("["+userName+"]收到公众号["+gzh.getName()+"]的消息："+message);
    }

    public void subscribe(GongZhongHao _gzh) {
        this.gzh = _gzh;
        gzh.registerObserver(this);
        System.out.println(userName + "关注了公众号["+gzh.getName()+"]");
    }

    public void unSubscribe(GongZhongHao gzh) {
        gzh.removeObserver(this);
        System.out.println(userName + "取消关注了公众号["+gzh.getName()+"]");
    }

    public void update(Subject observable, String message) {
        readMessage((GongZhongHao) observable,message);
    }
}
