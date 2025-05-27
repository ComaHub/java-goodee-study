package sec01.exam03;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Key - equals()");
		if (obj instanceof Key key) {
			return this.number == key.number;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// number가 같은 모든 Key 객체의 hashCode()가 동일한 값을 출력하도록 오버라이딩
		System.out.println("Key - hashCode()");
		return number;
	}
}
