package pub.ningjinren.designpattern.structural.adaper2;

public class Chicken extends JiaQinAdapter{

	public Chicken() {
		System.out.println("我是小鸡。");
	}
	@Override
	public void say() {
		System.out.println("咯咯哒");
	}

	@Override
	public void play() {
		System.out.println("在地上跑");
	}

	
}
