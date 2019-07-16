package com.mini.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	@ManyToMany(mappedBy = "courseSaya")
	private Set<Student> studentSaya = new HashSet<>();
	
	@ManyToOne
	@JoinColumn
	private Semester semester;
	
	public void setSemesterFK(Semester semester) {
        this.semester = semester;
    }

	public Semester getSemesterFK() {
		return semester;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn 
//	(name = "exam_id", insertable=false, updatable=false)
	private Exam courseExam;
	
	public void setExam(Exam courseExam) {
		this.courseExam = courseExam;
	}
	
	
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
	public Set<Student> getStudentSaya() {
		return studentSaya;
	}
	public void setStudentSaya(Set<Student> studentSaya) {
		this.studentSaya = studentSaya;
	}
	
	
}
