package com.chenjj.java.designmode.adapt;

public class LaptopBatteryImpl implements LaptopBattery{
    public void charging(Voltage20 v20) {
        int v = v20.output20V();
        if (v==20){
            System.out.println("电压输入20V,笔记本电池充电中...");
        }else{
            System.out.println("电压输入不是20V,笔记本电池无法充电");
        }
    }
}
