package com.mini.ejb;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mini.entity.Course;
import com.mini.entity.Semester;

@Named
@ApplicationScoped

public class SemesterView {

	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;

	private int courseID;
	private List<Integer> courses;
	private List<Course> courseAmbil;

	Course c = new Course();
	Semester s;

	private List<Semester> sem;

	@PostConstruct
	public void init() {
		try {
			showCourse();
			s = new Semester();
			factory = Persistence.createEntityManagerFactory("TrainingUnit");
			entityManager = factory.createEntityManager();

			courses = new ArrayList<Integer>();
			Query query = entityManager.createQuery("select e from Course e");
			courseAmbil = new ArrayList<Course>();
			courseAmbil = (List<Course>) query.getResultList();
			for (Course course : courseAmbil) {
				courses.add(course.getCourse_id());
			}

			// Read Table
			sem = new ArrayList<>();
			Query queryObj = entityManager.createQuery("SELECT i FROM Semester i");
			sem = queryObj.getResultList();

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
		}
	}

	public void create() {
		EntityTransaction transaction = entityManager.getTransaction();

		Course course = new Course();
		course = entityManager.find(Course.class, courseID);
		s.setCourse(course);

		transaction.begin();
		entityManager.persist(s);
		transaction.commit();

	}

	public void cobaDelete(int semester_id) {
		try {

			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();

			em.flush();
			em.clear();

			Query query = em.createQuery("DELETE Semester s WHERE semester_id = :semester_id");
			query.setParameter("semester_id", semester_id);
			query.executeUpdate();

			em.getTransaction().commit();
			em.close();

		} catch (Exception e) {
			System.out.println("DELETE SEMESTER");
			System.out.println(e);
		}

	}
	
	  public void delChy(int id) {
		    try {
		      entityManager.getTransaction().begin();

		      // do something ...

		      // add this if you fetched the Book entity in this session
		      entityManager.flush();
		      entityManager.clear();

		      Query query = entityManager.createQuery("DELETE Semester WHERE semester_id = :semester_id");
		      query.setParameter("semester_id", id);
		      query.executeUpdate();

		      entityManager.getTransaction().commit();
		      entityManager.close();

		      init();
		    } catch (Exception e) {
		      // TODO: handle exception
		    }
		  }

	public void delete(int semester_id) {
		try {

			entityManager.getTransaction().begin();

			Semester sem = (Semester) entityManager.find(Semester.class, semester_id);
			entityManager.find(Semester.class, semester_id);
			entityManager.createQuery("delete Semester c where c.semester_id=:semester_id")
					.setParameter("semester_id", semester_id).executeUpdate();
			entityManager.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("DELETE SEMESTER");
			System.out.println(e);
		}

	}

	public void cobaUpdate(int semester_id, int course_id, String semester) {
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		Semester course = (Semester) entityManager.find(Semester.class, semester_id);
		entityManager.find(Semester.class, semester_id);
		entityManager.createQuery("update Semester c set semester = :semester where semester_id=:semester_id")
				.setParameter("semester_id", semester_id).setParameter("semester", semester).executeUpdate();
		transaction.commit();

		// init();

	}
	
	public void showCourse() {
	    try {
	      Query query = entityManager.createQuery("select e from Semester e");

	      sem = (List<Semester>) query.getResultList();
	      query.getResultList();
	      System.out.println(query.getFirstResult());
	    } catch (Exception e) {
	      // TODO: handle exception
	    }
	  }

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int semesterID) {
		this.courseID = semesterID;
	}

	public Semester getSemester() {
		return s;
	}

	public List<Course> getCourseAmbil() {
		return courseAmbil;
	}

	public List<Integer> getCourses() {
		return courses;
	}

	public List<Semester> getSem() {
		return sem;
	}

}
