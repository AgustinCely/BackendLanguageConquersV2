package co.edu.usbcali.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dao.ICourseMissionDAO;
import co.edu.usbcali.modelo.Course;
import co.edu.usbcali.modelo.CourseMission;
import co.edu.usbcali.modelo.Mission;

@Scope("singleton")
@Service("courseMissionLogica")
public class CourseMissionLogica implements ICourseMissionLogica{


	@Autowired
	private ICourseLogica courseLogica;
	
	
	@Autowired
	private IMissionLogica missionLogica;
	
	@Autowired
	private ICourseMissionDAO courseMissionDAO;
	
	@Override
	@Transactional(readOnly=false, propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
	public void crearCourseMission(CourseMission entity)throws Exception {
		if(entity ==null) {
			throw new Exception("la entidad es nula");
		}
		Mission mission = missionLogica.consultarPorIdMission(entity.getMission().getIdMission());
		if(mission == null) {
			throw new Exception("La mission es nula");
		}
		if(entity.getDescripcionMission() == null || entity.getDescripcionMission().trim().equals("")==true) {
			throw new Exception("ingrese una descripcion para la mision");
		}
		
		Course course = courseLogica.consultarPorId(entity.getCourse().getIdCourse());
		if(course==null) {
			throw new Exception("El course es nulo");
		}
		
		courseMissionDAO.crearCourseMission(entity);
	}

	@Override
	@Transactional(readOnly=false, propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
	public void modificarCourseMission(CourseMission entity)throws Exception {
		if(entity ==null) {
			throw new Exception("la entidad es nula");
		}
		Mission mission = missionLogica.consultarPorIdMission(entity.getMission().getIdMission());
		if(mission == null) {
			throw new Exception("La mission es nula");
		}

		if(entity.getDescripcionMission() == null || entity.getDescripcionMission().trim().equals("")==true) {
			throw new Exception("ingrese una descripcion para la mision");
		}

		courseMissionDAO.modificarCourseMission(entity);
	}

	@Override
	@Transactional(readOnly=false, propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
	public void eliminarCourseMission(CourseMission entity)throws Exception {
		if(entity ==null) {
			throw new Exception("la entidad es nula");
		}
		if(entity.getIdCourseMission()==0) {
			throw new Exception("El id es nulo");
		}
		
		courseMissionDAO.eliminarCourseMission(entity);
	}

	@Override
	@Transactional(readOnly=true)
	public CourseMission consultarPorIdCourseMission(Integer id) throws Exception{
		if(id==0) {
			throw new Exception("El id es nulo");
		}
		return courseMissionDAO.consultarPorIdCourseMission(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<CourseMission> consultarTodosLosCourseMission()throws Exception {
		return courseMissionDAO.consultarTodoslosCourseMission();
	}

}
