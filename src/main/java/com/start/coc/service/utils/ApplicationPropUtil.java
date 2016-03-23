package com.start.coc.service.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * application.properties 工具
 * 
 * @author Administrator
 *
 */
public final class ApplicationPropUtil {

	private static final String NAME = "application.properties";

	// private static final String DEFAULT_KEY = "secret_key";

	private static final Properties AppProp = new Properties();

	static {
		try {			
			//InputStream url =ApplicationPropUtil.class.getClass().getClassLoader().getResourceAsStream(NAME);  
			//System.out.println(url);
	        //String path = url.substring(0, url.indexOf("WEB-INF")) + "WEB-INF/"+NAME;  
			AppProp.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(NAME));
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

	public static String getValue(String key) {		
		return AppProp.getProperty(key);
	}

	/**
	 * 获取加密密钥
	 * 
	 * @return
	 */
	// public static String getDefaultValue(){
	// return getValue(DEFAULT_KEY);
	// }

}
