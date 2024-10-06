package _41DesignPattern.coreJava.creational.singleton;

class SingletonDP12 implements Cloneable {
	private static SingletonDP12 obj = new SingletonDP12();// Early, instance
															// will
															// be created at
															// load
															// time

	private SingletonDP12() {
		System.out.println("Inside Constructor SingletonDP1");
	}

	public static SingletonDP12 getSingletonDP12() {
		return obj;
	}

	public static void doSomething() {
		// write your code
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
		//return this;
		//throw new CloneNotSupportedException();
	}
}