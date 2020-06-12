package com.star.proxy.dynamicproxy.cglibproxy;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/5/31    17:15
 * @Version: 1.0
 */
public class CglibProxyDemo {
    public static void main(String[] args) {
        UserAction userAction = (UserAction)new ActionProxy().createProxyObject(new UserAction());
        System.out.println(userAction.getClass());
        userAction.myjob();
    }
}
