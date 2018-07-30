package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.dto.CourseDTO;
import co.edu.usbcali.logica.ICourseLogica;
import co.edu.usbcali.mapper.ICourseMapper;
import co.edu.usbcali.modelo.Course;

@RestController
@RequestMapping("/courseRest")
@CrossOrigin(origins="*")
public class CourseController {

	@Autowired
	private ICourseLogica courseLogica;
	
	@Autowired
	private ICourseMapper courseMapper;
	
	@RequestMapping(value="/consultarPorIdCourse/{id}",method=RequestMethod.GET)
	public CourseDTO consultarPorIdCourse(@PathVariable("id") Integer id) throws Exception{
		Course course = courseLogica.consultarPorId(id);
		CourseDTO courseDTO = courseMapper.courseToCourseDTO(course);
		return courseDTO;
	}
	
	@RequestMapping(value="/consultarTodosCourse",method=RequestMethod.GET)
	public List<CourseDTO> consultarTodosCourse() throws Exception{
		List<Course> courses = courseLogica.consultarTodosLosCourse();
		List<CourseDTO> listaCourse = courseMapper.listCourseToCourseDTO(courses);
		return listaCourse;
	}
	
	@RequestMapping(value="/crearCourse",method=RequestMethod.POST)
	public void crearCourse(@RequestBody CourseDTO courseDTO) throws Exception{
		Course course = courseMapper.courseDTOToCourse(courseDTO);
		courseLogica.crearCourse(course);
	}
	
	@RequestMapping(value="/modificarCourse",method=RequestMethod.PUT)
	public void modificarCourse(@RequestBody CourseDTO courseDTO) throws Exception{
		Course course = courseMapper.courseDTOToCourse(courseDTO);
		courseLogica.modificarCourse(course);
	}
	@RequestMapping(value="/eliminarCourse/{id}",method=RequestMethod.DELETE)
	public void eliminarCourse(@PathVariable("id") Integer id) throws Exception{
		Course course = courseLogica.consultarPorId(id);
		courseLogica.eliminarCourse(course);
	}
}
