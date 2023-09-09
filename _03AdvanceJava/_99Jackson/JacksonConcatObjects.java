package _03AdvanceJava._99Jackson;

public class JacksonConcatObjects {

	public static void main(String[] args) {
		Address adress1 = new Address("Delhi", 123456);
		Address adress2 = new Address("Banglore", 123456);
		Address adress3 = new Address("New York", 123456);

		Employee emp1 = new Employee("Vinay", adress1);
		Employee emp2 = new Employee("Sarang", adress2);
		Employee emp3 = new Employee("Saikat", adress3);

		
		
	}

}
