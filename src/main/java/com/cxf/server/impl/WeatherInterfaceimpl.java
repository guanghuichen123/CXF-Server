package com.cxf.server.impl;

import com.cxf.server.WeatherInterface;

public class WeatherInterfaceimpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		String weather = "";
		if ("杭州".equals(cityName)) {
			weather = "阴转梅雨";
		} else if ("上海".equals(cityName)) {
			weather = "今天有雪";
		} else {
			weather = "我也不知道";
		}
		return weather;
	}
}
