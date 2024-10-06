package _41DesignPattern.coreJava.creational.factory.personFactory;

public class PersonFactory {

	Person createPerson(String personType) {
		if (personType == null) {
			return null;
		} else if (personType.equalsIgnoreCase("male")) {
			return new Male();
		} else if (personType.equalsIgnoreCase("female")) {
			return new Female();
		}
		return null;

	}
}
