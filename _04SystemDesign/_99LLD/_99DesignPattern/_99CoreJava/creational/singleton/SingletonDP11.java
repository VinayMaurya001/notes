package _41DesignPattern.coreJava.creational.singleton;

import java.io.Serializable;

class SingletonDP11 implements Serializable {
	private static SingletonDP11 obj = null;

	private SingletonDP11() {
		System.out.println("Inside Constructor SingletonDP11");
	}

	public static SingletonDP11 getSingletonDP11() {
		if (obj == null) {
			synchronized (SingletonDP11.class) {
				if (obj == null) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					obj = new SingletonDP11();
				}
			}
		}
		return obj;
	}

	// This method is called immediately after an object of this class is
	// deserialized.
	protected Object readResolve() {
		// Instead of the object we are on, return the class variable singleton
		return getSingletonDP11();
	}
}