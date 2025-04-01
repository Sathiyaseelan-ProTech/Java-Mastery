package own;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		String no = Integer.toString(num);
		int len = no.length();
		int sum = 0;

		for (int j = 0; j < no.length(); j++) {
			int sq = 1;
			char c = no.charAt(j);
			int tem = Character.getNumericValue(c);

			sq *= (int) Math.pow(tem, len);

			sum += sq;
		}
		System.out.println(sum);
		System.out.println("Input no :" + num + " sum of power :" + sum);
		if (num == sum) {
			System.out.println("So, " + num + " is a Armstrong number.");
		} else {
			System.out.println("So " + num + " is not Armstrong number.");
		}

	}

}
