package co.edu.usbcali.logica;

import java.util.List;

import co.edu.usbcali.modelo.Language;

public interface ILanguageLogica {
	
	public void crearLanguage (Language entity) throws Exception;
	public void modificarLanguage (Language entity) throws Exception;
	public void eliminarLanguage (Language entity) throws Exception;
	public Language consultarPorIdLanguage(Integer id) throws Exception;
	public List<Language> consultarTodosLosLanguage() throws Exception;

}
