package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.Student;

public interface IStudentDAO {

	public void crearStudent(Student entity);
	public void modificarStudent(Student entity);
	public void borrarStudent(Student entity);
	public Student consultarPorIdStudent(Integer id);
	public List<Student> consultarTodosLosStudent();
}
