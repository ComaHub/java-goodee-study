package model.vo;

public class Book {
	private String isbn;
	private int price;
	
	public Book() {}

	public Book(String isbn, int price) {
		this.isbn = isbn;
		this.price = price;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printInfo() {
		System.out.println("ISBN: " + isbn + ", 가격: " + price + "원");
	}
	
	public static String recoverMissingDigit(String isbn) {
		String[] digits = isbn.split("");
		int digitSum = 0;
		int result = 0;
		
		int missingDigitIndex = 0;
		for (int i = 0; i < digits.length; i++) {
			if ("*".equals(digits[i])) {
				missingDigitIndex = i;
				break;
			}
		}
		
		// if m = *
		if (missingDigitIndex == (digits.length - 1)) {
			for (int i = 0; i < digits.length - 1; i++) {
				if (i % 2 == 0) {
					digitSum += Integer.parseInt(digits[i]);
				} else {
					digitSum += Integer.parseInt(digits[i]) * 3;
				}
			}
			
			result = 10 - (digitSum % 10);
		}
		
		// if m != *
		else {
			for (int i = 0; i < digits.length - 1; i++) {
				if (i == missingDigitIndex) continue;
				
				if (i % 2 == 0) {
					digitSum += Integer.parseInt(digits[i]);
				} else {
					digitSum += Integer.parseInt(digits[i]) * 3;
				}
			}
			
			digitSum += Integer.parseInt(digits[digits.length - 1]);
			
			if (missingDigitIndex % 2 == 0) {
				result = 10 - (digitSum % 10);
			} else {
				for (int i = 0; i <= 9; i++) {
					if (((3 * i) + digitSum) % 10 == 0) {
						result = i;
						break;
					}
				}
			}
		}
		
		digits[missingDigitIndex] = String.valueOf(result);
		return String.join("", digits);
	}
}
