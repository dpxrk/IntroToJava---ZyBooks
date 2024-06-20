public class Course {
	
	private String courseNumber;
	private String courseTitle;
	
	//@getter
	public String getCourseNumber() {
		return courseNumber;
	}
	
	//@setter	
	public void setCourseNumber(String number) {
		courseNumber = number;
	}
	
	//@getter
	public String getCourseTitle() {
		return courseTitle;
	}
	
	//@setter	
	public void setCourseTitle(String newTitle) {
		courseTitle = newTitle;
	}
	
	public void printInfo() {
		System.out.println("Course Information: ");
		System.out.println("   Course Number: " +courseNumber);
		System.out.println("   Course Title: " +courseTitle);
	}

}
