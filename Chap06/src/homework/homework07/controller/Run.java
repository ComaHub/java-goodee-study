package homework.homework07.controller;

import homework.homework07.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setEmpNo(100);
		employee.setEmpName("홍길동");
		employee.setDept("영업부");
		employee.setJob("과장");
		employee.setAge(25);
		employee.setGender('남');
		employee.setSalary(3000000);
		employee.setBonus(0.05);
		employee.setPhone("010-123-4567");
		employee.setAddress("서울시 강남구");
		
		System.out.println("=== " + employee.getEmpName() + "의 정보 ==="
											+ "\n사번: " + employee.getEmpNo()
											+ "\n부서: " + employee.getDept()
											+ "\n직급: " + employee.getJob()
											+ "\n나이: " + employee.getAge()
											+ "\n월급: " + employee.getSalary()
											+ "\n전화번호: " + employee.getPhone()
											+ "\n주소: " + employee.getAddress());
	}
}
