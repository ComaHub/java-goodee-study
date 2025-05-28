package sec01.exam18;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "마법사는 원거리 딜러입니다. 마법사는 안정적인 DPS를 보여줍니다.";
		String newStr = oldStr.replace("마법사", "궁수");
		
		System.out.println(oldStr); // 원본 객체는 변경 안 됨
		System.out.println(newStr); // 새로운 객체
	}
}
