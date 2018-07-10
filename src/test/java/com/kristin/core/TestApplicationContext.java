package com.kristin.core;

import com.kristin.bean.A;
import com.kristin.bean.B;
import org.junit.Test;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/7/10 11:55
 * @desc
 **/
public class TestApplicationContext {
    @Test
    public void test() {
        BeanFactory bf = new ClassPathXmlApplicationContext("/applicationContext.xml");
        A a = (A) bf.getBean("A");
        A a1 = (A) bf.getBean("A");
        B b = (B) bf.getBean("B");
        B b1 = (B) bf.getBean("B");
        System.out.println(a == a1);
        System.out.println(b == b1);
        System.out.println(b.getAName() + ":" + b.getAge());
    }
}
