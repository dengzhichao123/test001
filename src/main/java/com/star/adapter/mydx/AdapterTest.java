package com.star.adapter.mydx;

/**
 * @ClassName:
 * @Description: 说明 对象的适配器模式
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    23:00
 * @Version: 1.0
 */
public class AdapterTest {
    public static void main(String[] args) {
        Life life = new Adapter(new Job());
        life.code();
        life.work();
    }
}
