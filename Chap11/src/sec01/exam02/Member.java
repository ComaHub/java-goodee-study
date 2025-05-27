package sec01.exam02;

// Object는 명시하지 않아도 자동 상속
// public class Member extends Object
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Object 클래스 변수에는 모든 객체가 다 들어올 수 있으니 제일 먼저 Member 타입인지 확인해야 함
		if (obj instanceof Member member) { // id 필드에 접근하기 위해 Member 타입으로 다운캐스팅
			return this.id.equals(member.id); // id 필드의 값이 서로 동일한지 비교 (여기 equals는 String에서 overriding된 메서드)
		} else {
			return false; // Member 타입이 아니면 false
		}
	}
}
