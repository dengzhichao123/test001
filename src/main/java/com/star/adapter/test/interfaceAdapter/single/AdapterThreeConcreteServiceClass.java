package com.star.adapter.test.interfaceAdapter.single;

/**
 * @ClassName:
 * @Description: 说明 接口的适配器模式
 *                  原理 借用抽象类来的实现适配器的功能
 *                  ConcreteServiceClass（具体业务类）：它是缺省适配器类的子类，
 *                  在没有引入适配器之前，它需要实现适配者接口，
 *                  因此需要实现在适配者接口中定义的所有方法，
 *                  而对于一些无须使用的方法也不得不提供空实现。
 *                  在有了缺省适配器之后，可以直接继承该适配器类，
 *                  根据需要有选择性地覆盖在适配器类中定义的方法
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    23:29
 * @Version: 1.0
 */
public class AdapterThreeConcreteServiceClass extends TypecAndroidAdapterAbstractServiceClass {
    //重写
    public void typec(){
        System.out.println("充电信息从Android手机输出  我只有Type-C线");
    }
    public void android(){
        System.out.println("阿超已经接收到信息 ，我给你android的转接头");
        System.out.println("我已经适配成功，可以充电了");
    }
}
