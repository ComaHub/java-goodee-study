package sec02.exam01;

import java.util.Stack;

// 동전 케이스를 Stack으로 구현한 예제
// Stack 구조는 위에만 열려있음 => 먼저 넣은 동전이 제일 나중에 나옴 (LIFO)
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 동전 케이스가 비었는지 확인
		while (!coinBox.isEmpty()) {
			// 제일 위 동전을 꺼냄
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.value() + "원");
		}
	}
}
