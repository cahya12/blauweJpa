package com.mini.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* 
 * desc tbl_admin;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| admin_id   | int(11)     | NO   | PRI | NULL    |       |
| admin_name | varchar(25) | NO   |     | NULL    |       |
| password   | varchar(10) | NO   |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
 */ 
@Entity
@Table(name = "tbl_admin")
public class Admin implements Serializable {
	static final long serialVersionUID = 123453l;
	
	@Id
	int admin_id;
	String admin_name;
	String password;
	
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
}
