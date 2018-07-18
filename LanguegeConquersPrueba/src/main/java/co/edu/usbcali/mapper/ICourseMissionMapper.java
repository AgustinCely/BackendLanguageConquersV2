package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.CourseMissionDTO;
import co.edu.usbcali.modelo.CourseMission;

public interface ICourseMissionMapper {

	public CourseMissionDTO courseMissionToCourseMissionDTO(CourseMission courseMission) throws Exception;
	public CourseMission courseMissionDTOToCourseMission(CourseMissionDTO courseMissionDTO) throws Exception;
	public List<CourseMissionDTO> listCourseMissionToCourseMissionDTO(List<CourseMission> courseMissions) throws Exception;
	public List<CourseMission> listCourseMissionDTOToCourseMission(List<CourseMissionDTO> courseMissionDTOs) throws Exception;
	
}
