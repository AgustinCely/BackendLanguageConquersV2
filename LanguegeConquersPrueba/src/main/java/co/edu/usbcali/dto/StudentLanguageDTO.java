package co.edu.usbcali.dto;

import co.edu.usbcali.modelo.Language;
import co.edu.usbcali.modelo.Student;

public class StudentLanguageDTO {

	private int idStudentLanguage;
	private Language language;
	private Student student;
	
	public int getIdStudentLanguage() {
		return idStudentLanguage;
	}
	public void setIdStudentLanguage(int idStudentLanguage) {
		this.idStudentLanguage = idStudentLanguage;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
