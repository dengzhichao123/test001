package com.star.chain.yes;

/**
 * @ClassName:AllHandle
 * @Description: 说明  抽象处理类
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    21:48
 * @Version: 1.0
 */
public abstract class AllHandle {

    //管理者的名字
    protected String name;
    //上级
    protected AllHandle myallHandle;

    public AllHandle(String name) {
         this.name=name;
    }

    public void setMyallHandle(AllHandle myallHandle) {
        this.myallHandle = myallHandle;
    }



    //处理请求
    public abstract void GetRequest(AllReques allReques);
}