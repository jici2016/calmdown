package pub.ningjinren.designpattern.structural.bridge;

public class Dumpling extends MianShi{

	public Dumpling(Cook cook) {
		super(cook);
		// TODO Auto-generated constructor stub
	}

	@Override
	void name() {
		// TODO Auto-generated method stub
		super.name();
		System.out.println("饺子");
	}

}
