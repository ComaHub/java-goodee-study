package sec01.exam04;

import java.util.HashMap;
import java.util.Map;

public class MemberExample {
	public static void main(String[] args) {
		Map<Member, String> map = new HashMap<Member, String>();
		
		map.put(new Member("Yuni"), "Value1");
		map.put(new Member("Hina"), "Value2");
		map.put(new Member("Yuni"), "Value3");
		
		System.out.println(map.size());
	}
}
