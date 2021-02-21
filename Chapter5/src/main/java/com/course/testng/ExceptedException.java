package com.course.testng;

import org.testng.annotations.Test;

@Test(expectedExceptions = RuntimeException.class)
public class ExceptedException {
    /**
     *什么时候会用到异常测试
     * 在我们遇到预期的异常时，如我们输入一些不合法的参数，期望程序抛出异常
     * 就是说我们就想看到这个异常
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();   //java固定语法，抛出异常
    }


}
