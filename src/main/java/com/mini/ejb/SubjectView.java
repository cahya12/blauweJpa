package com.mini.ejb;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mini.entity.Course;
import com.mini.entity.Semester;
import com.mini.entity.Subject;

@Named
@ApplicationScoped
public class SubjectView {

	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;

	Subject s;
	private int semesterID;
	private List<Integer> sem;

	private List<Subject> sub = new ArrayList<>();

	@PostConstruct
	public void initial() {

		try {

			s = new Subject();
			factory = Persistence.createEntityManagerFactory("TrainingUnit");
			entityManager = factory.createEntityManager();

			sem = new ArrayList<Integer>();
			Query querySemester = entityManager.createQuery("select a from Semester a");
			List<Semester> idSem = new ArrayList<Semester>();
			idSem = (List<Semester>) querySemester.getResultList();
			for (Semester semester : idSem) {
				sem.add(semester.getSemester_id());
			}

			// Read Table
			Query queryObj = entityManager.createQuery("SELECT i FROM Subject i");
			sub = queryObj.getResultList();

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();

		} finally {

		}
	}

	public void createSubject() {
		EntityTransaction transaction = entityManager.getTransaction();

		try {

			Semester add = new Semester();
			add = entityManager.find(Semester.class, semesterID);
			s.setSubject(add);

			transaction.begin();
			entityManager.persist(s);
			transaction.commit();

		} catch (Exception e) {
			System.out.println("---------------------------------Coba");
			System.out.println(e);
		}

	}

	public void deleteSub(int subject_code) {
		try {

			 entityManager.getTransaction().begin();

		      // do something ...

		      // add this if you fetched the Book entity in this session
		      entityManager.flush();
		      entityManager.clear();

		      Query query = entityManager.createQuery("DELETE Subject WHERE subject_code = :subject_code");
		      query.setParameter("subject_code", subject_code);
		      query.executeUpdate();

		      entityManager.getTransaction().commit();
		      entityManager.close();

		} catch (Exception e) {
			System.out.println("-----------------------TEST-------");
			System.out.println(e);
		}

	}
	
	public void updateSub(int subject_code, int semester_id, String subject_name) {
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		Subject course = (Subject) entityManager.find(Subject.class, subject_code);
		entityManager.find(Subject.class, subject_code);
		entityManager.createQuery("update Subject c set subject_name = :subject_name where subject_code=:subject_code")
				.setParameter("subject_code", subject_code).setParameter("subject_name", subject_name).executeUpdate();
		transaction.commit();

		// init();

	}

	public int getSemesterID() {
		return semesterID;
	}

	public void setSemesterID(int semesterID) {
		this.semesterID = semesterID;
	}

	public List<Integer> getSem() {
		return sem;
	}

	public Subject getSub() {
		return s;
	}

	public List<Subject> getSubject() {
		return sub;
	}

}
