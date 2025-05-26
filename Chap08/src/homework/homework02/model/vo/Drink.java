package homework.homework02.model.vo;

public class Drink extends Menu {
	private String recipe;
	
	public Drink() {}
	
	public Drink(String name, int price, String recipe) {
		super(name, price);
		this.recipe = recipe;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\n레시피는 " + recipe + "입니다.");
	}
	
	@Override
	public void cook() {
		System.out.println(toString());
	}
}
