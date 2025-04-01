package own;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number do you want? ");
		int n = sc.nextInt();
		int a[] = new int[n];
		a[0] = 0;
		a[1] = 1;

		int i = 0;
		int j = 1;
		int k = j + 1;

		while (i <= a.length - 3) {
			a[k] = a[i] + a[j];
			i++;
			j++;
			k++;
		}
		for(int b:a)
			System.out.println(b);
	}

}
