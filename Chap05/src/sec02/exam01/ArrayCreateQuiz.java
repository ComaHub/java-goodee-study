package sec02.exam01;

// Quiz: 아래 문자열을 담는 과일 배열을 만들고 반복문을 이용해 모든 요소 출력하기
// "사과", "바나나", "오렌지", "포도", "딸기"

public class ArrayCreateQuiz {
	public static void main(String[] args) {
		String[] fruits = {"사과", "바나나", "오렌지", "포도", "딸기"};
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
}
