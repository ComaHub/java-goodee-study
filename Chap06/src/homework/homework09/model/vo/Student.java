package homework.homework09.model.vo;

public class Student {
	private int studentNum;
	private String studentName;
	private String className;
	
	private static int studentCount = 1;
	
	public Student() {
		this.studentNum = studentCount++;
	}
	
	public int getStudentNum() {
		return studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
