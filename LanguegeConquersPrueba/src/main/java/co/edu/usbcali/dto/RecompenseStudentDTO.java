package co.edu.usbcali.dto;

import co.edu.usbcali.modelo.Recompense;
import co.edu.usbcali.modelo.Student;

public class RecompenseStudentDTO {

	private int idRecompenseStudent;
	private Recompense recompense;
	private Student student;
	
	public int getIdRecompenseStudent() {
		return idRecompenseStudent;
	}
	public void setIdRecompenseStudent(int idRecompenseStudent) {
		this.idRecompenseStudent = idRecompenseStudent;
	}
	public Recompense getRecompense() {
		return recompense;
	}
	public void setRecompense(Recompense recompense) {
		this.recompense = recompense;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
