package co.edu.usbcali.modelo;
// Generated 15/07/2018 07:41:58 PM by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol implements java.io.Serializable {

	private int idRol;
	private String nameRol;
	private String imgRol;
	private Set rolStudents = new HashSet(0);

	public Rol() {
	}

	public Rol(int idRol) {
		this.idRol = idRol;
	}

	public Rol(int idRol, String nameRol, String imgRol, Set rolStudents) {
		this.idRol = idRol;
		this.nameRol = nameRol;
		this.imgRol = imgRol;
		this.rolStudents = rolStudents;
	}

	public int getIdRol() {
		return this.idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNameRol() {
		return this.nameRol;
	}

	public void setNameRol(String nameRol) {
		this.nameRol = nameRol;
	}

	public String getImgRol() {
		return this.imgRol;
	}

	public void setImgRol(String imgRol) {
		this.imgRol = imgRol;
	}

	public Set getRolStudents() {
		return this.rolStudents;
	}

	public void setRolStudents(Set rolStudents) {
		this.rolStudents = rolStudents;
	}

}
