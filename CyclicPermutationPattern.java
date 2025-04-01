package own;

import java.util.Scanner;

public class CyclicPermutationPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for CyclicPermutationPattern :");
		int n = sc.nextInt();
		System.out.println("First Type :");
		firstType(n);
		System.out.println();
		System.out.println("Second Type :");
		secondType(n);
	}

	private static void firstType(int t) {
		int n = t;
		int a = n;
		for (int i = n; i >= 1; i--) {
			int j = 0;
			int k = a;
			while (j <= n - 1 || k >= 1) {
				if (n - j >= 1) {
					System.out.print(" " + (n - j));
				} else if (n - j <= 0) {
					if (i == j || i < j)
						System.out.print(" " + (i + k));
				}
				k--;
				j++;

			}
			--n;
			System.out.println();
		}
	}

	private static void secondType(int t) {
		int n = t;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + (n - ((i + j) % n)));
			}
			System.out.println();
		}
	}
}
