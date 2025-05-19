package sec02.exam07;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "유니";
		strArray[1] = "유니"; // 같은 값의 객체 존재 => 기존 객체 참조값 반환
		strArray[2] = new String("유니"); // new 명령어 사용 => 새 객체 생성 후 참조값 반환
		
		System.out.println(strArray[0] == strArray[1]); // 참조값 비교
		System.out.println(strArray[0] == strArray[2]); // 참조값 비교
		System.out.println(strArray[0].equals(strArray[2])); // 내부 문자열 비교
	}
}
