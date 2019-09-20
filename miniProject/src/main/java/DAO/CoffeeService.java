package DAO;

import java.sql.SQLException;

import entity.Price;

public class CoffeeService {
	public static boolean insertPrice(int price) throws SQLException{
		return CoffeeDAO.insertPrice(price);
	}
}
