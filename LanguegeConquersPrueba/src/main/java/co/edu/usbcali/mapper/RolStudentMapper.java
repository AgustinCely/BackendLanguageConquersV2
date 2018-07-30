package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.RolStudentDTO;
import co.edu.usbcali.modelo.RolStudent;


@Component
@Scope("singleton")
public class RolStudentMapper implements IRolStudentMapper {

	@Transactional(readOnly = true)
	public RolStudentDTO rolStudentToRolStudentDTO(RolStudent rolStudent) throws Exception {
		try {
			RolStudentDTO rolStudentDTO = new RolStudentDTO();
			
			rolStudentDTO.setIdRolStudent(rolStudent.getIdRolStudent());
			rolStudentDTO.setRol(rolStudent.getRol());
			rolStudentDTO.setStudent(rolStudent.getStudent());
			
			return rolStudentDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public RolStudent rolStudentDTOToRolStudent(RolStudentDTO rolStudentDTO) throws Exception {
		try {
			RolStudent rolStudent = new RolStudent();
			
			rolStudent.setIdRolStudent(rolStudentDTO.getIdRolStudent());
			rolStudent.setRol(rolStudentDTO.getRol());
			rolStudent.setStudent(rolStudentDTO.getStudent());
			
			return rolStudent;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<RolStudentDTO> listRolStudentToRolStudentDTO(List<RolStudent> rolStudents) throws Exception {
		try {
			List<RolStudentDTO> rolStudentDTOs = new ArrayList<RolStudentDTO>();
			
			for (RolStudent rolStudent : rolStudents) {
				RolStudentDTO rolStudentDTO = rolStudentToRolStudentDTO(rolStudent);
				rolStudentDTOs.add(rolStudentDTO);
			}
			
			return rolStudentDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<RolStudent> listRolStudentDTOToRolStudent(List<RolStudentDTO> rolStudentDTOs) throws Exception {
		try {
			List<RolStudent> rolStudents = new ArrayList<RolStudent>();
			
			for (RolStudentDTO rolStudentDTO : rolStudentDTOs) {
				RolStudent rolStudent = rolStudentDTOToRolStudent(rolStudentDTO);
				rolStudents.add(rolStudent);
			}
			
			return rolStudents;
		} catch (Exception e) {
			throw e;
		}
	}

}
