package sec02.exam06;

public class EscapeExample {
	public static void main(String[] args) {
		// Escape 문자: \가 붙은 문자, 특수 용도로 사용
		// 문자열 작성 시 사용
		
		System.out.println("번호\t이름\t직업");
		System.out.println("번호\n이름\n직업"); // println의 ln은 \n을 뜻함
//		System.out.print("행 단위 출력");
//		System.out.print("행 단위 출력");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
	}
}
