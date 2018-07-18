package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.CourseDTO;
import co.edu.usbcali.modelo.Course;

public class CourseMapper implements ICourseMapper{

	@Transactional(readOnly = true)
	public CourseDTO courseToCourseDTO(Course course) throws Exception {
		try {
			CourseDTO courseDTO = new CourseDTO();
			
			courseDTO.setIdCourse(course.getIdCourse());
			courseDTO.setNameCourse(course.getNameCourse());
			courseDTO.setPasswordCourse(course.getPasswordCourse());
			courseDTO.setNumberStudent(course.getNumberStudent());
			courseDTO.setQuantityLanguage(course.getQuantityLanguage());
			courseDTO.setTeacher(course.getTeacher());
			courseDTO.setStartCourse(course.getStartCourse());
			courseDTO.setEndCourse(course.getEndCourse());
			
			return courseDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public Course courseDTOToCourse(CourseDTO courseDTO) throws Exception {
		try {
			Course course = new Course();
			
			course.setNameCourse(courseDTO.getNameCourse());
			course.setPasswordCourse(courseDTO.getPasswordCourse());
			course.setNumberStudent(courseDTO.getNumberStudent());
			course.setQuantityLanguage(courseDTO.getQuantityLanguage());
			course.setTeacher(courseDTO.getTeacher());
			course.setStartCourse(course.getStartCourse());
			course.setEndCourse(courseDTO.getEndCourse());
			
			return course;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<CourseDTO> listCourseToCourseDTO(List<Course> courses) throws Exception {
		try {
			List<CourseDTO> courseDTOs = new ArrayList<CourseDTO>();
			
			for (Course course : courses) {
				CourseDTO courseDTO = courseToCourseDTO(course);
				courseDTOs.add(courseDTO);
			}
			
			return courseDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Course> listCourseDTOToCourse(List<CourseDTO> courseDTOs) throws Exception {
		try {
			List<Course> listCourse = new ArrayList<Course>();
			
			for (CourseDTO courseDTO : courseDTOs) {
				Course course = courseDTOToCourse(courseDTO);
				listCourse.add(course);
			}
			return listCourse;
		} catch (Exception e) {
			throw e;
		}
	}

}
