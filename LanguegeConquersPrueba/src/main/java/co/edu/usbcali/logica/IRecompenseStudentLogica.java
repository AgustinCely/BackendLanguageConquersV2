package co.edu.usbcali.logica;

import java.util.List;

import co.edu.usbcali.modelo.RecompenseStudent;

public interface IRecompenseStudentLogica {

	public void crearRecompenseStudent(RecompenseStudent entity) throws Exception;
	public void modificarRecompenseStudent(RecompenseStudent entity) throws Exception;
	public void eliminarRecompenseStudent(RecompenseStudent entity) throws Exception;
	public RecompenseStudent consultarPorIdRecompenseStudent(Integer id) throws Exception;
	public List<RecompenseStudent> consultarTodosLosRecompenseStudent() throws Exception;
	
}
