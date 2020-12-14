package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * 用于写@test标记的测试方法
 */
public class LoginTest {

    @Test
    public void loginTaoBao(){
        System.out.println("淘宝登录成功");
    }

}
