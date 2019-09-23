package view;

import controller.CoffeeController;
import entity.Price;

public class CoffeeView {
	public static void main(String[] args) {

		CoffeeController.insertPrice(3500);
		CoffeeController.insertPrice(2600);
		CoffeeController.insertPrice(3499);
		CoffeeController.insertPrice(4299);
		CoffeeController.insertPrice(11);
	}
}
