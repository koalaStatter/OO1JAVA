package l4;

public class findMax {

	public static void main(String[] args) {
		int[] numbers= {4,6,42,67,56,45,21};
		int max=numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.printf("the max is %d",max);

	}

}
