package _41DesignPattern.coreJava.creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Employee e1 = new Employee(1, "Ram", "manager", 200000, "gurgaon");
		e1.showRecord();
		System.out.println("\n");

		Employee e2 = (Employee) e1.getClone();
		e2.showRecord();
	}

}
