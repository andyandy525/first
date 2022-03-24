package com.yby.first.util;

public class C extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("进程" + Thread.currentThread().isAlive());
    }

}
