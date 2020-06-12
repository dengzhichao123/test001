package com.star.adapter.test.play;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/9    19:50
 * @Version: 1.0
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "你的月亮我的心.mp3");
        audioPlayer.play("mp4", "好男人就是我.mp4");
        audioPlayer.play("wmv", "Java.wmv");
        audioPlayer.play("avi", "mind me.avi");

        int k =0;
        int i =0;
        i=++k;
        System.out.println(i);
        System.out.println(k);
        i=i+k++;
        System.out.println(i);
        System.out.println(k);
        i=i + ++k;
        System.out.println(i);
        System.out.println(k);
        i=i + k++;
        System.out.println(i);
        System.out.println(k);
    }

}
