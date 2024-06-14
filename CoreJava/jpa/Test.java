package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("apple");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();// create connection

		Employee emp1 = em.find(Employee.class, 100);
		
		Employee emp2 = em.find(Employee.class, 101);
		
		System.out.println(emp1);
		
		System.out.println(emp2);
		
		em.remove(emp1);
	
		em.getTransaction().commit();// commit

		em.close(); // closing the connections

	}
}
