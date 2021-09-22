package l4;

import java.util.Arrays;

public class copyT {

	public static void main(String[] args) {
		int arg1[]= {1,2,3,4};
		int[] arg2=new int[4];
		int arg3[];
		//        from arr  starting point, To arr , starting point , number of value to copy  
		System.arraycopy(arg1, 0, arg2, 0, 4);
		for(int n:arg2) {
			System.out.print(n+" ");
		}
		
		System.out.println("\n"+ arg1.equals(arg2));
		System.out.println(Arrays.equals(arg1,arg2));
		System.out.println();
		arg3=Arrays.copyOf(arg1, 2);
		for(int n:arg3) {
			System.out.print(n+" ");
		}
		
	}

}