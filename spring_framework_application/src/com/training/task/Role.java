package com.training.task;

public class Role {
	private String roleName;
	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}

	public Role() {
		roleName="";
		// TODO Auto-generated constructor stub
	}

}
