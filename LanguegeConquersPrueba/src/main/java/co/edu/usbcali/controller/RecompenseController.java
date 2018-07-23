package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.usbcali.dto.RecompenseDTO;
import co.edu.usbcali.logica.IRecompenseLogica;
import co.edu.usbcali.mapper.IRecompenseMapper;
import co.edu.usbcali.modelo.Recompense;

public class RecompenseController {

	@Autowired
	private IRecompenseLogica recompenseLogica;
	
	@Autowired
	private IRecompenseMapper recompenseMapper;
	
	@RequestMapping(value="/consultarPorIdRecompense/{id}",method=RequestMethod.GET)
	public RecompenseDTO consultarPorIdRecompense(@PathVariable("id") Integer id) throws Exception{
		Recompense recompense = recompenseLogica.consultarPorIdRecompense(id);
		RecompenseDTO recompenseDTO = recompenseMapper.recompenseToRecompenseDTO(recompense);
		return recompenseDTO;
	}
	
	@RequestMapping(value="/consultarTodosRecompense",method=RequestMethod.GET)
	public List<RecompenseDTO> consultarTodosLosRecompense() throws Exception{
		List<Recompense> listaRecompense = recompenseLogica.consultarTodosLosRecompense();
		List<RecompenseDTO> listaRecompenseDTO = recompenseMapper.listRecompenseToRecompenseDTO(listaRecompense);
		return listaRecompenseDTO;
	}
	
	@RequestMapping(value="/crearRecompense",method=RequestMethod.POST)
	public void crearRecompense(@RequestBody RecompenseDTO recompenseDTO) throws Exception{
		Recompense recompense = recompenseMapper.recompenseDTOToRecompense(recompenseDTO);
		recompenseLogica.crearRecompense(recompense);
	}
	
	@RequestMapping(value="/modificarRecompense",method=RequestMethod.PUT)
	public void modificarRecompense(@RequestBody RecompenseDTO recompenseDTO) throws Exception {
		Recompense recompense = recompenseMapper.recompenseDTOToRecompense(recompenseDTO);
		recompenseLogica.modificarRecompense(recompense);
	}
	
	@RequestMapping(value="/eliminarRecompense/{id}",method=RequestMethod.DELETE)
	public void eliminarRecompense(@PathVariable("id") Integer id) throws Exception{
		Recompense recompense = recompenseLogica.consultarPorIdRecompense(id);
		recompenseLogica.eliminarRecompense(recompense);
	}
}
