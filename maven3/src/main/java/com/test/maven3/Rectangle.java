package com.test.maven3;

import com.test.maven3.Enum.Enum1;
import com.test.maven3.interfaceTest.AtInterface;
import com.test.maven3.interfaceTest.Interface;
import com.test.maven3.interfaceTest.Interface2;


public class Rectangle extends Abstract implements Interface, Interface2 {
    private volatile boolean isSort = false;

    @AtInterface(hello = "d", world = "fsda", value = "fdsafdsafdsa") //注释类  貌似没用

    public void say() {
        System.out.println("say hello");
        System.out.print(Enum1.fdsafd.reason);
        this.isSort = true;

    }

    public static void main(String[] args) {
        Rectangle ta = new Rectangle(5, 6);
        ta.say();
    }


    public String myMethod() {
        return "";
    }

    float width;
    float height;

    public Rectangle(float w, float h) {
        width = w;
        height = h;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public String in() {
        return "";
    }

    public int fun() {
        return 0;
    }
}
