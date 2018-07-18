package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.StudentMissionHomework;

public interface IStudentMissionHomeworkDAO {

	public void crearStudentMissionHomework(StudentMissionHomework entity);
	public void modificarStudentMissionHomework(StudentMissionHomework entity);
	public void eliminarStudentMissionHomework(StudentMissionHomework entity);
	public StudentMissionHomework consultarPorIdStudentMissionHomework(Integer id);
	public List<StudentMissionHomework> consultarTododLosStudentMissionHomework();
}
