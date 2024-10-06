package _41DesignPattern.coreJava.creational.prototype;

public class Employee implements PrototypeInterface {
	private int id;
	private String name, designation;
	private double salary;
	private String address;

	public Employee() {
		System.out.println("   Employee Records of Oracle Corporation ");
		System.out.println("---------------------------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");
	}

	public Employee(int id, String name, String designation, double salary, String address) {
		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	public void showRecord() {
		System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
	}

	@Override
	public PrototypeInterface getClone() {
		return new Employee(id, name, designation, salary, address);
	}
}