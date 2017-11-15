package pub.ningjinren.designpattern.structural.bridge;

public class Fish extends RouCai{

	public Fish(Cook cook) {
		super(cook);
		// TODO Auto-generated constructor stub
	}

	@Override
	void price() {
		// TODO Auto-generated method stub
		super.price();
		System.out.println("鱼"+50);
	}

}
