package com.chy.action;
public class ChyAction {
    /*添加*/
    public String add(){
        System.out.println("添加用户");
        return "add";
    }
    /*删除*/
    public String del(){
        System.out.println("删除用户");
        return "del";
    }
    /*系统*/
    public String sys(){
        System.out.println("系统管理");
        return "sys";
    }
    /*成功*/
    public String success(){
        System.out.println("成功");
        return "success";
    }
    /*失败*/
    public String error(){
        System.out.println("失败");
        return "error";
    }
}
