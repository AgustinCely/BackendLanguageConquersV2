package co.edu.usbcali.backend.rest.test;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.client.RestTemplate;

import co.edu.usbcali.dto.TeacherDTO;

public class TeacherService {
	
	public static void main(String[] args) {
		
		TeacherDTO teacherDTO = new TeacherDTO();
		teacherDTO.setNameUser("Diego Armando");
		teacherDTO.setLastnameUser("Gomez Mosquera");
		teacherDTO.setEmailUser("dgomez@vortexbird.com");
		teacherDTO.setGenderUser('M');
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mmm-yyyy");
		String dateInString = "1985-10-26";
		try {
			
			Date date = formatter.parse(dateInString);
			
			teacherDTO.setBirthdateUser(date);
		}catch (Exception e) {
			e.printStackTrace();
		}
		teacherDTO.setImageUser("");
		teacherDTO.setPasswordUser("1235");
		teacherDTO.setUsername("holiPePe");
		
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.postForLocation("http://localhost:8080/LanguegeConquersPrueba/controller/teacherRest/crear", teacherDTO);
	}
}
