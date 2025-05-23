package sec02.exam03_2_not;

// 다형성 없이 if-else if로 구현
public class PaymentService {
	public void pay(String type, int amount) {
		if ("Card".equals(type)) {
			System.out.println("신용카드로 결제합니다.");
			System.out.println("결제 승인 요청 중...");
			System.out.println(amount + "원 결제 완료!");
		} else if ("Paypal".equals(type)) {
			System.out.println("Paypal로 결제합니다.");
			System.out.println("결제 승인 요청 중...");
			System.out.println(amount + "원 결제 완료!");
		} else if ("Bank".equals(type)) {
			System.out.println("가상계좌로 결제합니다.");
			System.out.println("입금 확인 중...");
			System.out.println(amount + "원 결제 완료!");
		} else {
			System.out.println("지원하지 않는 결제 수단입니다.");
		}
	}
}

// 단점: 새 결제방식이 추가되면 기존 코드에 조건을 계속 추가해야 함
// 객체지향적이지 않고, 테스트와 유지보수가 어렵고 유연하지 않음

// 다형성을 활용하면
// 유지보수: 새 결제수단 추가 시 기존 코드 수정 없이 자식 클래스만 추가
// 확장성: 객체를 교체하는 것만으로 기능 변경 가능
// 가독성: if-else가 없어 깔끔하고 명확
