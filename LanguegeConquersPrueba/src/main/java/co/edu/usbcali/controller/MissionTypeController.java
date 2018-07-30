package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.dto.MissionTypeDTO;
import co.edu.usbcali.logica.IMissionTypeLogica;
import co.edu.usbcali.mapper.IMissionTypeMapper;
import co.edu.usbcali.modelo.MissionType;

@RestController
@RequestMapping("/missionTypeRest")
@CrossOrigin(origins="*")
public class MissionTypeController {

	@Autowired
	private IMissionTypeLogica missionTypeLogica;
	
	@Autowired
	private IMissionTypeMapper missionTypeMapper;
	
	@RequestMapping(value="/consultarPorIdMissionType/{id}",method=RequestMethod.GET)
	public MissionTypeDTO consultarPorIdMissionType(@PathVariable("id") Integer id) throws Exception{
		MissionType missionType = missionTypeLogica.consultarPorIdMissionType(id);
		MissionTypeDTO missionTypeDTO = missionTypeMapper.missionTypeToMissionTypeDTO(missionType);
		return missionTypeDTO;
	}
	
	@RequestMapping(value="/consultarTodosMissionType",method=RequestMethod.GET)
	public List<MissionTypeDTO> consultarTodosLosMissionType() throws Exception{
		List<MissionType> listaMissionType = missionTypeLogica.consutarTodosLosMissionType();
		List<MissionTypeDTO> listaMissionTypeDTO = missionTypeMapper.listMissionTypeToMissionTypeDTO(listaMissionType);
		return listaMissionTypeDTO;
	}
	
	@RequestMapping(value="/crearMissionType",method=RequestMethod.POST)
	public void crearMissionType(@RequestBody MissionTypeDTO missionTypeDTO) throws Exception{
		MissionType missionType = missionTypeMapper.missionTypeDTOToMissionType(missionTypeDTO);
		missionTypeLogica.crearMissionType(missionType);
	}
	
	@RequestMapping(value="/modificarMissionType",method=RequestMethod.PUT)
	public void modificarMissionType(@RequestBody MissionTypeDTO missionTypeDTO) throws Exception {
		MissionType missionType = missionTypeMapper.missionTypeDTOToMissionType(missionTypeDTO);
		missionTypeLogica.modificarMissionType(missionType);;
	}
	
	@RequestMapping(value="/eliminarMissionType/{id}",method=RequestMethod.DELETE)
	public void eliminarMissionType(@PathVariable("id") Integer id) throws Exception{
		MissionType missionType = missionTypeLogica.consultarPorIdMissionType(id);
		missionTypeLogica.eliminarMissionType(missionType);
	}
}
