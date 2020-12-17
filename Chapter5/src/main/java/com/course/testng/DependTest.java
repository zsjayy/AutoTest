package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    /**
     * 如果被依赖的方法失败了，依赖的方法就会被忽略ignore
     */

    //被依赖的方法一般被用作某些方法的前置条件
    @Test
    public void test1(){
        System.out.println("test1执行了");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2执行了");
    }

    @Test(dependsOnMethods = {"test1"},ignoreMissingDependencies = true)
    public void test3(){
        System.out.println("test3执行了");
    }
}
