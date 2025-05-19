package sec02.exam06;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		// 2행 3열인 2차원 배열
		int[][] mathScores = new int[2][3];
		
		// 2차원 배열의 모든 요소에 접근하려면 중첩 for를 사용
		// 바깥 for => 행을 반복
		System.out.println("== mathScores ==");
		for (int i = 0; i < mathScores.length; i++) { // mathScores.length => 2 (행의 길이)
			// 내부 for => 열을 반복
			for (int j = 0; j < mathScores[i].length; j++) { // mathScores[i].length => 3 (각 행의 배열 길이)
				System.out.print("[" + mathScores[i][j] + "]");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// 2행의 2차원 배열 (열의 크기를 지정하지 않고 생성)
		System.out.println("== englishScores ==");
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.print("[" + englishScores[i][j] + "]");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		// 값 목록으로 2차원 배열 만들기
		int[][] javaScores = { // 줄바꿈 처리를 하면 가독성이 좋아짐
				{95, 80},
				{92, 96, 80}
		};
		
		System.out.println("== javaScores ==");
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.print("[" + javaScores[i][j] + "]");
			}
			
			System.out.println();
		}
	}
}
