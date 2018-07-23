package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.usbcali.dto.RolDTO;
import co.edu.usbcali.logica.IRolLogica;
import co.edu.usbcali.mapper.IRolMapper;
import co.edu.usbcali.modelo.Rol;

public class RolController {

	@Autowired
	private IRolLogica rolLogica;
	
	@Autowired
	private IRolMapper rolMapper;

	@RequestMapping(value="/consultarPorIdRol/{id}",method=RequestMethod.GET)
	public RolDTO consultarPorIdRol(@PathVariable("id") Integer id) throws Exception{
		Rol rol = rolLogica.consultarPorIdRol(id);
		RolDTO rolDTO = rolMapper.rolToRolDTO(rol);
		return rolDTO;
	}
	
	@RequestMapping(value="/consultarTodosRol",method=RequestMethod.GET)
	public List<RolDTO> consultarTodosLosRol() throws Exception{
		List<Rol> listaRol = rolLogica.consultarTodosLorRol();
		List<RolDTO> listaRolDTO = rolMapper.listRolToRolDTO(listaRol);
		return listaRolDTO;
	}
	
	@RequestMapping(value="/crearRol",method=RequestMethod.POST)
	public void crearRol(@RequestBody RolDTO rolDTO) throws Exception{
		Rol rol = rolMapper.rolDTORoRol(rolDTO);
		rolLogica.crearRol(rol);
	}
	
	@RequestMapping(value="/modificarRol",method=RequestMethod.PUT)
	public void modificarRol(@RequestBody RolDTO rolDTO) throws Exception {
		Rol rol = rolMapper.rolDTORoRol(rolDTO);
		rolLogica.modificarRol(rol);
	}
	
	@RequestMapping(value="/eliminarRol/{id}",method=RequestMethod.DELETE)
	public void eliminarRol(@PathVariable("id") Integer id) throws Exception{
		Rol rol = rolLogica.consultarPorIdRol(id);
		rolLogica.eliminarRol(rol);
	}
	
}
