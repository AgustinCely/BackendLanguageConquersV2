package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.MissionStudentDTO;
import co.edu.usbcali.modelo.MissionStudent;


@Component
@Scope("singleton")
public class MissionStudentMapper implements IMissionStudentMapper {

	@Transactional(readOnly = true)
	public MissionStudentDTO missionStudentToMissionStudentDTO(MissionStudent missionStudent) throws Exception {
		
		try {
			MissionStudentDTO missionStudentDTO = new MissionStudentDTO();
			
			missionStudentDTO.setIdMissionStudent(missionStudent.getIdMissionStudent());
			missionStudentDTO.setCourseMission(missionStudent.getCourseMission());
			missionStudentDTO.setIdStudent(missionStudent.getIdStudent());
			missionStudentDTO.setNote(missionStudent.getNote());
			missionStudentDTO.setScoreMission(missionStudent.getScoreMission());
			
			return missionStudentDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public MissionStudent missionStudentDTOToMissionStudent(MissionStudentDTO missionStudentDTO) throws Exception {
		try {
			MissionStudent missionStudent = new MissionStudent();
			
			missionStudent.setIdMissionStudent(missionStudentDTO.getIdMissionStudent());
			missionStudent.setCourseMission(missionStudentDTO.getCourseMission());
			missionStudent.setIdStudent(missionStudentDTO.getIdStudent());
			missionStudent.setNote(missionStudentDTO.getNote());
			missionStudent.setScoreMission(missionStudentDTO.getScoreMission());
			
			return missionStudent;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<MissionStudentDTO> listMissionStudentToMissionStudentDTO(List<MissionStudent> missionStudents)
			throws Exception {
		try {
			List<MissionStudentDTO> missionStudentDTOs = new ArrayList<MissionStudentDTO>();
			
			for (MissionStudent missionStudent : missionStudents) {
				MissionStudentDTO missionStudentDTO = missionStudentToMissionStudentDTO(missionStudent);
				missionStudentDTOs.add(missionStudentDTO);
			}
			
			return missionStudentDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<MissionStudent> listMissionStudentDTOToMissionStudent(List<MissionStudentDTO> missionStudentDTOs)
			throws Exception {
		try {
			List<MissionStudent> missionStudents = new ArrayList<MissionStudent>();
			
			for (MissionStudentDTO missionStudentDTO : missionStudentDTOs) {
				MissionStudent missionStudent = missionStudentDTOToMissionStudent(missionStudentDTO);
				missionStudents.add(missionStudent);
			}
			
			return missionStudents;
		} catch (Exception e) {
			throw e;
		}
	}

}
