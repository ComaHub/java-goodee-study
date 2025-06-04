package homework.homework02.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import homework.homework02.model.vo.Lottery;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery lottery) {
		return this.lottery.add(lottery);
	}
	
	public boolean deleteObject(Lottery lottery) {
		boolean result = this.lottery.remove(lottery);
		
		
		return result;
	}
	
	public Set<Lottery> searchObject() {
		return this.lottery;
	}
	
	public Set<Lottery> winObject() {
		if (lottery.size() < 4) return null;
		
		List<Lottery> list = new ArrayList<Lottery>(this.lottery);
		
		while (this.win.size() < 4) {
			int randomIndex = (int) (Math.random() * list.size());
			win.add(list.get(randomIndex));
		}
		
		return win;
	}
	
	public Set<Lottery> sortedWinObject() {
		List<Lottery> list = new ArrayList<Lottery>(win);
		
		list.sort(new Comparator<Lottery>() {
			@Override
			public int compare(Lottery o1, Lottery o2) {
				if (o1.getName().equals(o2.getName())) {
					return o1.getPhone().compareTo(o2.getPhone());
				} else return o1.getName().compareTo(o2.getName());
			}
		});
		
		Set<Lottery> sortedSet = new LinkedHashSet<Lottery>(list);
		return sortedSet;
	}
	
	public boolean searchWinner(Lottery lottery) {
		return win.contains(lottery);
	}
}
