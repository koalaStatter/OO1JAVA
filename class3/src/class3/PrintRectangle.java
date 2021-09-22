package class3;

import java.util.Scanner;

public class PrintRectangle {

	public static void main(String[] args) {
		Scanner inputScan=new Scanner(System.in);
		int rows ,columes;
		System.out.println("please enter the number of rows and columes");
		rows=inputScan.nextInt();
		columes=inputScan.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columes;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		inputScan.close();
	}

}
