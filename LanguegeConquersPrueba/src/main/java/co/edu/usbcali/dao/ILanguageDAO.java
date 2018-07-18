package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.Language;

public interface ILanguageDAO {
	
	public void crearLanguage(Language entity);
	public void modificarLanguage(Language entity);
	public void eliminarLanguage(Language entity);
	public Language consultarPorIdLanguage(Integer id);
	public List<Language> consultarTodosLosLanguage();

}
