package _41DesignPattern.coreJava.creational.factory.personFactory;

public class Male implements Person {

	@Override
	public void wish(String message) {
		System.out.println("Male " + message);

	}

}
