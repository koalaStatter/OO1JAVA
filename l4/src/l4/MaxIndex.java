package l4;

public class MaxIndex {

	public static void main(String[] args) {
		int[] numbers= {4,6,42,67,56,45,21};
		int max=0;
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i]>numbers[max]) {
				max=i;
			}
		}
		System.out.printf("the max is in cell number %d and its value is %d",max,numbers[max]);

	}

}
