package co.edu.usbcali.modelo;
// Generated 15/07/2018 07:41:58 PM by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * CourseMission generated by hbm2java
 */
public class CourseMission implements java.io.Serializable {

	private int idCourseMission;
	private Course course;
	private Mission mission;
	private String descripcionMission;
	private Set missionStudents = new HashSet(0);

	public CourseMission() {
	}

	public CourseMission(int idCourseMission) {
		this.idCourseMission = idCourseMission;
	}

	public CourseMission(int idCourseMission, Course course, Mission mission, String descripcionMission,
			Set missionStudents) {
		this.idCourseMission = idCourseMission;
		this.course = course;
		this.mission = mission;
		this.descripcionMission = descripcionMission;
		this.missionStudents = missionStudents;
	}

	public int getIdCourseMission() {
		return this.idCourseMission;
	}

	public void setIdCourseMission(int idCourseMission) {
		this.idCourseMission = idCourseMission;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Mission getMission() {
		return this.mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public String getDescripcionMission() {
		return this.descripcionMission;
	}

	public void setDescripcionMission(String descripcionMission) {
		this.descripcionMission = descripcionMission;
	}

	public Set getMissionStudents() {
		return this.missionStudents;
	}

	public void setMissionStudents(Set missionStudents) {
		this.missionStudents = missionStudents;
	}

}
