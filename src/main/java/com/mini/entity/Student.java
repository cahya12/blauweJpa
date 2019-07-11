package com.mini.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

/*
 * MariaDB [trainingDB]> desc tbl_student;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| student_id  | int(11)      | NO   | PRI | NULL    |       |
| course_id   | int(11)      | NO   | MUL | NULL    |       |
| semester_id | int(11)      | NO   | MUL | NULL    |       |
| first_name  | varchar(15)  | NO   |     | NULL    |       |
| middle_name | varchar(15)  | NO   |     | NULL    |       |
| last_name   | varchar(15)  | NO   |     | NULL    |       |
| gender      | int(1)       | NO   |     | NULL    |       |
| address     | varchar(100) | NO   |     | NULL    |       |
| contact_no  | varchar(15)  | NO   |     | NULL    |       |
| email_id    | varchar(20)  | NO   |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
 */

@Entity
@Table(name = "tbl_student")
@SecondaryTable(name = "tbl_course")
//@SecondaryTables(name = "tbl_course", "tbl_semester")
public class Student implements Serializable {
	static final long serialVersionUID = 123459l;
	
	@Id
	int student_id;
	@Column(table = "tbl_course")
	int course_id;
	//@Column(table = "tbl_semester")
	int semester_id;
	String first_name;
	String middle_name;
	String last_name;
	String gender;
	String address;
	String contact_no;
	String email_id;
	
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public int getSemester_id() {
		return semester_id;
	}
	public void setSemester_id(int semester_id) {
		this.semester_id = semester_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	
	
	
}
