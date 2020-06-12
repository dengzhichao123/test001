package com.star.adapter.test;

import com.star.adapter.test.classAdapter.AdapterOne;
import com.star.adapter.test.interfaceAdapter.single.AdapterThreeConcreteServiceClass;
import com.star.adapter.test.objectAdapter.AdapterTwo;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    23:31
 * @Version: 1.0
 */
public class Cient {
    public static void main(String[] args) {//客户端
        //第一种适配器
        System.out.println("-------------------------------");
        TargetAndroid android  = new AdapterOne();
        android.Android();//适配器给转化
        System.out.println("-------------------------------");
        AdapterTwo adapterTwo = new AdapterTwo(new AdapteePhone());
        adapterTwo.Android();
        System.out.println("-------------------------------");
        AdapterThreeConcreteServiceClass adapterThre = new AdapterThreeConcreteServiceClass();
        adapterThre.typec();
        adapterThre.android();
    }
}
