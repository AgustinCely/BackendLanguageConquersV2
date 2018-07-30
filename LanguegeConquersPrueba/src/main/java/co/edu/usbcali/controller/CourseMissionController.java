package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.dto.CourseMissionDTO;
import co.edu.usbcali.logica.ICourseMissionLogica;
import co.edu.usbcali.mapper.ICourseMissionMapper;
import co.edu.usbcali.modelo.CourseMission;

@RestController
@RequestMapping("/courseMissionRest")
@CrossOrigin(origins="*")
public class CourseMissionController {

	@Autowired
	private ICourseMissionLogica courseMissionLogica;
	
	@Autowired
	private ICourseMissionMapper courseMissionMapper;
	
	@RequestMapping(value="/consultarPorIdCourseMission/{id}",method=RequestMethod.GET)
	public CourseMissionDTO consultarPorIdCourseMission(@PathVariable("id") Integer id) throws Exception{
		CourseMission courseMission = courseMissionLogica.consultarPorIdCourseMission(id);
		CourseMissionDTO courseMissionDTO = courseMissionMapper.courseMissionToCourseMissionDTO(courseMission);
		return courseMissionDTO;
	}
	
	@RequestMapping(value="/consultarTodosCourseMission",method=RequestMethod.GET)
	public List<CourseMissionDTO> consultarTodosCourseMission() throws Exception{
		List<CourseMission> listaCourseMission = courseMissionLogica.consultarTodosLosCourseMission();
		List<CourseMissionDTO> listaCourseMissionDTO = courseMissionMapper.listCourseMissionToCourseMissionDTO(listaCourseMission);
		return listaCourseMissionDTO;
	}
	
	@RequestMapping(value="/crearCourseMission",method=RequestMethod.POST)
	public void crearCourseMission(@RequestBody CourseMissionDTO courseMissionDTO) throws Exception{
		CourseMission courseMission = courseMissionMapper.courseMissionDTOToCourseMission(courseMissionDTO);
		courseMissionLogica.crearCourseMission(courseMission);
	}
	
	@RequestMapping(value="/modificarCourseMission",method=RequestMethod.PUT)
	public void modificarCourseMission(@RequestBody CourseMissionDTO courseMissionDTO) throws Exception{
		CourseMission courseMission = courseMissionMapper.courseMissionDTOToCourseMission(courseMissionDTO);
		courseMissionLogica.modificarCourseMission(courseMission);
	}
	
	@RequestMapping(value="/eliminarCourseMission/{id}",method=RequestMethod.DELETE)
	public void eliminarCourseMission(@PathVariable("id") Integer id) throws Exception{
		CourseMission courseMission = courseMissionLogica.consultarPorIdCourseMission(id);
		courseMissionLogica.eliminarCourseMission(courseMission);
	}
}
