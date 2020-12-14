package com.course.testng;

import org.testng.annotations.*;


public class BasicAnnotation {

    // 最基本的注释，将下面的方法标记为测试方法
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass是在测试类之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass是在测试类之后运行的");
    }
}
