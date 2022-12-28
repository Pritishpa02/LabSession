package abcz;

import java.util.Scanner;

public class vc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		  System.out.println("Enter Your Name:");
		  String a = sc.nextLine();
				
		  StringBuilder reverseString = new StringBuilder(a);
		  reverseString.reverse();
		  String result = reverseString.toString();
				
		  System.out.println("Reversed String:"+result);
				
		  System.out.println("Upper Case Of String:"+a.toUpperCase());

		}

	}