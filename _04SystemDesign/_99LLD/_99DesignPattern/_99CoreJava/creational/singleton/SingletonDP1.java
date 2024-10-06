package _41DesignPattern.coreJava.creational.singleton;

public class SingletonDP1 {
	private static SingletonDP1 obj = new SingletonDP1();// Early, instance will
															// be created at load
															// time, but exception handling can't be done

	private SingletonDP1() {
		System.out.println("Inside Constructor SingletonDP1");
		
		
	}

	public static SingletonDP1 getSingletonDP() {
		return obj;
	}

	
	public static void main(String[] args) {
		System.out.println(SingletonDP1.getSingletonDP());
		System.out.println(SingletonDP1.getSingletonDP());
		System.out.println(SingletonDP1.getSingletonDP());
	}
}