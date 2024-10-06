package _41DesignPattern.coreJava.creational.singleton;

class SingletonDP8  {

	private SingletonDP8() {
		System.out.println("Inside Constructor SingletonDP7");
	}

	private static class SingletonDP8Helper {
		private static final SingletonDP8 obj = new SingletonDP8();
	}
 
	public static SingletonDP8 getSingletonDP7() {
		return SingletonDP8Helper.obj;
	}

	public static void doSomething() {
		// write your code
	}

	
}