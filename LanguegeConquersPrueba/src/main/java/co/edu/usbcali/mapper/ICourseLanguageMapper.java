package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.CourseLanguageDTO;
import co.edu.usbcali.modelo.CourseLanguage;

public interface ICourseLanguageMapper {
	
	public CourseLanguageDTO courseLanguageToCourseLanguageDTO(CourseLanguage courseLanguage) throws Exception;
	public CourseLanguage courseLanguageDTOToCourseLanguage(CourseLanguageDTO courseLanguageDTO) throws Exception;
	public List<CourseLanguageDTO> listCourseLanguageToCourseLanguageDTO(List<CourseLanguage> courseLanguages)  throws Exception;
	public List<CourseLanguage> listCourseLanguageDTOToCourseLanguage(List<CourseLanguageDTO> courseLanguageDTOs) throws Exception;
}
