package homework.homework01.model.vo;

public class Person {
	private int age;
	private double height;
	private double weight;
	
	protected String name;
	
	public Person() {}
	
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return ("=== " + getName() + " ==="
					+ "\n나이: " + getAge()
					+ "\n키: " + getHeight()
					+ "\n체중: " + getWeight());
	}
}
