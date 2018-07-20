package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.StudentLanguageDTO;
import co.edu.usbcali.modelo.StudentLanguage;

public interface IStudentLanguageMapper {

	public StudentLanguageDTO studentLanguageToStudentLanguageDTO(StudentLanguage studentLanguage) throws Exception;
	public StudentLanguage studentLanguageDTOToStudentLanguage(StudentLanguageDTO studentLanguageDTO) throws Exception;
	public List<StudentLanguageDTO> listStudentLanguageToStudentLanguageDTO(List<StudentLanguage> studentLanguages) throws Exception;
	public List<StudentLanguage> listStudentLanguageDTOToStudentLanguage(List<StudentLanguageDTO> studentLanguageDTOs) throws Exception;
}
