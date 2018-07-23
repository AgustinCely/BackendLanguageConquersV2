package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.LanguageDTO;
import co.edu.usbcali.modelo.Language;

public class LanguageMapper implements ILanguageMapper{

	@Transactional(readOnly=true)
	public LanguageDTO languageToLanguageDTO(Language language) throws Exception {
		try {
			LanguageDTO languageDTO = new LanguageDTO();
			
			languageDTO.setIdLanguage(language.getIdLanguage());
			languageDTO.setNameLanguage(language.getNameLanguage());
			
			return languageDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly=true)
	public Language languageDTOToLanguage(LanguageDTO languageDTO) throws Exception {
		try {
			Language language = new Language();
			
			language.setIdLanguage(languageDTO.getIdLanguage());
			language.setNameLanguage(languageDTO.getNameLanguage());
			
			return language;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public List<LanguageDTO> listLanguageToLanguageDTO(List<Language> languages) throws Exception {
		try {
			List<LanguageDTO> languageDTOs = new ArrayList<LanguageDTO>();
			
			for (Language language : languages) {
				LanguageDTO languageDTO = languageToLanguageDTO(language);
				
				languageDTOs.add(languageDTO);
			}
			
			return languageDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Language> listLanguageDTOToLanguage(List<LanguageDTO> languageDTOs) throws Exception {
		try {
			List<Language> languages = new ArrayList<Language>();
			
			for (LanguageDTO languageDTO : languageDTOs) {
				Language language = languageDTOToLanguage(languageDTO);
				
				languages.add(language);
			}
			
			return languages;
		} catch (Exception e) {
			throw e;
		}
	}

}
