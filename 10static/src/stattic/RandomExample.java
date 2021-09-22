package stattic;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		Random rand=new Random();
		int countLess10=0;
		int count40_60=0;
		int j;
		for (int i=0;i<100000;i++) {
			j=rand.nextInt(100);
			if(j<10) {
				countLess10++;
			}
			else {
				if(j>40 && j<60) {
					count40_60++;
				}
			}
		}
		System.out.println("less 10 "+countLess10);
		System.out.println("40-60 "+count40_60);
	}

}
