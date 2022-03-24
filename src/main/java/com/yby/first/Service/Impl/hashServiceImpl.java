package com.yby.first.Service.Impl;

import com.yby.first.Service.hashservice;


public class hashServiceImpl implements hashservice {
    @Override
    public void test01() {

    }

    @Override
    //创建26个数组，通过哈希表进行对各个数字的数量统计。
    //目前还没有弄明白为什么是.charAt() - 'a'
    public boolean test(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        String asd = NAME;
        int[] leetcount = new int[26];
        for (int i = 0; i< s.length(); i++)
            leetcount[s.charAt(i) - 'a']++;
        for (int i=0;i< t.length();i++)
            leetcount[t.charAt(i) - 'a']--;
        for (int count:leetcount)
            if (count != 0)
                return false;
            return true;
    }
}
