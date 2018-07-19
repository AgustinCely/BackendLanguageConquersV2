package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.MissionTypeDTO;
import co.edu.usbcali.modelo.MissionType;

public interface IMissionTypeMapper {

	public MissionTypeDTO missionTypeToMissionTypeDTO(MissionType missionType) throws Exception;
	public MissionType missionTypeDTOToMissionType(MissionTypeDTO missionTypeDTO) throws Exception;
	public List<MissionTypeDTO> listMissionTypeToMissionTypeDTO(List<MissionType> missionTypes) throws Exception;
	public List<MissionType> listMissionTypeDTOToMissionType(List<MissionTypeDTO> missionTypeDTOs) throws Exception;
}
