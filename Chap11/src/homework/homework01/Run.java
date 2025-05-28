package homework.homework01;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] people = str.split("\n");
		
		Person[] personArr = new Person[3];
		for (int i = 0; i < personArr.length; i++) {
			String[] person = people[i].split(",");
			personArr[i] = new Person(person[0], Integer.parseInt(person[1]), person[2], person[3].charAt(0));
		}
		
		for (Person p : personArr) {
			System.out.println(p.toString());
		}	
	}
}
