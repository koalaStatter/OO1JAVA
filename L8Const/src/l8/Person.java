package l8;

public class Person {
	String id;
	String name;
	final String NOT_A_PERSON="#######";
	
	public Person(String id, String name) {
		if(checkId(id)) {
			this.id = id;
		}
		else {
			this.id=NOT_A_PERSON;
		}
		this.name = name;
	}
	
	private boolean checkId(String id2Check) {
		if(!id2Check.startsWith("0")) {
			return false;
		}
		if(id2Check.length()!=9) {
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Person p=new Person("23", "GO");
		System.out.println(p);
		
	}

}
