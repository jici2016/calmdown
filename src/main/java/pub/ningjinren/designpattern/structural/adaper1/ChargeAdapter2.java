package pub.ningjinren.designpattern.structural.adaper1;

/**
 * 这种方式是持有另外一个接口的对象
 * @author ming
 *
 */
public class ChargeAdapter2 implements IPhoneCharge{

	private AndroidChargeLine line = new AndroidChargeLine();
	@Override
	public void chargeIPhone() {
		// TODO Auto-generated method stub
		System.out.println("我可以给苹果充电。");
	}
	
	public void chargeAndoird2(){
		System.out.println("我也可以给安卓充电。");
		line.chargeAndroid();
	}
}
