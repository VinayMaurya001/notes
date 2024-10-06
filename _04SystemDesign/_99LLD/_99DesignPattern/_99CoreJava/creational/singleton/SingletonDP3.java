package _41DesignPattern.coreJava.creational.singleton;

class SingletonDP3 {
	private static SingletonDP3 obj = null;

	private SingletonDP3() {
		System.out.println("Inside Constructor SingletonDP2");
	}

	public static SingletonDP3 getSingletonDP2() {
		if (obj == null) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			obj = new SingletonDP3();
		}
		return obj;
	}

	public static void doSomething() {
		// write your code
	}
}