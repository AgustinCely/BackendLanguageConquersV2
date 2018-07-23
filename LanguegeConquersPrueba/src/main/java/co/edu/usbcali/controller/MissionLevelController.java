package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.usbcali.dto.MissionLevelDTO;
import co.edu.usbcali.logica.IMissionLevelLogica;
import co.edu.usbcali.mapper.IMissionLevelMapper;
import co.edu.usbcali.modelo.MissionLevel;

public class MissionLevelController {

	
	@Autowired
	private IMissionLevelLogica missionLevelLogica;
	
	@Autowired
	private IMissionLevelMapper missionLevelMapper;
	
	@RequestMapping(value="/consultarPorIdMissionLevel/{id}",method=RequestMethod.GET)
	public MissionLevelDTO consultarPorIdMissionLevel(@PathVariable("id") Integer id) throws Exception{
		MissionLevel missionLevel = missionLevelLogica.consultarPorIdMissionLevel(id);
		MissionLevelDTO missionLevelDTO = missionLevelMapper.missionLevelToMissionLevelDTO(missionLevel);
		return missionLevelDTO;
	}
	
	@RequestMapping(value="/consultarTodosMissionLevel",method=RequestMethod.GET)
	public List<MissionLevelDTO> consultarTodosMissionLevel() throws Exception{
		List<MissionLevel> listaMissionLevel = missionLevelLogica.consultarTodosPorIdMissionLevel();
		List<MissionLevelDTO> listaMissionLevelDTO = missionLevelMapper.listMissionLevelToMissionLevelDTO(listaMissionLevel);
		return listaMissionLevelDTO;
	}
	
	@RequestMapping(value="/crearMissionLevel",method=RequestMethod.POST)
	public void crearMissionLevel(@RequestBody MissionLevelDTO missionLevelDTO) throws Exception{
		MissionLevel missionLevel = missionLevelMapper.missionLevelDTOToMissionLevel(missionLevelDTO);
		missionLevelLogica.crearMissionLevel(missionLevel);
	}
	
	@RequestMapping(value="/modificarMissionLevel",method=RequestMethod.PUT)
	public void modificarMissionLevel(@RequestBody MissionLevelDTO missionLevelDTO) throws Exception {
		MissionLevel missionLevel = missionLevelMapper.missionLevelDTOToMissionLevel(missionLevelDTO);
		missionLevelLogica.modificarMissionLevel(missionLevel);
	}
	
	@RequestMapping(value="/eliminarMissionLevel/{id}",method=RequestMethod.DELETE)
	public void eliminarMissionLevel(@PathVariable("id") Integer id) throws Exception{
		MissionLevel missionLevel = missionLevelLogica.consultarPorIdMissionLevel(id);
		missionLevelLogica.eliminarMissionLevel(missionLevel);
	}
}
