package com.start.coc.service.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find{	
	private Map<String, String> map;		

	public Find(){		
		map = new HashMap<String, String>();	
	}
	
	public void eq(String field , String value){
		map.put("eq_"+field, value);		
	}
	
	public void like(String field , String value){
		map.put("like_"+field, "%"+value+"%");		
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
}
