package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import co.edu.usbcali.dto.CourseMissionDTO;
import co.edu.usbcali.modelo.CourseMission;

public class CourseMissionMapper implements ICourseMissionMapper {

	@Override
	public CourseMissionDTO courseMissionToCourseMissionDTO(CourseMission courseMission) throws Exception {
		try {
			CourseMissionDTO courseMissionDTO = new CourseMissionDTO();
			
			courseMissionDTO.setIdCourseMission(courseMission.getIdCourseMission());
			courseMissionDTO.setCourse(courseMission.getCourse());
			courseMissionDTO.setMission(courseMission.getMission());
			courseMissionDTO.setDescripcionMission(courseMission.getDescripcionMission());
			
			return courseMissionDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public CourseMission courseMissionDTOToCourseMission(CourseMissionDTO courseMissionDTO) throws Exception {
		try {
			CourseMission courseMission = new CourseMission();
			
			courseMission.setCourse(courseMissionDTO.getCourse());
			courseMission.setMission(courseMissionDTO.getMission());
			courseMission.setDescripcionMission(courseMissionDTO.getDescripcionMission());
			
			return courseMission;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<CourseMissionDTO> listCourseMissionToCourseMissionDTO(List<CourseMission> courseMissions)
			throws Exception {
		try {
			List<CourseMissionDTO> courseMissionDTOs = new ArrayList<CourseMissionDTO>();
			
			for (CourseMission courseMission : courseMissions) {
				CourseMissionDTO courseMissionDTO = courseMissionToCourseMissionDTO(courseMission);
				courseMissionDTOs.add(courseMissionDTO);
			}
			
			return courseMissionDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<CourseMission> listCourseMissionDTOToCourseMission(List<CourseMissionDTO> courseMissionDTOs)
			throws Exception {
		try {
			List<CourseMission> courseMissions = new ArrayList<CourseMission>();
			
			for (CourseMissionDTO courseMissionDTO : courseMissionDTOs) {
				CourseMission courseMission = courseMissionDTOToCourseMission(courseMissionDTO);
				courseMissions.add(courseMission);
			}
			
			return courseMissions;
		} catch (Exception e) {
			throw e;
		}
	}

}
