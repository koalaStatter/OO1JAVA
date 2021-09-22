package firstClass;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lesson1 {

	public static void main(String[] args) {
		int a;
		a=3;
		Scanner scanner= new Scanner(System.in);
		System.out.println("type a number");
	//	a=scanner.nextInt();
		System.out.println(a);
		scanner.close();
		
		JOptionPane.showMessageDialog(null, "long live the koala", "I have a meassage", JOptionPane.INFORMATION_MESSAGE);
		String an=JOptionPane.showInputDialog("enter anaimal ");
		System.out.println(an);
		
	
	}

}
