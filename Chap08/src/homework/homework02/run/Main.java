package homework.homework02.run;

import homework.homework02.model.vo.Dish;
import homework.homework02.model.vo.Drink;
import homework.homework02.model.vo.Menu;

public class Main {
	public static void main(String[] args) {
		Menu[] menu = new Menu[5];
		
		menu[0] = new Dish("비엔나", 3000, "오징어");
		menu[1] = new Drink("락스 온더 락", 54000, "락스");
		menu[2] = new Dish("유부초밥", 5000, "유부");
		menu[3] = new Drink("몰디브", 27000, "모히또");
		menu[4] = new Dish("이베리코", 45000, "돼지");
		
		for (Menu thisMenu : menu) {
			thisMenu.cook();
		}
	}
}
