package sec04.exam05.quiz;

class Calculator {
	int getEvenTotal(int startNum, int endNum) {
		int sum = 0;
		
		for (int i = startNum; i <= endNum; i++) {
			if (i % 2 == 1) continue;
			
			sum += i;
		}
		
		return sum;
	}
}
