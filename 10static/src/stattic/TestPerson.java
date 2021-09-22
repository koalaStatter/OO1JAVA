package stattic;

public class TestPerson {
	public static void main(String[] args) {
		Person.sayHi();
		Person p1=new Person("Jon");
		Person p2=new Person("Jon");
		System.out.println(p1);
		System.out.println(p2);
		p1.sayHi();
		p1.sayWhy();
		p1.getCount();
		Person.getCount();
		

	}
}
