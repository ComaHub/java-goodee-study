package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hankook.Tire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {
	// Field (집합 관계)
	// 자동완성 기능 사용 시 자동으로 import / 또는 단축키 사용 (ctrl shift o)
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// 한국타이어 사용
	Tire tire3 = new Tire();
	
	// 금호타이어 사용 => import문 사용 불가 (hankook.Tire가 이미 import되어 충돌 가능) => 클래스의 풀네임을 사용해 명시해야 함
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}
