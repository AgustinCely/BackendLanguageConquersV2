package co.edu.usbcali.dto;

import java.util.Date;

import co.edu.usbcali.modelo.Teacher;

public class CourseDTO {

	private int idCourse;
	private Teacher teacher;
	private String nameCourse;
	private String passwordCourse;
	private Integer numberStudent;
	private Integer quantityLanguage;
	private Date startCourse;
	private Date endCourse;
	
	
	public int getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getNameCourse() {
		return nameCourse;
	}
	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}
	public String getPasswordCourse() {
		return passwordCourse;
	}
	public void setPasswordCourse(String passwordCourse) {
		this.passwordCourse = passwordCourse;
	}
	public Integer getNumberStudent() {
		return numberStudent;
	}
	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}
	public Integer getQuantityLanguage() {
		return quantityLanguage;
	}
	public void setQuantityLanguage(Integer quantityLanguage) {
		this.quantityLanguage = quantityLanguage;
	}
	public Date getStartCourse() {
		return startCourse;
	}
	public void setStartCourse(Date startCourse) {
		this.startCourse = startCourse;
	}
	public Date getEndCourse() {
		return endCourse;
	}
	public void setEndCourse(Date endCourse) {
		this.endCourse = endCourse;
	}
	
}
