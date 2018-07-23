package co.edu.usbcali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.usbcali.dto.NoteDTO;
import co.edu.usbcali.logica.INoteLogica;
import co.edu.usbcali.mapper.INoteMapper;
import co.edu.usbcali.modelo.Note;

public class NoteController {

	@Autowired
	private INoteLogica noteLogica;
	
	@Autowired
	private INoteMapper noteMapper;

	@RequestMapping(value="/consultarPorIdNote/{id}",method=RequestMethod.GET)
	public NoteDTO consultarPorIdNote(@PathVariable("id") Integer id) throws Exception{
		Note note = noteLogica.consultarPorIdNote(id);
		NoteDTO noteDTO = noteMapper.noteToNoteDTO(note);
		return noteDTO;
	}
	
	@RequestMapping(value="/consultarTodosNote",method=RequestMethod.GET)
	public List<NoteDTO> consultarTodosLosNote() throws Exception{
		List<Note> listaNote = noteLogica.consultarTodosLosNote();
		List<NoteDTO> listaNoteDTO = noteMapper.listNoteToNoteDTO(listaNote);
		return listaNoteDTO;
	}
	
	@RequestMapping(value="/crearNote",method=RequestMethod.POST)
	public void crear(@RequestBody NoteDTO noteDTO) throws Exception{
		Note note = noteMapper.noteDTOToNote(noteDTO);
		noteLogica.crearNote(note);
	}
	
	@RequestMapping(value="/modificarNote",method=RequestMethod.PUT)
	public void modificar(@RequestBody NoteDTO noteDTO) throws Exception {
		Note note = noteMapper.noteDTOToNote(noteDTO);
		noteLogica.modificarNote(note);
	}
	
	@RequestMapping(value="/eliminarNote/{id}",method=RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		Note note = noteLogica.consultarPorIdNote(id);
		noteLogica.eliminarNote(note);
	}
}
