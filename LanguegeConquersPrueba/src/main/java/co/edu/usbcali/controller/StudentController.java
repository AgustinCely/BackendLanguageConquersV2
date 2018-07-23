package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.usbcali.dto.StudentDTO;
import co.edu.usbcali.logica.IStudenLogica;
import co.edu.usbcali.mapper.IStudentMapper;
import co.edu.usbcali.modelo.Student;

public class StudentController {

	@Autowired
	private IStudenLogica studentLogica;
	
	@Autowired
	private IStudentMapper studentMapper;

	@RequestMapping(value="/consultarPorId/{id}",method=RequestMethod.GET)
	public StudentDTO consultarPorIdTeacher(@PathVariable("id") Integer id) throws Exception{
		Student student = studentLogica.consultarPorIdStudent(id);
		StudentDTO studentDTO = studentMapper.studentToStudentDTO(student);
		return studentDTO;
	}
	
	@RequestMapping(value="/consultarTodos",method=RequestMethod.GET)
	public List<StudentDTO> consultarTodosLos() throws Exception{
		List<Student> listaStudent = studentLogica.consultarTodosLosStudent();
		List<StudentDTO> listaStudentDTO = studentMapper.listStudentToStudenDTO(listaStudent);
		return listaStudentDTO;
	}
	
	@RequestMapping(value="/crear",method=RequestMethod.POST)
	public void crear(@RequestBody StudentDTO studentDTO) throws Exception{
		Student student = studentMapper.studentDTOToStudent(studentDTO);
		studentLogica.crearStudent(student);
	}
	
	@RequestMapping(value="/modificar",method=RequestMethod.PUT)
	public void modificar(@RequestBody StudentDTO studentDTO) throws Exception {
		Student student = studentMapper.studentDTOToStudent(studentDTO);
		studentLogica.modificarStudent(student);
	}
	
	@RequestMapping(value="/eliminarTeacher/{id}",method=RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		Student student = studentLogica.consultarPorIdStudent(id);
		studentLogica.eliminarStudent(student);
	}
}
