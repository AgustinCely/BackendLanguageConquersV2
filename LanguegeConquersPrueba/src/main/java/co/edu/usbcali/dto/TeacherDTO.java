package co.edu.usbcali.dto;

import java.util.Date;

public class TeacherDTO {
	
	private int idTeacher;
	private String username;
	private String nameUser;
	private String lastnameUser;
	private String emailUser;
	private String passwordUser;
	private String imageUser;
	private Date birthdateUser;
	private Character genderUser;
	
	public int getIdTeacher() {
		return idTeacher;
	}
	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getLastnameUser() {
		return lastnameUser;
	}
	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public String getImageUser() {
		return imageUser;
	}
	public void setImageUser(String imageUser) {
		this.imageUser = imageUser;
	}
	public Date getBirthdateUser() {
		return birthdateUser;
	}
	public void setBirthdateUser(Date birthdateUser) {
		this.birthdateUser = birthdateUser;
	}
	public Character getGenderUser() {
		return genderUser;
	}
	public void setGenderUser(Character genderUser) {
		this.genderUser = genderUser;
	}
	
	
	
}
