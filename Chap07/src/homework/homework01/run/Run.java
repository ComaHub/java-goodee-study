package homework.homework01.run;

import java.util.Scanner;

import homework.homework01.model.vo.Employee;
import homework.homework01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[3];
		
		students[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		students[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		System.out.println(students[0].toString());
		System.out.println(students[1].toString());
		System.out.println(students[2].toString());
		
		Employee[] employees = new Employee[10];
		
		int pointer = 0;
		System.out.println("=== 사원 입력받기 ===");
		Master:
		while (pointer < 10) {
			System.out.print("이름: ");
			String inputName = scanner.nextLine();
			
			System.out.print("나이: ");
			int inputAge = scanner.nextInt();
			
			System.out.print("키: ");
			double inputHeight = scanner.nextDouble();
			
			System.out.print("체중: ");
			double inputWeight = scanner.nextDouble();
			
			System.out.print("급여: ");
			int inputSalary = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("부서: ");
			String inputDept = scanner.nextLine();
			
			employees[pointer++] = new Employee(inputName, inputAge, inputHeight, inputWeight, inputSalary, inputDept);
			
			while (true) {
				System.out.print("계속 추가하시겠습니까?: ");
				String inputContinue = scanner.nextLine();
				
				if ("Y".equalsIgnoreCase(inputContinue)) break;
				else if ("N".equalsIgnoreCase(inputContinue)) break Master;
				else System.out.println("다시 입력해주세요.");
			}
		}
		
		for (int i = 0; i < pointer; i++) {
			System.out.println(employees[i].toString());
		}
	}
}
