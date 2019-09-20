package controller;

import java.sql.SQLException;

import DAO.CoffeeService;
import entity.Price;

public class CoffeeController {
	public static boolean insertPrice(int price) {
		boolean result = false;
		try{
			result = CoffeeService.insertPrice(price);
		}catch(SQLException s){
			s.printStackTrace();
		}
		return result;
	}
}
