package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Price;

public class CoffeeDAO {
	
	//@SuppressWarnings("null")
	public static boolean insertPrice(int price) {
		
		Price price2 = new Price();
		price2 = new Price(price2.getPriceKey(), price, price2.getMenu());

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("encore");
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

	public static ArrayList<Price> getAllPrice() throws SQLException{

	}

	public static Price getPrice() throws SQLException{

	}

}
