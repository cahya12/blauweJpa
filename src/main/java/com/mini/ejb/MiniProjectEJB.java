package com.mini.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.*;
import javax.tools.JavaCompiler.CompilationTask;
import javax.transaction.Transactional;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.mini.entity.Admin;
import com.mini.entity.ContactUs;
import com.mini.entity.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@ApplicationScoped
public class MiniProjectEJB {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	static int counter = 102;

	Admin _a = new Admin();
	Course _c = new Course();
	ContactUs _cu = new ContactUs();
	List<Course> courseList = new ArrayList<Course>();
	List<Admin> adminList = new ArrayList<Admin>();
	List<ContactUs> contactusList = new ArrayList<ContactUs>();

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {

		try {

			System.out.println("running .... ");

			factory = Persistence.createEntityManagerFactory("TrainingUnit");

			entityManager = factory.createEntityManager();

			System.out.println("running .... 123");

			System.out.println("running .... 2");

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

	public void cekAdmin() {
		try {
			Query query = entityManager.createQuery("select e from Admin e");

			adminList = (List<Admin>) query.getResultList();
			query.getResultList();

			System.out.println(query.getFirstResult());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void cekCourse() {
		try {
			Query query = entityManager.createQuery("select e from Course e");

			courseList = (List<Course>) query.getResultList();
			query.getResultList();

			System.out.println(query.getFirstResult());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void setAdmin(Admin a) {
		this._a = a;
	}

	public Admin getAdmin() {

		return _a;
	}

	public void setCourse(Course e) {
		this._c = e;
	}

	public Course getCourse() {

		return _c;
	}

	public void setContactUs(ContactUs cu) {
		this._cu = cu;
	}

	public ContactUs getContactUs() {

		return _cu;
	}

	public List<Admin> getAdminList() {
		return adminList;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public List<ContactUs> getContactusList() {
		return contactusList;
	}

}
