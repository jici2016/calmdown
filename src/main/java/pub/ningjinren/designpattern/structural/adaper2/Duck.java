package pub.ningjinren.designpattern.structural.adaper2;

public class Duck extends JiaQinAdapter{

public Duck() {
	System.out.println("我是小鸭子");
}
	@Override
	public void say() {
		System.out.println("嘎嘎");
		
	}

	@Override
	public void play() {
		System.out.println("在水里面玩");
	}
	
	

}
