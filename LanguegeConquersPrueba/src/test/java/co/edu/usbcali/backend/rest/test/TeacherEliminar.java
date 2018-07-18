package co.edu.usbcali.backend.rest.test;

import org.springframework.web.client.RestTemplate;

public class TeacherEliminar {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.delete("http://localhost:8080/LanguegeConquersPrueba/controller/teacherRest/eliminarTeacher/"+2);
	}
}
