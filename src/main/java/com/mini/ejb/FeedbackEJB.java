package com.mini.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.tools.JavaCompiler.CompilationTask;
import javax.transaction.Transactional;
import com.mini.entity.Feedback;
import com.mini.entity.Feedback;
import com.mini.entity.Feedback;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@ApplicationScoped
public class FeedbackEJB {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	static int counter = 102;

	Feedback _c = new Feedback();
	List<Feedback> courseList = new ArrayList<Feedback>();

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {

		try {

			System.out.println("running Feedback.... ");

			factory = Persistence.createEntityManagerFactory("TrainingUnit");

			entityManager = factory.createEntityManager();

			System.out.println("running .... 123");

			System.out.println("running .... 2");

			showFeedback();

			System.out.println("Running ..... 3");

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();

		} finally {

		}
	}

	public void testing() {

		try {
			System.out.println("running .... persistFeedback 1");

			persistFeedback(entityManager);

			System.out.println("running .... persistFeedback 2");

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

	private void persistFeedback(EntityManager entityManager) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			Feedback c = new Feedback();

			c.setFeedback_id(counter++);
			c.setDescription("hola");

			entityManager.persist(c);

			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistFeedback transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	// Feedback
	public void showFeedback() {
		try {
			Query query = entityManager.createQuery("select e from Feedback e");

			courseList = (List<Feedback>) query.getResultList();
			query.getResultList();
			System.out.println(query.getFirstResult());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void saveFeedback() {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			entityManager.persist(_c);

			transaction.commit();

			init();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistFeedback transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	public void delFeedback(int id) {
		try {
			entityManager.getTransaction().begin();

			// do something ...

			// add this if you fetched the Book entity in this session
			entityManager.flush();
			entityManager.clear();

			Query query = entityManager.createQuery("DELETE Feedback b WHERE feedback_id = :feedback_id");
			query.setParameter("feedback_id", id);
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

			Feedback course = (Feedback) entityManager.find(Feedback.class, course_id);
			entityManager.find(Feedback.class, course_id);
			entityManager.createQuery(
					"update Feedback c set c.course_name = :course_name, c.course_duration = :course_duration, c.description = :description where c.course_id=:course_id")
					.setParameter("course_name", course_name).setParameter("course_id", course_id)
					.setParameter("course_duration", course_duration).setParameter("description", description)
					.executeUpdate();
			transaction.commit();

			init();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistFeedback transaction.isActive()");
				transaction.rollback();
			}
		}

	}

	public void setFeedback(Feedback e) {
		this._c = e;
	}

	public Feedback getFeedback() {

		return _c;
	}

	public List<Feedback> getFeedbackList() {
		return courseList;
	}

}
