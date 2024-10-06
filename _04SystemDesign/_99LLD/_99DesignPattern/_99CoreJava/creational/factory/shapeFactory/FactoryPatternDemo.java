package _41DesignPattern.coreJava.creational.factory.shapeFactory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("C");

		// call draw method of Circle
		shape1.draw();

		// get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("R");

		// call draw method of Rectangle
		shape2.draw();

		// get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("S");

		// call draw method of square
		shape3.draw();
	}
}