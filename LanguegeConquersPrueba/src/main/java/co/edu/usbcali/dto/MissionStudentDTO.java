package co.edu.usbcali.dto;

import co.edu.usbcali.modelo.CourseMission;
import co.edu.usbcali.modelo.Note;

public class MissionStudentDTO {

	private int idMissionStudent;
	private CourseMission courseMission;
	private Note note;
	private Integer idStudent;
	private Integer scoreMission;
	
	public int getIdMissionStudent() {
		return idMissionStudent;
	}
	public void setIdMissionStudent(int idMissionStudent) {
		this.idMissionStudent = idMissionStudent;
	}
	public CourseMission getCourseMission() {
		return courseMission;
	}
	public void setCourseMission(CourseMission courseMission) {
		this.courseMission = courseMission;
	}
	public Note getNote() {
		return note;
	}
	public void setNote(Note note) {
		this.note = note;
	}
	public Integer getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}
	public Integer getScoreMission() {
		return scoreMission;
	}
	public void setScoreMission(Integer scoreMission) {
		this.scoreMission = scoreMission;
	}
	
}
