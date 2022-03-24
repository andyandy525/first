package com.yby.first.util;

public class B implements Runnable {
    @Override
    public void run() {
        System.out.println("线程B" + Thread.currentThread().getName());

    }
}
