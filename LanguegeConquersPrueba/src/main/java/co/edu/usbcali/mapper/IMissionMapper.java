package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.MissionDTO;
import co.edu.usbcali.modelo.Mission;

public interface IMissionMapper {

	public MissionDTO missionToMissionDTO(Mission mission) throws Exception;
	public Mission missionDTOToMission(MissionDTO missionDTO) throws Exception;
	public List<MissionDTO> listMissionToMissionDTO(List<Mission> missions) throws Exception;
	public List<Mission> listMissionDTOToMission(List<MissionDTO> missionDTOs) throws Exception;
}
