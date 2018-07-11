package com.chenjj.java.designmode.factory.product;

/**
 * 制作红烧牛肉面
 */
public class NoodlesCookerHSNRM implements NoodlesCooker {

    private boolean lessPepper;//是否少辣

    public NoodlesCookerHSNRM(){

    }

    public NoodlesCookerHSNRM(boolean lessPepper){
        this.lessPepper = lessPepper;
    }

    public void make() {
        if (lessPepper){
            System.out.println("一碗经典红烧牛肉面(少辣)出炉");
        }else {
            System.out.println("一碗经典红烧牛肉面出炉");
        }

    }
}
