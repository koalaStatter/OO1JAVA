package l9obj2;

public class BMI {
	private String name;
	private int age;
	private double weight; // in kilogram
	private double height; // in meters

	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public BMI(String name, double weight, double height) {
		this(name, 24, weight, height);
	}

	public double getBMI() {
		double bmi = weight / (height * height);
		return Math.round(bmi * 100) / 100.0;
	}

	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 16)
			return "seriously underweight you need to start to train";
		else if (bmi < 18)
			return "underweight you need to start to train";
		else if (bmi < 24)
			return "normal weight I see you train ";
		else if (bmi < 29)
			return "over weight you need to start to train";
		else if (bmi < 35)
			return "seriously over weight you need to start to train";
		else
			return "gravely over weight you need to start to train";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
}
