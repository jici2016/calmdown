package pub.ningjinren.designpattern.creational.factorypattern;

/**
 * 1.简单工厂
 * @author ming
 *
 */
public class SimpleShapeFactory {
	/**
	 * 返回
	 * @param shapeName
	 * @return
	 */
	public static Shape getInstance(String shapeName){
		Shape shape = null;
		if(null == shapeName)return null;
		if("circle".equals(shapeName)){
			shape = new Circle();
		}else if("rectangle".equals(shapeName)){
			shape = new Rectangle();
		}else if("square".equals(shapeName)){
			shape = new Square();
		}else{
			throw new IllegalArgumentException("没有这种形状");
//			 null;
		}
		return shape;
	}
}
