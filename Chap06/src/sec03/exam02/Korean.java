package sec03.exam02;

public class Korean {
	// Field
	String nation = "South Korea"; // 기본값 설정
	String name;
	String ssn;
	
	// Constructor
//	public Korean(String str1, String str2) {
//	name = str1;
//	ssn = str2;
//	}
	
	public Korean(String name, String ssn) {
		this.name = name; // 양쪽 모두 매개변수 name으로 인식 => 필드명 앞에 this를 붙여 필드임을 명시
		this.ssn = ssn;	// this: 객체 내부에서 자기 자신을 가리킬 때 사용
	}
}
