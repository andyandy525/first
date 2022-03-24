package com.yby.first.Proxey;

import com.yby.first.util.Date;

public class Teacher {

    String name;
    Date date;

    public void  setTeacher(String t1,int x,int y,int z){
        name = t1;
        date = new Date(x, y, z);
    }


    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
