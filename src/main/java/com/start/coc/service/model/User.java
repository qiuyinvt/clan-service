package com.start.coc.service.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.start.coc.service.enums.UserAuthRole;

public class User implements UserDetails{
	
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String role;

    private Date created;

    private Integer clanId;

    private String authority;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getClanId() {
        return clanId;
    }

    public void setClanId(Integer clanId) {
        this.clanId = clanId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
    	setRoles(authority);
        this.authority = authority == null ? null : authority.trim();
    }

    /**权限管理*/
    private Set<String> roles = new HashSet<String>();
	
	public Set<String> getRoles() {
		return roles;
	}

	public void addRole(String role) {
		getRoles().add(role);
	}

	public void setRoles(String roles) {
		String[] arr = roles.split(",");
		for(String role : arr){
			addRole(role);
		}		
	}
    
	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();		
		for (String role : roles) {
			auths.add(new SimpleGrantedAuthority(role));
		}
		return auths;
	}

	@Override
	public boolean isAccountNonExpired() {		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {		
		return true;
	}

	@Override
	public boolean isEnabled() {		
		return true;
	}
}