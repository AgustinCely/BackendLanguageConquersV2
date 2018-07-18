package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.MissionLevelDTO;
import co.edu.usbcali.modelo.MissionLevel;

public class MissionLevelMapper implements IMissionLevelMapper{

	@Transactional(readOnly = true)
	public MissionLevelDTO missionLevelToMissionLevelDTO(MissionLevel missionLevel) throws Exception {
		try {
			MissionLevelDTO missionLevelDTO = new MissionLevelDTO();
			
			missionLevelDTO.setIdMissionLevel(missionLevel.getIdMissionLevel());
			missionLevelDTO.setImgMissionLevel(missionLevel.getImgMissionLevel());
			missionLevelDTO.setNameMissionLevel(missionLevel.getNameMissionLevel());
			missionLevelDTO.setScoreMissionLevel(missionLevelDTO.getScoreMissionLevel());
			
			return missionLevelDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public MissionLevel missionLevelDTOToMissionLevel(MissionLevelDTO missionLevelDTO) throws Exception {
		try {
			MissionLevel missionLevel = new MissionLevel();
			
			missionLevel.setIdMissionLevel(missionLevelDTO.getIdMissionLevel());
			missionLevel.setImgMissionLevel(missionLevelDTO.getImgMissionLevel());
			missionLevel.setNameMissionLevel(missionLevelDTO.getNameMissionLevel());
			missionLevel.setScoreMissionLevel(missionLevelDTO.getScoreMissionLevel());
			
			return missionLevel;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<MissionLevelDTO> listMissionLevelToMissionLevelDTO(List<MissionLevel> missionLevels) throws Exception {
		try {
			List<MissionLevelDTO> missionLevelDTOs = new ArrayList<MissionLevelDTO>();
			
			for (MissionLevel missionLevel : missionLevels) {
				MissionLevelDTO missionLevelDTO = missionLevelToMissionLevelDTO(missionLevel);
				
				missionLevelDTOs.add(missionLevelDTO);
			}
			
			return missionLevelDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<MissionLevel> listMissionLevelDTOToMissionLevel(List<MissionLevelDTO> missionLevelDTOs)
			throws Exception {
		try {
			List<MissionLevel> missionLevels = new ArrayList<MissionLevel>();
			
			for (MissionLevelDTO missionLevelDTO : missionLevelDTOs) {
				MissionLevel missionLevel = missionLevelDTOToMissionLevel(missionLevelDTO);
				
				missionLevels.add(missionLevel);
			}
			
			return missionLevels;
		} catch (Exception e) {
			throw e;
		}
	}

}
