package com.chenjj.java.designmode.adapt;

/**
 * 测试类
 */
public class Application {
    public static void main(String[] args) {
        //生产一个魅族手机
        MeizuMobile mz = new MeizuMobile(new MobileBatteryImpl(),new VoltageAdapterClass());
        System.out.println("生产一个魅族手机，指定手机电池、万能电源适配器(类)");
        //生产一个tinkpad笔记本电脑
        ThinkpadLaptop tk = new ThinkpadLaptop(new LaptopBatteryImpl(),new VoltageAdapterObject(new Voltage220()));
        System.out.println("生产一个Thinkpad笔记本电脑，制定笔记本电池、万能电源适配器（对象）");

        //运行了一段时间，手机，电脑都没电了，需要充电。
        //中国的标准电压是220V。
        System.out.println("高负载运行一段时间后...");
        System.out.println("手机、电脑提示：电池电量不足10%");

        //充电
        mz.charging();
        tk.charging();

    }
}
