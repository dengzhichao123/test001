package com.star.adapter.myclass;

/**
 * @ClassName:
 * @Description: 说明 类的适配器模式
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    22:49
 * @Version: 1.0
 */
public class Adapter extends Adaptee implements Target {
    public void work() {
        System.out.println("工作---编程");
        code();
    }
}
