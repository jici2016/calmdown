package pub.ningjinren.designpattern.structural.adaper1;

public class IPhoneChargeLine implements IPhoneCharge  {


	@Override
	public void chargeIPhone() {
		// TODO Auto-generated method stub
		System.out.println("苹果充电线，只支持iphone");
	}

}
