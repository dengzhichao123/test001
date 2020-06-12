package com.star.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/5/31    17:06
 * @Version: 1.0
 */
public class ActionProxy implements MethodInterceptor{

    //引用
    private Object userAction;

    //cglib  代理
    public Object createProxyObject(Object obj){
        this.userAction = (UserAction) obj;
        Enhancer enhancer = new Enhancer();

        //cglib   生成子类
        enhancer.setSuperclass(userAction.getClass());
        enhancer.setCallback(this);

        //返回我们代理对象
        Object o = enhancer.create();
        return  o;
    }

    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before ------  上班途中");
        Object invoke = methodProxy.invoke(this.userAction, args);//调用对象
        System.out.println("after ------  下班途中");
        return invoke;
    }
}
