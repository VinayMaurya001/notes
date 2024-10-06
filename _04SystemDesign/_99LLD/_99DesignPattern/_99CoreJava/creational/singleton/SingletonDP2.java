package _41DesignPattern.coreJava.creational.singleton;

class SingletonDP2 {
	private static SingletonDP2 obj;// Early, instance will be created at
									// loadtime

	// static block initialization for exception handling
	static {
		try {
			obj = new SingletonDP2();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	private SingletonDP2() {
		System.out.println("Inside Constructor SingletonDP2");
	}

	public static SingletonDP2 getSingletonDP() {
		return obj;
	}

	public static void doSomething() {
		// write your code
	}
}