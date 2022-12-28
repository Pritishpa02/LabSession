package pritishProg;

import java.util.Scanner;

public class Excp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		//To Throw Exception if the age is below 18
		if(age >= 18) {
			System.out.println("You are eligible to vote.");
		}
		//if age i above 18
		
		else {
			throw new ArithmeticException("Age is not correct");
		}
		sc.close();
	}

	}

