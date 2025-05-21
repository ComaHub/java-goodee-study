package homework.homework09.controller;

import homework.homework09.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setStudentName("김철수");
		student1.setClassName("A");
		
		student2.setStudentName("홍길동");
		student2.setClassName("F");
		
		student3.setStudentName("이영희");
		student3.setClassName("B");
		
		System.out.println(student1.getStudentNum() + " " + student1.getStudentName() + " " + student1.getClassName());
		System.out.println(student2.getStudentNum() + " " + student2.getStudentName() + " " + student2.getClassName());
		System.out.println(student3.getStudentNum() + " " + student3.getStudentName() + " " + student3.getClassName());
	}
}
