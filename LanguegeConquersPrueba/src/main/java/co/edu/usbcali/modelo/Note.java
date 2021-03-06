package co.edu.usbcali.modelo;
// Generated 15/07/2018 07:41:58 PM by Hibernate Tools 5.1.7.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Note generated by hbm2java
 */
public class Note implements java.io.Serializable {

	private int idNote;
	private BigDecimal quanlificationNote;
	private Set missionStudents = new HashSet(0);

	public Note() {
	}

	public Note(int idNote) {
		this.idNote = idNote;
	}

	public Note(int idNote, BigDecimal quanlificationNote, Set missionStudents) {
		this.idNote = idNote;
		this.quanlificationNote = quanlificationNote;
		this.missionStudents = missionStudents;
	}

	public int getIdNote() {
		return this.idNote;
	}

	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}

	public BigDecimal getQuanlificationNote() {
		return this.quanlificationNote;
	}

	public void setQuanlificationNote(BigDecimal quanlificationNote) {
		this.quanlificationNote = quanlificationNote;
	}

	public Set getMissionStudents() {
		return this.missionStudents;
	}

	public void setMissionStudents(Set missionStudents) {
		this.missionStudents = missionStudents;
	}

}
