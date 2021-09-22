package l4;

import java.util.Scanner;

public class numberOfChars {
	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		int count = 0;
		boolean hasAppear;
		char[] str = new char[10];

		System.out.printf("Please enter %d chars: ", str.length);
		for (int i = 0; i < str.length; i++) {
			str[i] = inputScan.next().charAt(0);
		}
		inputScan.close();
		// print each char only once
		System.out.println("The chars are:");
		for (int i = 0; i < str.length; i++) {
			hasAppear = false;
			int j = 0;
			while (j<i&&!hasAppear) {
				if (str[i] == str[j]) {
					hasAppear = true;
				}
				j++;
			}
			if (!hasAppear) {
				System.out.print(str[i]);
				count++;
			}
		}

		System.out.printf("\nThere were %d different letters\n", count);
	}
}
