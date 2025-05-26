package homework.homework01.run;

import homework.homework01.model.vo.Book;
import homework.homework01.model.vo.Food;
import homework.homework01.model.vo.Product;

public class ProductRun {
	public static void main(String[] args) {
		Product product1 = new Food("치킨", 20000, 3);
		Product product2 = new Book("자바의 정석", 15000);
		
		int chickenPrice = product1.calculatePrice();
		int bookPrice = product2.calculatePrice();
		
		System.out.println("치킨의 최종 가격: " + chickenPrice);
		System.out.println("자바의 정석의 최종 가격: " + bookPrice);
	}
}
