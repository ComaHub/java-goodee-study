package sec01.exam22.string;

// 문자열을 일정 기준으로 잘라 배열로 만들고 다시 문자열로 합침
public class StringSplitJoinExample {
	public static void main(String[] args) {
		// split() => 문자열을 특정 구분자를 기준으로 나누어 배열로 반환
		String str = "봄-여름-가을-겨울";
		String[] seasons = str.split("-");
		
		for (String season : seasons) {
			System.out.println(season);
		}
		
		// join() => 문자열 배열을 각 요소 사이에 연결자를 넣은 하나의 문자열로 결합해서 반환
		String result = String.join(", ", seasons);
		System.out.println(result);
	}
}
