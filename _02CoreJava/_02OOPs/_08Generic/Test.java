package _02CoreJava._02OOPs._08Generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<P> p = new ArrayList<>();
		//List<C> c = new ArrayList<>();

		p.add(new C());
		//p=c;//CTE
	}

}

class P {

}

class C extends P {

}