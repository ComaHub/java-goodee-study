package sec05.exam05;

class Person {
	final String nation = "South Korea"; // 선언 시 초기화 => 이후 값 변경 불가
	final String ssn; // 선언 후 생성자에서 초기화
	String name;
	
	Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		// this.nation = "Japan"; => final / 값 변경 불가
	}
}
