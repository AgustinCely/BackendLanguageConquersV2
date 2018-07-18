package co.edu.usbcali.dto;

import java.util.Date;

import co.edu.usbcali.modelo.Avatar;
import co.edu.usbcali.modelo.Course;

public class StudentDTO {

	private int idStudent;
	private Avatar avatar;
	private Course course;
	private String nameStudent;
	private String lastnameStudent;
	private Character genderStudent;
	private String passwordStudent;
	private Integer scoreStudent;
	private Integer semestreStudent;
	private String nicknameStudent;
	private String emailStudent;
	private Date birthdateStudent;
	
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public Avatar getAvatar() {
		return avatar;
	}
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public String getLastnameStudent() {
		return lastnameStudent;
	}
	public void setLastnameStudent(String lastnameStudent) {
		this.lastnameStudent = lastnameStudent;
	}
	public Character getGenderStudent() {
		return genderStudent;
	}
	public void setGenderStudent(Character genderStudent) {
		this.genderStudent = genderStudent;
	}
	public String getPasswordStudent() {
		return passwordStudent;
	}
	public void setPasswordStudent(String passwordStudent) {
		this.passwordStudent = passwordStudent;
	}
	public Integer getScoreStudent() {
		return scoreStudent;
	}
	public void setScoreStudent(Integer scoreStudent) {
		this.scoreStudent = scoreStudent;
	}
	public Integer getSemestreStudent() {
		return semestreStudent;
	}
	public void setSemestreStudent(Integer semestreStudent) {
		this.semestreStudent = semestreStudent;
	}
	public String getNicknameStudent() {
		return nicknameStudent;
	}
	public void setNicknameStudent(String nicknameStudent) {
		this.nicknameStudent = nicknameStudent;
	}
	public String getEmailStudent() {
		return emailStudent;
	}
	public void setEmailStudent(String emailStudent) {
		this.emailStudent = emailStudent;
	}
	public Date getBirthdateStudent() {
		return birthdateStudent;
	}
	public void setBirthdateStudent(Date birthdateStudent) {
		this.birthdateStudent = birthdateStudent;
	}
	
}
