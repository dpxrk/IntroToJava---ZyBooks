import java.util.Scanner;

public class CourseInformation {

	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String courseNumber;
		String courseTitle;
		String instructorName;
		String courseTerm;
		String classTime;
		
		
		Course myCourse = new Course();
		OfferedCourse newCourse = new OfferedCourse();
		
		courseNumber = scnr.nextLine();
		courseTitle = scnr.nextLine();
		
		myCourse.setCourseNumber(courseNumber);
		myCourse.setCourseTitle(courseTitle);
		
		courseNumber = scnr.nextLine();
		courseTitle = scnr.nextLine();
		instructorName = scnr.nextLine();
		courseTerm = scnr.nextLine();
		classTime = scnr.nextLine();
		
		newCourse.setCourseNumber(courseNumber);;
		newCourse.setCourseTitle(courseTitle);;
		newCourse.setInstructorName(instructorName);
		newCourse.setTerm(courseTerm);
		newCourse.setClassTime(classTime);
		
		myCourse.printInfo();
		newCourse.printAllInfo();
		
		scnr.close();
		
		
	}
}
