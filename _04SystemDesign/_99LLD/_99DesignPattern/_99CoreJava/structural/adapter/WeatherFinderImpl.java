package _41DesignPattern.coreJava.structural.adapter;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int findTemperature(String city) {
		int temperature = -1;
		if (city.equalsIgnoreCase("delhi")) {
			temperature = 10;
		}
		if (city.equalsIgnoreCase("patna")) {
			temperature = 20;
		}
		return temperature;
	}
}
