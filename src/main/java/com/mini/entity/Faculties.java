package com.mini.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

/*
 * MariaDB [trainingDB]> desc tbl_faculties;
+--------------+--------------+------+-----+---------+-------+
| Field        | Type         | Null | Key | Default | Extra |
+--------------+--------------+------+-----+---------+-------+
| faculty_id   | int(11)      | NO   | PRI | NULL    |       |
| first_name   | varchar(15)  | NO   |     | NULL    |       |
| middle_name  | varchar(15)  | NO   |     | NULL    |       |
| last_name    | varchar(15)  | NO   |     | NULL    |       |
| address      | varchar(100) | NO   |     | NULL    |       |
| designation  | varchar(20)  | NO   |     | NULL    |       |
| course_id    | int(11)      | NO   | MUL | NULL    |       |
| faculty_type | varchar(15)  | NO   |     | NULL    |       |
+--------------+--------------+------+-----+---------+-------+
 */
@Entity
@Table(name = "tbl_faculties")
@SecondaryTable(name = "tbl_course")
public class Faculties implements Serializable {
	static final long serialVersionUID = 123457l;
	
	@Id
	int faculty_id;
	@Column(table = "tbl_course")
	int course_id;
	String first_name;
	String middle_name;
	String last_name;
	String address;
	String designation;
	String faculty_type;
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getFaculty_type() {
		return faculty_type;
	}
	public void setFaculty_type(String faculty_type) {
		this.faculty_type = faculty_type;
	}
	
	
}
