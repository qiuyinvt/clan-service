package com.start.coc.service.enums;

import java.util.HashMap;
import java.util.Map;

public enum ClanManRole {
	chief("首领"),subchief("副首领"),elder("长老"),member("成员");
	
	public final String name;

	ClanManRole(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public final static Map<String,String> ROLES=new HashMap<String,String>();
	
	static{
		for(ClanManRole role:values()){
			ROLES.put(role.name() ,role.getName());
		}
	}
}
