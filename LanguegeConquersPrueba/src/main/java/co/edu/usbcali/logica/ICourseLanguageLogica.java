package co.edu.usbcali.logica;

import java.util.List;

import co.edu.usbcali.modelo.CourseLanguage;

public interface ICourseLanguageLogica {

	public void crearCourseLanguage(CourseLanguage entity) throws Exception;
	public void modificarCourseLanguage(CourseLanguage entity) throws Exception;
	public void eliminarCourseLanguage(CourseLanguage entity) throws Exception;
	public CourseLanguage consultarPorIdCourseLanguage(Integer id) throws Exception;
	public List<CourseLanguage> consultarTodoLosCourseLanguage() throws Exception;
	
}
