package com.star.chain.yes;

/**
 * @ClassName:
 * @Description: 说明  有责任链
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    22:10
 * @Version: 1.0
 */
public class YseDemo {
    public static void main(String[] args) {
        //初始化管理并且赋值
        LeaderHandle zz =new LeaderHandle("fame");
        SectionHandle kz =new SectionHandle("sy");
        CeoHandle ceo =new CeoHandle("pack");

        //给管理层 设置上一级
        zz.setMyallHandle(kz);
        kz.setMyallHandle(ceo);

        //发送请求
        AllReques allReques = new AllReques();
        allReques.setAllRequesType("请假");
        allReques.setRequesContext("今天不想上班");
        allReques.setAllNumber(9);

        zz.GetRequest(allReques);
    }
}
