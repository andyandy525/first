package com.yby.first.Controller;

import com.yby.first.Service.Impl.ProterImpl;
import com.yby.first.Service.hashservice;
import com.yby.first.Service.proterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

@RestController
@RequestMapping("test")
public class ProController {
    @Autowired
    private proterService proterService;

    private hashservice hashservices;

    //public int[] nums1 = {1,3,5,6};

    //两个数组的交集(通过比较后放入list中，最后再转成数组）
    @RequestMapping("demo")
    public int[] test(){
        int[] nums1 = {10,2,5,6};
        Arrays.sort(nums1);
        int [] nums2 = {2,5,9,4};
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else {
                arrayList.add(nums1[i]);
                i++;
                j++;
            }
        }
        int index=0;
        int[] res = new int[arrayList.size()];
        for (int k=0; k< arrayList.size(); k++){
            res[index++] = arrayList.get(k);
        }
        return res;

    }

    //两个数组的交集（通过hashmap方式进行比较）
    //hashmap.put(key,value)插入数据，，，，，，hashmap.getOrDefault( xxx, defaultValue)判断hashmap中是否有xxx，没有就是用默认值defaultValue.
    @RequestMapping("hashmap")
    public int[] test1(){
        int[] nums1 = new int[4];
        nums1 = new int[]{10, 2, 4, 5};
        int [] nums2 = {2,6,9,4};
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<nums1.length;i++){
            hashMap.put(nums1[i],hashMap.getOrDefault(nums1[i],0)+1);
        }
        for (int i=0; i<nums2.length;i++){
            if (hashMap.getOrDefault(nums2[i],0)> 0){
                arrayList.add(nums2[i]);
                hashMap.put(nums2[i],hashMap.get(nums2[i]-1));
            }
        }

        int[] res= new int[arrayList.size()];
        for (int i=0; i< arrayList.size(); i++){
            res[i] = arrayList.get(i);
        }
        return res;
    }

    //@RequestMapping("reverse")
    public int nums1(){
        int[] nums1 = {0,1,0,3,12};
        //判断数组是否为0，为0直接返回
        //
        int index = 0;
        for (int i = 0; i< nums1.length;i++){
            if (nums1[i] != 0){
                nums1[index++] = nums1[i];
            }
        }
        while (index < nums1.length){
            nums1[index++] = 0;
        }
        return 0;
    }

    //九宫格，计算九宫格里面数字是否满足行，列，3x3方格都无重复数据
    @RequestMapping("nums2")
    public Serializable nums2(){
         char[][] asd =
                 {{'5','3','.','.','7','.','.','.','.'}
                 ,{'6','.','.','1','9','5','.','.','.'}
                 ,{'.','9','8','.','.','.','.','6','.'}
                 ,{'8','.','.','.','6','.','.','.','3'}
                 ,{'4','.','.','8','.','3','.','.','1'}
                 ,{'7','.','.','.','2','.','.','.','6'}
                 ,{'.','6','.','.','.','.','2','8','.'}
                 ,{'.','.','.','4','1','9','.','.','5'}
                 ,{'.','.','.','.','8','.','.','7','9'}};
        for(int i=0; i < asd.length;i++){
            HashSet hashline = new HashSet();
            HashSet hashcol = new HashSet();
            HashSet hashbox = new HashSet();

            for (int j=0; j < asd.length;j++){
                if (asd[i][j] != '.' && !hashline.add(asd[i][j])){
                    return hashline;
                }
                if (asd[j][i] != '.' && !hashcol.add(asd[j][i])){
                    return hashcol;
                }
                int a = (i/3)*3+j/3;
                int b = (i%3)*3+j%3;
                if (asd[a][b] != '.' && !hashbox.add(asd[a][b])){
                    return hashbox;
                }

            }
            System.err.println(hashbox);
        }


         return true;
        //return asd;
    }
    @RequestMapping("string")
    public String[] text(){
        String[] asd = new String[]{"h", "e", "l", "l", "o"};
        int length = asd.length;
        for (int i=0; i< length/2;i++){
            String temp = asd[i];
            asd[i] = asd[length-i-1];
            asd[length-i-1] = temp;
        }
        return asd;
    }

    //对字符串进行比较或者翻转，首先都是将字符串转成数组进行操作
    @RequestMapping("abc")
    public boolean abc(){
        boolean demo = hashservices.test("asdasd", "dsadsa");
        String aaa = "asdasd";
        String bbb = "dsadsaa";
        char[] a = aaa.toCharArray();
        char[] b = bbb.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        //return Arrays.equals(a,b);
        return demo;
    }


    @Scheduled(fixedDelay = 1000)
    public void schdule(){
        System.out.println("11111111");
    }
    @Scheduled(fixedDelay = 1000)
    public void schdule1(){
        System.out.println("11111111");
    }
}
