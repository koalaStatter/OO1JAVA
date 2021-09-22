package l4;

import java.util.Scanner;

public class ArrayHandler {
	private int[] inputArr;

	public ArrayHandler(int[] inputArr) {
		this.inputArr = inputArr;
	}

	public int findMax() {
		int max = inputArr[0];
		for (int i = 1; i < inputArr.length; i++) {
			if (inputArr[i] > max) {
				max = inputArr[i];
			}
		}
		return max;
	}

	public int findMaxIndex() {
		int max = 0;
		for (int i = 1; i < inputArr.length; i++) {
			if (inputArr[i] > inputArr[max]) {
				max = i;
			}
		}
		System.out.printf("the max is in cell number %d and its value is %d", max, inputArr[max]);
		return max;
	}

	public int numberOfChar() {
		char[] str = readChar();
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			boolean hasAppear = false;
			int j = 0;
			while (j < i && !hasAppear) {
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
		return count;
	}

	private char[] readChar() {
		Scanner inputScan = new Scanner(System.in);
		int count = 0;
		boolean hasAppear;
		char[] str = new char[10];

		System.out.printf("Please enter %d chars: ", str.length);
		for (int i = 0; i < str.length; i++) {
			str[i] = inputScan.next().charAt(0);
		}
		inputScan.close();
		return str;
	}

	public boolean isSymetic() {
		boolean isSym = true;
		int left = 0;
		int right = inputArr.length - 1;
		while (left < right) {
			if (inputArr[left] != inputArr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}
	public static void main(String[] args) {
		int[] inputArr= {3,6,4,6,6,3};
		ArrayHandler handler=new ArrayHandler(inputArr);
		System.out.println(handler.isSymetic());
		int num=handler.numberOfChar();
		int max=handler.findMax();
		int maxIndex=handler.findMaxIndex();

	}

}
