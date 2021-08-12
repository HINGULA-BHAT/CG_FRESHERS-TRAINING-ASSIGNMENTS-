
public class Fruits {
	String FruitName;
	int  FruitCalories;
	int  FruitPrice;
	String FruitColor;
	public Fruits(String fruitName, int fruitCalories, int fruitPrice, String fruitColor) {
	
		this.FruitName = fruitName;
		this.FruitCalories = fruitCalories;
		this.FruitPrice = fruitPrice;
		this.FruitColor = fruitColor;
	}
	public String getFruitName() {
		return FruitName;
	}
	public void setFruitName(String fruitName) {
		FruitName = fruitName;
	}
	public int getFruitCalories() {
		return FruitCalories;
	}
	public void setFruitCalories(int fruitCalories) {
		FruitCalories = fruitCalories;
	}
	public int getFruitPrice() {
		return FruitPrice;
	}
	public void setFruitPrice(int fruitPrice) {
		FruitPrice = fruitPrice;
	}
	public String getFruitColor() {
		return FruitColor;
	}
	public void setFruitColor(String fruitColor) {
		FruitColor = fruitColor;
	}
	@Override
	public String toString() {
		return "Fruit [FruitName=" + FruitName + ", FruitCalories=" + FruitCalories + ", FruitPrice=" + FruitPrice
				+ ", FruitColor=" + FruitColor + "]";
	}

}