package pub.ningjinren.designpattern.structural.bridge;

/**
 * 面食 集合了烹饪方式
 * @author ming
 *
 */
public abstract class MianShi {
	private Cook cook;
	public MianShi(Cook cook) {
		// TODO Auto-generated constructor stub
		this.cook=cook;
	}
	public void setCook(Cook cook) {
		this.cook = cook;
	}
	
	 void name(){
	cook.cookway();	
	};
}
