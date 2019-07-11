package com.mini.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* 
 * desc tbl_course;
+-----------------+-------------+------+-----+---------+-------+
| Field           | Type        | Null | Key | Default | Extra |
+-----------------+-------------+------+-----+---------+-------+
| course_id       | int(11)     | NO   | PRI | NULL    |       |
| course_name     | varchar(4)  | NO   |     | NULL    |       |
| course_duration | varchar(15) | NO   |     | NULL    |       |
| description     | varchar(50) | NO   |     | NULL    |       |
+-----------------+-------------+------+-----+---------+-------+
 */ 
@Entity
@Table(name = "tbl_course")
public class Course implements Serializable {
	static final long serialVersionUID = 123450l;
	
	@Id
	int course_id;
	String course_name;
	String course_duration;
	String description;
	
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
