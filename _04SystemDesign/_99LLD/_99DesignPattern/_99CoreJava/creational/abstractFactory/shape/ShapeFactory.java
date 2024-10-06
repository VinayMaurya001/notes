package _41DesignPattern.coreJava.creational.abstractFactory.shape;

public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("R")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("S")) {
			return new Square();
		}
		return null;
	}
}