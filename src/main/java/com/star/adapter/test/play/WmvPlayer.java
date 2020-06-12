package com.star.adapter.test.play;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/9    19:24
 * @Version: 1.0
 *///创建实现了 AdvancedMediaPlayer 接口的实体类。
public class WmvPlayer implements AdvancedMediaPlayer{
    public void playWmv(String fileName) {
        System.out.println("播放 wmv 文件: "+ fileName);
    }

    public void playMp4(String fileName) {
        //什么也不做
    }

}
