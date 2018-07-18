package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.TeacherDTO;
import co.edu.usbcali.modelo.Teacher;


@Component
@Scope("singleton")
public class teacherMapper implements ITeacherMapper{

	@Transactional(readOnly = true)
	public TeacherDTO teacherToteacherDTO(Teacher entity) throws Exception {
		try {
			TeacherDTO teacherDTO = new TeacherDTO();
			
			teacherDTO.setIdTeacher(entity.getIdTeacher());
			teacherDTO.setNameUser(entity.getNameUser());
			teacherDTO.setLastnameUser(entity.getLastnameUser());
			teacherDTO.setUsername(entity.getUsername());
			teacherDTO.setPasswordUser(entity.getPasswordUser());
			teacherDTO.setImageUser(entity.getImageUser());
			teacherDTO.setEmailUser(entity.getEmailUser());
			teacherDTO.setGenderUser(entity.getGenderUser());
			teacherDTO.setBirthdateUser(entity.getBirthdateUser());
			
			return teacherDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	@Transactional(readOnly = true)
	public Teacher teacherDTOtoTeacher(TeacherDTO entityDTO) throws Exception {
		try {
			Teacher teacher = new Teacher();
			
			teacher.setIdTeacher(entityDTO.getIdTeacher());
			teacher.setNameUser(entityDTO.getNameUser());
			teacher.setLastnameUser(entityDTO.getLastnameUser());
			teacher.setUsername(entityDTO.getUsername());
			teacher.setPasswordUser(entityDTO.getPasswordUser());
			teacher.setImageUser(entityDTO.getImageUser());
			teacher.setEmailUser(entityDTO.getEmailUser());
			teacher.setGenderUser(entityDTO.getGenderUser());
			teacher.setBirthdateUser(entityDTO.getBirthdateUser());
			
			return teacher;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public List<TeacherDTO> listTeacherToListTeacherDTO(List<Teacher> teachers) throws Exception {
		try {
			List<TeacherDTO> teacherDTOs = new ArrayList<TeacherDTO>();
			
			for (Teacher teacher : teachers) {
				TeacherDTO teachersDTO = teacherToteacherDTO(teacher);
				
				teacherDTOs.add(teachersDTO);
			}
			
			return teacherDTOs;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public List<Teacher> listTeacherDTOToListTeacher(List<TeacherDTO> teacherDTOs) throws Exception {
		try {
			
			List<Teacher> listTeacher = new ArrayList<Teacher>();
			
			for (TeacherDTO teacherDTO : teacherDTOs) {
				Teacher teacher = teacherDTOtoTeacher(teacherDTO);
				
				listTeacher.add(teacher);
			}
			
			return listTeacher;
		} catch (Exception e) {
			throw e;
		}
		

	}


}
