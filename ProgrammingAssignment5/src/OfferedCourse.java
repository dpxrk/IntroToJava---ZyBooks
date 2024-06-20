public class OfferedCourse extends Course {
	private String instructorName;
	private String classTime;
	private String term;
	
	//@getter
	public String getInstructorName() {
		return instructorName;
	}
	
	//@setter
	public void setInstructorName(String name) {
		instructorName = name;
	}
	
	//@getter
	public String getTerm() {
		return term;
	}
	
	//@setter
	public void setTerm(String inputTerm) {
		term = inputTerm;
	}
	
	//@getter
	public String getClassTime() {
		return classTime;
	}
	
	//@setter
	public void setClassTime(String time) {
		classTime = time;
	}
	
	public void printAllInfo() {
		super.printInfo();
		System.out.println("   Instructor Name: " +instructorName);
		System.out.println("   Term: " +term);
		System.out.println("   Class Time: "+ classTime);
	}
	
	
}
