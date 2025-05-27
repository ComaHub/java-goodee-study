package sec01.exam02;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("Blue");
		Member obj2 = new Member("Blue");
		// obj1과 obj2는 물리적으로 다른 객체, 논리적으로 동등한 객체
		Member obj3 = new Member("Red");
		
		if (obj1.equals(obj2)) System.out.println("obj1과 obj2는 동등합니다.");
		else System.out.println("obj1과 obj2는 동등하지 않습니다.");
		
		if (obj1.equals(obj3)) System.out.println("obj1과 obj3는 동등합니다.");
		else System.out.println("obj1과 obj3는 동등하지 않습니다.");
	}
}
