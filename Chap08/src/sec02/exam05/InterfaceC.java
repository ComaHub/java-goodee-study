package sec02.exam05;

// Method A, Method B도 필요하다면 상속을 통해 물려받을 수 있음
// Interface 사이에만 (다중) 상속이 가능 (부모는 같은 Interface만 가능, Object를 상속받지 않음)
public interface InterfaceC extends InterfaceA, InterfaceB {
	public void methodC();
	
	// 상속으로 물려받은 추상 메서드 meth0d, methodB()
}
