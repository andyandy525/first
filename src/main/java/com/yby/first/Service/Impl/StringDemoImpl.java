package com.yby.first.Service.Impl;

import com.yby.first.Service.StringDemo;


public class StringDemoImpl implements StringDemo {
    @Override
    //通过character的两个api，isletterordigit（判断字符是否是数组或者字母），islowercase（把大写变成小写）
    public boolean demo(String s) {
        if (s.length() == 0){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (Character.isLowerCase(s.charAt(left)) != Character.isLowerCase(s.charAt(right))){
                return false;

            }
            left++;
            right--;
        }
        return true;
    }
}
