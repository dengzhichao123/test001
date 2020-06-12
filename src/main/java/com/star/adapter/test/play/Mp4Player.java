package com.star.adapter.test.play;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/9    19:40
 * @Version: 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playWmv(String fileName) {
        //什么也不做
    }

    public void playMp4(String fileName) {
        System.out.println("播放 mp4 文件: "+ fileName);
    }
}
