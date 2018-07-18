package co.edu.usbcali.logica;

import java.util.List;

import co.edu.usbcali.modelo.Rol;

public interface IRolLogica {
	
	public void crearRol(Rol entity) throws Exception;
	public void modificarRol(Rol entity) throws Exception;
	public void eliminarRol(Rol entity) throws Exception;
	public Rol consultarPorIdRol(Integer id) throws Exception;
	public List<Rol> consultarTodosLorRol() throws Exception;

}
