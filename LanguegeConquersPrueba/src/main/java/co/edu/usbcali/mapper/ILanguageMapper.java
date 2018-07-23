package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.LanguageDTO;
import co.edu.usbcali.modelo.Language;

public interface ILanguageMapper {
	
	public LanguageDTO languageToLanguageDTO(Language language) throws Exception;
	public Language languageDTOToLanguage(LanguageDTO languageDTO) throws Exception;
	public List<LanguageDTO> listLanguageToLanguageDTO(List<Language> languages) throws Exception;
	public List<Language> listLanguageDTOToLanguage(List<LanguageDTO> languageDTOs) throws Exception;
}
