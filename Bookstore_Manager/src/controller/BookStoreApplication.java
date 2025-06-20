package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.BookDAO;
import model.vo.Book;
import model.vo.Novel;
import model.vo.Poem;

public class BookStoreApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Book> bookList = new ArrayList<Book>();
		BookDAO bookDAO = new BookDAO();
		
		Master:
		while (true) {
			Book book;
			
			System.out.print("책 종류를 입력하세요 (소설 / 시): ");
			String category = scanner.nextLine();
			switch (category) {
			  case "소설" -> book = new Novel();
			  case "시" -> book = new Poem();
			  default -> {
				  System.out.println("잘못된 종류입니다. 다시 입력해주세요");
				  continue Master;
			  }
			}
			
			System.out.print("ISBN을 입력하세요 (13자리, * 포함 가능): ");
			String isbn = scanner.nextLine();
			String validISBN = isValidISBN(isbn);
			if (validISBN != null) book.setIsbn(validISBN);
			else {
				System.out.println("유효하지 않은 ISBN입니다.");
				continue Master;
			}
			
			System.out.print("가격을 입력하세요: ");
			try {
				int price = Integer.parseInt(scanner.nextLine());
				book.setPrice(price);
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
				continue Master;
			}
			
			bookList.add(book);
			bookDAO.insertBook(book);
			System.out.print("입력을 종료하시겠습니까? (Y / y 입력 시 종료): ");
			String inputFinish = scanner.nextLine();
			if ("Y".equalsIgnoreCase(inputFinish)) break Master;
		}
		
		int priceSum = 0;
		System.out.println("\n===== 도서 목록 =====");
		for (Book book : bookList) {
			book.printInfo();
			priceSum += book.getPrice();
		}
		
		System.out.printf("\n총 평균 가격: %.2f원", (double) priceSum / bookList.size());
	}
	
	private static String isValidISBN(String isbn) {
		if (isbn.length() != 13) return null;
		
		int count = 0;
		for (int i = 0; i < isbn.length(); i++) {
			char c = isbn.charAt(i);
			
			if (!(c >= '0' && c <= '9') && (c != '*')) return null;
			
			if (c == '*') count++;
		}
		
		if (count > 1) return null;
		else {
			if (count == 1) isbn = Book.recoverMissingDigit(isbn);
			
			if (checkISBN(isbn)) return isbn;
			else return null;
		}
	}
	
	private static boolean checkISBN(String isbn) {
		int digitSum = 0;
		String[] digits = isbn.split("");
		
		for (int i = 0; i < digits.length; i++) {
			if (i % 2 == 0) {
				digitSum += Integer.parseInt(digits[i]);
			} else {
				digitSum += Integer.parseInt(digits[i]) * 3;
			}
		}
		
		if (digitSum % 10 == 0) return true;
		else return false;
	}
}
