package com.star.adapter.mydx;

/**
 * @ClassName:
 * @Description: 说明  对象的适配器模式
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    22:54
 * @Version: 1.0
 */
public class Adapter implements Life{

    //引用job
    private Job job;

    //构造方法
    public Adapter(Job job){
        this.job = job;
    }


    public void code() {
        System.out.println("代码写的不错");
    }

    public void work() {
        System.out.println("工作完成的不错");
    }
}
