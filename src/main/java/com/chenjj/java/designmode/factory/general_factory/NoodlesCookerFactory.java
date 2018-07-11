package com.chenjj.java.designmode.factory.general_factory;

import com.chenjj.java.designmode.factory.product.NoodlesCooker;

public abstract class NoodlesCookerFactory {


    /**
     * 自定义烹饪
     * @param pepperLessMore 辣椒less/more
     * @param saltLessMore 盐less/more
     */
    public NoodlesCooker makeByCustmor(String pepperLessMore,String saltLessMore){
        if ("".equalsIgnoreCase(pepperLessMore) && "".equalsIgnoreCase(saltLessMore)){
            System.out.println("客户没有选择辣椒/盐的调量");
            return create();
        }else if("less".equalsIgnoreCase(pepperLessMore) && "".equalsIgnoreCase(saltLessMore)){
            System.out.println("客户选择了少辣椒");
            return createLessPepper();
        }


        return  null;
    }


    public abstract NoodlesCooker create();

    public abstract NoodlesCooker createLessPepper();
}
