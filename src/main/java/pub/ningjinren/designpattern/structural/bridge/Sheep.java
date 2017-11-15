package pub.ningjinren.designpattern.structural.bridge;

public class Sheep extends RouCai{

	public Sheep(Cook cook) {
		super(cook);
		// TODO Auto-generated constructor stub
	}

	@Override
	void price() {
		super.price();
		System.out.println("羊肉"+80);
	}

}
