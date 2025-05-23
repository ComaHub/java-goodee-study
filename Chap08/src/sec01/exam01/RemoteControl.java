package sec01.exam01;

// Interface: 상수 + 추상 메서드의 집합 (이후 개념이 확장되며 default, static이 추가됨)
// 실제로 구현할 클래스들을 위해 제공하는 가이드라인 + 객체 사용 방법을 정의한 설명서
// 모든 멤버가 public + 필드는 모두 상수(public static final), 메서드는 모두 추상(public abstract)
public interface RemoteControl {

}

// can-be 관계 ( ~할 수 있다. )
// Airplane can be flyable. Fighter can be fightable.
// TV can-be RemoteControl. Audio can-be RemoteControl.
