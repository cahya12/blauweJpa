package com.mini.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.tools.JavaCompiler.CompilationTask;
import javax.transaction.Transactional;
import com.mini.entity.News;
import com.mini.entity.News;
import com.mini.entity.News;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@ApplicationScoped
public class NewsEJB {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	static int counter = 102;

	News _c = new News();
	List<News> courseList = new ArrayList<News>();

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {

		try {

			System.out.println("running News.... ");

			factory = Persistence.createEntityManagerFactory("TrainingUnit");

			entityManager = factory.createEntityManager();

			System.out.println("running .... 123");

			System.out.println("running .... 2");

			showNews();

			System.out.println("Running ..... 3");

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();

		} finally {

		}
	}

	public void testing() {

		try {
			System.out.println("running .... persistNews 1");

			persistNews(entityManager);

			System.out.println("running .... persistNews 2");

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

	private void persistNews(EntityManager entityManager) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			News c = new News();

			c.setNews_id(counter++);

			entityManager.persist(c);

			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistNews transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	// News
	public void showNews() {
		try {
			Query query = entityManager.createQuery("select e from News e");

			courseList = (List<News>) query.getResultList();
			query.getResultList();
			System.out.println(query.getFirstResult());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void saveNews() {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			entityManager.persist(_c);

			transaction.commit();

			init();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistNews transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	public void delNews(int id) {
		try {
			entityManager.getTransaction().begin();

			// do something ...

			// add this if you fetched the Book entity in this session
			entityManager.flush();
			entityManager.clear();

			Query query = entityManager.createQuery("DELETE News b WHERE news_id = :news_id");
			query.setParameter("news_id", id);
			query.executeUpdate();

			entityManager.getTransaction().commit();
			entityManager.close();

			init();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void updatecoba(int news_id, String course_name, String course_duration, String description) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			News course = (News) entityManager.find(News.class, news_id);
			entityManager.find(News.class, news_id);
			entityManager.createQuery(
					"update News c set c.course_name = :course_name, c.course_duration = :course_duration, c.description = :description where c.news_id=:news_id")
					.setParameter("course_name", course_name).setParameter("news_id", news_id)
					.setParameter("course_duration", course_duration).setParameter("description", description)
					.executeUpdate();
			transaction.commit();

			init();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistNews transaction.isActive()");
				transaction.rollback();
			}
		}

	}

	public void setNews(News e) {
		this._c = e;
	}

	public News getNews() {

		return _c;
	}

	public List<News> getNewsList() {
		return courseList;
	}

}
