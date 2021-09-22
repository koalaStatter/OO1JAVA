package l4;



public class EachString {
	public static void main(String[] args) {
		
		String s="koala";
		String s2="koala";
		String s3=new String("koala");
		System.out.println(s==s2);
		System.out.println(s==s3);
		String[] animal = { "cat", "koala", "dog ", "pig" };
		for (String str : animal) {
			System.out.print(str);
			if (str == "koala") {
				System.out.println(" YES !!!!!!!");
			} else {
				System.out.println(" no :(");
			}
		}
		//SAME CODE 
//		for (int i = 0; i < animal.length; i++) {
//			System.out.print(animal[i]);
//			if (animal[i] == "koala") {
//				System.out.println(" YES !!!!!!!");
//			} else {
//				System.out.println(" no :(");
//			}
//		}
	}

}
