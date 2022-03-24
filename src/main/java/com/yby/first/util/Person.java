package com.yby.first.util;

import com.yby.first.config.AbstractPerson;

public class Person extends AbstractPerson {
    @Override
    public void show() {
        System.out.println("1111");
        String s1 = "asd";
        s1 = "dsa";
        System.out.println(s1);
    }
}
