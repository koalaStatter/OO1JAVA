package l5Methods;

public class traceMet {

	public static void main(String[] args) {
		int i=1;
		int j =2;
		int first=5;
		System.out.println(max(i,j));
		int res=max(first,9);
		System.out.println(res);

	}
	public static int max(int first,int second) {
		if(first>second) {
			return first;
		}
		return second;
	}

}
