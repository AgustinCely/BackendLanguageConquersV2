package co.edu.usbcali.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.edu.usbcali.modelo.CourseMission;


@Scope("singleton")
@Repository("courseMissionDAO")
public class CourseMissionDAO implements ICourseMissionDAO{

	private SessionFactory sessionFactory;
	
	
	@Override
	public void crearCourseMission(CourseMission entity) {
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public void modificarCourseMission(CourseMission entity) {
		sessionFactory.getCurrentSession().update(entity);
	}

	@Override
	public void eliminarCourseMission(CourseMission entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

	@Override
	public CourseMission consultarPorIdCourseMission(Integer id) {
		return sessionFactory.getCurrentSession().get(CourseMission.class,id);
	}

	@Override
	public List<CourseMission> consultarTodoslosCourseMission() {
		String sql="SELECT cm FROM CourseMission cm";
		return sessionFactory.getCurrentSession().createQuery(sql).getResultList();
	}

	
	
}
