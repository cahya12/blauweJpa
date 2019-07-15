package com.mini.ejb;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.primefaces.PrimeFaces;

import com.mini.entity.News;
import com.mini.entity.Student;

@Named
@ApplicationScoped
public class NewsEJB implements Serializable {
	static final long serialVersionUID = 1l;
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;

	News news;
	List<News> newses;
	int i = 0;
	String startDate, endDate, startUpdate,endUpdate;
	boolean onhomePage, onhomeUpdate;
	Date start_Date, end_Date;
	List<String> onhome;
	
	News updateNewsLur;

	@PostConstruct
	public void init() {
		try {
			startDate = "";
			endDate = "";
			onhomePage = false;
			news = new News();
			factory = Persistence.createEntityManagerFactory("TrainingUnit");
			entityManager = factory.createEntityManager();
			onhome = new ArrayList<String>();
			onhome.add("true");
			onhome.add("false");
			readNews();
		} catch (Exception e) {

		}
	}

	public void insertNews() {
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			i = i + 1;
			start_Date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startDate);
			end_Date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endDate);
			transaction.begin();
			news.setEnd_date(end_Date);
			news.setStart_date(start_Date);
			news.setOnhomepage(onhomePage);
			news.setNews_id(i);
			entityManager.persist(news);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();

			if (transaction.isActive()) {
				System.out.println("running .... persistCourse transaction.isActive()");
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
			init();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void updateNews(int id, String newsTitle, String newsContent, 
			String dateStart, String dateEnd) {
		
		try {
			News newsUpdate = new News();
			newsUpdate =  entityManager.find(News.class, id);
			
			Date updateStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateStart);
			Date endStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateEnd);
			
			entityManager.getTransaction().begin();
			
			newsUpdate.setNews_title(newsTitle);
			newsUpdate.setNews_content(newsContent);
			newsUpdate.setOnhomepage(onhomeUpdate);
			newsUpdate.setStart_date(updateStart);
			newsUpdate.setEnd_date(endStart);
			
			entityManager.getTransaction().commit();
			init();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void readNews() {
		try {
			newses = new ArrayList<News>();
			Query query = entityManager.createQuery("SELECT x FROM News x");
			newses = query.getResultList();
			System.out.println("Iki news ----------------------------- : " + newses);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bosokkkk " + e);
		}
	}
	
	public void bantuUpdate(int id) {

		TypedQuery<News> query = entityManager.createQuery("SELECT s FROM News s where news_id = : newsku",
				News.class);
		query.setParameter("newsku", id);
		updateNewsLur = new News();
		updateNewsLur = query.getSingleResult();
		startUpdate = updateNewsLur.getStart_date().toString();
		endUpdate = updateNewsLur.getEnd_date().toString();
		init();
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('dlg4').show();");

	}

	public String getStartUpdate() {
		return startUpdate;
	}

	public void setStartUpdate(String startUpdate) {
		this.startUpdate = startUpdate;
	}

	public String getEndUpdate() {
		return endUpdate;
	}

	public void setEndUpdate(String endUpdate) {
		this.endUpdate = endUpdate;
	}

	public boolean getOnhomeUpdate() {
		return onhomeUpdate;
	}

	public void setOnhomeUpdate(boolean onhomeUpdate) {
		this.onhomeUpdate = onhomeUpdate;
	}

	public News getUpdateNewsLur() {
		return updateNewsLur;
	}

	public News getNews() {
		return news;
	}

	public List<News> getNewses() {
		return newses;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public boolean isOnhomePage() {
		return onhomePage;
	}

	public void setOnhomePage(boolean onhomePage) {
		this.onhomePage = onhomePage;
	}

	public List<String> getOnhome() {
		return onhome;
	}

}
