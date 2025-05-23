package sec02.exam03;

public class Tire {
	public int maxRotation; // 최대 회전수
	public int accumulatedRotation; // 누적 회전수 => 최대 회전수와 같아지면 펑크남
	public String location; // 타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 타이어를 1회전 시키는 메소드 => 회전 가능하면 true, 펑크났으면 false 반환
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 발생 ***");
			return false;
		}
	}
}
