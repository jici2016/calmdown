package pub.ningjinren.designpattern.creational.builder;

import java.util.LinkedList;
import java.util.List;

public class Meal {
	private List<Item> items = new LinkedList<Item>();

	
	public void addItem(Item item){
		items.add(item);
	}
	
	public float getCost(){
		float price = 0;
		for (Item item : items) {
			price += item.price();
		}
		return price;
	}
	
	public void showItems(){
		for (Item item : items) {
			System.out.print("Item:"+item.name());
			System.out.print(",Packing:"+item.packing().pack());
			System.out.println(",price:"+item.price());
		}
	}
}
