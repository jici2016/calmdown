package pub.ningjinren.designpattern.creational.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		Meal meal = builder.getChicken$Coke();
		meal.showItems();
		
		meal = builder.getVeg$Pesi();
		meal.showItems();
	}
}
