package co.edu.usbcali.logica;

import java.util.List;

import co.edu.usbcali.modelo.StudentMissionHomework;

public interface IStudentMissionHomeworkLogica {

	public void crearStudentMissionHomework(StudentMissionHomework entity) throws Exception;
	public void modificarStudentMissionHomework(StudentMissionHomework entity) throws Exception;
	public void eliminarStudentMissionHomework(StudentMissionHomework entity) throws Exception;
	public StudentMissionHomework consultarPorIdStudentMissionHomework(Integer id) throws Exception;
	public List<StudentMissionHomework> consultarTodosLosStudentMissionHomework() throws Exception;
}
