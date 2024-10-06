package _41DesignPattern.coreJava.creational.abstractFactory.shape;
public class RoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("R")){
         return new RoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("S")){
         return new RoundedSquare();
      }	 
      return null;
   }
}