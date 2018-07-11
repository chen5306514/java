package com.chenjj.java.designmode.adapt;

public class ThinkpadLaptop{
    private LaptopBattery battery;
    private Voltage20 v20;

    private ThinkpadLaptop(){}

    public ThinkpadLaptop(LaptopBattery b,Voltage20 v){
        this.battery = b;
        this.v20 = v;
    }

    public void charging(){
        System.out.println("Thinkpad电脑准备充电");
        battery.charging(v20);
    }
}
