package grades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import javax.management.monitor.StringMonitorMBean;

public class StudentList {
	private Student[] allStudent;
	private String className;
	public final double EXAM_PART = 0.9;

	public StudentList(String name) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(name));
		String size = scan.next();
		String[] arr = size.split(",");
		allStudent = new Student[Integer.parseInt(arr[0])];
		className = arr[1];
		for (int i = 0; i < allStudent.length; i++) {
			allStudent[i] = new Student(scan);
		}
	}

	private int addEx(String fileName) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(fileName));
		int back = 0;
		sort();
		while (scan.hasNext()) {
			String tmp = scan.next();
			String[] arr = tmp.split(",");
			long id = Long.parseLong(arr[0]);
			;
			int grade = Integer.parseInt(arr[1]);
			Student studentToAdd = findById(id);
			if (studentToAdd != null) {
				back++;
				studentToAdd.setExGrade(grade);
			}
		}
		scan.close();
		return back;
	}

	private int findMinArg(int start) {
		int minArg = start;
		for (int i = start + 1; i < allStudent.length; i++) {
			if (allStudent[i].getId() < allStudent[minArg].getId()) {
				minArg = i;
			}
		}
		return minArg;
	}

	private void sort() {
		for (int i = 0; i < allStudent.length; i++) {
			int arg = findMinArg(i);
			swap(arg, i);
		}

	}

	private void swap(int i, int j) {
		Student temp = allStudent[i];
		allStudent[i] = allStudent[j];
		allStudent[j] = temp;

	}

	public void getFinalGrade(String exFile) throws IOException {
		addEx(exFile);
		for (int i = 0; i < allStudent.length; i++) {
			allStudent[i].calcFinalGrade(EXAM_PART, 1 - EXAM_PART);
		}
	}

	public String toString() {
		return "StudentList [allStudent=" + Arrays.toString(allStudent) + "]";
	}

	private Student findById(long id) {
		int start = 0;
		int end = allStudent.length - 1;
		int middle;
		while (start <= end) {
			middle = (start + end) / 2;
			if (allStudent[middle].getId() == id) {
				return allStudent[middle];
			} else {
				if (allStudent[middle].getId() < id) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
			}
		}
		return null;
	}

	public void printToFile(File f) throws FileNotFoundException {
		PrintWriter printWriter = new PrintWriter(f);
		for (Student s : allStudent) {
			printWriter.print(s.getId());
			printWriter.print(",");
			printWriter.println(s.getFinalGrade());
		}
		printWriter.close();
		
		
	}

	public static void main(String[] args) throws IOException {
		StudentList sl = new StudentList("D:\\grades\\dt.csv");
		File ex = new File("D:\\grades\\de.csv");
		System.out.println(ex.exists());
		System.out.println(ex.canRead());
		sl.getFinalGrade("D:\\grades\\de.csv");
		System.out.println(sl);
		File outF = new File("D:\\grades\\dFinal.csv");
		sl.printToFile(outF);

	}

}
