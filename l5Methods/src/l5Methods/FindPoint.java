package l5Methods;

/**
 *  find a point in R^2 that is higher then a give point and to its left for example
 *  input (3,5) output (2,6)
 * @author David
 *
 */
public class FindPoint {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int x=3;
		int y=5;
		int[] point=findPoint(x,y);
		System.out.printf("new point has X of %d and Y %d\n",point[0],point[1]);
		int [] point2=new int[2];
		findPoint(point2,x,y);
		System.out.printf("new point has X of %d and Y %d",point2[0],point2[1]);

	}
/*
 * new array example 
 */
	public static int[] findPoint(int x, int y) {
		int[] back=new int[2];
		back[0]=x--;
		back[1]=y++;
		return back;
	}
	/*
	 * getting the array as input 
	 */
	 public static void findPoint(int[] back,int x,int y) {
		 back[0]=x--;
		 back[1]=y++;
		 
	 }

}
