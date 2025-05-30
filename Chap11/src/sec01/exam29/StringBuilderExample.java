package sec01.exam29;

public class StringBuilderExample {
	public static void main(String[] args) {
		// StringBuilder
		// 문자열을 변경 가능한 객체로 다루기 위해 탄생
		// 문자열 수정이 빈번할 때 많이 활용
		StringBuilder stringBuilder = new StringBuilder("Java");
		
		// 기존 문자열의 끝에 주어진 값을 추가
		stringBuilder.append(" Program Study");
		System.out.println(stringBuilder);
		
		// 지정한 인덱스 위치에 주어진 값을 삽입
		stringBuilder.insert(4, "2"); // 2번째 인자에 다른 자료형을 넣어도 문자열로 변환되어 추가
		System.out.println(stringBuilder);
		
		// 지정한 인덱스의 문자를 주어진 문자로 변경
		stringBuilder.setCharAt(4, '6');
		System.out.println(stringBuilder);
		
		// 지정한 시작 인덱스부터 끝 인덱스 전까지의 문자열을 대체
		stringBuilder.replace(6, 13, "Book");
		System.out.println(stringBuilder);
		
		// 지정한 시작 인덱스부터 끝 인덱스 전까지의 문자열 삭제
		stringBuilder.delete(4, 5);
		System.out.println(stringBuilder);
		
		// 현재 문자열의 길이를 반환
		System.out.println("총 문자 수: " + stringBuilder.length());
		
		// 현재 문자열을 String으로 반환
		String result = stringBuilder.toString();
		System.out.println(result);
		
		// 정리
		// 내부에서 문자열을 저장해서 조작하기 때문에 변경 사항이 발생해도 객체를 새로 만들지 않음
		// 문자열을 많이 변경한다면 => StringBuilder를 사용하는 것이 성능상 좋다
	}
}
