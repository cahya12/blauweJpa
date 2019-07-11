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
public class ContactUsEJB {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	static int counter = 102;

	ContactUs _cu = new ContactUs();
	List<ContactUs> contactusList = new ArrayList<ContactUs>();

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {

		try {

			System.out.println("running ContactUs EJB.... ");

			factory = Persistence.createEntityManagerFactory("TrainingUnit");

			entityManager = factory.createEntityManager();

			System.out.println("running .... 123");

			System.out.println("running .... 2");

			showContactus();

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

	// Contact
	public void showContactus() {
		try {
			Query query = entityManager.createQuery("select e from ContactUs e");

			contactusList = (List<ContactUs>) query.getResultList();
			query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void saveContactUs() {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			entityManager.persist(_cu);

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

	public void delContactUs(int id) {
		try {
			entityManager.getTransaction().begin();

			// do something ...

			// add this if you fetched the Book entity in this session
			entityManager.flush();
			entityManager.clear();

			Query query = entityManager.createQuery("DELETE ContactUs b WHERE contact_us_id = :contact_us_id");
			query.setParameter("contact_us_id", id);
			query.executeUpdate();

			entityManager.getTransaction().commit();
			entityManager.close();

			init();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void updateContactUs(int contact_us_id, String name, String address, String phone_no, String email_id,
			String message) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			entityManager.find(ContactUs.class, contact_us_id);
			entityManager.createQuery(
					"update ContactUs c set c.name = :name, c.address =:address, c.address = :address, c.phone_no = :phone_no, c.email_id =:email_id, c.message =:message where c.contact_us_id=:contact_us_id")
					.setParameter("contact_us_id", contact_us_id).setParameter("name", name)
					.setParameter("address", address).setParameter("phone_no", phone_no)
					.setParameter("email_id", email_id).setParameter("message", message).executeUpdate();
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

	public void setContactUs(ContactUs cu) {
		this._cu = cu;
	}

	public ContactUs getContactUs() {

		return _cu;
	}

	public List<ContactUs> getContactusList() {
		return contactusList;
	}

}
