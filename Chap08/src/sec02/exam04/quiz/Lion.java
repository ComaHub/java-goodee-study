package sec02.exam04.quiz;

class Lion extends Animal {
	Lion() {
		this("사자", 4);
	}
	
	Lion(String kind, int leg) {
		super(kind, leg);
	}

	@Override
	void eat() {
		System.out.println("초식 동물을 잡아먹는다.");
	}

	@Override
	void sound() {
		System.out.println("어흥거린다.");
	}
}
