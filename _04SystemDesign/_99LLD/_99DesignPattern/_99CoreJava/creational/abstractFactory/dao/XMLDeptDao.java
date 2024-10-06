package _41DesignPattern.coreJava.creational.abstractFactory.dao;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to XML");
	}

}
