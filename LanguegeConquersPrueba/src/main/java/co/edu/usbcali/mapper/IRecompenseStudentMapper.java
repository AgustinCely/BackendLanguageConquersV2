package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.RecompenseStudentDTO;
import co.edu.usbcali.modelo.RecompenseStudent;

public interface IRecompenseStudentMapper {

	public RecompenseStudentDTO recompenseToRecompenseDTO(RecompenseStudent recompenseStudent) throws Exception;
	public RecompenseStudent recompenseDTOToRecompense(RecompenseStudentDTO recompenseStudentDTO) throws Exception;
	public List<RecompenseStudentDTO> listRecompenseToRecompenseDTO(List<RecompenseStudent> recompenseStudents) throws Exception;
	public List<RecompenseStudent> listRecompenseDTOToRecompense(List<RecompenseStudentDTO> recompenseStudentDTOs) throws Exception;
}
