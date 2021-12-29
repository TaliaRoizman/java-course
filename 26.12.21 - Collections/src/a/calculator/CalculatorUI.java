	package a.calculator;

	import java.util.Scanner;

	public class CalculatorUI{
		
		private Calculator calculator = new Calculator();
		private Scanner sc = new Scanner(System.in);
		private boolean systemOn;
		
		public void start() {
			systemOn = true;
			while(systemOn) {
				try {
					printMenu();
					String command = sc.nextLine();
					switch(command) {
					case "+":
						doAdd();
						break;
					case "-":
						doSub();
						break;
					case "*":
						doMul();
						break;
					
					case "/":
						doDiv();
						break;
						
					case "Clr":
						doClear();
						break;
						
					case "res":
						doGetRes();
						break;
										
					}
					
				} catch (Exception e) {
				System.err.println("ERROR: " + e.getMessage());
			}
			}
		
		}
		

		private void doGetRes() {
			// TODO Auto-generated method stub
			
		}


		private void doClear() {
			// TODO Auto-generated method stub
			
		}


		private void doDiv() {
			System.out.println("Enter value to Divide: ");
			double val = Double.parseDouble(sc.nextLine());
			calculator.div(val);
			System.out.println("Divided: " + val);
			
		}


		private void doMul() {
			System.out.println("Enter value to multiply: ");
			double val = Double.parseDouble(sc.nextLine());
			calculator.mul(val);
			System.out.println("Multiplyed: " + val);
			
		}


		private void doSub() {
			System.out.println("Enter value to sub: ");
			double val = Double.parseDouble(sc.nextLine());
			calculator.sub(val);
			System.out.println("Subtracted: " + val);
					
		}


		private void doAdd() {
			System.out.println("Enter value to add: ");
			double val = Double.parseDouble(sc.nextLine());
			calculator.add(val);
			System.out.println("Added: " + val);
		}


		public void printMenu() {
			System.out.println("\n=== Menu ===");
			System.out.println("Add ........... +");
			System.out.println("Sub ........... -");
			System.out.println("Multiplay ..... *");
			System.out.println("Divide ........ /");
			System.out.println("Clear ......... clr");
			System.out.println("Get Result .... res");
			
		}
	}


