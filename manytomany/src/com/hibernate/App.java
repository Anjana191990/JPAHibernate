package com.hibernate;
import org.hibernate.Session;
import com.model.Student;
import com.model.Subject;
public class App {
		public static void main(String[] args) {
			 //public Student(String firstName, String lastName)
	        Student student1 = new Student("kartiki","k");
	        Student student2 = new Student("meghna", "m");
	        Student student3 = new Student("Akash", "P");
	        Student student4 = new Student("Amisha", "G");
	        //public Subject(String name)
	        
	        Subject subject1 = new Subject("Spring");
	        Subject subject2 = new Subject("Devops");
	        Subject subject3 = new Subject("vew js");
	 
	        //Student1 have 3 subjects
	        student1.getSubjects().add(subject3);
	        student2.getSubjects().add(subject2);
	        student3.getSubjects().add(subject1);
	        student3.getSubjects().add(subject2);
	        
	        //Student2 have 2 subjects
	        student4.getSubjects().add(subject1);
	        student4.getSubjects().add(subject2);
	        student4.getSubjects().add(subject3);
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	 //persist=means storing/saving data
	        session.persist(student1);
	        session.persist(student2);
	        session.persist(student3);
	         
	        session.persist(student4);
	         
	         
	        session.getTransaction().commit();
	        session.close();  
	    }
	 
	}

