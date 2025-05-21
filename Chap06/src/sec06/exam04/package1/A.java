package sec06.exam04.package1;

public class A {
	// class 내부에서는 모두 사용 가능
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// constructor overloading
	public A(boolean b) {}
	A(int i) {}
	private A(String s) {}
	
}
