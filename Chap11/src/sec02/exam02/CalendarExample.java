package sec02.exam02;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // Calendar는 추상 클래스 => getInstance()로 하위 객체를 생성해 반환해줌
		
		int year = now.get(Calendar.YEAR); // index같은 느낌으로 숫자로 받아오기엔 접근성이 떨어짐 => Calendar에 등록된 상수를 사용해 값을 가져옴
		int month = now.get(Calendar.MONTH) + 1; // 월: 0 ~ 11의 숫자로 반환 (1월: 0) => 받아와서 +1하면 좋다
		int day = now.get(Calendar.DAY_OF_MONTH); // 일: 1 ~ 31의 숫자로 반환
		
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일: 1 ~ 7의 숫자로 반환 (일요일: 1)
		String strWeek = 
		switch (week) {
			case Calendar.MONDAY -> "월요일";
			case Calendar.TUESDAY -> "화요일";
			case Calendar.WEDNESDAY -> "수요일";
			case Calendar.THURSDAY -> "목요일";
			case Calendar.FRIDAY -> "금요일";
			case Calendar.SATURDAY -> "토요일";
			case Calendar.SUNDAY -> "일요일";
			default -> null;
		};
		
		System.out.print(strWeek + " ");
		
		int amPm = now.get(Calendar.AM_PM); // 오전: 0, 오후: 1
		String strAmPm = (amPm == Calendar.AM ? "오전" : "오후");
		System.out.println(strAmPm);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		System.out.println("===================");
		
		
		// 참고: 자바 8 이후 권장 방식
		// Calendar 대신 java.time API로 대체
		// 현재 날짜 / 시간 얻기
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.printf("%d년 %d월 %d일\n", ldt.getYear(), ldt.getMonthValue(), ldt.getDayOfMonth()); // getMonthValue(): 1 ~ 12까지 반환
		
		DayOfWeek dayOfWeek = ldt.getDayOfWeek();
		System.out.print(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN) + " ");
		
		String strAmPm2 = ldt.getHour() < 12 ? "오전" : "오후"; // getHour(): 24시간제
		System.out.println(strAmPm2);
		System.out.printf("%d시 %d분 %d초\n", ldt.getHour() % 12 == 0 ? 12 : ldt.getHour() % 12, ldt.getMinute(), ldt.getSecond());
		System.out.println("===================");
		
		// 날짜 더하기/빼기: plusDays(), minusDays()
		LocalDateTime plusDays = ldt.plusDays(3);
		System.out.println("3일 후: " + plusDays);
		System.out.println("===================");
		
		// 날짜/시간 비교: isBefore(), isAfter(), isEqual()
		// 날짜 비교
		LocalDate today = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2025, 12, 25);
		
		if (today.isBefore(targetDate)) { // 지정한 날짜/시간보다 이전인지 확인
			System.out.println("오늘은 크리스마스 이전입니다.");
		} else if (today.isAfter(targetDate)) { // 이후인지
			System.out.println("오늘은 크리스마스 이후입니다.");
		} else {
			System.out.println("오늘은 크리스마스입니다.");
		}
		
		LocalDateTime todayTime = LocalDateTime.now();
		LocalDateTime targetTime = LocalDateTime.of(2025, 5, 29, 18, 0, 0);
		
		if (todayTime.isBefore(targetTime)) {
			System.out.println("마감 시간 전입니다. 계속 일하세요.");
		} else if (todayTime.isAfter(targetTime)) {
			System.out.println("야근 시간입니다. 계속 일하세요.");
		} else {
			System.out.println("마감 시간이라고 일을 멈추지 마세요.");
		}
		
		System.out.println("===================");
		
		// 날짜/시간 차이 구하기: Period.between(), Duration.between()
		// 날짜 차이
		Period period = Period.between(today, targetDate);
		System.out.printf("연 차이: %d, 월 차이: %d, 일 차이: %d\n", period.getYears(), period.getMonths(), period.getDays());
		
		// 시간 차이
		Duration duration = Duration.between(todayTime, targetTime);
		System.out.println("두 시간의 차이 (초): " + duration.getSeconds());
		System.out.println("두 시간의 차이 (분): " + duration.toMinutes());
		
		
		// 차이 계산: ChronoUnit
		// 두 날짜/시간의 차이를 원하는 단위로 바로 계산
		long daysBetween = ChronoUnit.DAYS.between(today, targetDate); // 사용 가능 단위: DAYS, WEEKS, MONTHS, YEARS 등 
		System.out.println("크리스마스까지: " + daysBetween);
	}
}
