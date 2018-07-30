package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.dto.MissionStateDTO;
import co.edu.usbcali.logica.IMissionStateLogica;
import co.edu.usbcali.mapper.IMissionStateMapper;
import co.edu.usbcali.modelo.MissionState;

@RestController
@RequestMapping("/missionStateRest")
@CrossOrigin(origins="*")
public class MissionStateController {

	@Autowired
	private IMissionStateLogica missionStateLogica;
	@Autowired
	private IMissionStateMapper missionStateMapper;
	
	@RequestMapping(value="/consultarPorIdMissionState/{id}",method=RequestMethod.GET)
	public MissionStateDTO consultarPorIdMissionState(@PathVariable("id") Integer id) throws Exception{
		MissionState missionState = missionStateLogica.consultarPorIdMissionState(id);
		MissionStateDTO missionStateDTO = missionStateMapper.missionStateToMissionStateDTO(missionState);
		return missionStateDTO;
	}
	
	@RequestMapping(value="/consultarTodosMissionState",method=RequestMethod.GET)
	public List<MissionStateDTO> consultarTodosLosMissionState() throws Exception{
		List<MissionState> listaMissionState = missionStateLogica.consultarTodosLosMissionState();
		List<MissionStateDTO> listaMissionStateDTO = missionStateMapper.listMissionStateToMissionStateDTO(listaMissionState);
		return listaMissionStateDTO;
	}
	
	@RequestMapping(value="/crearMissionState",method=RequestMethod.POST)
	public void crearMissionState(@RequestBody MissionStateDTO missionStateDTO) throws Exception{
		MissionState missionState = missionStateMapper.missionStateDTOToMissionState(missionStateDTO);
		missionStateLogica.crearMissionState(missionState);
	}
	
	@RequestMapping(value="/modificarMissionState",method=RequestMethod.PUT)
	public void modificarMissionState(@RequestBody MissionStateDTO missionStateDTO) throws Exception {
		MissionState teacher = missionStateMapper.missionStateDTOToMissionState(missionStateDTO);
		missionStateLogica.modificarMissionState(teacher);
	}
	
	@RequestMapping(value="/eliminarMissionState/{id}",method=RequestMethod.DELETE)
	public void eliminarMissionState(@PathVariable("id") Integer id) throws Exception{
		MissionState teacher = missionStateLogica.consultarPorIdMissionState(id);
		missionStateLogica.eliminarMissionState(teacher);
	}
}
