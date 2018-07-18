package co.edu.usbcali.dto;

import java.util.Date;

import co.edu.usbcali.modelo.MissionLevel;
import co.edu.usbcali.modelo.MissionType;
import co.edu.usbcali.modelo.Recompense;

public class MissionDTO {

	private int idMission;
	private MissionLevel missionLevel;
	private MissionType missionType;
	private Recompense recompense;
	private String titleMission;
	private Integer scoreMission;
	private Character stateMission;
	private Character sendMission;
	private Date dateLimit;
	
	public int getIdMission() {
		return idMission;
	}
	public void setIdMission(int idMission) {
		this.idMission = idMission;
	}
	public MissionLevel getMissionLevel() {
		return missionLevel;
	}
	public void setMissionLevel(MissionLevel missionLevel) {
		this.missionLevel = missionLevel;
	}
	public MissionType getMissionType() {
		return missionType;
	}
	public void setMissionType(MissionType missionType) {
		this.missionType = missionType;
	}
	public Recompense getRecompense() {
		return recompense;
	}
	public void setRecompense(Recompense recompense) {
		this.recompense = recompense;
	}
	public String getTitleMission() {
		return titleMission;
	}
	public void setTitleMission(String titleMission) {
		this.titleMission = titleMission;
	}
	public Integer getScoreMission() {
		return scoreMission;
	}
	public void setScoreMission(Integer scoreMission) {
		this.scoreMission = scoreMission;
	}
	public Character getStateMission() {
		return stateMission;
	}
	public void setStateMission(Character stateMission) {
		this.stateMission = stateMission;
	}
	public Character getSendMission() {
		return sendMission;
	}
	public void setSendMission(Character sendMission) {
		this.sendMission = sendMission;
	}
	public Date getDateLimit() {
		return dateLimit;
	}
	public void setDateLimit(Date dateLimit) {
		this.dateLimit = dateLimit;
	}
	
}
