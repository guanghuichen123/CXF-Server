package com.cxf.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

@WebService
//指定xml生成的版本。不写默认为1.1版本。 写上SOAP12HTTP_BINDING为1.2版本
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {

	public String queryWeather(String cityName);
}
