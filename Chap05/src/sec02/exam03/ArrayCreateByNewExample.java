package sec02.exam03;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		// new 연산자로 배열 생성
		int[] arr1 = new int[3];
		
		// 배열 생성 시 자동 초기화 확인
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
		System.out.println();
		
		double[] arr2 = new double[3];
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		System.out.println();
		
		String[] arr3 = new String[3];
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
		
		arr3[0] = "유니";
		arr3[1] = "시로";
		arr3[2] = "리제";
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
		
		
		// (정리)
		// 배열 객체는 값 목록을 이용하거나 길이를 지정하여 생성
		// 생성 시 길이가 정해지고 변경 불가
		// 생성 시 지정된 타입만 저장 가능
	}
}
