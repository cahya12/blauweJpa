package com.mini.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.*;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.mini.entity.Feedback;
import com.verdin.jsf.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@ApplicationScoped
public class MiniProjectFeedback {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	static int counter = 1000;

	Feedback _c = new Feedback();

	List<Feedback> data = new ArrayList<Feedback>();

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void initiate() {

		try {

			System.out.println("running .... ");

			factory = Persistence.createEntityManagerFactory("TrainingUnit");

			entityManager = factory.createEntityManager();

			System.out.println("running .... 1");

			System.out.println("running .... 2");

			Query query = entityManager.createQuery("Select e " + "from Feedback e ");

			data = (List<Feedback>) query.getResultList();

			/* viewTable(); */

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

			Feedback c = new Feedback();

			c.setFeedback_id(counter++);
			c.setUser_name("aaaa");
			c.setEmail_id("ajeng@mail.com");
			c.setSubject("mate");
			c.setDescription("lala");

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

	public void saveCourse() {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			entityManager.persist(_c);

			transaction.commit();
			
			initiate();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistCourse transaction.isActive()");
				transaction.rollback();
			} 
		}
	}

	public void deleteTopic(int feedback_id) {
		EntityManager c = factory.createEntityManager();
		c.getTransaction().begin();

		c.flush();
		c.clear();

		// query
		// setParameter
		Query query = c.createQuery("DELETE Feedback e WHERE feedback_id = :feedback_id");
		query.setParameter("feedback_id", feedback_id);
		query.executeUpdate();

		c.getTransaction().commit();
		c.close();

		initiate();

	}

	/**
	 * @param id
	 * 
	 * @return number of affected columns .
	 */
	public int deleteTopicById(int id) {
		Query query = entityManager.createNativeQuery("Delete from Feedback where ID=?");
		query.setParameter(1, id);
		return query.executeUpdate();

	}

	public void updateData(int feedback_id, String user_name, String email_id, String subject, String description) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery(
				"update Feedback set user_name = :user_name, email_id = :email_id, subject = :subject, description = :description where feedback_id= :feedback_id");
		query.setParameter("feedback_id", feedback_id).setParameter("user_name", user_name)
				.setParameter("email_id", email_id).setParameter("subject", subject)
				.setParameter("description", description);

		query.executeUpdate();
		em.getTransaction().commit();

		initiate();

	}

	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Feedback Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Edit Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onCellEdit(CellEditEvent event) {
		Object oldValue = event.getOldValue();
		Object newValue = event.getNewValue();

		if (newValue != null && !newValue.equals(oldValue)) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed",
					"Old: " + oldValue + ", New:" + newValue);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void setCourse(Feedback e) {
		this._c = e;
	}

	public Feedback getFeedback() {

		return _c;
	}

	public List<Feedback> getData() {
		return data;
	}

}
