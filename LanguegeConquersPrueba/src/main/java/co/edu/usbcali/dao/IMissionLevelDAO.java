package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.MissionLevel;

public interface IMissionLevelDAO {

	public void crearMissionLevel(MissionLevel entity);
	public void modificarMissionLevel(MissionLevel entity);
	public void eliminarMissionLevel(MissionLevel entity);
	public MissionLevel consultarPorIdMissionLevel(Integer id);
	public List<MissionLevel> consultarTodosLosMissionLevel();
}
