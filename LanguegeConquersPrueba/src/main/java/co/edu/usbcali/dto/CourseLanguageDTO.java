package co.edu.usbcali.dto;

import co.edu.usbcali.modelo.Course;
import co.edu.usbcali.modelo.Language;

public class CourseLanguageDTO {

	private int idCourseLanguage;
	private Course course;
	private Language language;
	private Integer progressbarCourseLanguage;
	private String imgCourseLanguage;
	
	
	public int getIdCourseLanguage() {
		return idCourseLanguage;
	}
	public void setIdCourseLanguage(int idCourseLanguage) {
		this.idCourseLanguage = idCourseLanguage;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Integer getProgressbarCourseLanguage() {
		return progressbarCourseLanguage;
	}
	public void setProgressbarCourseLanguage(Integer progressbarCourseLanguage) {
		this.progressbarCourseLanguage = progressbarCourseLanguage;
	}
	public String getImgCourseLanguage() {
		return imgCourseLanguage;
	}
	public void setImgCourseLanguage(String imgCourseLanguage) {
		this.imgCourseLanguage = imgCourseLanguage;
	}
	
}
