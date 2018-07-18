package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.MissionDTO;
import co.edu.usbcali.modelo.Mission;

public class MissionMapper implements IMissionMapper {

	@Transactional(readOnly = true)
	public MissionDTO missionToMissionDTO(Mission mission) throws Exception {
		try {
			MissionDTO missionDTO = new MissionDTO();
			
			missionDTO.setIdMission(mission.getIdMission());
			missionDTO.setTitleMission(mission.getTitleMission());
			missionDTO.setScoreMission(mission.getScoreMission());
			missionDTO.setStateMission(mission.getStateMission());
			missionDTO.setMissionLevel(mission.getMissionLevel());
			missionDTO.setMissionType(mission.getMissionType());
			missionDTO.setRecompense(mission.getRecompense());
			missionDTO.setSendMission(mission.getSendMission());
			missionDTO.setDateLimit(mission.getDateLimit());
			
			return missionDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public Mission missionDTOToMission(MissionDTO missionDTO) throws Exception {
		try {
			Mission mission = new Mission();
			
			mission.setIdMission(missionDTO.getIdMission());
			mission.setTitleMission(missionDTO.getTitleMission());
			mission.setScoreMission(missionDTO.getScoreMission());
			mission.setStateMission(missionDTO.getStateMission());
			mission.setMissionLevel(missionDTO.getMissionLevel());
			mission.setMissionType(missionDTO.getMissionType());
			mission.setRecompense(missionDTO.getRecompense());
			mission.setSendMission(missionDTO.getSendMission());
			mission.setDateLimit(missionDTO.getDateLimit());
			
			return mission;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<MissionDTO> listMissionToMissionDTO(List<Mission> missions) throws Exception {
		try {
			List<MissionDTO> missionDTOs = new ArrayList<MissionDTO>();
			
			for (Mission mission : missions) {
				MissionDTO missionDTO = missionToMissionDTO(mission);
				missionDTOs.add(missionDTO);
			}
			
			return missionDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Mission> listMissionDTOToMission(List<MissionDTO> missionDTOs) throws Exception {
		try {
			List<Mission> missions = new ArrayList<Mission>();
			
			for (MissionDTO missionDTO : missionDTOs) {
				Mission mission = missionDTOToMission(missionDTO);
				missions.add(mission);
			}
			
			return missions;
		} catch (Exception e) {
			throw e;
		}
	}

}
