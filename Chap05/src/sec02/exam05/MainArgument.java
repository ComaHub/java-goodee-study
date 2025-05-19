package sec02.exam05;

public class MainArgument {
	public static void main(String[] args) {
		// IDE에서 Run으로 실행하는 것과 CLI에서 명령어로 java를 실행하는 것은 동일
		System.out.println(args.length);
		
		// Eclipse에서 직접 argument를 주는 방법: Run Configurations > Arguments
		
		// String[] 배열 매개변수 활용
		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); // 프로그램(JVM) 강제 종료 => 0은 정상 종료를 의미
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// Quiz: 문자열을 정수로 변환해서 더한 결과를 출력
		int sum = Integer.parseInt(strNum1) + Integer.parseInt(strNum2);
		System.out.println(sum);
	}
}
