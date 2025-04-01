package own;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Array size :");
		int a[] = new int[sc.nextInt()];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter " + i + " th Index value :");
			a[i] = sc.nextInt();
		}
		System.out.println("Before arrange :");
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i <= j) {
					if (a[i] > a[j]) {
						int t = a[i];
						a[i] = a[j];
						a[j] = t;
					}
				}

			}
		}
		System.out.println();
		System.out.println("After arrange :");
		System.out.println(Arrays.toString(a));

	}

}
