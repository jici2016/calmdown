package pub.ningjinren.designpattern.creational.builder;

/*
 * builder 一般用来装配套餐
 */
public class MealBuilder {
	public Meal getVeg$Pesi(){
		Meal meal = new Meal();
		meal.addItem(new Item() {
			
			@Override
			public float price() {
				// TODO Auto-generated method stub
				return 100;
			}
			
			@Override
			public Packing packing() {
				// TODO Auto-generated method stub
				return new Wrapper();
			}
			
			@Override
			public String name() {
				// TODO Auto-generated method stub
				return "羊肉卷";
			}
			
		});
		meal.addItem(new VegBurger());
		meal.addItem(new Pesi());
		return meal;
	}
	
	
	public Meal getChicken$Pesi(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pesi());
		return meal;
	}
	
	public Meal getChicken$Coke(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}
}
