package com.yby.first;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FirstApplicationTests {


    int x;
    int y;



    @Test
    public void contextLoads() {
        
    }

//    public FirstApplicationTests(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//    void move(int x1,int y1){
//        x = x1;
//        y = y1;
//    }



    @Test
    public void threadTest() {
//        try{
//            int a = 1;
//            int b = 0;
//            System.out.println(a/b);
//        }catch (Exception e){
//            System.out.println("gg");
//            //continue;
//        }finally {
//            String a = "asd";
//            String b = a + "dsa";
//            System.out.println("qwe");
//            //在finally中加入return，会导致整个return失效
//            return;
//        }

        int x = 5;
        if (x > 10){
            System.out.println("1111");
        }else {
            assert (x > 6);
            System.out.println("22222");
            System.out.println("222233");
        }
    }
}
