package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.StudentLanguage;

public interface IStudentLanguageDAO {

	public void crearStudentLanguage(StudentLanguage entity);
	public void modificarStudentLanguage(StudentLanguage entity);
	public void eliminarStudentLanguage(StudentLanguage entity);
	public StudentLanguage consultarPorIdStudentLanguage(Integer id);
	public List<StudentLanguage> consultarTodosLosStudentLanguage();
	
}
