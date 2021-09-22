package l8;

import java.util.Arrays;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student("dontCare", 4);
		Student size0=new Student("arr0", 0);
		Student size1=new Student("arr1", 1);
		String java="java";
		String infi="infi";
		System.out.println(s1.addSubject(infi));
		System.out.println(s1.addSubject(java));
		System.out.println(size0.addSubject(infi));
		System.out.println(size0.addSubject(java));
		System.out.println(size1.addSubject(infi));
		System.out.println(size1.addSubject(java));
		
		System.out.println(Arrays.toString(s1.getSubjects()));
		
		String[] y1= {"j","I","kill"};
		Student s2=new Student("name",y1,8);
		System.out.println(Arrays.toString(s2.getSubjects()));
		s2.addSubject(infi);
		String[] y2= {"jh2","kill2"};
		s2.addListOfSub(y2);
		System.out.println(Arrays.toString(s2.getSubjects()));
	}
		

}
