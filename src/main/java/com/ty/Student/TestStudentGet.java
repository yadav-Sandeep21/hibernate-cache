package com.ty.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestStudentGet {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Student student=entityManager.find(Student.class, 1);
		System.out.println(student);
		
		EntityManager entityManager1=entityManagerFactory.createEntityManager();

		Student student1=entityManager1.find(Student.class, 1);
		System.out.println(student1);
		
	}

}
