package class3;

public class PrintAllOdd {

	public static void main(String[] args) {
		int number=(int)(Math.random()*101);
		System.out.println("printing all the numbers from 1 to "+number);
		for(int i=1;i<number;i=i+2) {
			System.out.print(i+", ");
		}
		System.out.print(number);
	}
}
