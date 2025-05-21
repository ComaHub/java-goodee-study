package sec05.exam05;

public class PersonExample {
	public static void main(String[] args) {
		Person person1 = new Person("정윤희", "020521-4335532");
		
		System.out.println(person1.nation);
		System.out.println(person1.name);
		System.out.println(person1.ssn);
		
		// person1.nation = "Japan"; => final / 값 변경 불가!
		// person1.ssn = "412415-4412541";
		person1.name = "정인아";
		System.out.println(person1.name);
	}
}
