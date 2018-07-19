package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.NoteDTO;
import co.edu.usbcali.modelo.Note;

public interface INoteMapper {

	public NoteDTO noteToNoteDTO(Note note) throws Exception;
	public Note noteDTOToNote(NoteDTO noteDTO) throws Exception;
	public List<NoteDTO> listNoteToNoteDTO(List<Note> notes) throws Exception;
	public List<Note> listNoteDTOToNote(List<NoteDTO> noteDTOs) throws Exception;
}
