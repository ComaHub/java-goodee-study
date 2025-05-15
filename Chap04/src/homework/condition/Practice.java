package homework.condition;

class Practice {
	int practice01(int age) {
		if (age < 3) {
			return 0;
		} else if (age <= 12) {
			return 10000;
		} else if (age <= 18) {
			return 20000;
		} else if (age <= 64) {
			return 30000;
		} else {
			return 0;
		}
	}
	
	String practice02(int month, int temp) {
		if (month < 1 || month > 12) { // Early return
			return "해당하는 계절이 없습니다.";
		}
		
		if (month >= 3 && month <= 5) {
			return "봄";
		} else if (month >= 6 && month <= 8) {
			if (temp >= 35) {
				return "여름 폭염 경보";
			} else if (temp >= 33) {
				return "여름 폭염 주의보";
			} else {
				return "여름";
			}
		} else if (month >= 9 && month <= 11) {
			return "가을";
		} else {
			if (temp <= -15) {
				return "겨울 한파 경보";
			} else if (temp <= -12) {
				return "겨울 한파 주의보";
			} else {
				return "겨울";
			}
		}
	}
	
	int practice03(int num1, int num2, int num3) {
		return (num1 < num2) ? 
				((num1 < num3) ? num1 : num3) :
				((num2 < num3) ? num2 : num3);
	}
	
	String practice04(int code) {
		switch (code) {
			case 400:
				return "잘못된 요청입니다.";
						
			case 404:
				return "요청하신 서비스를 찾을 수 없습니다.";
						
			case 500:
				return "처리 방법을 알 수 없는 문제가 발생했습니다.";
						
			case 503:
				return "일시적인 서버 오류가 발생하였습니다.";
				
			default: return "알 수 없는 오류가 발생하였습니다.";
		}
	}
	
	String practice05(int num) {
		if (num > 5) {
			return "목록에 있는 숫자만 입력해주세요.";
		} else if (num <= 0) {
			return "양수만 입력해주세요.";
		} else {
			if (num == 1) {
				return "스쿼트 운동 시간입니다.";
			} else if (num == 2) {
				return "데드리프트 운동 시간입니다.";
			} else if (num == 3) {
				return "벤치 프레스 운동 시간입니다.";
			} else if (num == 4) {
				return "풀업 운동 시간입니다.";
			} else {
				return "오늘도 수고하셨습니다.";
			}
		}
	}
	
	String practice06(int score1, int score2, int score3, int score4, int score5) {
		double avg = (score1 + score2 + score3 + score4 + score5) / 5.0;
		
		if (score1 < 40) {
			return "소프트웨어 설계 과목 과락으로 불합격입니다.";
		} else if (score2 < 40) {
			return "소프트웨어 개발 과목 과락으로 불합격입니다.";
		} else if (score3 < 40) {
			return "데이터베이스 구축 과목 과락으로 불합격입니다.";
		} else if (score4 < 40) {
			return "프로그래밍언어 활용 과목 과락으로 불합격입니다.";
		} else if (score5 < 40) {
			return "정보시스템 구축관리 과목 과락으로 불합격입니다.";
		} else if (avg < 60) {
			return "평균 점수 60점 미만으로 불합격입니다.";
		} else {
			return "합격을 축하합니다!";
		}
	}
}
