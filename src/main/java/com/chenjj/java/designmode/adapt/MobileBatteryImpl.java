package com.chenjj.java.designmode.adapt;

public class MobileBatteryImpl implements MobileBattery{

    public void charging(Voltage5 v5) {
        int v = v5.output5V();
        if(v==5){
            System.out.println("输入电压5V，魅族手机充电中...");
        }else{
            System.out.println("输入电压不是5V，魅族手机无法充电");
        }
    }
}
