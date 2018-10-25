package com.test.maven3.Enum;

public enum Enum1 {
    fdsafd(1); // 就是 实例化了一个 Enum1  并且 reason = 1

    public  final int reason;

    private Enum1(int reason) {
        this.reason = reason;

    }


}
