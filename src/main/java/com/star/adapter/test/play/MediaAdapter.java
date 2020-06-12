package com.star.adapter.test.play;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/9    19:42
 * @Version: 1.0
 */// MediaPlayer 接口的适配器类。
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        //函数–equalsIgnoreCase()。那么它到底起到什么作用呢？
        // 简单点而言就是两个string类型的变量进行对比，看是否相等的功能，
        // 但是在对比是否相等的需求下，我们常用的还是equals()方法，
        // 相比equals而言，equalsIgnoreCase()有其自己的功能，
        // 可以忽略大小写，只要两个类型字母组成一样，那么就可以核对成功。

        if(audioType.equalsIgnoreCase("wmv") ){
            advancedMusicPlayer = new WmvPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("wmv")){
            advancedMusicPlayer.playWmv(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
