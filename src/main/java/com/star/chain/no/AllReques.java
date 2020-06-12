package com.star.chain.no;

/**
 * @ClassName:AllReques
 * @Description: 说明 请求类
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/2    21:20
 * @Version: 1.0
 */
public class AllReques {
    //请假
    //加薪
    //采购

    private String AllRequesType;//类型
    private String RequesContext;//内容
    private Integer AllNumber;//数据

    public String getAllRequesType() {
        return AllRequesType;
    }

    public void setAllRequesType(String allRequesType) {
        AllRequesType = allRequesType;
    }

    public String getRequesContext() {
        return RequesContext;
    }

    public void setRequesContext(String requesContext) {
        RequesContext = requesContext;
    }

    public Integer getAllNumber() {
        return AllNumber;
    }

    public void setAllNumber(Integer allNumber) {
        AllNumber = allNumber;
    }
}
