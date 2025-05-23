package sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); // upcasting
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// parent.field2 = "data2"; => field2는 자식의 고유 필드!
		// parent.method3(); => method3()은 자식의 고유 메서드!
		
		// 자식의 고유 멤버에 접근하고 싶다면...
		Child child = (Child) parent; // downcasting
		child.field2 = "yyy";
		child.method3();
	}
}
