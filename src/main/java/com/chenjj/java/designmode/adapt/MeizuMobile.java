package com.chenjj.java.designmode.adapt;

/**
 * 魅族手机
 */
public class MeizuMobile {
    private MobileBattery battery;
    private Voltage5 v5;

    private MeizuMobile(){}

    public MeizuMobile(MobileBattery b,Voltage5 v){
        this.battery = b;
        this.v5 = v;
    }

    public void charging(){
        System.out.println("魅族手机准备充电");
        battery.charging(v5);
    }
}
