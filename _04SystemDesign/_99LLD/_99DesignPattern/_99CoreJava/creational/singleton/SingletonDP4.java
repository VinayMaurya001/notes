package _41DesignPattern.coreJava.creational.singleton;

class SingletonDP4 {
	private static SingletonDP4 obj = null;

	private SingletonDP4() {
		System.out.println("Inside Constructor SingletonDP3");
	}

	public static synchronized SingletonDP4 getSingletonDP3() {
		if (obj == null) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			obj = new SingletonDP4();
		}
		return obj;
	}

	public static void doSomething() {
		// write your code
	}
}