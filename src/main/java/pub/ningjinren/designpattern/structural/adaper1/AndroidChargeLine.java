package pub.ningjinren.designpattern.structural.adaper1;

public class AndroidChargeLine implements AndroidCharge  {

	@Override
	public void chargeAndroid() {
		System.out.println("安卓充电线，只支持安卓设备充电！");
	}

}
