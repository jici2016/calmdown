package pub.ningjinren.designpattern.creational.factorypattern;

public class RectangleFactory extends AbstractShapeFactory {

	public RectangleFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("RectangleFactory工厂被创建");
	}
	@Override
	protected Shape productShape() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

}
