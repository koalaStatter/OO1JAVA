/**
 * add tax to price 
 */
package firstClass;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class FindTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double price;
		double priceWithTax;
		final double tax=0.17;
		System.out.println("what is the price");
		price=in.nextDouble();
		priceWithTax=price*(1+tax);
		System.out.println("the price with " +"tax*100+"+" % tax is "+priceWithTax);
	
		in.close();

	}

}
