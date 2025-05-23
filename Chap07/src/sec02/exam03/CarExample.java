package sec02.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run(); // 4개의 타이어를 1회전 시킴
			
			switch (problemLocation) {
				case 1:
					System.out.println("Front-Left HankookTire로 교체");
					car.frontLeftTire = new HankookTire("Front-Left", 15);
					break;
					
				case 2:
					System.out.println("Front-Right KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("Front-Left", 13);
					break;
					
				case 3:
					System.out.println("Back-Left HankookTire로 교체");
					car.backLeftTire = new HankookTire("Front-Left", 14);
					break;
					
				case 4:
					System.out.println("Back-Right KumhoTire로 교체");
					car.backRightTire = new KumhoTire("Front-Left", 17);
					break;
			}
			
			System.out.println("------------------");
		}
	}
}
