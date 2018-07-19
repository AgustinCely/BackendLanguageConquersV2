package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.NoteDTO;
import co.edu.usbcali.modelo.Note;

public class NoteMapper implements INoteMapper{

	@Transactional(readOnly = true)
	public NoteDTO noteToNoteDTO(Note note) throws Exception {
		try {
			NoteDTO noteDTO = new NoteDTO();
			
			noteDTO.setIdNote(note.getIdNote());
			noteDTO.setQuanlificationNote(note.getQuanlificationNote());
			
			return noteDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public Note noteDTOToNote(NoteDTO noteDTO) throws Exception {
		try {
			Note note = new Note();
			
			note.setIdNote(noteDTO.getIdNote());
			note.setQuanlificationNote(noteDTO.getQuanlificationNote());
			
			return note;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<NoteDTO> listNoteToNoteDTO(List<Note> notes) throws Exception {
		try {
			List<NoteDTO> noteDTOs = new ArrayList<NoteDTO>();
			
			for (Note note : notes) {
				NoteDTO noteDTO = noteToNoteDTO(note);
				noteDTOs.add(noteDTO);
			}
			
			return noteDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Note> listNoteDTOToNote(List<NoteDTO> noteDTOs) throws Exception {
		try {
			List<Note> notes = new ArrayList<Note>();
			
			for (NoteDTO noteDTO : noteDTOs) {
				Note note = noteDTOToNote(noteDTO);
				notes.add(note);
			}
			
			return notes;
		} catch (Exception e) {
			throw e;
		}
	}

}
