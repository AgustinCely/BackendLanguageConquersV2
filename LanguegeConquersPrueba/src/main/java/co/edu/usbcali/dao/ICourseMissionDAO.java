package co.edu.usbcali.dao;

import java.util.List;

import co.edu.usbcali.modelo.CourseMission;

public interface ICourseMissionDAO {

	public void crearCourseMission(CourseMission entity);
	public void modificarCourseMission(CourseMission entity);
	public void eliminarCourseMission(CourseMission entity);
	public CourseMission consultarPorIdCourseMission(Integer id);
	public List<CourseMission> consultarTodoslosCourseMission();
	//public void guardarCourseMission(Integer id_student, Integer id_mission);
}
