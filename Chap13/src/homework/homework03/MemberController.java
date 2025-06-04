package homework.homework03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	private Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member member) {
		if (map.containsKey(id)) return false;
		else {
			map.put(id, member);
			return true;
		}
	}
	
	public String logIn(String id, String password) {
		if (!map.containsKey(id)) return null;
		
		if (!map.get(id).getPassword().equals(password)) return null;
		
		return map.get(id).getName();
		
	}
	
	public boolean changePassword(String id, String oldPassword, String newPassword) {
		if (map.containsKey(id) && map.get(id).getPassword().equals(oldPassword)) {
			map.get(id).setPassword(newPassword);
			return true;
		}
		
		return false;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> resultMap = new TreeMap<String, String>();
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			if (map.get(key).getName().equals(name)) {
				resultMap.put(key, map.get(key).getName());
			}
		}
		
		return resultMap;
	}
}
