package c;

import b.Box;

public class Demo1StaticInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 5, 6, 8 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		String[] names = {"Dana", "Michael", "Yossi", "Maya"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("=========");
		Box[] boxes = {new Box(), new Box(1,2,3)};
		System.out.println(boxes.length);
		
	}

}
