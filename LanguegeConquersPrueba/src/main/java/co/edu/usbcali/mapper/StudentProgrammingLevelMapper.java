package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.StudentProgrammingLevelDTO;
import co.edu.usbcali.modelo.StudentProgrammingLevel;

public class StudentProgrammingLevelMapper implements IStudentProgrammingLevelMapper{

	@Transactional(readOnly = true)
	public StudentProgrammingLevelDTO studentProgrammingLevelToStudentProgrammingLevelDTO(StudentProgrammingLevel studentProgrammingLevel) throws Exception {
		try {
			StudentProgrammingLevelDTO studentProgrammingLevelDTO = new StudentProgrammingLevelDTO();
			
			studentProgrammingLevelDTO.setIdStudentProgrammingLevel(studentProgrammingLevel.getIdStudentProgrammingLevel());
			studentProgrammingLevelDTO.setProgrammingLevel(studentProgrammingLevel.getProgrammingLevel());
			studentProgrammingLevelDTO.setStudent(studentProgrammingLevel.getStudent());
			
			return studentProgrammingLevelDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public StudentProgrammingLevel studentProgrammingLevelDTOToStudentProgrammingLevel(StudentProgrammingLevelDTO studentProgrammingLevelDTO) throws Exception {
		try {
			StudentProgrammingLevel studentProgrammingLevel = new StudentProgrammingLevel();
			
			studentProgrammingLevel.setIdStudentProgrammingLevel(studentProgrammingLevelDTO.getIdStudentProgrammingLevel());
			studentProgrammingLevel.setProgrammingLevel(studentProgrammingLevelDTO.getProgrammingLevel());
			studentProgrammingLevel.setStudent(studentProgrammingLevelDTO.getStudent());
			
			return studentProgrammingLevel;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<StudentProgrammingLevelDTO> listStudentProgrammingLevelToStudentProgrammingLevelDTO(List<StudentProgrammingLevel> studentProgrammingLevels) throws Exception {
		try {
			List<StudentProgrammingLevelDTO> studentProgrammingLevelDTOs = new ArrayList<StudentProgrammingLevelDTO>();
			
			for (StudentProgrammingLevel studentProgrammingLevel : studentProgrammingLevels) {
				StudentProgrammingLevelDTO studentProgrammingLevelDTO = studentProgrammingLevelToStudentProgrammingLevelDTO(studentProgrammingLevel);
				
				studentProgrammingLevelDTOs.add(studentProgrammingLevelDTO);
			}
			
			return studentProgrammingLevelDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<StudentProgrammingLevel> listStudentProgrammingLevelDTOToStudentProgrammingLevel(List<StudentProgrammingLevelDTO> studentProgrammingLevelDTOs) throws Exception {
		try {
			List<StudentProgrammingLevel> studentProgrammingLevels = new ArrayList<StudentProgrammingLevel>();
			
			for (StudentProgrammingLevelDTO studentProgrammingLevelDTO : studentProgrammingLevelDTOs) {
				StudentProgrammingLevel studentProgrammingLevel = studentProgrammingLevelDTOToStudentProgrammingLevel(studentProgrammingLevelDTO);
				
				studentProgrammingLevels.add(studentProgrammingLevel);
			}
			
			return studentProgrammingLevels;
		} catch (Exception e) {
			throw e;
		}
	}

}
