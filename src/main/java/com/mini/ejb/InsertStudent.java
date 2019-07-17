package com.mini.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.primefaces.PrimeFaces;

import com.mini.entity.Course;
import com.mini.entity.Semester;
import com.mini.entity.Student;

@Named
@ApplicationScoped
//@ViewScoped
public class InsertStudent implements Serializable {
	static final long serialVersionUID = 1l;
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;

	Student student;
	private int courseIdInput, semesterIdInput, semUpdate, courseUpdate;
	private List<Integer> courses;
	private List<Integer> semesters;
	private List<Student> students;

	@PostConstruct
	public void initiate() {
		try {
			student = new Student();
			factory = Persistence.createEntityManagerFactory("TrainingUnit");
			entityManager = factory.createEntityManager();

			courses = new ArrayList<Integer>();
			Query query = entityManager.createQuery("select e from Course e");
			List<Course> courseAmbil = new ArrayList<Course>();
			courseAmbil = (List<Course>) query.getResultList();

			for (Course course : courseAmbil) {
				courses.add(course.getCourse_id());
			}

			semesters = new ArrayList<Integer>();
			Query querySemester = entityManager.createQuery("select a from Semester a");
			List<Semester> semesterAmbil = new ArrayList<Semester>();
			semesterAmbil = (List<Semester>) querySemester.getResultList();

			for (Semester smstr : semesterAmbil) {
				semesters.add(smstr.getSemester_id());
			}

			readStudent();

			System.out.println("Iki Course---------------------- : " + courses);

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
		}
	}

	public void insertStudent() {

		EntityTransaction transaction = entityManager.getTransaction();

		try {
			Course course = new Course();
			course = entityManager.find(Course.class, courseIdInput);
			student.setCourseSaya(course);

			Semester smstrku = new Semester();
			smstrku = entityManager.find(Semester.class, semesterIdInput);
			student.setStudent(smstrku);

			transaction.begin();
			entityManager.persist(student);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistCourse transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	public void readStudent() {
		students = new ArrayList<Student>();
		TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s",Student.class);
		students = (List<Student>) query.getResultList();
//		System.out.println("Iki join masyukk : "+students);
		
		for (Student course : students) {
			Set<Course> y = course.getCourseSaya();
			System.out.println(course.getFirst_name());
			
			for (Course course2 : y) {
				System.out.println("IKi brooooo----------------------" +course2.getCourse_duration());
				System.out.println(course2.getCourse_name());
			}
		}
	}

	public void delStudent(int id) {
		try {
			entityManager.getTransaction().begin();

			// do something ...

			// add this if you fetched the Book entity in this session
			entityManager.flush();
			entityManager.clear();

			Query query = entityManager.createQuery("DELETE Student b WHERE student_id = :student_id");
			query.setParameter("student_id", id);
			query.executeUpdate();

			entityManager.getTransaction().commit();
			initiate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private Student bantuGanti;

	public void bantuUpdate(int id) {

		TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s where student_id = : studentku",
				Student.class);
		query.setParameter("studentku", id);
		bantuGanti = new Student();
		bantuGanti = query.getSingleResult();
		System.out.println("ki lo ---------------------------" + bantuGanti);
		initiate();
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('dlg2').show();");

	}

	public void updateStudent(int studentID, int semId, String firstName, String middleName,
			String lastName, int gender, String address, String contactNo, String emailId) {

		try {
			entityManager.getTransaction().begin();

			Student student1 = new Student();
			student1 = entityManager.find(Student.class, studentID);

			Semester semester1 = new Semester();
			semester1 = entityManager.find(Semester.class, semId);
			
			student1.setStudent(semester1);
			student1.setFirst_name(firstName);
			student1.setMiddle_name(middleName);
			student1.setLast_name(lastName);
			student1.setGender(gender);
			student1.setAddress(address);
			student1.setContact_no(contactNo);
			student1.setEmail_id(emailId);

			System.out.println("iki update ----------------- : " + semUpdate);

			System.out.println("iki semester : " + semester1);

			System.out.println("iki student : " + student1);

//			Query query = entityManager.createQuery("UPDATE Student s SET s.first_name = :firstName,"
//					+ "s.middle_name = :middleName, s.last_name = :lastName, s.gender = :gender, s.address = :address, s.contact_no = :contactNo, "
//					+ "s.email_id = :emailId WHERE s.student_id = :studentID");
//			query.setParameter("studentID", studentID);
////			  query.setParameter("courseId",courseId); 
////			  query.setParameter("semId", semesterId);
//			query.setParameter("firstName", firstName);
//			query.setParameter("middleName", middleName);
//			query.setParameter("lastName", lastName);
//			query.setParameter("gender", gender);
//			query.setParameter("address", address);
//			query.setParameter("contactNo", contactNo);
//			query.setParameter("emailId", emailId);
//			query.executeUpdate();

			entityManager.getTransaction().commit();

			initiate();

		} catch (Exception e) {
			System.out.println("Error Boss ---------------- : " + e);
		}

	}

	public Student getBantuGanti() {
		return bantuGanti;
	}

	public List<Student> getStudents() {
		return students;
	}

	public int getSemesterIdInput() {
		return semesterIdInput;
	}

	public void setSemesterIdInput(int semesterIdInput) {
		this.semesterIdInput = semesterIdInput;
	}

	public Student getStudent() {
		return student;
	}

	public int getCourseIdInput() {
		return courseIdInput;
	}

	public void setCourseIdInput(int courseIdInput) {
		this.courseIdInput = courseIdInput;
	}

	public List<Integer> getCourses() {
		return courses;
	}

	public List<Integer> getSemesters() {
		return semesters;
	}

	public int getSemUpdate() {
		return semUpdate;
	}

	public void setSemUpdate(int semUpdate) {
		this.semUpdate = semUpdate;
	}

	public int getCourseUpdate() {
		return courseUpdate;
	}

	public void setCourseUpdate(int courseUpdate) {
		this.courseUpdate = courseUpdate;
	}

}
