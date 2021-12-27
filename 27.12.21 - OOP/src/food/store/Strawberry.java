package food.store;

public class Strawberry extends Fruit{

	public Strawberry() {
		super();
	}

	public Strawberry(double weight, String taste) {
		super(weight, taste);
	}

	@Override
	public String toString() {
		return "Strawberry [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
