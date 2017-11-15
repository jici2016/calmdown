package pub.ningjinren.designpattern.structural.bridge;

/**
 * 肉菜，集合了烹饪方式
 * @author ming
 *
 */
public abstract class RouCai {
	Cook cook;
	public RouCai(Cook cook) {
		this.cook = cook;
	}
	
	 void price(){
		 cook.cookway();
	 };
}
