package com.mini.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * MariaDB [trainingDB]> desc tbl_feedback;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| feedback_id | int(11)      | NO   | PRI | NULL    |       |
| user_name   | varchar(25)  | NO   |     | NULL    |       |
| email_id    | varchar(25)  | NO   |     | NULL    |       |
| subject     | varchar(25)  | NO   |     | NULL    |       |
| description | varchar(100) | NO   |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
 */
@Entity
@Table(name = "tbl_feedback")
public class Feedback implements Serializable {
	static final long serialVersionUID = 123454l;
	
	@Id
	int feedback_id;
	String user_name;
	String email_id;
	String subject;
	String description;
	public int getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
