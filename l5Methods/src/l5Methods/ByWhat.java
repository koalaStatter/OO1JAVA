package l5Methods;

public class ByWhat {

	public static void main(String[] args) {
		int i=5;
		int j=9;
		int[] list= {1,2,3};
		moveInt(i);
		System.out.println("int i in main is "+i);
		j= moveInt(j);
		System.out.println("int j in main is "+j);
		moveList(list);
		System.out.println("arr in main is ");
		printArr(list);
	}
	public static int moveInt(int i) {
		i++;
		System.out.println("int i in method is "+i );
		return i;	
	}
	public static void moveList(int[] mList) {
		for (int i = 0; i < mList.length; i++) {
			mList[i]++;
		}
		System.out.println("arr in method is ");
		printArr(mList);
	}
	public static void printArr(int[] list) {
		for (int n:list) {
			System.out.print(n+" ");
		}
		System.out.println();	
	}
}
