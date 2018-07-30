package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.CourseLanguageDTO;
import co.edu.usbcali.modelo.CourseLanguage;


@Component
@Scope("singleton")
public class CourseLanguageMapper implements ICourseLanguageMapper {

	@Transactional(readOnly = true)
	public CourseLanguageDTO courseLanguageToCourseLanguageDTO(CourseLanguage courseLanguage) throws Exception {
		try {
			CourseLanguageDTO courseLanguageDTO = new CourseLanguageDTO();
			
			courseLanguageDTO.setIdCourseLanguage(courseLanguage.getIdCourseLanguage());
			courseLanguageDTO.setImgCourseLanguage(courseLanguage.getImgCourseLanguage());
			courseLanguageDTO.setCourse(courseLanguage.getCourse());
			courseLanguageDTO.setLanguage(courseLanguage.getLanguage());
			courseLanguageDTO.setProgressbarCourseLanguage(courseLanguage.getProgressbarCourseLanguage());
			
			return courseLanguageDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public CourseLanguage courseLanguageDTOToCourseLanguage(CourseLanguageDTO courseLanguageDTO) throws Exception {
		try {
			CourseLanguage courseLanguage = new CourseLanguage();
			
			courseLanguage.setIdCourseLanguage(courseLanguageDTO.getIdCourseLanguage());
			courseLanguage.setCourse(courseLanguageDTO.getCourse());
			courseLanguage.setLanguage(courseLanguageDTO.getLanguage());
			courseLanguage.setProgressbarCourseLanguage(courseLanguageDTO.getProgressbarCourseLanguage());
			courseLanguage.setImgCourseLanguage(courseLanguageDTO.getImgCourseLanguage());
			
			return courseLanguage;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<CourseLanguageDTO> listCourseLanguageToCourseLanguageDTO(List<CourseLanguage> courseLanguages)
			throws Exception {
		try {
			List<CourseLanguageDTO> courseLanguageDTOs = new ArrayList<CourseLanguageDTO>();
			
			for (CourseLanguage courseLanguage : courseLanguages) {
				CourseLanguageDTO courseLanguageDTO = courseLanguageToCourseLanguageDTO(courseLanguage);
				
				courseLanguageDTOs.add(courseLanguageDTO);
			}
			
			return courseLanguageDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<CourseLanguage> listCourseLanguageDTOToCourseLanguage(List<CourseLanguageDTO> courseLanguageDTOs)
			throws Exception {
		try {
			List<CourseLanguage> courseLanguages = new ArrayList<CourseLanguage>();
			
			for (CourseLanguageDTO courseLanguageDTO : courseLanguageDTOs) {
				CourseLanguage courseLanguage = courseLanguageDTOToCourseLanguage(courseLanguageDTO);
				
				courseLanguages.add(courseLanguage);
			}
			
			return courseLanguages;
		} catch (Exception e) {
			throw e;
		}
	}

}
