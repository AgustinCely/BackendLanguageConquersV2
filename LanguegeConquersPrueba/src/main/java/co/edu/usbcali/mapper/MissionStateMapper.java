package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.MissionStateDTO;
import co.edu.usbcali.modelo.MissionState;


@Component
@Scope("singleton")
public class MissionStateMapper implements IMissionStateMapper{

	@Transactional(readOnly = true)
	public MissionStateDTO missionStateToMissionStateDTO(MissionState missionState) throws Exception {
		try {
			MissionStateDTO missionStateDTO = new MissionStateDTO();
			
			missionStateDTO.setIdMissionState(missionState.getIdMissionState());
			missionStateDTO.setNameMissionState(missionState.getNameMissionState());
			
			return missionStateDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public MissionState missionStateDTOToMissionState(MissionStateDTO missionStateDTO) throws Exception {
		try {
			MissionState missionState = new MissionState();
			
			missionState.setIdMissionState(missionStateDTO.getIdMissionState());
			missionState.setNameMissionState(missionStateDTO.getNameMissionState());
			
			return missionState;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<MissionStateDTO> listMissionStateToMissionStateDTO(List<MissionState> missionStates) throws Exception {
		try {
			List<MissionStateDTO> missionStateDTOs = new ArrayList<MissionStateDTO>();
			
			for (MissionState missionState : missionStates) {
				MissionStateDTO missionStateDTO = missionStateToMissionStateDTO(missionState);
				missionStateDTOs.add(missionStateDTO);
			}
			
			return null;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<MissionState> listMissionStateDTOToMissionState(List<MissionStateDTO> missionStateDTOs)
			throws Exception {
		try {
			List<MissionState> missionStates = new ArrayList<MissionState>();
			
			for (MissionStateDTO missionStateDTO : missionStateDTOs) {
				MissionState missionState = missionStateDTOToMissionState(missionStateDTO);
				missionStates.add(missionState);
			}
			
			return missionStates;
		} catch (Exception e) {
			throw e;
		}
	}

}
