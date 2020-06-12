package com.star.chain.no;

/**
 * @ClassName: 无责任链模式
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    21:33
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) {

        AllHandle zz = new AllHandle("组长");
        AllHandle kz = new AllHandle("科长");
        AllHandle ceo = new AllHandle("ceo");

        AllReques reques = new AllReques();
        //请求类赋值
        reques.setAllRequesType("请假");
        reques.setRequesContext("阿超请求请假4天，望批准");
        reques.setAllNumber(111);

        //处理类的处理方法进行赋值
        zz.GetRequest("组长",reques);
        kz.GetRequest("科长",reques);
        ceo.GetRequest("ceo",reques);

    }
}
