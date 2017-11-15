package pub.ningjinren.designpattern.structural.adaper2;

public class AnimalAdapterDemo {
	public static void main(String[] args) {
		JiaQinAdapter chicken = new Chicken();
		chicken.info();
		System.out.println("-------------");
		JiaQinAdapter duck = new Duck();
		duck.info();
	}
}
