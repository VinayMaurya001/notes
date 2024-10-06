package _41DesignPattern.coreJava.creational.singleton;

class SingletonDP5 {
	private static SingletonDP5 obj = null;

	private SingletonDP5() {
		System.out.println("Inside Constructor SingletonDP4");
	}

	public static SingletonDP5 getSingletonDP4() {
		synchronized (SingletonDP5.class) {
			if (obj == null) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				obj = new SingletonDP5();
			}
		}

		return obj;
	}

	public static void doSomething() {
		// write your code
	}
}