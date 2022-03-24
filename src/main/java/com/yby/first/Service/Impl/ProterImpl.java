package com.yby.first.Service.Impl;

import com.yby.first.Proxey.Teacher;
import com.yby.first.Service.proterService;
import com.yby.first.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class ProterImpl implements proterService {




    @Async
    public void run(int i) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("111111111111");
//            }
//        };
//        runnable.run();
        //System.out.println("线程" + Thread.currentThread().getName() + " 执行异步任务：" + i);
//        while(true){
//            for (int k = 0; k < 10; k++){
//                for (int j = 0; j < 20; j++){
//                    int w = k + j;
//                    System.out.println("线程" + Thread.currentThread().getName() + "         W:" + w);
//                }
//            }
//        }
//        int c = 9;
//        int a = c / 3;
//        int b = c % 3;
//        System.out.println(a + "  " + b + Thread.currentThread().getName());
//        List<String> list = new ArrayList<>();
//        list.add("111");
//        list.add("222");
//        list.add("333");
//        for (int j=0; j< list.size();j++){
//            System.out.println(list.get(j));
//        }
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.set()
//        System.out.println(arrayList);

        A a = new A();
        B b = new B();
        C c = new C();
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("线程开始：" + Thread.currentThread().getName());
//                    a.run();
//                    b.run();
//                    try{
//                        Thread.sleep(1000);
//                        c.run();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//            a.start();
//        Animal am = new Dog();
//
//        am.eat();
//        am.sleep();
//        am.run();
//        System.out.println(am.);
//        System.out.println(((Dog) am).age);

        Test1 one = new Test1();
        Test1 two = new Test1();
        Person person = new Person();

        //Test1.b = 0.2;
        StringBuffer buffer = new StringBuffer();
        buffer.append("a").append("b").insert(1,"c");
        System.out.println(one.a);
        System.out.println(one.b);

        System.out.println(two.a);
        System.out.println(two.b);


            //a.interrupt();
        Teacher teacher = new Teacher();
        teacher.setTeacher("dddaaasssdddaaa",2,3,5);
        teacher.getDate().showDate();
        System.out.println(teacher.getName());
        System.out.println(teacher.getDate().showtest());




//        Iterator<String> iterator = list.iterator();
//        //System.out.println(iterator.next());
//        while (iterator.hasNext()){
//            System.out.println(iterator.next() + Thread.currentThread().getName());
//        }


    }
    static class Test1 {
        final double a = Math.random();
        static double b = Math.random();
    }
}

