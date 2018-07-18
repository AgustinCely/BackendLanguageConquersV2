package co.edu.usbcali.dto;

import co.edu.usbcali.modelo.Course;
import co.edu.usbcali.modelo.Mission;

public class CourseMissionDTO {

	private int idCourseMission;
	private Course course;
	private Mission mission;
	private String descripcionMission;
	
	public int getIdCourseMission() {
		return idCourseMission;
	}
	public void setIdCourseMission(int idCourseMission) {
		this.idCourseMission = idCourseMission;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Mission getMission() {
		return mission;
	}
	public void setMission(Mission mission) {
		this.mission = mission;
	}
	public String getDescripcionMission() {
		return descripcionMission;
	}
	public void setDescripcionMission(String descripcionMission) {
		this.descripcionMission = descripcionMission;
	}
	
}
