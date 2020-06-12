package com.star.chain.no;

/**
 * @ClassName:AllHandle
 * @Description: 说明 处理类
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    21:20
 * @Version: 1.0
 */
public class AllHandle {
    private String name;

    public AllHandle(String name){
        this.name = name;
    }

    //处理
    public void GetRequest(String people,AllReques allReques){
        if ("组长".equals(people)){
            if ("请假".equals(allReques.getAllRequesType())&&allReques.getAllNumber() <=3){
                System.out.println("请假天数小于等于3，请假被班长批准");
            }else{
                System.out.println("我无权处理，你去找我们科长");
        }
        }
        else if ("科长".equals(people)){
            if ("请假".equals(allReques.getAllRequesType())&&allReques.getAllNumber() <=7){
                System.out.println("请假天数小于等于7，请假被科长批准");
            }else{
                System.out.println("我无权处理，你去找我们ceo");
            }
        }
        else if ("ceo".equals(people)){
            if ("请假".equals(allReques.getAllRequesType())&&allReques.getAllNumber() <=15){
                System.out.println("请假天数小于等于15，请假被ceo批准");
            }else{
                System.out.println("你还想不想干了");
            }
        }
    }
}
