package com.mini.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
//@SecondaryTable(name = "tbl_course")
public class Semester implements Serializable {
	static final long serialVersionUID = 123456l;

	@Id
	int semester_id;
//	@Column(table = "tbl_course")
	int course_id;
	String semester;
	@OneToMany(mappedBy = "semesterSaya")
	private Set<Student> student = new HashSet<Student>();
	
	@OneToMany(mappedBy = "semester", cascade = CascadeType.ALL)
	private Set<Course> c = new HashSet<Course>();
	
	@OneToMany(mappedBy = "semSubject", cascade = CascadeType.ALL)
	private Set<Subject> s = new HashSet<Subject>();
	
	public Set<Subject> getSemSubject() {
		return s;
	}
	
	public void setStudents(Set<Subject> subject) {
		this.s = subject;
	}
	
	public Set<Course> getCourse() {
		return c;
	}
	
	public void setCourse(Course course) {
		this.c = Stream.of(course).collect(Collectors.toSet());
        this.c.forEach(x -> x.setSemesterFK(this));
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

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
