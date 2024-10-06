package demo.factoryDesignPattern;

public class ProxyDesingPattern {

	public static void main(String[] args) {
		ClientInterface object = new Proxy();
		object.process();
		object.process();
	}

}

interface ClientInterface {
	void process();
}

class RealSubject implements ClientInterface {

	public RealSubject() {
		heavyInitialConfiguration();
	}

	private void heavyInitialConfiguration() {
		System.out.println("Loading initial configuration...");
	}

	@Override
	public void process() {
		System.out.println("processing complete.");
	}

}

class Proxy implements ClientInterface {
	private static RealSubject object;

	@Override
	public void process() {
		if (object == null) {
			object = new RealSubject();
		}
		object.process();
	}
}