package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.MissionTypeDTO;
import co.edu.usbcali.modelo.MissionType;

public class MissionTypeMapper implements IMissionTypeMapper{

	@Transactional(readOnly = true)
	public MissionTypeDTO missionTypeToMissionTypeDTO(MissionType missionType) throws Exception {
		try {
			MissionTypeDTO missionTypeDTO = new MissionTypeDTO();
			return missionTypeDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public MissionType missionTypeDTOToMissionType(MissionTypeDTO missionTypeDTO) throws Exception {
		try {
			MissionType missionType = new MissionType();
			
			return missionType;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<MissionTypeDTO> listMissionTypeToMissionTypeDTO(List<MissionType> missionTypes) throws Exception {
		try {
			List<MissionTypeDTO> missionTypeDTOs = new ArrayList<MissionTypeDTO>();
			
			for (MissionType missionType : missionTypes) {
				MissionTypeDTO missionTypeDTO = missionTypeToMissionTypeDTO(missionType);
				missionTypeDTOs.add(missionTypeDTO);
			}
			
			return missionTypeDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<MissionType> listMissionTypeDTOToMissionType(List<MissionTypeDTO> missionTypeDTOs) throws Exception {
		try {
			List<MissionType> missionTypes = new ArrayList<MissionType>();
			
			for (MissionTypeDTO missionTypeDTO : missionTypeDTOs) {
				MissionType missionType = missionTypeDTOToMissionType(missionTypeDTO);
				missionTypes.add(missionType);
			}
			
			return missionTypes;
		} catch (Exception e) {
			throw e;
		}
	}

}
