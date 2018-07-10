package com.kristin.bean;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/7/10 10:31
 * @desc
 **/
public class B {
    private A a;
    private int age;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAName(){
        return a.getName();
    }
}
