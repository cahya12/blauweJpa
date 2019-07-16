package com.mini.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.tools.JavaCompiler.CompilationTask;
import javax.transaction.Transactional;
import com.mini.entity.Event;
import com.mini.entity.Event;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@ApplicationScoped
public class EventEJB {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	static int counter = 102;

	Event _c = new Event();
	List<Event> eventList = new ArrayList<Event>();

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {

		try {

			System.out.println("running .... ");

			factory = Persistence.createEntityManagerFactory("TrainingUnit");

			entityManager = factory.createEntityManager();

			System.out.println("running .... 123");

			System.out.println("running .... 2");

			showEvent();

			System.out.println("Running ..... 3");

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();

		} finally {

		}
	}

	public void testing() {

		try {
			System.out.println("running .... persistEvent 1");

			persistEvent(entityManager);

			System.out.println("running .... persistEvent 2");

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

	private void persistEvent(EntityManager entityManager) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			Event c = new Event();

			c.setEvent_id(counter++);
			c.setEvent_name("MGDG");

			entityManager.persist(c);

			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistEvent transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	// Event
	public void showEvent() {
		try {
			Query query = entityManager.createQuery("select e from Event e");

			eventList = (List<Event>) query.getResultList();
			query.getResultList();
			System.out.println(query.getFirstResult());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void saveEvent() {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			entityManager.persist(_c);

			transaction.commit();

			init();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistEvent transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	public void delEvent(int id) {
		try {
			entityManager.getTransaction().begin();

			// do something ...

			// add this if you fetched the Book entity in this session
			entityManager.flush();
			entityManager.clear();

			Query query = entityManager.createQuery("DELETE Event b WHERE event_id = :event_id");
			query.setParameter("event_id", id);
			query.executeUpdate();

			entityManager.getTransaction().commit();
			entityManager.close();

			init();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void updatecoba(int event_id, String event_name, Date event_duration, Date description) {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			transaction.begin();

			Event event = (Event) entityManager.find(Event.class, event_id);
			entityManager.find(Event.class, event_id);
			entityManager.createQuery(
					"update Event c set c.event_name = :event_name, c.event_duration = :event_duration, c.description = :description where c.event_id=:event_id")
					.setParameter("event_name", event_name).setParameter("event_id", event_id)
					.setParameter("event_duration", event_duration).setParameter("description", description)
					.executeUpdate();
			transaction.commit();

			init();

		} catch (Exception e) {

			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistEvent transaction.isActive()");
				transaction.rollback();
			}
		}

	}

	public void setEvent(Event e) {
		this._c = e;
	}

	public Event getEvent() {

		return _c;
	}

	public List<Event> getEventList() {
		return eventList;
	}

}
