package pub.ningjinren.designpattern.structural.adaper2;

/**
 * 家禽类
 * @author ming
 *
 */
public abstract class JiaQinAdapter implements Animal{

	@Override
	public void eat() {
		System.out.println("吃素");
	}

	@Override
	public void drink() {
		System.out.println("喝水");
	}
	@Override
	public void sleep() {
		System.out.println("卧着睡");
	}
	
	public void info(){
		eat();drink();
		say();play();
	}
}
