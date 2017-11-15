package pub.ningjinren.designpattern.structural.bridge;

public class BridgeDemo {
	public static void main(String[] args) {
		Zha zha = new Zha();
		Zheng zheng = new Zheng();
		Zhu zhu = new Zhu();
		Dun dun = new Dun();
		Fish fish = new Fish(dun);
		Dumpling dumpling = new Dumpling(zheng);
		Noodles noodles = new Noodles(zhu);
		
		fish.price();
		fish.cook = zha;
		fish.price();
		fish.cook = zheng;
		fish.price();
		
		noodles.name();
		dumpling.name();
		dumpling.setCook(zha);
		dumpling.name();
		
		
	}
}
