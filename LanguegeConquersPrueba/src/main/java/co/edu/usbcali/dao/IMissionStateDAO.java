package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.MissionState;

public interface IMissionStateDAO {
	
	public void crearMissionState(MissionState entity);
	public void modificarMissionState(MissionState entity);
	public void eliminarMissionState(MissionState entity);
	public MissionState consultarPorIdMissionState(Integer id);
	public List<MissionState> consultarTodosLosMissionState();

}
