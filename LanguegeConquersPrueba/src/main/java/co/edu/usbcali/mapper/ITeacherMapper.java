package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.TeacherDTO;
import co.edu.usbcali.modelo.Teacher;

public interface ITeacherMapper {

	public TeacherDTO teacherToteacherDTO(Teacher entity) throws Exception; 
	public Teacher teacherDTOtoTeacher(TeacherDTO entityDTO) throws Exception;
	public List<TeacherDTO> listTeacherToListTeacherDTO(List<Teacher> teachers) throws Exception;
	public List<Teacher> listTeacherDTOToListTeacher(List<TeacherDTO> teacherDTOs)throws Exception;
	
}
