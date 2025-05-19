package sec02.exam08;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		// 배열은 생성 후 크기 변경 불가 => 데이터를 추가해야하는 경우 더 큰 크기의 배열을 새로 생성해서 기존 데이터를 복사해야 함
		// 때문에 실무에서는 Collection Framework의 ArrayList를 사용
		
		// 1. For를 사용한 배열 복사
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print("[" + newIntArray[i] + "]");
		}
		
		System.out.println();
	}
}
