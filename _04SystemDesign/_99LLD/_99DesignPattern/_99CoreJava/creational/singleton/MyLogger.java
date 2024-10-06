package _41DesignPattern.coreJava.creational.singleton;

import java.io.Serializable;

public class MyLogger implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private volatile static MyLogger instance;

	private MyLogger() {
	}

	private static MyLogger getInstance() {
		if (instance == null) {
			synchronized (MyLogger.class) {
				if (instance == null) {
					instance = new MyLogger();
				}
			}
		}
		return instance;

	}

	public void log(String message) {
		System.out.println(message);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}

	protected MyLogger readResolve() {
		return instance;
	}

	public static void main(String[] args) {
		MyLogger myLogger = MyLogger.getInstance();
		myLogger.log("Hi Logger via Singleton class.");

	}

}
