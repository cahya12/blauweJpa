package com.mini.ejb;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import org.primefaces.event.RowEditEvent;

import com.mini.entity.Course;
import com.mini.entity.Exam;
import com.mini.entity.Semester;
import com.mini.entity.Subject;


@Named
@ApplicationScoped
public class ExamEJB implements Serializable{
	static final long serialVersionUID = 1l;
	private static final Logger LOGGER = Logger.getLogger("JPA");
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;
	
	Exam exam = new Exam();
//	Exam2 exam2 = new Exam2();
	Date UpdateDate;
	String dates;
	
	private int courseIdInput, subjectIdInput, semesterIdInput;
	private List<Integer> courses;
	private List<Integer> sub;
	private List<Integer> semesters;
	
	
	
	@PostConstruct
	public void init() {
		try {
			exam = new Exam();
			factory = Persistence.createEntityManagerFactory("TrainingUnit");
			entityManager = factory.createEntityManager();
			
			courses = new ArrayList<Integer>();
			Query query = entityManager.createQuery("select e from Course e");
			List<Course> courseAmbil = new ArrayList<Course>();
			courseAmbil = (List<Course>) query.getResultList();
			for (Course course : courseAmbil) {
				courses.add(course.getCourse_id());
			}
			
			sub = new ArrayList<Integer>();
			Query querySub = entityManager.createQuery("select e from Subject e");
			List<Subject> subjectExam = new ArrayList<Subject>();
			subjectExam = (List<Subject>) querySub.getResultList();
			for (Subject subject : subjectExam) {
				sub.add(subject.getSubject_code());
			}
			
			semesters = new ArrayList<Integer>();
			Query querySemester = entityManager.createQuery("select a from Semester a");
			List<Semester> semesterAmbil = new ArrayList<Semester>();
			semesterAmbil = (List<Semester>) querySemester.getResultList();
			for (Semester smstr : semesterAmbil) {
				semesters.add(smstr.getSemester_id());
			}
			
			
		}
		catch (Exception e) {
					LOGGER.log(Level.SEVERE, e.getMessage(), e);
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
	
	
	public void insertExam() {
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			
			Course course = new Course();
			course = entityManager.find(Course.class, courseIdInput);
			exam.setCourse(course);
			
			Subject subject = new Subject();
			subject = entityManager.find(Subject.class, subjectIdInput);
			exam.setSubject(subject);
			
			Semester smt = new Semester();
			smt = entityManager.find(Semester.class, semesterIdInput);
			exam.setExam(smt);
			
//			UpdateDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dates);
//			exam.setDate(UpdateDate);

			
			
			transaction.begin();
			entityManager.persist(exam);			
			transaction.commit();
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
			
			if (transaction.isActive()) {
				System.out.println( "running .... persistCourse transaction.isActive()");
				transaction.rollback();
			}
		}
	}

	public void getDelete(int exam_id) {

			  EntityManager em = factory.createEntityManager();
			  em.getTransaction().begin();

			  // do something ...

			  // add this if you fetched the Book entity in this session
			  em.flush();
			  em.clear();

			  Query query = em.createQuery("DELETE Exam s WHERE exam_id = :exam_id");
			  query.setParameter("exam_id", exam_id);
			  query.executeUpdate();

			  em.getTransaction().commit();
			  em.close();

			  init();
		}

	public static List getAllExam() {
				Query query3 = entityManager.createQuery("Select e from Exam e");
				List allExam = query3.getResultList();
				if (allExam != null && allExam.size() > 0) {           
			    return allExam;
			} else {
			    return null;
			}
		}

	public void Update(int exam_id, int course_id, int semester_id, int subject_code, int marks, Date date2) {
			 try {
				   Exam examUpdate = new Exam();
				   examUpdate =  entityManager.find(Exam.class, exam_id);
				   
//				   Date dateUpdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date2);
//				   Date timeUpdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time);
//				   
				   entityManager.getTransaction().begin();
				   
				   Course course = new Course();
				   course = entityManager.find(Course.class, course_id);
				   examUpdate.setCourse(course);
				   
				   Subject subject = new Subject();
				   subject = entityManager.find(Subject.class, subject_code);
				   examUpdate.setSubject(subject);
					
				   Semester smt = new Semester();
				   smt = entityManager.find(Semester.class, semester_id);
				   examUpdate.setExam(smt);
				   
				   examUpdate.setExam_id(exam_id);
				   examUpdate.setMarks(marks);
				   examUpdate.setDate(date2);
				   
//				   entityManager.createQuery(
//							"update Exam c set c.exam_id = :exam_id, c.course_id = :course_id, c.semester_id = :semester_id, c.subject_code = :subject_code, c.marks =:marks, c.date =: date, c.time =:time where c.exam_id=:exam_id")
//							.setParameter("exam_id", exam_id).setParameter("course_id", course_id)
//							.setParameter("semesterExam_semester_id", semesterExam).setParameter("subject_code", subject_code)
//							.setParameter("marks", marks).setParameter("date", dateUpdate).setParameter("time", timeUpdate)
//							.executeUpdate();
				   
				   
				   entityManager.getTransaction().commit();
				   init();
				  } catch (Exception e) {
				   // TODO: handle exception
				  }
		}
	
	
	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Feedback Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Edit Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}


	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public int getCourseIdInput() {
		return courseIdInput;
	}

	public void setCourseIdInput(int courseIdInput) {
		this.courseIdInput = courseIdInput;
	}

	public int getSubjectIdInput() {
		return subjectIdInput;
	}

	public void setSubjectIdInput(int subjectIdInput) {
		this.subjectIdInput = subjectIdInput;
	}

	public int getSemesterIdInput() {
		return semesterIdInput;
	}

	public void setSemesterIdInput(int semesterIdInput) {
		this.semesterIdInput = semesterIdInput;
	}

	public List<Integer> getCourses() {
		return courses;
	}

	public void setCourses(List<Integer> courses) {
		this.courses = courses;
	}
	
	public List<Integer> getSub() {
		return sub;
	}

	public void setSub(List<Integer> sub) {
		this.sub = sub;
	}

	public List<Integer> getSemesters() {
		return semesters;
	}

	public void setSemesters(List<Integer> semesters) {
		this.semesters = semesters;
	}

	public Date getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(Date UpdateDate) {
		this.UpdateDate = UpdateDate;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}
	
	


}