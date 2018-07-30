package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.dto.MissionDTO;
import co.edu.usbcali.logica.IMissionLogica;
import co.edu.usbcali.mapper.IMissionMapper;
import co.edu.usbcali.modelo.Mission;

@RestController
@RequestMapping("/missionRest")
@CrossOrigin(origins="*")
public class MissionController {

	@Autowired
	private IMissionLogica missionLogica;
	
	@Autowired
	private IMissionMapper missionMapper;
	
	@RequestMapping(value="/consultarPorIdMission/{id}",method=RequestMethod.GET)
	public MissionDTO conusltarPorIdMission(@PathVariable("id") Integer id) throws Exception{
		Mission mission = missionLogica.consultarPorIdMission(id);
		MissionDTO missionDTO = missionMapper.missionToMissionDTO(mission);
		return missionDTO;
	}
	
	@RequestMapping(value="/consultarTodosMission",method=RequestMethod.GET)
	public List<MissionDTO> consultarTodosMission() throws Exception{
		List<Mission> listamission = missionLogica.consultarTodosLosMission();
		List<MissionDTO> listaMissionDTO = missionMapper.listMissionToMissionDTO(listamission);
		return listaMissionDTO;
	}
	
	@RequestMapping(value="/crearMission",method=RequestMethod.POST)
	public void crearMission(@RequestBody MissionDTO missionDTO) throws Exception{
		Mission mission = missionMapper.missionDTOToMission(missionDTO);
		missionLogica.crearMission(mission);
	}
	
	@RequestMapping(value="/modificarMission",method=RequestMethod.PUT)
	public void modificarMission(@RequestBody MissionDTO missionDTO) throws Exception {
		Mission mission = missionMapper.missionDTOToMission(missionDTO);
		missionLogica.modificarMission(mission);
	}
	
	@RequestMapping(value="/eliminarMission/{id}",method=RequestMethod.DELETE)
	public void eliminarMission(@PathVariable("id") Integer id) throws Exception{
		Mission mission = missionLogica.consultarPorIdMission(id);
		missionLogica.eliminarMission(mission);
	}
}
