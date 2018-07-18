package co.edu.usbcali.dto;

import java.math.BigDecimal;

public class NoteDTO {
	
	private int idNote;
	private BigDecimal quanlificationNote;
	
	public int getIdNote() {
		return idNote;
	}
	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}
	public BigDecimal getQuanlificationNote() {
		return quanlificationNote;
	}
	public void setQuanlificationNote(BigDecimal quanlificationNote) {
		this.quanlificationNote = quanlificationNote;
	}
	
}
