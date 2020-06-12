package com.star.adapter.test.objectAdapter;

import com.star.adapter.test.TargetAndroid;
import com.star.adapter.test.AdapteePhone;

/**
 * @ClassName:
 * @Description: 说明 对象的适配器
 *                 原理 通过组合方法实现适配器功能
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    23:22
 * @Version: 1.0
 */
public class AdapterTwo implements TargetAndroid {
    //维持一个对适配者对象的引用
    private AdapteePhone phone;
    public AdapterTwo(AdapteePhone phone){
        this.phone = phone;
    }


    public void Android() {
        if (phone != null){
            phone.typePhone();
            System.out.println("阿超已经接收到信息 ，我给你android的转接头");
            System.out.println("我已经适配成功，可以充电了");
        }
    }
}
