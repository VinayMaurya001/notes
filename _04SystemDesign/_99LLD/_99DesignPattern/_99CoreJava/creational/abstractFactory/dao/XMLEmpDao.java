package _41DesignPattern.coreJava.creational.abstractFactory.dao;

public class XMLEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Employee to XML");
	}

}
