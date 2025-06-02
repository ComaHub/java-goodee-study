package homework.homework02.model.vo;

import java.util.Objects;

public class Lottery {
	private String name;
	private String phone;
	
	public Lottery() {}

	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "[이름: " + name + ", 휴대폰 번호: " + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Lottery lottery) return Objects.equals(name, lottery.name) && Objects.equals(phone, lottery.phone);
		else return false;
	}
	
	
}
