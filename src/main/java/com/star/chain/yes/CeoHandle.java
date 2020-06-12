package com.star.chain.yes;

/**
 * @ClassName:
 * @Description: 说明 ceo处理
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    21:56
 * @Version: 1.0
 */
public class CeoHandle extends AllHandle{
    public CeoHandle(String name){
        super(name);//调用父类方法
    }
    //处理请求
    public void GetRequest(AllReques allReques) {
            if ("请假".equals(allReques.getAllRequesType())&&allReques.getAllNumber() <=3){
                System.out.println("请假天数小于等于3，请假被组长批准");
            }
             else{
                    System.out.println("你还想不想干了");
            }
    }
}
