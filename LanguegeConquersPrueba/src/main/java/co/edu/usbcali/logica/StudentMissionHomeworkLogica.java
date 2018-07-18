package co.edu.usbcali.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dao.IStudentMissionHomeworkDAO;
import co.edu.usbcali.modelo.Mission;
import co.edu.usbcali.modelo.Student;
import co.edu.usbcali.modelo.StudentMissionHomework;

@Scope("singleton")
@Service("studentMissionHomeworkLogica")
public class StudentMissionHomeworkLogica implements IStudentMissionHomeworkLogica{

	@Autowired
	private IStudentMissionHomeworkDAO studentMissionHomeworkDAO;
	
	@Autowired
	private IStudenLogica studentLogica;
	
	@Autowired
	private IMissionLogica missionLogica;
	
	@Override
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public void crearStudentMissionHomework(StudentMissionHomework entity) throws Exception {
		if(entity == null) {
			throw new Exception("La tarea es nulo");
		}
		if(entity.getHomeworkName()==null || entity.getHomeworkName().trim().equals("")==true) {
			throw new Exception("El nombre de la tarea es nulo");
		}
		if(entity.getUrlHomework()==null || entity.getUrlHomework().trim().equals("")==true) {
			throw new Exception("El url de la tarea es nulo");
		}
		Student student = studentLogica.consultarPorIdStudent(entity.getStudent().getIdStudent());
		if(student==null) {
			throw new Exception("El student es nulo");
		}
		Mission mission = missionLogica.consultarPorIdMission(entity.getMission().getIdMission());
		if(mission==null) {
			throw new Exception("La mission es nulo");
		}
		
		studentMissionHomeworkDAO.crearStudentMissionHomework(entity);
	}

	@Override
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public void modificarStudentMissionHomework(StudentMissionHomework entity) throws Exception {
		if(entity == null) {
			throw new Exception("La tarea es nulo");
		}
		if(entity.getHomeworkName()==null || entity.getHomeworkName().trim().equals("")==true) {
			throw new Exception("El nombre de la tarea es nulo");
		}
		if(entity.getUrlHomework()==null || entity.getUrlHomework().trim().equals("")==true) {
			throw new Exception("El url de la tarea es nulo");
		}
		Student student = studentLogica.consultarPorIdStudent(entity.getStudent().getIdStudent());
		if(student==null) {
			throw new Exception("El student es nulo");
		}
		Mission mission = missionLogica.consultarPorIdMission(entity.getMission().getIdMission());
		if(mission==null) {
			throw new Exception("La mission es nulo");
		}
		
		studentMissionHomeworkDAO.modificarStudentMissionHomework(entity);
	}

	@Override
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public void eliminarStudentMissionHomework(StudentMissionHomework entity) throws Exception {
		if(entity == null) {
			throw new Exception("La tarea es nulo");
		}
		if(entity.getIdStudentMissionHomework()==0) {
			throw new Exception("El id es nulo");
		}
		
		studentMissionHomeworkDAO.eliminarStudentMissionHomework(entity);
	}

	@Override
	@Transactional(readOnly=true)
	public StudentMissionHomework consultarPorIdStudentMissionHomework(Integer id) throws Exception {
		if(id==0) {
			throw new Exception("El id es nulo");
		}
		return studentMissionHomeworkDAO.consultarPorIdStudentMissionHomework(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<StudentMissionHomework> consultarTodosLosStudentMissionHomework() throws Exception {
		return studentMissionHomeworkDAO.consultarTododLosStudentMissionHomework();
	}
	
	
	
}
