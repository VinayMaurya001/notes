package _41DesignPattern.coreJava.creational.factory.shapeFactory;
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}