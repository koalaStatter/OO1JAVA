package class3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AvargeWithTokenAndDo {
	public static void main(String[] args) {
		int sum=1;
		int numberOfInput=-1;
		int inputNum=0;
		Scanner scan=new Scanner(System.in);
		do {
		//	String inputString=JOptionPane.showInputDialog("please type a number");
		//inputNum=Integer.parseInt(inputString);
			System.out.println("please type a number");
			inputNum=scan.nextInt();
			sum=sum+inputNum;
			numberOfInput++;
		} while (inputNum!=-1);
		double avarage=sum/numberOfInput; //bug !!!!!! 
		System.out.printf("the avarage is %.2f\n",avarage);
	}
}
