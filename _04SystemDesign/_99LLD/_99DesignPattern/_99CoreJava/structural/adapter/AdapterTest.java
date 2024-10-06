package _41DesignPattern.coreJava.structural.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		WeatherAdapter weatherAdapter = new WeatherAdapter();
		System.out.println(weatherAdapter.findTemperature(123456));
		System.out.println(weatherAdapter.findTemperature(223456));

	}

}
