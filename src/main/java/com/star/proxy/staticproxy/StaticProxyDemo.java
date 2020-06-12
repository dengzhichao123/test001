package com.star.proxy.staticproxy;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/5/31    16:27
 * @Version: 1.0
 */
public class StaticProxyDemo {
    public static void main(String[] args) {
        //目标对象
        UserAction userAction = new UserAction();
        //代理对象
        ActionProxy actionProxy = new ActionProxy(userAction);
        //通过代理对象去操作 我们的对象/目标
        actionProxy.myjob();
    }
}
