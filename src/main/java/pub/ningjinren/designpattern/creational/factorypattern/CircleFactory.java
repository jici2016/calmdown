package pub.ningjinren.designpattern.creational.factorypattern;

public class CircleFactory extends AbstractShapeFactory {

	public CircleFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("circle工厂被创建");
	}
	@Override
	protected Shape productShape() {
		// TODO Auto-generated method stub
		
		return new Circle();
	}

}
