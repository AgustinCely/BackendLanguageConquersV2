package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.ProgrammingLevelDTO;
import co.edu.usbcali.modelo.ProgrammingLevel;


@Component
@Scope("singleton")
public class ProgrammingLevelMapper implements IProgrammingLevelMapper {

	@Transactional(readOnly = true)
	public ProgrammingLevelDTO programmingLevelToProgrammingLevelDTO(ProgrammingLevel programmingLevel)
			throws Exception {
		try {
			ProgrammingLevelDTO programmingLevelDTO = new ProgrammingLevelDTO();
			
			programmingLevelDTO.setIdProgrammingLevel(programmingLevel.getIdProgrammingLevel());
			programmingLevelDTO.setNameProgrammingLevel(programmingLevel.getNameProgrammingLevel());
			
			return programmingLevelDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public ProgrammingLevel programmingLevelDTOToProgrammingLevel(ProgrammingLevelDTO programmingLevelDTO)
			throws Exception {
		try {
			ProgrammingLevel programmingLevel = new ProgrammingLevel();
			
			programmingLevel.setIdProgrammingLevel(programmingLevelDTO.getIdProgrammingLevel());
			programmingLevel.setNameProgrammingLevel(programmingLevelDTO.getNameProgrammingLevel());
			
			return programmingLevel;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<ProgrammingLevelDTO> listProgrammingLevelToProgrammingLevelDTO(List<ProgrammingLevel> programmingLevels)
			throws Exception {
		try {
			List<ProgrammingLevelDTO> programmingLevelDTOs = new ArrayList<ProgrammingLevelDTO>();
			
			for (ProgrammingLevel programmingLevel : programmingLevels) {
				
				ProgrammingLevelDTO programmingLevelDTO = programmingLevelToProgrammingLevelDTO(programmingLevel);
				programmingLevelDTOs.add(programmingLevelDTO);
				
			}
			
			return programmingLevelDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<ProgrammingLevel> listProgrammingLevelDTOToProgrammingLevel(
			List<ProgrammingLevelDTO> programmingLevelDTOs) throws Exception {
		try {
			List<ProgrammingLevel> programmingLevels = new ArrayList<ProgrammingLevel>();
			
			for (ProgrammingLevelDTO programmingLevelDTO : programmingLevelDTOs) {
				
				ProgrammingLevel programmingLevel = programmingLevelDTOToProgrammingLevel(programmingLevelDTO);
				programmingLevels.add(programmingLevel);
			}
			
			return programmingLevels;
		} catch (Exception e) {
			throw e;
		}
	}

}
