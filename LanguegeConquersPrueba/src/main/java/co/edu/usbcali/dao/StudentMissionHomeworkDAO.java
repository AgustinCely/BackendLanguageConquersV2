package co.edu.usbcali.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.modelo.StudentMissionHomework;

@Scope("singleton")
@Repository("studentMissionHomeworkDAO")
public class StudentMissionHomeworkDAO implements IStudentMissionHomeworkDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional(readOnly=false)
	public void crearStudentMissionHomework(StudentMissionHomework entity) {
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	@Transactional(readOnly=false)
	public void modificarStudentMissionHomework(StudentMissionHomework entity) {
		sessionFactory.getCurrentSession().update(entity);
	}

	@Override
	@Transactional(readOnly=false)
	public void eliminarStudentMissionHomework(StudentMissionHomework entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

	@Override
	@Transactional(readOnly=true)
	public StudentMissionHomework consultarPorIdStudentMissionHomework(Integer id) {
		return sessionFactory.getCurrentSession().get(StudentMissionHomework.class, id);
	}

	@Override@Transactional(readOnly=true)
	public List<StudentMissionHomework> consultarTododLosStudentMissionHomework() {
		String sql="SELECT smh FROM StudentMissionHomework smh";
		return sessionFactory.getCurrentSession().createQuery(sql).getResultList();
	}

	
	
}
