package org.softnovo.seckill.flyweight;

public class AuthorizationModel {
	private String user;
	private String securityEntity;
	private String permit;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSecurityEntity() {
		return securityEntity;
	}

	public void setSecurityEntity(String securityEntity) {
		this.securityEntity = securityEntity;
	}

	public String getPermit() {
		return permit;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	@Override
	public String toString() {
		return "AuthorizationModel [user=" + user + ", securityEntity=" + securityEntity + ", permit=" + permit + "]";
	}
}
