package stattic;

import java.util.Arrays;
import java.util.Random;

public class PlayWithArray {

	public static void main(String[] args) {
		int[] num= {1,3,5,7};
		int[][] dim2= {{1,2},{3,5}};
		System.out.println(num);
		System.out.println(Arrays.toString(num));
		System.out.println(dim2);
		System.out.println(Arrays.toString(dim2));
		for (int i = 0; i < dim2.length; i++) {
			System.out.println(Arrays.toString(dim2[i]));
			
		}
		double [] fillMe=new double[10];
		Arrays.fill(fillMe, 7.0);
		System.out.println(Arrays.toString(fillMe));
		Random rand=new Random();
		Arrays.fill(fillMe, rand.nextDouble());
		System.out.println(Arrays.toString(fillMe));
		

	}

}
