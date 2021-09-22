package l13rec;

public class FindRec {
	private int find9Lec(int number,int loc) {
		loc++;
		if(number==0) {
			return -1;
		}
		else {
			if(number%10==9) {
				return loc;
			}
		}
		return find9Lec(number/10, loc);
	}
	
	public int find9Lec(int number) {
		return find9Lec(number, 0);
	}
	public static void main(String[] args) {
		FindRec f=new FindRec();
		System.out.println(f.find9Lec(92888984, 0));
		System.out.println(f.find9Lec(999288884));
	}

}
