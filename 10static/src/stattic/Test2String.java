package stattic;

import java.util.Arrays;

public class Test2String {
	int[][] printMe;
	public Test2String(int size) {
		printMe=new int[size][size];
		for (int i = 0; i < printMe.length; i++) {
			for (int j = 0; j < printMe.length; j++) {
				printMe[i][j]=(i+1)*(j+1);
			}
		}
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Test2String [printMe=" + Arrays.toString(printMe) + "]";
	}public Test2String() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Test2String t=new Test2String(3);
		System.out.println(t);
		
		
	}
}
