package com.mini.ejb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.primefaces.PrimeFaces;
import org.primefaces.event.RowEditEvent;

import com.mini.entity.Event;

@Named
@ApplicationScoped
public class EventEJB {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	
	Event ev = new Event();
	String start_date,end_date;
	
	@PostConstruct
	public void initiate() {
		
		try {
			
			System.out.println( "running .... ");
			
			
			factory = Persistence.createEntityManagerFactory("TrainingUnit");
			
			entityManager = factory.createEntityManager();
			
			System.out.println( "running .... 1");
			
			System.out.println( "running .... 2");
			
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
			
		} finally {
		
			
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
	
	public void saveCourse() {
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			
			transaction.begin();
			entityManager.persist(ev);
			transaction.commit();
			initiate();
		} catch (Exception e) {
			
			e.printStackTrace();
			
			
			if (transaction.isActive()) {
				System.out.println( "running .... persistCourse transaction.isActive()");
				transaction.rollback();
			}
		}
	}
	
	
	
	public static List getAllEvent() {
		Query query2 = entityManager.createQuery("Select e from Event e");
		List allEvent = query2.getResultList();
		if (allEvent != null && allEvent.size() > 0) {           
            return allEvent;
        } else {
            return null;
        }
	}
	
	public void getDelete(int event_id) {

		  EntityManager em = factory.createEntityManager();
		  em.getTransaction().begin();

		  // do something ...

		  // add this if you fetched the Book entity in this session
		  em.flush();
		  em.clear();

		  Query query = em.createQuery("DELETE Event s WHERE event_id = :event_id");
		  query.setParameter("event_id", event_id);
		  query.executeUpdate();

		  em.getTransaction().commit();
		  em.close();

		  initiate();
	}
	
//	public void Update(int event_id, String event_name, Date start_date, Date end_date) {
//		EntityManager em = factory.createEntityManager();
//		
//			em.getTransaction().begin();
//			
//			Query queryUpdate=em.createQuery("UPDATE EVENT SET event_id = :event_id,"
//					+ "event_name = :event_name, start_date = :start_date, end_date = :end_date WHERE event_id = :event_id");
//			queryUpdate.setParameter("event_id", event_id).setParameter("event_name", event_name).setParameter("start_date", start_date)
//			.setParameter("end_date", end_date);
//			
//			queryUpdate.executeUpdate();
//			em.getTransaction().commit();
//			
//			initiate();
//
//	}
	
	public void Update(int event_id, String event_name, String start, String end) {
		 try {
			   Event eventUpdate = new Event();
			   eventUpdate =  entityManager.find(Event.class, event_id);
			   
			   Date startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(start);
			   Date endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(end);
			   
			   entityManager.getTransaction().begin();
			   
			   eventUpdate.setEvent_id(event_id);
			   eventUpdate.setEvent_name(event_name);;
			   eventUpdate.setStart_date(startDate);
			   eventUpdate.setEnd_date(endDate);
			   
			   
			   entityManager.getTransaction().commit();
			   initiate();
			  } catch (Exception e) {
			   // TODO: handle exception
			  }
	}
	
	public void updateDate(int event_id) {
		 TypedQuery<Event> query = entityManager.createQuery("SELECT s FROM Event s where event_id = : event_id",
				    Event.class);
				  query.setParameter("event_id",event_id);
				  Event updateEvent = new Event();
				  updateEvent = query.getSingleResult();
				  start_date = updateEvent.getStart_date().toString();
				  end_date = updateEvent.getEnd_date().toString();
				  initiate();
				  PrimeFaces current = PrimeFaces.current();
				  current.executeScript("PF('dlg4').show();");
	}
	
	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Feedback Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Edit Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Event getEvent() {
		return ev;
	}

	public void setEvent(Event ev) {
		this.ev = ev;
	}
	

}
