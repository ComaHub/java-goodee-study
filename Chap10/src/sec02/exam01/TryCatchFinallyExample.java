package sec02.exam01;

// 일반 예외 처리
public class TryCatchFinallyExample {
	public static void main(String[] args) {
		// 예외 처리: 발생한 예외를 적절하게 처리해 프로그램의 정상 실행 흐름을 유지하도록 함
		try {			
			// Compile exception: 컴파일러가 체크해 예외처리를 지시
			// Class class01 = Class.forName("java.lang.String"); // forName(className): 주어진 인수로 클래스를 찾아 Class 객체로 반환
			
			// 클래스를 못 찾았을 때
			Class class01 = Class.forName("java.lang.String2");
			
			System.out.println("클래스를 찾았습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally { // 예외의 발생 여부에 관계없이 반드시 실행할 코드를 입력 (Optional)
			System.out.println("이제 PC를 끄셔도 됩니다.");
		};
	}
}
