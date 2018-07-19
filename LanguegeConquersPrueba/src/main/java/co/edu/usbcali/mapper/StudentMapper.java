package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.StudentDTO;
import co.edu.usbcali.modelo.Student;

public class StudentMapper implements IStudentMapper{

	@Transactional(readOnly = true)
	public StudentDTO studentToStudentDTO(Student student) throws Exception {
		try {
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setIdStudent(student.getIdStudent());
			studentDTO.setNameStudent(student.getNameStudent());
			studentDTO.setLastnameStudent(student.getLastnameStudent());
			studentDTO.setGenderStudent(student.getGenderStudent());
			studentDTO.setPasswordStudent(student.getPasswordStudent());
			studentDTO.setScoreStudent(student.getScoreStudent());
			studentDTO.setSemestreStudent(student.getSemestreStudent());
			studentDTO.setAvatar(student.getAvatar());
			studentDTO.setCourse(student.getCourse());
			studentDTO.setNicknameStudent(student.getNicknameStudent());
			studentDTO.setEmailStudent(student.getEmailStudent());
			studentDTO.setBirthdateStudent(student.getBirthdateStudent());
			
			return studentDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public Student studentDTOToStudent(StudentDTO studentDTO) throws Exception {
		try {
			Student student = new Student();
			
			student.setIdStudent(studentDTO.getIdStudent());
			student.setNameStudent(studentDTO.getNameStudent());
			student.setLastnameStudent(studentDTO.getLastnameStudent());
			student.setGenderStudent(studentDTO.getGenderStudent());
			student.setPasswordStudent(studentDTO.getPasswordStudent());
			student.setScoreStudent(studentDTO.getScoreStudent());
			student.setSemestreStudent(studentDTO.getSemestreStudent());
			student.setAvatar(studentDTO.getAvatar());
			student.setCourse(studentDTO.getCourse());
			student.setNicknameStudent(studentDTO.getNicknameStudent());
			student.setEmailStudent(studentDTO.getEmailStudent());
			student.setBirthdateStudent(studentDTO.getBirthdateStudent());
			
			return student;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public List<StudentDTO> listStudentToStudenDTO(List<Student> students) throws Exception {
		try {
			List<StudentDTO> studentDTOs = new ArrayList<StudentDTO>();
			
			for (Student student : students) {
				StudentDTO studentDTO = studentToStudentDTO(student);
				
				studentDTOs.add(studentDTO);
			}
			return studentDTOs;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public List<Student> listStudentDTOToStudent(List<StudentDTO> studentsDTOs) throws Exception {
		try {
			List<Student> listStudent = new ArrayList<Student>();
			
			for (StudentDTO studentDTO : studentsDTOs) {
				Student student = studentDTOToStudent(studentDTO);
				
				listStudent.add(student);
			}
			return listStudent;
		} catch (Exception e) {
			throw e;
		}
		
	}

	
	
}
