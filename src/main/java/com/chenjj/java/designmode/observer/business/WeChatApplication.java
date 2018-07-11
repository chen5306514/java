package com.chenjj.java.designmode.observer.business;


import java.util.Observable;

/**
 * 微信应用
 */
public class WeChatApplication {

    public static void main(String[] args) {
        System.out.println("服务运行中...");

        //房产资讯公众号定义
        GongZhongHao fczx = new WeChatGZH("房产资讯公众号");
        //股票行情公众号定义
        GongZhongHao gphq = new WeChatGZH("股票行情公众号");

        //用户张三定义
        User zhangsan = new WeChatUser("张三");
        //用户李四定义
        User lisi = new WeChatUser("李四");

        //用户张三关注房产资讯，股票行情
        zhangsan.subscribe(fczx);
        zhangsan.subscribe(gphq);

        //用户李四关注股票行情
        lisi.subscribe(gphq);

        //股票行情发布消息
        gphq.publish("今天上证指数大跌3%,投资者情绪低落。");
        zhangsan.unSubscribe(gphq);
        gphq.publish("专家称明天上证指数或呈报复性反弹。");
        fczx.publish("专家称有望在2019年底征收房产税");


    }
}
