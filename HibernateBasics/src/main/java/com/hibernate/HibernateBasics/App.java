package com.hibernate.HibernateBasics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Student s1 = new Student();
		s1.setId(106);
		s1.setName("capgemini-6");
		s1.setFees(600L);

		em.persist(s1);

		em.getTransaction().commit();

		emf.close();
		em.close();
	}
}
