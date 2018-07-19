package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.MissionStudentDTO;
import co.edu.usbcali.modelo.MissionStudent;

public interface IMissionStudentMapper {

	public MissionStudentDTO missionStudentToMissionStudentDTO(MissionStudent missionStudent) throws Exception;
	public MissionStudent missionStudentDTOToMissionStudent(MissionStudentDTO missionStudentDTO) throws Exception;
	public List<MissionStudentDTO> listMissionStudentToMissionStudentDTO(List<MissionStudent> missionStudents) throws Exception;
	public List<MissionStudent> listMissionStudentDTOToMissionStudent(List<MissionStudentDTO> missionStudentDTOs) throws Exception;
}
