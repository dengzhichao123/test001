package com.star.adapter.test;

/**
 * @ClassName:
 * @Description: 说明 定义一个手机类  有一个Type-C充电
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    23:13
 * @Version: 1.0
 */
// 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
public class AdapteePhone {//适配器类
    public void typePhone(){
        System.out.println("充电信息从Android手机输出  我只有Type-C线");
    }
}
