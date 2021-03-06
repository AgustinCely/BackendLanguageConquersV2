package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.RecompenseStudent;

public interface IRecompenseStudentDAO {

	public void crearRecompenseStudent(RecompenseStudent entity);
	public void modificarRecompenseStudent(RecompenseStudent entity);
	public void eliminarRecompenseStudent(RecompenseStudent entity);
	public RecompenseStudent consultarPorIdRecompenseStudent(Integer id);
	public List<RecompenseStudent> consultarTodosLosRecompenseStudent();
}
