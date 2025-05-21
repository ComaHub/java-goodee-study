package homework.homework02.controller;

import homework.homework02.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.phoneNum = "01012345678";
		person1.height = 190.5;
		person1.weight = 100.2;
		
		person2.phoneNum = "01056434563";
		person2.height = 175.4;
		person2.weight = 65.6;
		
		System.out.println("첫 번째 사람의 전화번호: " + person1.phoneNum + ", 키: " + person1.height + ", 체중: " + person1.weight);
		System.out.println("두 번째 사람의 전화번호: " + person2.phoneNum + ", 키: " + person2.height + ", 체중: " + person2.weight);
	}
}
