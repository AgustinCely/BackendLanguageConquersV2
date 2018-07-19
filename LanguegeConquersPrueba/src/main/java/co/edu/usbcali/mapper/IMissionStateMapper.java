package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.MissionStateDTO;
import co.edu.usbcali.modelo.MissionState;

public interface IMissionStateMapper {

	public MissionStateDTO missionStateToMissionStateDTO(MissionState missionState) throws Exception;
	public MissionState missionStateDTOToMissionState(MissionStateDTO missionStateDTO) throws Exception;
	public List<MissionStateDTO> listMissionStateToMissionStateDTO(List<MissionState> missionStates) throws Exception;
	public List<MissionState> listMissionStateDTOToMissionState(List<MissionStateDTO> missionStateDTOs) throws Exception;
}
