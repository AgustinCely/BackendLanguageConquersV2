package co.edu.usbcali.backend.rest.test;

import org.springframework.web.client.RestTemplate;

import co.edu.usbcali.dto.TeacherDTO;

public class TeacherModificar {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		
		TeacherDTO teacherDTO = restTemplate.getForObject("http://localhost:8080/LanguegeConquersPrueba/controller/teacherRest/consultarPorId/2", TeacherDTO.class);
		
		teacherDTO.setEmailUser("holaquehace@hotmail.com");
		teacherDTO.setImageUser("C:/Desktop/imagen/holi.jps");
		teacherDTO.setPasswordUser("holipepe1223");
		
		restTemplate.put("http://localhost:8080/LanguegeConquersPrueba/controller/teacherRest/modificar", teacherDTO);
		
	}
}
