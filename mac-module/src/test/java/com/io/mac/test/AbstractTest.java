package com.io.mac.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Created by 周高磊
 * Date: 2018/1/11.
 * Email: gaoleizhou@gmail.com
 * Desc:
 *
 * @author zhougaolei
 */
@Test
@ContextConfiguration(locations = {"classpath:spring-config-test.xml"})
public class AbstractTest extends AbstractTestNGSpringContextTests {
}
