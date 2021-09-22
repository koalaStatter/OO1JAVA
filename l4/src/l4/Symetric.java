package l4;

public class Symetric {

	public static void main(String[] args) {
		int[] inputArr= {3,6,4,6,6,3};
		boolean isSym=true;
		for(int left=0,right=inputArr.length-1; left<right ;left++,right--) {
			if(inputArr[left]!=inputArr[right]) {
				isSym=false;
				break;
			}
		}
		if(isSym) {
			System.out.println("the Arrey is symetric :)");
		}
		else {
			System.out.println("the Arrey is not symetric :(");
		}
	}

}
