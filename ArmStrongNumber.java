package own;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		System.out.println("ArmStrongNumbers 1 to "+n);
		int i = 1;
		while (i <= n) {
			int num = i;
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
			if (num == sum)
				System.out.println( num );
			i++;
		}
	}

}
