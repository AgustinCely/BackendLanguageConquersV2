package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.StudentDTO;
import co.edu.usbcali.modelo.Student;

public interface IStudentMapper {
	
	public StudentDTO studentToStudentDTO(Student student) throws Exception;
	public Student studentDTOToStudent(StudentDTO studentDTO) throws Exception;
	public List<StudentDTO> listStudentToStudenDTO(List<Student> students) throws Exception;
	public List<Student> listStudentDTOToStudent(List<StudentDTO> studentsDTOs) throws Exception;

}
