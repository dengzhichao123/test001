package com.star.adapter.myjk;

/**
 * @ClassName:
 * @Description: 说明 接口的适配器
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    23:07
 * @Version: 1.0
 */
public class AdapterTest {
    public static void main(String[] args) {
        AdapterOne adapterOne = new AdapterOne();
        adapterOne.code();
        ///adapterOne.work();
        AdapterTwo adapterTwo = new AdapterTwo();
        adapterTwo.work();
    }
}
