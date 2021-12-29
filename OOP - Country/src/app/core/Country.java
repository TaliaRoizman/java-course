package app.core;

public class Country {

	Highway[] highways = new Highway[5];

	public Country() {
	}

	public Country(Highway[] highways) {
		this.highways = highways;
	}

	public Highway[] getHighways() {
		return highways;
	}
	
	

}
