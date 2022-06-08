package com.ty.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setName("Nani");
		student.setEmail("nani@gmail.com");
		student.setPhone(85667889l);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

}
