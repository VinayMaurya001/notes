package _41DesignPattern.coreJava.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
		// System.out.println(test1.hashCode());
		// System.out.println(test2.hashCode());
		// SingletonDP1.doSomething();
		// m1();
		// m2();
		// m22();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		m12();
	}

	private static void m12() {
		try {
			SingletonDP12 singletonDP12 = SingletonDP12.getSingletonDP12();
			System.out.println(singletonDP12);
			SingletonDP12 singletonDP122;
			singletonDP122 = (SingletonDP12) singletonDP12.clone();
			System.out.println(singletonDP122);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	private static void m11() {
		try {
			SingletonDP11 singletonDP11 = SingletonDP11.getSingletonDP11();
			System.out.println(singletonDP11);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f.txt"));
			oos.writeObject(singletonDP11);
			oos.flush();
			oos.close();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f.txt"));
			SingletonDP11 singletonDP112 = (SingletonDP11) ois.readObject();
			System.out.println(singletonDP112);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void m9() {
		SingletonDP1 instanceOne = SingletonDP1.getSingletonDP();
		SingletonDP1 instanceTwo = null;
		try {
			Constructor[] constructors = SingletonDP1.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (SingletonDP1) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

	private static void m8() {

	}

	private static void m7() {
		try {
			SingletonDP8 instanceOne = SingletonDP8.getSingletonDP7();

			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
			out.writeObject(instanceOne);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
			SingletonDP8 instanceTwo = (SingletonDP8) in.readObject();
			in.close();

			System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
			System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void m6() {
		// TODO Auto-generated method stub

	}

	private static void m5() {
		// TODO Auto-generated method stub

	}

	private static void m4() {
		new Thread(() -> {
			SingletonDP5 singletonDP2 = SingletonDP5.getSingletonDP4();
			System.out.println("X" + singletonDP2.hashCode());

		}).start();

		for (int i = 1; i <= 10; i++)
			System.out.println(i + " " + SingletonDP5.getSingletonDP4().hashCode());

	}

	private static void m3() {
		new Thread(() -> {
			SingletonDP4 singletonDP2 = SingletonDP4.getSingletonDP3();
			System.out.println("X" + singletonDP2.hashCode());

		}).start();

		for (int i = 1; i <= 10; i++)
			System.out.println(i + " " + SingletonDP4.getSingletonDP3().hashCode());

	}

	private static void m22() {
		new Thread(() -> {
			SingletonDP3 singletonDP2 = SingletonDP3.getSingletonDP2();
			System.out.println("X" + singletonDP2.hashCode());

		}).start();

		for (int i = 1; i <= 10; i++)
			System.out.println(i + " " + SingletonDP3.getSingletonDP2().hashCode());

	}

	private static void m2() {
		SingletonDP3 singletonDP1 = SingletonDP3.getSingletonDP2();
		SingletonDP3 singletonDP2 = SingletonDP3.getSingletonDP2();

		System.out.println(singletonDP1.hashCode());
		System.out.println(singletonDP2.hashCode());

	}

	private static void m1() {
		SingletonDP1 singletonDP1 = SingletonDP1.getSingletonDP();
		SingletonDP1 singletonDP2 = SingletonDP1.getSingletonDP();

		System.out.println(singletonDP1.hashCode());
		System.out.println(singletonDP2.hashCode());

	}

}
