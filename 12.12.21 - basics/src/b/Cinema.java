package b;

public class Cinema {
	private String address;
	private int capcity;
	
	public Cinema() {
	}

	public Cinema(String address, int capcity) {
		this.address = address;
		this.capcity = capcity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCapcity() {
		return capcity;
	}

	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}

}
