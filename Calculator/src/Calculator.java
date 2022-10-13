
import java.util.Scanner;

public class Calculator {
	static Scanner scnr = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean calcActivity = true;
		String exit;
		String userInput;
		do {
		System.out.println("Enter the calculator mode: Standard/Scientific?");
		String calcMode = scnr.next();
		
		if(calcMode.equals("Standard") || calcMode.equals("standard")) {
			System.out.println("The calculator will operate in standard mode.");
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			
			String opperation = scnr.next();
			
			if(opperation.equals("+")) {
				additionOpp();
			}
			
			else if(opperation.equals("-")) {
				subtractionsOpp();
			}
			
			else if(opperation.equals("*")) {
				multiplicationOpp();
			}
			
			else if(opperation.equals("/")) {
				divisionOpp();
			}
			else {
				System.out.println("Invalid operator " + opperation);
				do {
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
				userInput = scnr.next();
				if(!userInput.equals("+") && (!userInput.equals("-") && (!userInput.equals("*") && !userInput.equals("/")))) {
					System.out.println("Invalid operator " + userInput);
				}
				}while(!userInput.equals("+") && (!userInput.equals("-") && (!userInput.equals("*") && !userInput.equals("/"))));
				
				opperation = userInput;
				if(opperation.equals("+")) {
					additionOpp();
					
				}
				
				else if(opperation.equals("-")) {
					subtractionsOpp();
					
				}
				
				else if(opperation.equals("*")) {
					multiplicationOpp();
					
				}
				
				else if(opperation.equals("/")) {
					divisionOpp();
					
				}
			}
			
			
			
			System.out.println("Do you want to start over? (Y/N)");
			exit = scnr.next();
			if(exit.equals("Y")) {
				calcActivity = true;
			
			}
			else if(exit.equals("N")) {
				calcActivity = false;
			}
			
		}
		
		if(calcMode.equals("Scientific") || calcMode.equals("scientific")) {
			System.out.println("The calculator will operate in scientific mode.");
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
				
				String opperation = scnr.next();
			
				if(opperation.equals("+")) {
					additionOpp();
				}
			
				else if(opperation.equals("-")) {
					subtractionsOpp();
				}
			
				else if(opperation.equals("*")) {
					multiplicationOpp();
				}
			
				else if(opperation.equals("/")) {
					divisionOpp();
				}
				else if(opperation.equals("sin")){
					sinOpp();
				}
				else if(opperation.equals("cos")){
					cosOpp();
				}
				else if(opperation.equals("tan")){
					tanOpp();
				}
				else {
					do {
					System.out.println("Invalid operator " + opperation);
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
					userInput = scnr.next();
					}while(!userInput.equals("+") && (!userInput.equals("-") && (!userInput.equals("*") && (!userInput.equals("/") && (!userInput.equals("sin") && (!userInput.equals("cos") && !userInput.equals("tan")))))));
					
					opperation = userInput;
					if(opperation.equals("+")) {
						additionOpp();
						
					}
					
					else if(opperation.equals("-")) {
						subtractionsOpp();
						
					}
					
					else if(opperation.equals("*")) {
						multiplicationOpp();
						
					}
					
					else if(opperation.equals("/")) {
						divisionOpp();
						
					}
					else if(opperation.equals("sin")){
						sinOpp();
					}
					else if(opperation.equals("cos")){
						cosOpp();
					}
					else if(opperation.equals("tan")){
						tanOpp();
					}
					
				}
				
				
				
				System.out.println("Do you want to start over? (Y/N)");
				exit = scnr.next();
				if(exit.equals("Y")) {
					calcActivity = true;
				
				}
				else if(exit.equals("N")) {
					calcActivity = false;
				}
				
		}
		
		
		
		}while(calcActivity);
		
		System.out.println("Goodbye");
		
	}
		
	public static void additionOpp() {
		
		
		System.out.println("How many numbers do you want to add?");
		int numAmmount = scnr.nextInt();
		double sum = 0;
		double values[] = new double [numAmmount];
		System.out.println("Enter " + numAmmount + " numbers");
		
		for(int i = 0; i < numAmmount ; i++) {
			values[i] = scnr.nextDouble();
		}
		
		for(int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		System.out.println("Result: " + sum);
		
	}
	
	public static void subtractionsOpp() {
		
		
		System.out.println("How many numbers do you want to subtract?");
		int numAmmount = scnr.nextInt();
		
		double values[] = new double [numAmmount];
		System.out.printf("Enter %d numbers\n", numAmmount);
		double sum = scnr.nextDouble();
		for(int i = 0; i < numAmmount - 1 ; i++) {
			values[i] = scnr.nextDouble();
			sum = sum - values[i];
		}
		
		System.out.println("Result: " + sum);
		
	}
	
	public static void multiplicationOpp() {

		
		System.out.println("How many numbers do you want to multiply?");
		int numAmmount = scnr.nextInt();
		double sum = 1;
		double values[] = new double [numAmmount];
		System.out.printf("Enter %d numbers\n", numAmmount);
		
		for(int i = 0; i < numAmmount ; i++) {
			values[i] = scnr.nextDouble();
		}
		
		for(int i = 0; i < values.length; i++) {
			sum = sum * values[i];
		}
		System.out.println("Result: " + sum);
	
	}
	
	public static void divisionOpp() {
		
		
		System.out.println("How many numbers do you want to divide?");
		int numAmmount = scnr.nextInt();
		
		double values[] = new double [numAmmount];
		System.out.printf("Enter %d numbers\n", numAmmount);
		double sum = scnr.nextDouble();
		for(int i = 0; i < numAmmount - 1 ; i++) {
			values[i] = scnr.nextDouble();
			sum = sum / values[i];
		}
		
		System.out.println("Result: " + sum);
	}
	
	public static void sinOpp() {
		
		System.out.println("Enter a number in radians to find the sine");
		double userNum = scnr.nextDouble();
		
		double sin = Math.sin(userNum);
		
		System.out.println("Result: " + sin);
		
	}
	
	public static void cosOpp() {
		
		System.out.println("Enter a number in radians to find the cosine");
		double userNum = scnr.nextDouble();
		
		double cos = Math.cos(userNum);
		
		System.out.println("Result: " + cos);
		
		
	}
	
	public static void tanOpp() {
		
		System.out.println("Enter a number in radians to find the tangent");
		double userNum = scnr.nextDouble();
		
		double tan = Math.tan(userNum);
		
		System.out.println("Result: " + tan);
		
		
	}
}