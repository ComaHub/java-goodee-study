package sec02.exam04.quiz;

abstract class Animal {
	private String kind;
	private int leg;
	
	Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}

	String getKind() {
		return kind;
	}

	int getLeg() {
		return leg;
	}
	
	abstract void eat();
	abstract void sound();
}
