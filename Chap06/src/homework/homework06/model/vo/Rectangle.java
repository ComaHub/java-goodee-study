package homework.homework06.model.vo;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		this(1, 1);
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		return (width + height) * 2;
	}
	
	public int calculateArea() {
		return width * height;
	}
	
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사격형의 둘레\n" + calculateRound() + "cm");
		System.out.println("2. 사격형의 넓이\n" + calculateArea() + "cm");
	}
}
