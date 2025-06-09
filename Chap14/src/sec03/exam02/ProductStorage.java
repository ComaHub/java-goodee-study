package sec03.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	// Product가 저장될 List Collection
	private List<Product> productList = new ArrayList<Product>();
	private Scanner scanner = new Scanner(System.in); // 키보드 입력을 받는 Scanner
	private int counter; // 상품 번호 부여용
	
	public void showMenu() {
		while (true) {
			System.out.println("---------------------------");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료");
			System.out.println("---------------------------");
			System.out.print("선택: ");
			String selectNum = scanner.nextLine();
			
			switch (selectNum) {
				case "1" -> registerProduct(); // Product 등록
				
				case "2" -> showProducts(); // 등록된 모든 Product 정보 출력
				
				case "3" -> {
					return; // 프로그램 종료
				}
			}
		}
	}
	
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setNum(++counter);
			
			System.out.print("상품명: ");
			product.setName(scanner.nextLine());
			
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			productList.add(product);
		} catch (Exception e) { System.out.println("등록 오류: " + e.getMessage()); }
	}
	
	public void showProducts() {
		for (Product product : productList) {
			System.out.println(product.getNum() + "\t" + product.getName() + "\t" + product.getPrice() + "\t" + product.getStock());
		}
	}
}
