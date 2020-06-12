package com.star.proxy.dynamicproxy.jdkproxy;

import com.star.proxy.Job;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/5/31    16:23
 * @Version: 1.0
 */
public class UserAction implements Job {
    public void myjob() {
        System.out.println("我在工作ing");
    }
}
