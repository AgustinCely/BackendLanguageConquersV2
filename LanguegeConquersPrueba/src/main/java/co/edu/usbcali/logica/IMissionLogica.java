package co.edu.usbcali.logica;

import java.util.List;

import co.edu.usbcali.modelo.Mission;

public interface IMissionLogica {
	
	public void crearMission(Mission entity) throws Exception;
	public void modificarMission(Mission entity) throws Exception;
	public void eliminarMission (Mission entity) throws Exception;
	public Mission consultarPorIdMission(Integer id) throws Exception;
	public List<Mission> consultarTodosLosMission() throws Exception;
}
