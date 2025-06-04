package sec01.exam08;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		Scanner scanner = new Scanner(System.in);
		
		map.put("정북희", "1000");
		map.put("정나나", "0");
		map.put("정리코", "18");
		map.put("정유니", "4");
		
		while (true) {
			System.out.println("ID와 Password를 입력해주세요.");
			System.out.print("ID: ");
			String id = scanner.nextLine();
			
			System.out.print("Password: ");
			String pw = scanner.nextLine();
			
			if (!map.containsKey(id)) {
				System.out.println("ID가 존재하지 않습니다.");
				continue;
			}
			
			if (map.get(id).equals(pw)) System.out.println("로그인되었습니다.");
			else System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
}
