package com.star.adapter.test.classAdapter;

import com.star.adapter.test.TargetAndroid;
import com.star.adapter.test.AdapteePhone;

/**
 * @ClassName:  实现Type-c转安卓
 * @Description: 说明 类的适配器
 *                 原理  通过继承特性实现适配器的功能
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    23:15
 * @Version: 1.0
 */
public class AdapterOne extends AdapteePhone implements TargetAndroid {
    //实现
    public void Android() {
        //因为我继承了Phone
        typePhone();
        System.out.println("阿超已经接收到信息 ，我给你android的转接头");
        System.out.println("我已经适配成功，可以充电了");
    }
}
