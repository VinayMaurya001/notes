package _41DesignPattern.coreJava.creational.factory.shapeFactory;

public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("C")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("R")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("S")) {
			return new Square();
		}
		return null;
	}
}