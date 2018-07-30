package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.dto.ProgrammingLevelDTO;
import co.edu.usbcali.logica.IProgrammingLevelLogica;
import co.edu.usbcali.mapper.IProgrammingLevelMapper;
import co.edu.usbcali.modelo.ProgrammingLevel;

@RestController
@RequestMapping("/programmingLevelRest")
@CrossOrigin(origins="*")
public class ProgrammingLevelController {

	@Autowired
	private IProgrammingLevelLogica rrogrammingLevelLogica;
	
	@Autowired
	private IProgrammingLevelMapper programmingLevelMapper;

	@RequestMapping(value="/consultarPorId/{id}",method=RequestMethod.GET)
	public ProgrammingLevelDTO consultarPorIdProgrammingLevel(@PathVariable("id") Integer id) throws Exception{
		ProgrammingLevel programmingLevel = rrogrammingLevelLogica.consultarPorIdProgrammingLevel(id);
		ProgrammingLevelDTO programmingLevelDTO = programmingLevelMapper.programmingLevelToProgrammingLevelDTO(programmingLevel);
		return programmingLevelDTO;
	}
	
	@RequestMapping(value="/consultarTodos",method=RequestMethod.GET)
	public List<ProgrammingLevelDTO> consultarTodosLosProgrammingLevel() throws Exception{
		List<ProgrammingLevel> listaProgrammingLevel = rrogrammingLevelLogica.consultarTodosLosProgrammingLevel();
		List<ProgrammingLevelDTO> listaProgrammingLevelDTO = programmingLevelMapper.listProgrammingLevelToProgrammingLevelDTO(listaProgrammingLevel);
		return listaProgrammingLevelDTO;
	}
	
	@RequestMapping(value="/crear",method=RequestMethod.POST)
	public void crearProgrammingLevel(@RequestBody ProgrammingLevelDTO programmingLevelDTO) throws Exception{
		ProgrammingLevel programmingLevel = programmingLevelMapper.programmingLevelDTOToProgrammingLevel(programmingLevelDTO);
		rrogrammingLevelLogica.crearProgrammingLevel(programmingLevel);
	}
	
	@RequestMapping(value="/modificar",method=RequestMethod.PUT)
	public void modificarProgrammingLevel(@RequestBody ProgrammingLevelDTO programmingLevelDTO) throws Exception {
		ProgrammingLevel programmingLevel = programmingLevelMapper.programmingLevelDTOToProgrammingLevel(programmingLevelDTO);
		rrogrammingLevelLogica.modificarProgrammingLevel(programmingLevel);
	}
	
	@RequestMapping(value="/eliminarTeacher/{id}",method=RequestMethod.DELETE)
	public void eliminarProgrammingLevel(@PathVariable("id") Integer id) throws Exception{
		ProgrammingLevel programmingLevel = rrogrammingLevelLogica.consultarPorIdProgrammingLevel(id);
		rrogrammingLevelLogica.eliminarProgrammingLevel(programmingLevel);
	}
	
}
