package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.RecompenseStudentDTO;
import co.edu.usbcali.modelo.RecompenseStudent;


@Component
@Scope("singleton")
public class RecompenseStudentMapper implements IRecompenseStudentMapper{

	@Transactional(readOnly = true)
	public RecompenseStudentDTO recompenseToRecompenseDTO(RecompenseStudent recompenseStudent) throws Exception {
		try {
			RecompenseStudentDTO recompenseStudentDTO = new RecompenseStudentDTO();
			
			recompenseStudentDTO.setIdRecompenseStudent(recompenseStudent.getIdRecompenseStudent());
			recompenseStudentDTO.setRecompense(recompenseStudent.getRecompense());
			recompenseStudentDTO.setStudent(recompenseStudent.getStudent());
			
			return recompenseStudentDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public RecompenseStudent recompenseDTOToRecompense(RecompenseStudentDTO recompenseStudentDTO) throws Exception {
		try {
			RecompenseStudent recompenseStudent = new RecompenseStudent();
			
			recompenseStudent.setIdRecompenseStudent(recompenseStudentDTO.getIdRecompenseStudent());
			recompenseStudent.setRecompense(recompenseStudentDTO.getRecompense());
			recompenseStudent.setStudent(recompenseStudentDTO.getStudent());
			
			return recompenseStudent;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<RecompenseStudentDTO> listRecompenseToRecompenseDTO(List<RecompenseStudent> recompenseStudents)
			throws Exception {
		try {
			List<RecompenseStudentDTO> recompenseStudentDTOs = new ArrayList<RecompenseStudentDTO>();
			
			for (RecompenseStudent recompenseStudent : recompenseStudents) {
				RecompenseStudentDTO recompenseStudentDTO = recompenseToRecompenseDTO(recompenseStudent);
				recompenseStudentDTOs.add(recompenseStudentDTO);
			}
			
			return recompenseStudentDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<RecompenseStudent> listRecompenseDTOToRecompense(List<RecompenseStudentDTO> recompenseStudentDTOs)
			throws Exception {
		try {
			List<RecompenseStudent> recompenseStudents = new ArrayList<RecompenseStudent>();
			
			for (RecompenseStudentDTO recompenseStudentDTO : recompenseStudentDTOs) {
				RecompenseStudent recompenseStudent = recompenseDTOToRecompense(recompenseStudentDTO);
				recompenseStudents.add(recompenseStudent);
			}
			
			return recompenseStudents;
		} catch (Exception e) {
			throw e;
		}
	}

}
