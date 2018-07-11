package com.chenjj.java.designmode.adapt;

/**
 * 电压适配器(对象配器模式--适配器引用Src)
 */
public class VoltageAdapterObject implements Voltage5,Voltage20 {

    private Voltage220 v220;

    public VoltageAdapterObject(Voltage220 v220){
        this.v220 = v220;
    }

    public int output5V() {
        int src = v220.output220V();
        int dst = src/44;
        System.out.println("适配器将电压从"+src+"V转换成"+dst+"V");
        return dst;
    }

    public int output20V() {
        int src = v220.output220V();
        int dst = src/11;
        System.out.println("适配器将电压从"+src+"V转换成"+dst+"V");
        return dst;
    }
}
