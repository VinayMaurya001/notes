package _41DesignPattern.coreJava.structural.adapter;

public class WeatherAdapter {
	public int findTemperature(int zipCode) {
		String city = "";
		if (zipCode == 123456) {
			city = "Delhi";
		}
		if (zipCode == 223456) {
			city = "Patna";
		}
		WeatherFinder weatherFinder = new WeatherFinderImpl();
		return weatherFinder.findTemperature(city);
	}
}
