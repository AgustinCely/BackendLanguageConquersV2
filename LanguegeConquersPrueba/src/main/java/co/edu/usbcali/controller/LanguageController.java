package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.dto.LanguageDTO;
import co.edu.usbcali.logica.ILanguageLogica;
import co.edu.usbcali.mapper.ILanguageMapper;
import co.edu.usbcali.modelo.Language;

@RestController
@RequestMapping("/languageRest")
@CrossOrigin(origins="*")
public class LanguageController {

	@Autowired
	private ILanguageLogica languageLogica;
	
	@Autowired
	private ILanguageMapper languageMapper;
	
	@RequestMapping(value="/consultarPorIdLanguage/{id}",method=RequestMethod.GET)
	public LanguageDTO consultarPorIdLanguage(@PathVariable("id") Integer id) throws Exception{
		Language language = languageLogica.consultarPorIdLanguage(id);
		LanguageDTO languageDTO = languageMapper.languageToLanguageDTO(language);
		return languageDTO;
	}
	
	@RequestMapping(value="/consultarTodosLanguage",method=RequestMethod.GET)
	public List<LanguageDTO> consultarTodosLanguage() throws Exception{
		List<Language> listaLanguage = languageLogica.consultarTodosLosLanguage();
		List<LanguageDTO> listaLanguageDTO = languageMapper.listLanguageToLanguageDTO(listaLanguage);
		return listaLanguageDTO;
	}
	
	@RequestMapping(value="/crearCourseMission",method=RequestMethod.POST)
	public void crearLanguage(@RequestBody LanguageDTO languageDTO) throws Exception{
		Language language = languageMapper.languageDTOToLanguage(languageDTO);
		languageLogica.crearLanguage(language);
	}
	
	@RequestMapping(value="/modificarCourseMission",method=RequestMethod.PUT)
	public void modificarLanguage(@RequestBody LanguageDTO languageDTO) throws Exception{
		Language language = languageMapper.languageDTOToLanguage(languageDTO);
		languageLogica.modificarLanguage(language);
	}
	
	@RequestMapping(value="/eliminarCourseMission/{id}",method=RequestMethod.DELETE)
	public void eliminarCourseMission(@PathVariable("id") Integer id) throws Exception{
		Language language = languageLogica.consultarPorIdLanguage(id);
		languageLogica.eliminarLanguage(language);
	}
}
