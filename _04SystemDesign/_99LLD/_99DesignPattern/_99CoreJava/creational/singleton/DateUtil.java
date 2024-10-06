package _41DesignPattern.coreJava.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DateUtil implements Serializable//, Cloneable??????? what is need of this 
{

	private static final long serialVersionUID = 1L;
	private static volatile DateUtil instance;

	private DateUtil() {

	}

	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}
		return instance;

	}

	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public static void main(String[] args) {

		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = null;
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(
					new FileOutputStream(new File("/Users/bharaththippireddy/Documents/singleton/dateUtil.ser")));
			oos.writeObject(dateUtil1);

			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(new File("/Users/bharaththippireddy/Documents/singleton/dateUtil.ser")));
			dateUtil2 = (DateUtil) ois.readObject();

			oos.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(dateUtil1 == dateUtil2);

	}
}
