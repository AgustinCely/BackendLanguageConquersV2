package co.edu.usbcali.modelo;
// Generated 15/07/2018 07:41:58 PM by Hibernate Tools 5.1.7.Final

/**
 * RolStudent generated by hbm2java
 */
public class RolStudent implements java.io.Serializable {

	private int idRolStudent;
	private Rol rol;
	private Student student;

	public RolStudent() {
	}

	public RolStudent(int idRolStudent) {
		this.idRolStudent = idRolStudent;
	}

	public RolStudent(int idRolStudent, Rol rol, Student student) {
		this.idRolStudent = idRolStudent;
		this.rol = rol;
		this.student = student;
	}

	public int getIdRolStudent() {
		return this.idRolStudent;
	}

	public void setIdRolStudent(int idRolStudent) {
		this.idRolStudent = idRolStudent;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
