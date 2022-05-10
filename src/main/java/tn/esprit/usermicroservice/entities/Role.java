package tn.esprit.usermicroservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private Long roleid;
	private String rolename;
	
	
	public Role(String rolename) {
		this.rolename = rolename;
	}
	
	public Role(Long roleid, String rolename) {
		this.roleid = roleid;
		this.rolename = rolename;
	}

	public Role() {
		//empty
	}
	
	
	
	public Long getRoleid() {
		return roleid;
	}
	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
}
