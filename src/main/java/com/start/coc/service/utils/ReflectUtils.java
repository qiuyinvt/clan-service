package com.start.coc.service.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectUtils {
	//获取泛型T的真正类型
	public static <T> Type getGenericType(Class<T> clazz){
		Type genType = clazz.getGenericSuperclass(); 		
		Type [] params = ((ParameterizedType) genType).getActualTypeArguments(); 		; 
		//System.out.println(((Class)params[0]).getCanonicalName());
		return (Class)params[0];
	}
}
