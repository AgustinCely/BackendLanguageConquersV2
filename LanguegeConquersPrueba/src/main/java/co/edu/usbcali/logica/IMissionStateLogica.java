package co.edu.usbcali.logica;

import java.util.List;

import co.edu.usbcali.modelo.MissionState;

public interface IMissionStateLogica {

	public void crearMissionState(MissionState entity) throws Exception;
	public void modificarMissionState(MissionState entity) throws Exception;
	public void eliminarMissionState(MissionState entity) throws Exception;
	public MissionState consultarPorIdMissionState(Integer id) throws Exception;
	public List<MissionState> consultarTodosLosMissionState() throws Exception ;
	
}
