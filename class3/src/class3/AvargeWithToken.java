package class3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AvargeWithToken {

	public static void main(String[] args) {
		int inputNum;
		int sum=0;
		int numberOfInput=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("please type a number");
		inputNum=scan.nextInt();
		while (inputNum>=0) {
			sum=sum+inputNum;
			numberOfInput++;
			System.out.println("please type a number");
			inputNum=scan.nextInt();
		}
		double avarage=sum/numberOfInput; //bug !!!!!! 
		System.out.printf("the avarage is %.2f\n",avarage);
	}
}
