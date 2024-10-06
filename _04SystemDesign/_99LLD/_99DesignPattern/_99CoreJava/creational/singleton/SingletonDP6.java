package _41DesignPattern.coreJava.creational.singleton;

class SingletonDP6 {
	private static SingletonDP6 obj = null;

	private SingletonDP6() {
		System.out.println("Inside Constructor SingletonDP5");
	}

	public static SingletonDP6 getSingletonDP5() {
		if (obj == null) {
			
			synchronized (SingletonDP6.class) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				obj = new SingletonDP6();
			}
		}
		return obj;
	}

	public static void doSomething() {
		// write your code
	}
}