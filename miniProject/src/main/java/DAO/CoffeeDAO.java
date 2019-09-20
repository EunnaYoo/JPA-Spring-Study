package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Price;

public class CoffeeDAO {
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("encore");
	
	public static boolean insertPrice(int price) {
		Price price2 = new Price(price);
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(price2);
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			em.close();
			factory.close();
		}
		return true;
	}

//	public static boolean insertMenu() {
//
//	}
//
//	public static boolean insertRecipe() {
//
//	}

}
