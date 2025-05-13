// 각자 테마 변경 및 글자 크기 조정
// Window -> Preferences
// 단축키: Ctrl + 또는 -

// 한 줄 주석

/*
	여러 줄 주석
	여러 줄 주석
*/

/**
	Document 주석: doc 문서 생성 시 사용
*/

package sec03.exam01; // 패키지 선언: 해당 source file이 sec03.exam01 package 밑에 있음

public class Hello { // 클래스 선언: 대문자로 시작, source file 이름과 동일해야 함
  // Program 실행 진입점
	public static void main(String[] args) { // main method 선언: java program 실행 시 가장 먼저 실행됨
		// console에 출력하는 실행문
		System.out.println("Hello, Java");
		// save할 때마다 자동으로 compile됨 (error 발생 시 빨간 줄 생성)
		
		// 참고
		System.out.println("Hello,// /**/ Java"); // 문자열 내부에는 주석을 붙일 수 없음
	}
}
