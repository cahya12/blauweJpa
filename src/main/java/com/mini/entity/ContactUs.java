package com.mini.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 *  desc tbl_contact_us;
+---------------+--------------+------+-----+---------+-------+
| Field         | Type         | Null | Key | Default | Extra |
+---------------+--------------+------+-----+---------+-------+
| contact_us_id | int(11)      | NO   | PRI | NULL    |       |
| name          | varchar(25)  | NO   |     | NULL    |       |
| address       | varchar(100) | NO   |     | NULL    |       |
| phone_no      | int(20)      | NO   |     | NULL    |       |
| email_id      | varchar(25)  | NO   |     | NULL    |       |
| message       | varchar(60)  | NO   |     | NULL    |       |
+---------------+--------------+------+-----+---------+-------+
 * 
 */
@Entity
@Table(name = "tbl_contact_us")
public class ContactUs implements Serializable {
	static final long serialVersionUID = 123452l;

	@Id
	int contact_us_id;
	String name;
	String address;
	String phone_no;
	String email_id;
	String message;
	
	public int getContact_us_id() {
		return contact_us_id;
	}
	public void setContact_us_id(int contact_us_id) {
		this.contact_us_id = contact_us_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
