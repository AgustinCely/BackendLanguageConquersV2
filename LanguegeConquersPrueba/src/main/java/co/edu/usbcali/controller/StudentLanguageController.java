package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.usbcali.dto.StudentLanguageDTO;
import co.edu.usbcali.logica.IStudentLanguageLogica;
import co.edu.usbcali.mapper.IStudentLanguageMapper;
import co.edu.usbcali.modelo.StudentLanguage;

public class StudentLanguageController {

	@Autowired
	private IStudentLanguageLogica studentLanguageLogica;
	
	@Autowired
	private IStudentLanguageMapper studentLanguageMapper;

	@RequestMapping(value="/consultarPorId/{id}",method=RequestMethod.GET)
	public StudentLanguageDTO consultarPorIdTeacher(@PathVariable("id") Integer id) throws Exception{
		StudentLanguage studentLanguage = studentLanguageLogica.consultarPorIdStudentLanguage(id);
		StudentLanguageDTO studentLanguageDTO = studentLanguageMapper.studentLanguageToStudentLanguageDTO(studentLanguage);
		return studentLanguageDTO;
	}
	
	@RequestMapping(value="/consultarTodos",method=RequestMethod.GET)
	public List<StudentLanguageDTO> consultarTodosLos() throws Exception{
		List<StudentLanguage> listaStudentLanguage = studentLanguageLogica.consultarTodosLosStudentLanguage();
		List<StudentLanguageDTO> listaStudentLanguageDTO = studentLanguageMapper.listStudentLanguageToStudentLanguageDTO(listaStudentLanguage);
		return listaStudentLanguageDTO;
	}
	
	@RequestMapping(value="/crear",method=RequestMethod.POST)
	public void crear(@RequestBody StudentLanguageDTO studentLanguageDTO) throws Exception{
		StudentLanguage studentLanguage = studentLanguageMapper.studentLanguageDTOToStudentLanguage(studentLanguageDTO);
		studentLanguageLogica.crearStudentLanguage(studentLanguage);
	}
	
	@RequestMapping(value="/modificar",method=RequestMethod.PUT)
	public void modificar(@RequestBody StudentLanguageDTO studentLanguageDTO) throws Exception {
		StudentLanguage studentLanguage = studentLanguageMapper.studentLanguageDTOToStudentLanguage(studentLanguageDTO);
		studentLanguageLogica.modificarStudentLanguage(studentLanguage);
	}
	
	@RequestMapping(value="/eliminarTeacher/{id}",method=RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		StudentLanguage studentLanguage = studentLanguageLogica.consultarPorIdStudentLanguage(id);
		studentLanguageLogica.eliminarStudentLanguage(studentLanguage);
	}
}
