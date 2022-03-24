package com.yby.first.util;

public class Date {
    int year;
    int month;
    int day;
    public Date(int x, int y, int z){
        this.year = x;
        this.month = y;
        this.day = z;
    }
    public void showDate(){
        System.out.println(year+month+day);
    }
    public int showtest(){
        return year;
    }
}
