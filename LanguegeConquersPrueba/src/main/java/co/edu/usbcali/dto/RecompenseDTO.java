package co.edu.usbcali.dto;

public class RecompenseDTO {

	private int idRecompense;
	private String titleRecompense;
	private String imgRecompense;
	private Integer scoreMin;
	
	public int getIdRecompense() {
		return idRecompense;
	}
	public void setIdRecompense(int idRecompense) {
		this.idRecompense = idRecompense;
	}
	public String getTitleRecompense() {
		return titleRecompense;
	}
	public void setTitleRecompense(String titleRecompense) {
		this.titleRecompense = titleRecompense;
	}
	public String getImgRecompense() {
		return imgRecompense;
	}
	public void setImgRecompense(String imgRecompense) {
		this.imgRecompense = imgRecompense;
	}
	public Integer getScoreMin() {
		return scoreMin;
	}
	public void setScoreMin(Integer scoreMin) {
		this.scoreMin = scoreMin;
	}
	
}
