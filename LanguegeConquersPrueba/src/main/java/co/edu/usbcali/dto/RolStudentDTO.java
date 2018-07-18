package co.edu.usbcali.dto;

import co.edu.usbcali.modelo.Rol;
import co.edu.usbcali.modelo.Student;

public class RolStudentDTO {

	private int idRolStudent;
	private Rol rol;
	private Student student;
	
	public int getIdRolStudent() {
		return idRolStudent;
	}
	public void setIdRolStudent(int idRolStudent) {
		this.idRolStudent = idRolStudent;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
