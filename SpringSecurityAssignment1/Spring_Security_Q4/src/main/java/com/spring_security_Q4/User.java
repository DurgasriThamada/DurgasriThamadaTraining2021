package com.spring_security_Q4;

public class User {
	String username;
	String password;
	int Attempts;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAttempts() {
		return Attempts;
	}
	public void setAttempts(int Attempts) {
		this.Attempts = Attempts;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", Attempts=" + Attempts + "]";
	}

}
