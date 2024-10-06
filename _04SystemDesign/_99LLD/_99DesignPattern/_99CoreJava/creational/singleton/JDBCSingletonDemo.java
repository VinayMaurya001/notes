package _41DesignPattern.coreJava.creational.singleton;

public class JDBCSingletonDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String username = "rama";
		JDBCSingleton jdbcSingleton = JDBCSingleton.getInstance();
		
		try {
			jdbcSingleton.view(username);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
