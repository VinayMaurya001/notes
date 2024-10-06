package _41DesignPattern.coreJava.creational.singleton;

class SingletonDP7 {
	private static SingletonDP7 obj = null;

	private SingletonDP7() {
		System.out.println("Inside Constructor SingletonDP6");
	}

	public static SingletonDP7 getSingletonDP6() {
		if (obj == null) {
			synchronized (SingletonDP7.class) {
				if (obj == null) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					obj = new SingletonDP7();
				}
			}
		}
		return obj;
	}

	public static void doSomething() {
		// write your code
	}
}