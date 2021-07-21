package com.springboot.restaurant.entity;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Table(name = "user_details")
@Entity
public class User implements UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "user_name", unique = true)
	private String userName;
	
	
	@Id
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private String phoneNumber;


	@Column(name = "user_password")
	private String password;


	@Column(name = "created_date")
	private Date createdAt;

	 

	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
 

	public void setPassword(String password) {
		this.password = password;
	}


	 
	public void setPhoneNumber(String  phoneNumber) {
	 
		
		this.phoneNumber = phoneNumber;
		
	}
	
	

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	 
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 
		return  null;
	}

	@Override
	public String getPassword() {
		 
		return this.password;
	}

	@Override
	public String getUsername() {
		 
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
	 
		return this.isAccountNonExpired();
	}

	@Override
	public boolean isAccountNonLocked() {
	 
		return this.isAccountNonLocked();
	}

	@Override
	public boolean isCredentialsNonExpired() {
	 
		return this.isCredentialsNonExpired();
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return this.isEnabled;
	}

	

	
	 

}
