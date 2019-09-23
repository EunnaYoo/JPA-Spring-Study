package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Menu;
import entity.Price;
import entity.Recipe;

public class CRUD {
	
	static void logic(EntityManager em) {
		Menu menu = new Menu();
		menu.setName("아이스 아메리카노");
		em.persist(menu);
		
//		Price p= new Price();
//		p.setPrice(3800);
//		p.setMenu(menu);
		//em.persist(p);
		
		Recipe r= new Recipe();
		r.setWater("80g");
		r.setIce("80g");
		r.setCoffeebeans("10g");
		r.setMenu(menu);
		em.persist(r);
		
		Menu findM = em.find(Menu.class, menu.getMenucode());
		System.out.println(findM);
	
		//Price findP = em.find(Price.class, p.getPriceKey());
		//System.out.println(findP);
		
		Recipe findR = em.find(Recipe.class, r.getRecipecode());
		System.out.println(findR);
	}
	
	static void updateMenu(EntityManager em) {
		Menu m = em.find(Menu.class, 1);
		m.setName("아이스 라떼");
		
	}
	
	static void updatePrice(EntityManager em) {
		Price p = em.find(Price.class, 1);
		p.setPrice(4300);
		
	}
	
	static void updateRecipe(EntityManager em) {
		Recipe r = em.find(Recipe.class, 1);
		r.setMilk("70g");
		r.setCoffeebeans("10g");
	}

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("encore");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			logic(em);
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			em.close();
			factory.close();
		}
	}
}
