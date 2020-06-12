package com.star.proxy.dynamicproxy.jdkproxy;

import com.star.proxy.Job;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/5/31    16:44
 * @Version: 1.0
 */
public class ActionProxy implements InvocationHandler{
    //目标对象
    private Job job;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before ------  上班途中");
        Object invoke = method.invoke(job, args);//调用对象
        System.out.println("after ------  下班途中");
        return invoke;//返回目标对象的返回值
    }

    public Job getJob(Job job){
        this.job=job;

        //返回反射生产的代理类的代理对象
        return (Job) Proxy.newProxyInstance(
                //指定生成的代理类的类加载器
                Thread.currentThread().getContextClassLoader(),
                //
                this.job.getClass().getInterfaces(),
                //要绑定的InvocationHandler
                this);
    }

}
