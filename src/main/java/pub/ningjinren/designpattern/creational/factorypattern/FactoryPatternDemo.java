package pub.ningjinren.designpattern.creational.factorypattern;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		
		/*
		 * 简单工厂
		 */
		System.out.println("----------简单工厂-----------------");
		Shape circle = SimpleShapeFactory.getInstance("circle");
		circle.draw();
		Shape rectangle = SimpleShapeFactory.getInstance("rectangle");
		rectangle.draw();
		Shape square = SimpleShapeFactory.getInstance("square");
		square.draw();
		System.out.println("---------抽象工厂-------------------");
		/*
		 * 抽象工厂
		 */
		Shape shape = null;
		AbstractShapeFactory factory = new CircleFactory();
		shape = factory.productShape();
		shape.draw();
		factory = new RectangleFactory();
		shape = factory.productShape();
		shape.draw();
		factory = new SquareFactory();
		shape = factory.productShape();
		shape.draw();
	}
	
}
