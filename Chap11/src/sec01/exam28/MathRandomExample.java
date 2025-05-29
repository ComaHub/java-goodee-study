package sec01.exam28;

import java.util.Arrays;

public class MathRandomExample {
	public static void main(String[] args) {
		// 공식: (int) (Math.random() * (MAX - MIX + 1)) + MIN;
		
		// 1부터 10까지의 임의의 정수 난수 얻기
		int num = (int) (Math.random() * 10) + 1;
		System.out.println("num = " + num);
		
		// Quiz: 주사위 번호 뽑기(1, 2, 3, 4, 5, 6)
		int cubeNum = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 번호: " + cubeNum);
		
		// Quiz: 로또 번호 뽑기(1, 2, 3, ..., 43, 44, 45)
		int[] lottoNum = new int[6];
		
		int pointer = 0;
		Master:
		while (pointer < 6) {
			int number = (int) (Math.random() * 45) + 1;
			for (int i = 0; i < lottoNum.length; i++) {
				if (lottoNum[i] == number) continue Master;
			}
			
			lottoNum[pointer++] = number;
		}
		
		System.out.println("로또 번호: " + Arrays.toString(lottoNum));
	}
}
