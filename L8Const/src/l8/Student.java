package l8;


public class Student {
	private String name;
	private String[] subjects;
	private int numOfSubjects;
	
		public Student(String name, int maxNumOfSubjects) {
		this.name = name;
		this.subjects = new String[maxNumOfSubjects];
		numOfSubjects=0;
	}
		
	public Student(String name, String[] subjects, int maxNumOfSubjects) {
			this(name,maxNumOfSubjects);
			addListOfSub(subjects);
		}

	 public boolean addListOfSub(String[] subjects2Add) {
		if(numOfSubjects+subjects2Add.length>getMaxNumbOfSub()) {
			return false;
		}
		for (String s:subjects2Add) {	
			subjects[numOfSubjects++]=s;
		}	
		return true;
	}

	//max number of subject a student can take 	
	public int getMaxNumbOfSub() {
		return subjects.length;
	}
	// add a subject to learn 
	public boolean addSubject(String sub) {
		if(numOfSubjects==getMaxNumbOfSub()) {
			return false;
		}
		subjects[numOfSubjects++]=sub;
		return true;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the subjects
	 */
	public String[] getSubjects() {
		String[] back=new String[numOfSubjects];
		System.arraycopy(subjects, 0, back, 0, numOfSubjects);
		return back;
	}
	/**
	 * @return the numOfSubjects
	 */
	public int getNumOfSubjects() {
		return numOfSubjects;
	}
	
}
