package class3;

public class RandomNumberOfAstrixes {

	public static void main(String[] args) {
		int numberOfAstrixes=(int) (Math.random()*21);
		System.out.printf("Printing %d astrixes: \n",numberOfAstrixes);
		for(int i=0;i<numberOfAstrixes;i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
