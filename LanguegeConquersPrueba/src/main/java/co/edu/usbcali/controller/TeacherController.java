package co.edu.usbcali.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.dto.TeacherDTO;
import co.edu.usbcali.logica.ITeacherLogica;
import co.edu.usbcali.mapper.ITeacherMapper;
import co.edu.usbcali.modelo.Teacher;

@RestController
@RequestMapping("/teacherRest")
@CrossOrigin(origins="*")
public class TeacherController {
	private static final Logger log = LoggerFactory.getLogger(TeacherController.class);
	
	
	@Autowired
	private ITeacherLogica teacherLogica;
	
	@Autowired
	private ITeacherMapper teacherMapper;

	@RequestMapping(value="/consultarPorId/{id}",method=RequestMethod.GET)
	public TeacherDTO consultarPorIdTeacher(@PathVariable("id") Integer id) throws Exception{
		Teacher teacher = teacherLogica.consultarPorIdTeacher(id);
		TeacherDTO teacherDTO = teacherMapper.teacherToteacherDTO(teacher);
		return teacherDTO;
	}
	
	@RequestMapping(value="/consultarTodos",method=RequestMethod.GET)
	public List<TeacherDTO> consultarTodosLos() throws Exception{
		List<Teacher> listaTeacher = teacherLogica.consultarTodosLosTeacher();
		List<TeacherDTO> listaTeacherDTO = teacherMapper.listTeacherToListTeacherDTO(listaTeacher);
		return listaTeacherDTO;
	}
	
	@RequestMapping(value="/crear",method=RequestMethod.POST)
	public void crear(@RequestBody TeacherDTO teacherDTO) throws Exception{
			Teacher teacher = teacherMapper.teacherDTOtoTeacher(teacherDTO);
			teacherLogica.crearTeacher(teacher);
	}
	
	@RequestMapping(value="/modificar",method=RequestMethod.PUT)
	public void modificar(@RequestBody TeacherDTO teacherDTO) throws Exception {
		Teacher teacher = teacherMapper.teacherDTOtoTeacher(teacherDTO);
		teacherLogica.modificarTeacher(teacher);
	}
	
	@RequestMapping(value="/eliminarTeacher/{id}",method=RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		Teacher teacher = teacherLogica.consultarPorIdTeacher(id);
		teacherLogica.eliminarTeacher(teacher);
	}
}
