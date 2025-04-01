package own;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int numOne = sc.nextInt();
		int numTwo = checkPalindrome(numOne);
		System.out.println(numOne+" : "+numTwo);
		if (numOne==numTwo)
			System.out.println("It's a Palindrome");
		else
			System.out.println("It's not a Palindrome");
		sc.close();
	}
	public static int checkPalindrome(int no) {
		int afterReverse = 0;

		while (no > 0) {
			afterReverse = afterReverse * 10 + (no % 10);
			no /= 10;
		}
		return afterReverse;
		
	}

}
