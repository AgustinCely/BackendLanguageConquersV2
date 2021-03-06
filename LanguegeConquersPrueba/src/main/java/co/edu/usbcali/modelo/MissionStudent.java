package co.edu.usbcali.modelo;
// Generated 15/07/2018 07:41:58 PM by Hibernate Tools 5.1.7.Final

/**
 * MissionStudent generated by hbm2java
 */
public class MissionStudent implements java.io.Serializable {

	private int idMissionStudent;
	private CourseMission courseMission;
	private Note note;
	private Integer idStudent;
	private Integer scoreMission;

	public MissionStudent() {
	}

	public MissionStudent(int idMissionStudent) {
		this.idMissionStudent = idMissionStudent;
	}

	public MissionStudent(int idMissionStudent, CourseMission courseMission, Note note, Integer idStudent,
			Integer scoreMission) {
		this.idMissionStudent = idMissionStudent;
		this.courseMission = courseMission;
		this.note = note;
		this.idStudent = idStudent;
		this.scoreMission = scoreMission;
	}

	public int getIdMissionStudent() {
		return this.idMissionStudent;
	}

	public void setIdMissionStudent(int idMissionStudent) {
		this.idMissionStudent = idMissionStudent;
	}

	public CourseMission getCourseMission() {
		return this.courseMission;
	}

	public void setCourseMission(CourseMission courseMission) {
		this.courseMission = courseMission;
	}

	public Note getNote() {
		return this.note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public Integer getIdStudent() {
		return this.idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	public Integer getScoreMission() {
		return this.scoreMission;
	}

	public void setScoreMission(Integer scoreMission) {
		this.scoreMission = scoreMission;
	}

}
