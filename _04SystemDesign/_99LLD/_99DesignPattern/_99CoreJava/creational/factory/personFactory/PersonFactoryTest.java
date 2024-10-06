package _41DesignPattern.coreJava.creational.factory.personFactory;

public class PersonFactoryTest {

	public static void main(String[] args) {
		PersonFactory personFactory = new PersonFactory();
		Person malePerson = personFactory.createPerson("male");
		malePerson.wish("means Mr.");
		Person femalePerson = personFactory.createPerson("female");
		femalePerson.wish("means Ms.");
	}
}
