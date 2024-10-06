package _41DesignPattern.coreJava.creational.factory.personFactory;

public class Female implements Person {

	@Override
	public void wish(String message) {
		System.out.println("Female " + message);

	}

}
