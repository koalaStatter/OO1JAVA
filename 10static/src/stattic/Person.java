package stattic;

public class Person {
	private static int count=0;
	private LicenseAge licenseAge;
	private String name;
	private int id;
	
	public Person(String name2Set,LicenseAge licenseAge2Set) {
		name=name2Set;
		licenseAge=licenseAge2Set;
	}
	
	public Person(String name2Set) {
		name=name2Set;
		id=++count;	
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	public static void  sayHi(){
		System.out.println("hi");
	}
	public void sayWhy() {
		System.out.println("why");
	}
	
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		sayHi();
		//sayWhy();
		
	}
}
