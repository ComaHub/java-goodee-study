package sec04.exam05;

// Quiz
// 2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하기
// [입력]   [출력]
// 10 20 => 10, 20

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("%d, %d", scanner.nextInt(), scanner.nextInt());
	}
}
