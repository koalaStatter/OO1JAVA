package class3;

public class PrintDown {
	public static void main(String[] args) {
		int number=(int)(Math.random()*101);
		System.out.printf("printing all the numbers from %d to 0\n",number);
		for(int i=number;i>0; i--) {
			System.out.print(i+", ");
		}
		System.out.print("0");
	}
}
