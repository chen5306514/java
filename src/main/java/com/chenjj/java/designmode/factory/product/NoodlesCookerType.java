package com.chenjj.java.designmode.factory.product;

/**
 * 面条口味枚举
 */
public enum NoodlesCookerType {
    HSNRM("红烧牛肉面"),
    ZCRSM("榨菜肉丝面");//分号结束

    private String desc;

    private NoodlesCookerType(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
