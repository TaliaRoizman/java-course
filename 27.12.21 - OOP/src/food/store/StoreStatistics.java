package food.store;

public class StoreStatistics {
	public static void main(String[] args) {

		Store s1 = new Store();
		fillStore(s1);
	}
	
	public static void fillStore(Store s) {
		boolean notFull = true;
		while(notFull) {
			notFull = s.addFruit(getRandomFruit());
			System.out.println("---F");
		}		
		
		notFull = true;
		while(notFull) {
			notFull = s.addVegetable(getRandomVeg());
			System.out.println("---v");
		}
	}
	
	public static Fruit getRandomFruit() {
		int weight = (int)(Math.random()*101)+100; // 100-200
		String taste  = "sweet";
		if(Math.random()<0.5) {
			return new Apple(weight, taste);
		} else {
			return new Strawberry(weight, taste);
		}
	}
	
	public static Vegetable getRandomVeg() {
		int weight = (int)(Math.random()*101)+100; // 100-200
		String taste  = "sour";
		if(Math.random()<0.5) {
			return new Carrot(weight, taste);
		} else {
			return new Tomato(weight, taste);
		}
	}
	
	

}
