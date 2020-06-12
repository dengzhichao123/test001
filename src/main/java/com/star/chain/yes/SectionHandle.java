package com.star.chain.yes;

/**
 * @ClassName:
 * @Description: 说明  科长处理
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    22:06
 * @Version: 1.0
 */
public class SectionHandle extends AllHandle{
    public SectionHandle(String name){
        super(name);//调用父类方法
    }
    //处理请求
    public void GetRequest(AllReques allReques) {
        if ("请假".equals(allReques.getAllRequesType())&&allReques.getAllNumber() <=3){
            System.out.println("请假天数小于等于3，请假被组长批准");
        }else{
            System.out.println("我无权处理，你去找我们ceo");
            if(myallHandle != null){//为什么我可以调用  protected 定位私有无法调用 公开封装没有意义
                //抛出处理  让上级处理
                myallHandle.GetRequest(allReques);
            }
        }
    }
}
