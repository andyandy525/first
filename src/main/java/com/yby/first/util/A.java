package com.yby.first.util;

public class A extends Thread{
    @Override
    public  void run(){
        Object o = new Object();
        Boolean asd = true;
        

        System.out.println("线程A" + Thread.currentThread().getName());
        synchronized (asd) {
            //while (true) {
                for (int i = 0; i < 10; i++) {

                    System.out.println(i);


                    if (this.isInterrupted()) {
                        System.out.println("线程停止");
                        System.out.println("当前线程状态" + this.isInterrupted());
                        break;
                    }
                }
           // }
        }
    }
}
