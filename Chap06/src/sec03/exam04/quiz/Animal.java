package sec03.exam04.quiz;

// Quiz
// 다른 생성자를 호출하는 this()를 써서 refactoring

class Animal {
	String kind;
	int age;
	
	Animal() {
		this("사람", 1);
	}
	
	Animal(String kind) {
		this(kind, 1);
	}
	
	Animal(int age) {
		this("사람", age);
	}
	
	Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}
	
	//출력 메소드
	void info() {
		System.out.println(kind + ": " + age + "살");
	}
}
