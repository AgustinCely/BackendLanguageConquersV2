package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.ProgrammingLevel;

public interface IProgrammingLevelDAO {
	
	public void crearProgrammingLevel(ProgrammingLevel entity);
	public void modificarProgrammingLevel(ProgrammingLevel entity);
	public void eliminarProgrammingLevel(ProgrammingLevel entity);
	public ProgrammingLevel consultarPorIdProgrammingLevel(Integer id);
	public List<ProgrammingLevel> consultarTodosLosProgrammingLevel();
}
