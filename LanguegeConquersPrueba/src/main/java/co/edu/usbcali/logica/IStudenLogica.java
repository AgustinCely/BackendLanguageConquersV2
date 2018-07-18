package co.edu.usbcali.logica;

import java.util.List;

import co.edu.usbcali.modelo.Student;

public interface IStudenLogica {
	
	public void crearStudent(Student entity) throws Exception;
	public void modificarStudent(Student entity) throws Exception;
	public void eliminarStudent(Student entity) throws Exception;
	public Student consultarPorIdStudent(Integer id) throws Exception;
	public List<Student> consultarTodosLosStudent() throws Exception;

}
