package com.cxf;

import org.apache.cxf.frontend.ServerFactoryBean;

/***
 * 基于CXF框架的服务端代码
 */
public class FirstCXFService {

    /**
     * web服务的方法
     * @param name
     * @return
     */
    public String printReciveInfo(String name){
        System.out.println("客户端发送过来信息：" + name);
        return "服务器转发给你了"+ name;
    }

    public String vvv(String name){
        System.out.println("客户端发送过来信息：" + name);
        return "服务器转发给你了"+ name;
    }
    public static void main(String[] args){
        ServerFactoryBean serverFactoryBean = new ServerFactoryBean();
        //设置访问地址
        serverFactoryBean.setAddress("http://localhost:8081/firstService");
        //设置实现类
        serverFactoryBean.setServiceClass(FirstCXFService.class);
        //启动服务
        serverFactoryBean.create();
    }

}
