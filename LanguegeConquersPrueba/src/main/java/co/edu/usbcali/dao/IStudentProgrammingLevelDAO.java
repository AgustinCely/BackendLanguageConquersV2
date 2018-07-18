package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.StudentProgrammingLevel;

public interface IStudentProgrammingLevelDAO {

	public void crearStudentProgrammingLevel(StudentProgrammingLevel entity);
	public void modificarStudentProgrammingLevel(StudentProgrammingLevel entity);
	public void eliminarStudentProgrammingLevel(StudentProgrammingLevel entity);
	public StudentProgrammingLevel consultarPorIdStudentProgrammingLevel(Integer id);
	public List<StudentProgrammingLevel> consultarTodosLosStudentProgrammingLevel();
	
}
