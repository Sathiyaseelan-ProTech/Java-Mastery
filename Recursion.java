package own;

import java.util.*;

public class Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("------------------------------");
		oddEven(1, num);//find a odd or even using Recursion
		System.out.println("------------------------------");
		int factorial = fact(num);//find the factorial number of given number using Recursion
		System.out.println("Factorial no of : " + num + " --> " + factorial);
		System.out.println("------------------------------");
		System.out.println("\nFibonacci series " + num + " times");
		fib(0, 1, num);//print Fibonacci series given number of times
		System.out.println("\n------------------------------");
		sc.close();
	}

	public static void oddEven(int a, int b) {
		if (a <= b) {
			String s = (a % 2 == 0) ? a + " is a Evem number" : a + " is a Odd number";
			System.out.println(s);
			oddEven(a + 1, b);
		}
	}

	public static int fact(int no) {
		return (no >= 1) ? no * fact(no - 1) : 1;
	}

	public static int fib(int a, int b, int tar) {
		if (tar > 0) {
			int c = a + b;
			System.out.print(a + " ");
			int n = b + fib(b, c, tar - 1);
		}
		return 0;
	}

}
