package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.RolStudentDTO;
import co.edu.usbcali.modelo.RolStudent;

public interface IRolStudentMapper {

	public RolStudentDTO rolStudentToRolStudentDTO(RolStudent rolStudent) throws Exception;
	public RolStudent rolStudentDTOToRolStudent(RolStudentDTO rolStudentDTO) throws Exception;
	public List<RolStudentDTO> listRolStudentToRolStudentDTO(List<RolStudent> rolStudents) throws Exception;
	public List<RolStudent> listRolStudentDTOToRolStudent(List<RolStudentDTO> rolStudentDTOs) throws Exception;
}
