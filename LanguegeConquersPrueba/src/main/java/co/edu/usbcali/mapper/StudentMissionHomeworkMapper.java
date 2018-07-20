package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.StudentMissionHomeworkDTO;
import co.edu.usbcali.modelo.StudentMissionHomework;

public class StudentMissionHomeworkMapper implements IStudentMissionHomeworkMapper {

	@Transactional(readOnly = true)
	public StudentMissionHomeworkDTO studentMissionHomeworkToStudentMissionHomeworkDTO(
			StudentMissionHomework studentMissionHomework) throws Exception {
		try {
			StudentMissionHomeworkDTO studentMissionHomeworkDTO = new StudentMissionHomeworkDTO();
			
			studentMissionHomeworkDTO.setIdStudentMissionHomework(studentMissionHomework.getIdStudentMissionHomework());
			studentMissionHomeworkDTO.setMission(studentMissionHomework.getMission());
			studentMissionHomeworkDTO.setStudent(studentMissionHomework.getStudent());
			studentMissionHomeworkDTO.setUrlHomework(studentMissionHomework.getHomeworkName());
			studentMissionHomeworkDTO.setHomeworkName(studentMissionHomework.getHomeworkName());
			
			return studentMissionHomeworkDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public StudentMissionHomework studentMissionHomeworkDTOToStudentMissionHomework(
			StudentMissionHomeworkDTO studentMissionHomeworkDTO) throws Exception {
		try {
			StudentMissionHomework studentMissionHomework = new StudentMissionHomework();
			
			studentMissionHomework.setIdStudentMissionHomework(studentMissionHomeworkDTO.getIdStudentMissionHomework());
			studentMissionHomework.setMission(studentMissionHomeworkDTO.getMission());
			studentMissionHomework.setStudent(studentMissionHomeworkDTO.getStudent());
			studentMissionHomework.setUrlHomework(studentMissionHomeworkDTO.getUrlHomework());
			studentMissionHomework.setHomeworkName(studentMissionHomeworkDTO.getHomeworkName());
			
			return studentMissionHomework;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<StudentMissionHomeworkDTO> listStudentMissionHomeworkToStudentMissionHomeworkDTO(
			List<StudentMissionHomework> studentMissionHomeworks) throws Exception {
		try {
			List<StudentMissionHomeworkDTO> studentMissionHomeworkDTOs = new ArrayList<StudentMissionHomeworkDTO>();
			
			for (StudentMissionHomework studentMissionHomework : studentMissionHomeworks) {
				StudentMissionHomeworkDTO studentMissionHomeworkDTO = studentMissionHomeworkToStudentMissionHomeworkDTO(studentMissionHomework);
				studentMissionHomeworkDTOs.add(studentMissionHomeworkDTO);
			}
			
			return studentMissionHomeworkDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<StudentMissionHomework> listStudentMissionHomeworkDTOToStudentMissionHomework(
			List<StudentMissionHomeworkDTO> studentMissionHomeworkDTOs) throws Exception {
		try {
			List<StudentMissionHomework> studentMissionHomeworks = new ArrayList<StudentMissionHomework>();
			
			for (StudentMissionHomeworkDTO studentMissionHomeworkDTO : studentMissionHomeworkDTOs) {
				StudentMissionHomework studentMissionHomework = studentMissionHomeworkDTOToStudentMissionHomework(studentMissionHomeworkDTO);
				studentMissionHomeworks.add(studentMissionHomework);
			}
			
			return studentMissionHomeworks;
		} catch (Exception e) {
			throw e;
		}
	}

}
