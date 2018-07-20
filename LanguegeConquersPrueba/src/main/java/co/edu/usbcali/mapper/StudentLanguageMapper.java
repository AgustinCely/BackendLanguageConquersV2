package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.StudentLanguageDTO;
import co.edu.usbcali.modelo.StudentLanguage;

public class StudentLanguageMapper implements IStudentLanguageMapper{

	@Transactional(readOnly = true)
	public StudentLanguageDTO studentLanguageToStudentLanguageDTO(StudentLanguage studentLanguage) throws Exception {
		try {
			StudentLanguageDTO studentLanguageDTO = new StudentLanguageDTO();
			
			studentLanguageDTO.setIdStudentLanguage(studentLanguage.getIdStudentLanguage());
			studentLanguageDTO.setLanguage(studentLanguage.getLanguage());
			studentLanguageDTO.setStudent(studentLanguage.getStudent());
			
			return studentLanguageDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public StudentLanguage studentLanguageDTOToStudentLanguage(StudentLanguageDTO studentLanguageDTO) throws Exception {
		try {
			StudentLanguage studentLanguage = new StudentLanguage();
			
			studentLanguage.setIdStudentLanguage(studentLanguage.getIdStudentLanguage());
			studentLanguage.setLanguage(studentLanguage.getLanguage());
			studentLanguage.setStudent(studentLanguage.getStudent());
			
			return studentLanguage;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<StudentLanguageDTO> listStudentLanguageToStudentLanguageDTO(List<StudentLanguage> studentLanguages)
			throws Exception {
		try {
			List<StudentLanguageDTO> studentLanguageDTOs = new ArrayList<StudentLanguageDTO>();
			
			for (StudentLanguage studentLanguage : studentLanguages) {
				StudentLanguageDTO studentLanguageDTO = studentLanguageToStudentLanguageDTO(studentLanguage);
				
				studentLanguageDTOs.add(studentLanguageDTO);
			}
			
			return studentLanguageDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<StudentLanguage> listStudentLanguageDTOToStudentLanguage(List<StudentLanguageDTO> studentLanguageDTOs)
			throws Exception {
		try {
			List<StudentLanguage> studentLanguages = new ArrayList<StudentLanguage>();
			
			for (StudentLanguageDTO studentLanguageDTO : studentLanguageDTOs) {
				StudentLanguage studentLanguage = studentLanguageDTOToStudentLanguage(studentLanguageDTO);
				
				studentLanguages.add(studentLanguage);
			}
			
			return studentLanguages;
		} catch (Exception e) {
			throw e;
		}
	}

}
