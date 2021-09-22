package l9obj2;

public class Employee {
	private String name;
	private String phone;

	public Employee(String name, String phone) {
		setName(name);
		setPhone(phone);
	}

	public Employee(Employee other) {
		this(other.name, other.phone);
	}

	public String toString() {
		return "name=" + name + ", phone=" + phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
