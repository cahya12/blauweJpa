package com.mini.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.mini.entity.Course;
import com.mini.entity.Faculties;
import com.mini.entity.Feedback;
import com.mini.model.Faculties2;

@Named
@ApplicationScoped
// @ViewScoped
public class MiniProjectFaculties implements Serializable {
	static final long serialVersionUID = 1l;
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;

	Faculties faculties = new Faculties();
	List<Faculties> fac2 = new ArrayList<>();
	Faculties2 f2 = new Faculties2();
	Course course;

	// List<Faculties> data = new ArrayList<Faculties>();

	// private Map<Integer,Map<Integer,Integer>> data = new HashMap<Integer,
	// Map<Integer,Integer>>();
	private int courseIdInput;
	private List<Integer> courses = new ArrayList<Integer>();

	@PostConstruct
	public void initiate() {
		try {
			factory = Persistence.createEntityManagerFactory("TrainingUnit");
			entityManager = factory.createEntityManager();
			Query query = entityManager.createQuery("select e from Course e");
			List<Course> courseAmbil = (List<Course>) query.getResultList();
			for (Course course : courseAmbil) {
				courses.add(course.getCourse_id());
			}

			// Read Table
			Query queryObj = entityManager.createQuery("SELECT i FROM Faculties i");
			fac2 = queryObj.getResultList();

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
		}
	}

	public void insertFaculty() {

		EntityTransaction transaction = entityManager.getTransaction();

		try {
			Course course = new Course();
			course = entityManager.find(Course.class, f2.getCourse_id());
			Faculties f = new Faculties();
			f.setCourseSaya(course);
			f.setFaculty_id(f2.getFaculty_id());
			f.setFirst_name(f2.getFirst_name());
			f.setMiddle_name(f2.getMiddle_name());
			f.setLast_name(f2.getLast_name());
			f.setAddress(f2.getAddress());
			f.setDesignation(f2.getDesignation());
			f.setCourse_id(f2.getCourse_id());
			// f.setFaculty_type(f2.getFaculty_type());
			f.setFaculty_type(f2.getFaculty_type());

			transaction.begin();
			entityManager.persist(f);
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

	public void deleteTopic(int faculty_id) {
		EntityManager c = factory.createEntityManager();
		c.getTransaction().begin();

		c.flush();
		c.clear();

		// query
		// setParameter
		Query query = c.createQuery("DELETE Faculties e WHERE faculty_id = :faculty_id");
		query.setParameter("faculty_id", faculty_id);
		query.executeUpdate();

		c.getTransaction().commit();
		c.close();

		initiate();

	}

	public void updateData(int faculty_id, String first_name, String middle_name, String last_name, String address, String designation, int course_id, String faculty_type) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery(
				"update Faculties set first_name = :first_name, middle_name = :middle_name, last_name = :last_name, address = :address, designation = :designation, course_id = :course_id, faculty_type = :faculty_type where faculty_id= :faculty_id");
		query.setParameter("faculty_id", faculty_id).setParameter("first_name", first_name)
				.setParameter("middle_name", middle_name).setParameter("last_name", last_name)
				.setParameter("address", address).setParameter("designation", designation).setParameter("course_id", course_id).setParameter("faculty_type", faculty_type);

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

	public Faculties2 getF2() {
		return f2;
	}

	public void setF2(Faculties2 f2) {
		this.f2 = f2;
	}

	public Faculties getFaculty() {
		return faculties;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getCourseIdInput() {
		return courseIdInput;
	}

	public void setCourseIdInput(int courseIdInput) {
		this.courseIdInput = courseIdInput;
	}

	public List<Integer> getCourses() {
		return courses;
	}

	public List<Faculties> getAllData() {
		return fac2;
	}

}