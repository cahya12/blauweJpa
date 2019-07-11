package com.mini.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

/*
 * MariaDB [trainingDB]> desc tbl_subject;
+--------------+------------+------+-----+---------+-------+
| Field        | Type       | Null | Key | Default | Extra |
+--------------+------------+------+-----+---------+-------+
| subject_code | int(11)    | NO   | PRI | NULL    |       |
| semester_id  | int(11)    | NO   | MUL | NULL    |       |
| course_id    | int(11)    | NO   | MUL | NULL    |       |
| subject_name | varchar(5) | NO   |     | NULL    |       |
+--------------+------------+------+-----+---------+-------+
 */

@Entity
@Table(name = "tbl_subject")
@SecondaryTable(name = "tbl_course")
//@SecondaryTables(name = "tbl_course", "tbl_semester")
public class Subject implements Serializable {
	static final long serialVersionUID = 1234661l;
	
	@Id
	int subject_code;
	@Column(table = "tbl_course")
	int course_id;
	//@Column(table = "tbl_semester")
	int semester_id;
	String subject_name;
	
	
	public int getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(int subject_code) {
		this.subject_code = subject_code;
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
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	
	
}
