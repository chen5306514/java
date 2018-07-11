package com.chenjj.java.designmode.observer.business;

import com.chenjj.java.designmode.observer.Observer;

/**
 * 用户接口
 */
public interface User extends Observer {
    /**
     * 关注公众号
     * @param gzh
     */
    public void subscribe(GongZhongHao gzh);

    /**
     * 取消关注公众号
     * @param gzh
     */
    public void unSubscribe(GongZhongHao gzh);
}
