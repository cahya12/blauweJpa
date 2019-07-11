package com.mini.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

/*
 * MariaDB [trainingDB]> desc tbl_semester;
+-------------+------------+------+-----+---------+-------+
| Field       | Type       | Null | Key | Default | Extra |
+-------------+------------+------+-----+---------+-------+
| semester_id | int(11)    | NO   | PRI | NULL    |       |
| course_id   | int(11)    | NO   | MUL | NULL    |       |
| semester    | varchar(5) | NO   |     | NULL    |       |
+-------------+------------+------+-----+---------+-------+
 */
@Entity
@Table(name = "tbl_semester")
@SecondaryTable(name = "tbl_course")
public class Semester implements Serializable {
	static final long serialVersionUID = 123456l;
	
	@Id
	int semester_id;
	@Column(table = "tbl_course")
	int course_id;
	String semester;
	
	
	public int getSemester_id() {
		return semester_id;
	}
	public void setSemester_id(int semester_id) {
		this.semester_id = semester_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
}
