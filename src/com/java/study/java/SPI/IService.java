package com.java.study.java.SPI;

import java.util.ServiceLoader;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 2:25 PM 2018/11/20
 */
public class IService {

	public static void main(String[] args) {
		ServiceLoader<IService> serviceLoader=ServiceLoader.load(IService.class);

		// private final Class<S> service;

	}
}
