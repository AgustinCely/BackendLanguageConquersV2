package co.edu.usbcali.dto;

import co.edu.usbcali.modelo.Mission;
import co.edu.usbcali.modelo.Student;

public class StudentMissionHomeworkDTO {

	private int idStudentMissionHomework;
	private Mission mission;
	private Student student;
	private String urlHomework;
	private String homeworkName;
	
	public int getIdStudentMissionHomework() {
		return idStudentMissionHomework;
	}
	public void setIdStudentMissionHomework(int idStudentMissionHomework) {
		this.idStudentMissionHomework = idStudentMissionHomework;
	}
	public Mission getMission() {
		return mission;
	}
	public void setMission(Mission mission) {
		this.mission = mission;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getUrlHomework() {
		return urlHomework;
	}
	public void setUrlHomework(String urlHomework) {
		this.urlHomework = urlHomework;
	}
	public String getHomeworkName() {
		return homeworkName;
	}
	public void setHomeworkName(String homeworkName) {
		this.homeworkName = homeworkName;
	}
	
}
