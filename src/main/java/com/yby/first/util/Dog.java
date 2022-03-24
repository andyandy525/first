package com.yby.first.util;

public class Dog extends Animal{
    String name = "小狗";
    static int age = 60;
    public void eat() {
        System.out.println("小狗可以吃饭");
    }
    public static void sleep() {
        System.out.println("小狗可以睡觉");
    }
    public void watchdog() {
        System.out.println("小狗可以看门");
    }

}
