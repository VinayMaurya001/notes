package _41DesignPattern.coreJava.creational.factory.shapeFactory;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}