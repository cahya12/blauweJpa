package com.mini.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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
public class Student implements Serializable {
	static final long serialVersionUID = 123459l;

	@Id
	@Column(name = "student_id")
	int student_id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Semester semesterSaya;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_idku", referencedColumnName = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_idku", referencedColumnName = "course_id"))
	private Set<Course> courseSaya = new HashSet<Course>();
	
//	private Course jajal;
	String first_name;
	String middle_name;
	String last_name;
	int gender;
	String address;
	String contact_no;
	String email_id;

	
//	public Course getJajal() {
//		return jajal;
//	}

	public void setStudent(Semester semester) {
		this.semesterSaya = semester;
	}

	public Semester getSemesterSaya() {
		return semesterSaya;
	}

	public Set<Course> getCourseSaya() {
		return courseSaya;
	}

	public void setCourseSaya(Course course) {
		this.courseSaya.add(course);
		course.getStudentSaya().add(this);
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
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

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
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
