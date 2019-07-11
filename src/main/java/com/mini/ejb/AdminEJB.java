package com.mini.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.tools.JavaCompiler.CompilationTask;
import javax.transaction.Transactional;

import com.mini.entity.Admin;
import com.mini.entity.Course;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@ApplicationScoped
public class AdminEJB {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	static int counter = 102;

	Admin _c = new Admin();
	List<Admin> adminList = new ArrayList<Admin>();

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {

		try {

			System.out.println("running Admin .... ");

			factory = Persistence.createEntityManagerFactory("TrainingUnit");

			entityManager = factory.createEntityManager();

			System.out.println("running .... 123");

			System.out.println("running .... 2");

			showAdmin();

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
	public void showAdmin() {
		try {
			Query query = entityManager.createQuery("select e from Admin e");

			adminList = (List<Admin>) query.getResultList();
			query.getResultList();
			System.out.println(query.getFirstResult());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void saveAdmin() {
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

	public void delAdmin(int id) {
		try {
			entityManager.getTransaction().begin();

			// do something ...

			// add this if you fetched the Book entity in this session
			entityManager.flush();
			entityManager.clear();

			Query query = entityManager.createQuery("DELETE Admin b WHERE admin_id = :admin_id");
			query.setParameter("admin_id", id);
			query.executeUpdate();

			entityManager.getTransaction().commit();
			entityManager.close();

			init();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void updateAdmin(int admin_id, String admin_name, String password) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			Admin admin = (Admin) entityManager.find(Admin.class, admin_id);
			entityManager.find(Admin.class, admin_id);
			entityManager.createQuery(
					"update Admin c set c.admin_name = :admin_name, c.password = :password where c.course_id=:course_id")
					.setParameter("admin_name", admin_name).setParameter("admin_id", admin_id)
					.setParameter("password", password).executeUpdate();
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

	public void setAdmin(Admin e) {
		this._c = e;
	}

	public Admin getAdmin() {

		return _c;
	}

	public List<Admin> getAdminList() {
		return adminList;
	}

}
