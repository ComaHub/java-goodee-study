package sec01.exam11;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes); // 각 keycode 값을 문자로 바꾸고 문자열로 반환
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); // offset index부터 몇 개까지 변환할지(length)
		System.out.println(str2);
	}
}
