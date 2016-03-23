package com.start.coc.service.utils;

public class FindPag<T> {
	private Class<T> entity;
	
	@SuppressWarnings({ "unchecked" })
	public FindPag(){
		this.entity = (Class<T>)ReflectUtils.getGenericType(getClass());		
	}
}
