package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.dto.AvatarDTO;
import co.edu.usbcali.logica.IAvatarLogica;
import co.edu.usbcali.mapper.IAvatarMapper;
import co.edu.usbcali.modelo.Avatar;

@RestController
@RequestMapping("/avatarRest")
public class AvatarController {
	
	@Autowired
	private IAvatarLogica avatarLogica;
	
	@Autowired
	private IAvatarMapper avatarMapper;
	
	@RequestMapping(value="/consultarPorIdAvatar/{id}",method=RequestMethod.GET)
	public AvatarDTO consultarPorIdAvatar(@PathVariable("id") Integer id) throws Exception{
		Avatar avatar = avatarLogica.consultarPorIdAvatar(id);
		AvatarDTO avatarDTO = avatarMapper.avatarToAvatarDTO(avatar);
		
		return avatarDTO;
	}
	
	@RequestMapping(value="/consultarTodosAvatar",method=RequestMethod.GET)
	public List<AvatarDTO> consultarTodosLosAvatar() throws Exception{
		List<Avatar> listaAvatar = avatarLogica.consultarTodosLosAvatar();
		List<AvatarDTO> listaAvatarDTO = avatarMapper.listAvatarToAvatarDTO(listaAvatar);
		
		return listaAvatarDTO;
	}
	
	@RequestMapping(value="/crearAvatar",method=RequestMethod.POST)
	public void crearAvatar(@RequestBody AvatarDTO avatarDTO) throws Exception{
		Avatar avatar = avatarMapper.avatarDTOToAvatar(avatarDTO);
		avatarLogica.crearAvatar(avatar);
	}
	
	@RequestMapping(value="/modificarAvatar",method=RequestMethod.PUT)
	public void modificarAvatar(@RequestBody AvatarDTO avatarDTO) throws Exception{
		Avatar avatar = avatarMapper.avatarDTOToAvatar(avatarDTO);
		avatarLogica.modificarAvatar(avatar);
	}
	
	@RequestMapping(value="/eliminarTeacher/{id}",method=RequestMethod.DELETE)
	public void eliminarAvatar(@PathVariable("id") Integer id) throws Exception{
		Avatar avatar = avatarLogica.consultarPorIdAvatar(id);
		avatarLogica.eliminarAvatar(avatar);
	}
}
