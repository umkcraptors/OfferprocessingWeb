package com.bis.eps.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.bis.eps.security.entity.Role;
import com.bis.eps.security.entity.User;

public class SecurityUser extends User implements UserDetails
{

	private static final long serialVersionUID = 1L;
	public SecurityUser(User user) {
		if(user != null)
		{
			this.setId(user.getId());
			this.setName(user.getName());
			this.setEmail(user.getEmail());
			this.setPassword(user.getPassword());
			this.setDob(user.getDob());
			this.setRoles(user.getRoles());
		}		
	}
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		Set<Role> userRoles = this.getRoles();
		
		if(userRoles != null)
		{
			for (Role role : userRoles) {
				SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
				authorities.add(authority);
			}
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}


	public String getUsername() {
		return super.getEmail();
	}


	public boolean isAccountNonExpired() {
		return true;
	}

	
	public boolean isAccountNonLocked() {
		return true;
	}


	public boolean isCredentialsNonExpired() {
		return true;
	}


	public boolean isEnabled() {
		return true;
	}
	
}

