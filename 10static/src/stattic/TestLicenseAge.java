package stattic;

public class TestLicenseAge {

	public static void main(String[] args) {
		LicenseAge licenseAgeISR=new LicenseAge(17);
		Person p1=new Person("ACHI", licenseAgeISR);
		Person p2=new Person("AchiShli", licenseAgeISR);
		LicenseAge licenseAgeUSA=new LicenseAge(21);
		Person p3=new Person("Linda", licenseAgeUSA);
		licenseAgeISR.setAge(16);
		
		
		

	}

}
