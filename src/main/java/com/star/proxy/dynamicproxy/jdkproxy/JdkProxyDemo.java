package com.star.proxy.dynamicproxy.jdkproxy;

import com.star.proxy.Job;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @ClassName:  JDK代理
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/5/31    16:53
 * @Version: 1.0
 */
public class JdkProxyDemo {
    public static void main(String[] args) {
        Job job = new ActionProxy().getJob(new UserAction());
        System.out.println(job.getClass());
        job.myjob();
    //D:\Igs\sjms

    //反编译
        try {

        byte[] bt = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Job.class});
        FileOutputStream fos = new FileOutputStream("D:/Igs/sjms/Proxy0.class");
        fos.write(bt);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
