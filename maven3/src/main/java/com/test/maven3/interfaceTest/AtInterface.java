package com.test.maven3.interfaceTest;

public @interface AtInterface {

    public String value() default "aaa";

    String hello() default "ttitfly";

    String world();


}
