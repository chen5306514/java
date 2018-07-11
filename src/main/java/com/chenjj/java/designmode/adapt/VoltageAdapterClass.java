package com.chenjj.java.designmode.adapt;

/**
 * 电压适配器(类适配器模式--适配器继承Src)
 */
public class VoltageAdapterClass extends Voltage220 implements Voltage5,Voltage20 {

    public int output5V() {
        int src = output220V();
        int dst = src/44;
        System.out.println("适配器将电压从"+src+"V转换成"+dst+"V");
        return dst;
    }

    public int output20V() {
        int src = output220V();
        int dst = src/11;
        System.out.println("适配器将电压从"+src+"V转换成"+dst+"V");
        return dst;
    }
}
