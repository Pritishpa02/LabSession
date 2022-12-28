package pritishProg;

import java.util.Scanner;

public class Excp {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two numbers:");
	 
	        // nextInt() reads the next integer from the keyboard
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	 
	        try {
	            int result = num1 / num2;
	            System.out.println("Result = " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception: Division by zero!");
	        }
	        

	}

}
