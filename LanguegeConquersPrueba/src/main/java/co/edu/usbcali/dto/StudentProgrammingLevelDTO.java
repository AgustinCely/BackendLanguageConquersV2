package co.edu.usbcali.dto;

import co.edu.usbcali.modelo.ProgrammingLevel;
import co.edu.usbcali.modelo.Student;

public class StudentProgrammingLevelDTO {

	private int idStudentProgrammingLevel;
	private ProgrammingLevel programmingLevel;
	private Student student;
	
	public int getIdStudentProgrammingLevel() {
		return idStudentProgrammingLevel;
	}
	public void setIdStudentProgrammingLevel(int idStudentProgrammingLevel) {
		this.idStudentProgrammingLevel = idStudentProgrammingLevel;
	}
	public ProgrammingLevel getProgrammingLevel() {
		return programmingLevel;
	}
	public void setProgrammingLevel(ProgrammingLevel programmingLevel) {
		this.programmingLevel = programmingLevel;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
