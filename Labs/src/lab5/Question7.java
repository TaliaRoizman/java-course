package lab5;

import java.util.Scanner;

public class Question7 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st number: ");
			int n1 = sc.nextInt();
			System.out.println("Enter 2st number: ");
			int n2 = sc.nextInt();
			sc.close();

			if (n1 > n2) {
				int temp = n1;
				n1 = n2;
				n2 = temp;
			}

			System.out.println(n1 + " - " + n2);

			for (int i = n1; i <= n2; i++) {
				int n = i;
				boolean isSeven = false;
				while (n > 0) {
					if ((i % 7 == 0) || (n % 10 == 7)) {
						System.out.println("BOOM");
						isSeven = true;
						break;
					} else {
						n = (int)(n/10);
					}
				}
				if (isSeven == false) {
					System.out.println(i);
				}
			}
	}

}
