package com.mini.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.tools.JavaCompiler.CompilationTask;
import javax.transaction.Transactional;
import com.mini.entity.Course;
import com.mini.entity.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@ApplicationScoped
public class SubjectEJB {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	static int counter = 102;

	Event _c = new Event();
	List<Event> courseList = new ArrayList<Event>();

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {

		try {

			System.out.println("running .... ");

			factory = Persistence.createEntityManagerFactory("TrainingUnit");

			entityManager = factory.createEntityManager();

			System.out.println("running .... 123");

			System.out.println("running .... 2");

			showCourse();

			System.out.println("Running ..... 3");

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();

		} finally {

		}
	}

	public void testing() {

		try {
			System.out.println("running .... persistCourse 1");

			persistCourse(entityManager);

			System.out.println("running .... persistCourse 2");

		} catch (Exception e) {
			// LOGGER.log(Level.SEVERE, e.getMessage(), e);

			System.out.println(e.getMessage());

			e.printStackTrace();

		}
	}

	@PreDestroy
	public void destroyrun() {

		if (entityManager != null) {
			entityManager.close();
		}

		if (factory != null) {
			factory.close();
		}
	}

	private void persistCourse(EntityManager entityManager) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			Course c = new Course();

			c.setCourse_id(counter++);
			c.setCourse_duration("2 days");
			c.setCourse_name("MGDG");
			c.setDescription("hola");

			entityManager.persist(c);

			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistCourse transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	// Course
	public void showCourse() {
		try {
			Query query = entityManager.createQuery("select e from Event e");

			courseList = (List<Event>) query.getResultList();
			query.getResultList();
			System.out.println(query.getFirstResult());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void saveCourse() {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			entityManager.persist(_c);

			transaction.commit();

			init();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistCourse transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	public void delCourse(int id) {
		try {
			entityManager.getTransaction().begin();

			// do something ...

			// add this if you fetched the Book entity in this session
			entityManager.flush();
			entityManager.clear();

			Query query = entityManager.createQuery("DELETE Course b WHERE course_id = :course_id");
			query.setParameter("course_id", id);
			query.executeUpdate();

			entityManager.getTransaction().commit();
			entityManager.close();

			init();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void updatecoba(int course_id, String course_name, String course_duration, String description) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			Course course = (Course) entityManager.find(Course.class, course_id);
			entityManager.find(Course.class, course_id);
			entityManager.createQuery(
					"update Course c set c.course_name = :course_name, c.course_duration = :course_duration, c.description = :description where c.course_id=:course_id")
					.setParameter("course_name", course_name).setParameter("course_id", course_id)
					.setParameter("course_duration", course_duration).setParameter("description", description)
					.executeUpdate();
			transaction.commit();

			init();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistCourse transaction.isActive()");
				transaction.rollback();
			}
		}

	}

	public void setCourse(Event e) {
		this._c = e;
	}

	public Event getCourse() {

		return _c;
	}

	public List<Event> getCourseList() {
		return courseList;
	}

}
