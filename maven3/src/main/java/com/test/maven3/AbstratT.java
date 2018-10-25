package com.test.maven3;


public abstract class AbstratT<I> extends CommonClass {
    // 意思就是 继承（Class import I）   的 一个class
    protected AbstratT(Class<? extends I> inboundMessageType) {


    }

    public AbstratT() {
    }
    public abstract String test();
}
