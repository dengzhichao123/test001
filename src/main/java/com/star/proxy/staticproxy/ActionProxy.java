package com.star.proxy.staticproxy;

import com.star.proxy.Job;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/5/31    16:23
 * @Version: 1.0
 */
public class ActionProxy implements Job {
    //引用
    private Job job;

    //创建一个构造方法
    public ActionProxy(Job job){
        this.job = job;
    }

    //重写  实现抽象方法
    public void myjob() {
        System.out.println("before ------  上班途中");
        job.myjob();
        System.out.println("after ------  下班途中");
    }

}
