package pub.ningjinren.designpattern.structural.adaper1;

public class ChargeAdapterDemo {
	public static void main(String[] args) {
		IPhoneChargeLine iPhoneChargeLine = new IPhoneChargeLine();
		iPhoneChargeLine.chargeIPhone();
		AndroidChargeLine androidChargeLine = new AndroidChargeLine();
		androidChargeLine.chargeAndroid();
		System.out.println("-------有一天，我忘了带苹果充电线，所以去买了一个转换头----------");
		System.out.println("-------第一种适配器----------");
		//第一种适配器
		ChargeAdapter1 chargeLine = new ChargeAdapter1();
		chargeLine.chargeIPhone();
		chargeLine.chargeAndroid();
		System.out.println("-------第二种适配器----------");
		//第二种适配器
		ChargeAdapter2 chargeAdapter2 = new ChargeAdapter2();
		chargeAdapter2.chargeIPhone();
		chargeAdapter2.chargeAndoird2();
	}
}
