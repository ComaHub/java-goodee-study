package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	// protected 접근 제한은 상속을 통해서만 사용 가능
	// 직접 객체를 생성해 사용하는 것은 불가
	
	// public void method() {
	// 	A a = new A();
		
	// 	a.field = "value";
	//	a.method();
	
	public D() {
		super();
		field = "values";
		method();
	}
	
	public void method() {
		field = "values";
		method();
	}
}
