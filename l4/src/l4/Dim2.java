package l4;

public class Dim2 {

	public static void main(String[] args) {
		double[][] nums = new double[4][5];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = Math.random()*11;
			}
		}
		for(double[] line:nums) {
			for(double d:line) {
				System.out.printf("%.3f ",d);
			}
			System.out.println();
		}
	}

}
