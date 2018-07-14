package com.cxf.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.cxf.server.impl.WeatherInterfaceimpl;

public class CXFServerDemo {
	// 用来发布服务端。让客户端可以访问
	public static void main(String[] args) {
		JaxWsServerFactoryBean jwf = new JaxWsServerFactoryBean();
		//设置访问路径
		jwf.setAddress("http://localhost:8080/cxf/weather");
		//设置接口的类文件
		jwf.setServiceClass(WeatherInterface.class);
		//获得实现类的对象。这是一个bean标签
		jwf.setServiceBean(new WeatherInterfaceimpl());
		//create发布
		jwf.create();
		System.out.println("success");
	}
}
