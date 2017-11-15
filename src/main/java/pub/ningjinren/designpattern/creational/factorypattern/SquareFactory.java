package pub.ningjinren.designpattern.creational.factorypattern;

public class SquareFactory extends AbstractShapeFactory {

	public SquareFactory() {
		System.out.println("SquareFactory工厂被创建");
	}
	@Override
	protected Shape productShape() {
		// TODO Auto-generated method stub
		return new Square();
	}

}
