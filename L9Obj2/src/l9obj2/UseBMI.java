package l9obj2;

public class UseBMI {
	public static void main(String[] args) {
		BMI bmi1 = new BMI("John Doe", 18, 78, 1.85);
		System.out.println("The BMI for " + bmi1.getName() + " is " + 
		bmi1.getBMI() + " " + bmi1.getStatus());
		BMI bmi2 = new BMI("Peter King", 80, 1.65);
		System.out.println("The BMI for " + bmi2.getName() + " is " 
		+ bmi2.getBMI() + " " + bmi2.getStatus());
	}

}
