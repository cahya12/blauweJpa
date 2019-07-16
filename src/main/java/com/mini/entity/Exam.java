package com.mini.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

/*
 * MariaDB [trainingDB]> desc tbl_exam;
+--------------+-----------+------+-----+-------------------+-----------------------------+
| Field        | Type      | Null | Key | Default           | Extra                       |
+--------------+-----------+------+-----+-------------------+-----------------------------+
| exam_id      | int(11)   | NO   | PRI | NULL              |                             |
| course_id    | int(11)   | NO   | MUL | NULL              |                             |
| semester_id  | int(11)   | NO   | MUL | NULL              |                             |
| subject_code | int(11)   | NO   | MUL | NULL              |                             |
| marks        | int(3)    | NO   |     | NULL              |                             |
| time         | timestamp | NO   |     | CURRENT_TIMESTAMP | on update CURRENT_TIMESTAMP |
| date         | datetime  | YES  |     | NULL              |                             |
+--------------+-----------+------+-----+-------------------+-----------------------------+
*/

@Entity
@Table(name = "tbl_exam")
//@SecondaryTable(name = "tbl_course")
//@SecondaryTable(name = "tbl_semester")
public class Exam implements Serializable {
	static final long serialVersionUID = 1234662l;
	
	@Id
	int exam_id;
//	@Column(table = "tbl_course")
	int course_id;
	//@Column(table = "tbl_semester")
	int semester_id;
	int subject_code;
	int marks;
	Date time;
	Date date;
	
	@OneToMany(mappedBy = "courseExam", cascade = CascadeType.ALL)
	private Set<Course> courseExam = new HashSet<Course>();
	
	@OneToMany(mappedBy = "subjectExam", cascade = CascadeType.ALL)
	private Set<Subject> subjectExam = new HashSet<Subject>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Semester semesterExam;
	
	public void setExam(Semester semester) {
		this.semesterExam = semester;
	}
	
	public Semester getSemesterExam() {
		return semesterExam;
	}

	public void setSemesterExam(Semester semesterSaya) {
		this.semesterExam = semesterSaya;
	}


	public Set<Course> getCourse() {
		return courseExam;
	}
	public void setCourse(Course course) {
		this.courseExam = Stream.of(course).collect(Collectors.toSet());
		this.courseExam.forEach(x -> x.setExam(this));
	}
	public void setSubject(Subject subject) {
		this.subjectExam = Stream.of(subject).collect(Collectors.toSet());
		this.subjectExam.forEach(x -> x.setExam(this));
	}
	public Set<Subject> getSubject() {
		return subjectExam;
	}
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public int getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(int subject_code) {
		this.subject_code = subject_code;
	}
}
