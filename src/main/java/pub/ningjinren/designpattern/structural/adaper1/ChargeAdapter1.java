package pub.ningjinren.designpattern.structural.adaper1;

/**
 * 
 * 这种方式是继承一个类，然后去实现另外的一个接口
 * 转换头充电线，本身支持安卓充电，也支持了苹果充电
 * 可以看出苹果充电线和安卓充电线类都没有改动
 * @author ming
 *
 */
public class ChargeAdapter1 extends AndroidChargeLine implements IPhoneCharge{

	@Override
	public void chargeIPhone() {
		// TODO Auto-generated method stub
		System.out.println("我是安卓充电线但是，也可以给iphone 充电");
	}

}
