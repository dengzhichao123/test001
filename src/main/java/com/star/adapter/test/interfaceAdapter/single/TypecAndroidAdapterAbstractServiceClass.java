package com.star.adapter.test.interfaceAdapter.single;

/**
 * @ClassName:
 * @Description: 说明 AbstractServiceClass（缺省适配器类）：它是缺省适配器模式的核心类，
 *              使用空方法的形式 实现了在ServiceInterface接口中声明的方法。
 *              通常将它定义为抽象类，因为对它进行实例化没 有任何意义
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    23:28
 * @Version: 1.0
 */
public abstract class TypecAndroidAdapterAbstractServiceClass implements TypecAndroidServiceInterface {
    public void typec(){}
    public void android(){}
}
