package class3;

public class PrintAllNumbers2 {

	public static void main(String[] args) {
		int number=(int)(Math.random()*101);
		System.out.println("printing all the numbers from 1 to "+number);
		for(int i=1;i<number;i++) {
			System.out.print(i+", ");
		}
		System.out.print(number);
	}

}
