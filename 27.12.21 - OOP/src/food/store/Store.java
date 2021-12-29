package food.store;

public class Store {

	Fruit[] fruit = new Fruit[100];
	Vegetable[] vegetable = new Vegetable[100];

	public boolean addFruit(Fruit f) {
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i] == null) {
				fruit[i] = f;
				return true;
			}
		}
		return false;
	}

	public boolean addVegetable(Vegetable v) {
		for (int i = 0; i < vegetable.length; i++) {
			if (vegetable[i] == null) {
				vegetable[i] = v;
				return true;
			}
		}
		return false;
	}

	public void showStock() {
		System.out.println("======================");
		System.out.println("store stock: ");
		System.out.println("fruites: ");
		for (Fruit fruit : fruit) {
			System.out.println(fruit);
		}
		System.out.println("vegetable: ");
		for (Vegetable veg : vegetable) {
			System.out.println(veg);
		}
		System.out.println("======================");
		}
	}
	
	

