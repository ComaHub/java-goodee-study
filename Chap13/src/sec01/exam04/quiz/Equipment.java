package sec01.exam04.quiz;

import java.util.Objects;

public class Equipment {
	private String name;
	private int pricePerDay;
	
	public Equipment() {}

	public Equipment(String name, int pricePerDay) {
		this.name = name;
		this.pricePerDay = pricePerDay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equipment equipment) return this.name.equals(equipment.name);
		else return false;
	}

	@Override
	public String toString() {
		return name + ": " + pricePerDay + "원";
	}
	
	
}
