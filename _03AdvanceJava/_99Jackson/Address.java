package _03AdvanceJava._99Jackson;

public class Address {

	private String city;
	private int pinCode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

}
