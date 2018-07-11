package com.chenjj.java.designmode.factory.product;

/**
 * 制作榨菜肉丝面
 */
public class NoodlesCookerZCRSM implements NoodlesCooker {

    private boolean lessPepper;//是否少辣

    public NoodlesCookerZCRSM(){

    }

    public NoodlesCookerZCRSM(boolean lessPepper){
        this.lessPepper = lessPepper;
    }

    public void make() {
        if (lessPepper){
            System.out.println("一碗经典榨菜肉丝面出炉(少辣)出炉");
        }else {
            System.out.println("一碗经典榨菜肉丝面出炉");
        }

    }
}
