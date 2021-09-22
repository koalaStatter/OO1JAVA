package l4;

public class HistOfArray {

	public static void main(String[] args) {
		int inputArr[]= {4,3,1,7};
		System.out.printf("there are %d numbers in the arrey \n",inputArr.length);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(inputArr[i]+": ");
			for(int j=0;j<inputArr[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
