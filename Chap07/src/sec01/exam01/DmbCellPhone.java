package sec01.exam01;

// child class: 부모의 멤버를 물려받고, 추가로 자식만의 멤버도 작성 가능
// 여기서는 CellPhone 클래스를 상속해 DMB 기능을 추가
public class DmbCellPhone extends CellPhone {
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		super(); // 부모 생성자 호출 (명시하지 않으면 컴파일러가 자동 추가)
		this.model = model; // 부모로부터 상속받은 필드
		this.color = color; // 부모로부터 상속받은 필드
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChennelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
