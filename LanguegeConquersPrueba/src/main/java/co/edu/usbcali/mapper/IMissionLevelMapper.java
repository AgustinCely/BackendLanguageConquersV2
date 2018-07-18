package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.MissionLevelDTO;
import co.edu.usbcali.modelo.MissionLevel;

public interface IMissionLevelMapper {

	public MissionLevelDTO missionLevelToMissionLevelDTO(MissionLevel missionLevel) throws Exception;
	public MissionLevel missionLevelDTOToMissionLevel(MissionLevelDTO missionLevelDTO) throws Exception;
	public List<MissionLevelDTO> listMissionLevelToMissionLevelDTO(List<MissionLevel> missionLevels) throws Exception;
	public List<MissionLevel> listMissionLevelDTOToMissionLevel(List<MissionLevelDTO> missionLevelDTOs) throws Exception;
	
}
