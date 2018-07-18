package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.LanguageDTO;
import co.edu.usbcali.modelo.Language;

public interface ILanguageMapper {
	
	public LanguageDTO studentToStudentDTO(Language language) throws Exception;
	public Language studentDTOToStudent(LanguageDTO languageDTO) throws Exception;
	public List<LanguageDTO> listStudentToStudentDTO(List<Language> languages) throws Exception;
	public List<Language> listStudentDTOToStudent(List<LanguageDTO> languageDTOs) throws Exception;
}
