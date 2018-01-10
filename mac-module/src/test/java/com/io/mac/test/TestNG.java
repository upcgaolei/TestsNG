package com.io.mac.test;

import com.io.mac.MacInterface;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by 周高磊
 * Date: 2018/1/10.
 * Email: gaoleizhou@gmail.com
 * Desc:
 *
 * @author zhougaolei
 */

public class TestNG extends AbstractTest {

    @Resource
    private MacInterface macInterface;

    //10个线程并发进行100次调用
    @Test(invocationCount = 100, threadPoolSize = 10)
    public void testHello() {
        System.out.println("current thread: " + Thread.currentThread().getId());
        System.out.println(macInterface.hello());
        Assert.assertEquals(macInterface.hello(), "hello world");
    }

}
