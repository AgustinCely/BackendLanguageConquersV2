package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.CourseDTO;
import co.edu.usbcali.modelo.Course;

public interface ICourseMapper {

	public CourseDTO courseToCourseDTO(Course course)throws Exception;
	public Course courseDTOToCourse(CourseDTO courseDTO) throws Exception;
	public List<CourseDTO> listCourseToCourseDTO(List<Course> courses) throws Exception;
	public List<Course> listCourseDTOToCourse(List<CourseDTO> courseDTO) throws Exception;
}
