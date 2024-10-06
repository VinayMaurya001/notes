package _41DesignPattern.coreJava.creational.abstractFactory.dao;

public class DBDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to DB");
	}

}
