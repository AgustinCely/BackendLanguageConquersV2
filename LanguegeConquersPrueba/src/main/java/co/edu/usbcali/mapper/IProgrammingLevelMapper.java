package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.ProgrammingLevelDTO;
import co.edu.usbcali.modelo.ProgrammingLevel;

public interface IProgrammingLevelMapper {

	public ProgrammingLevelDTO programmingLevelToProgrammingLevelDTO(ProgrammingLevel programmingLevel) throws Exception;
	public ProgrammingLevel programmingLevelDTOToProgrammingLevel(ProgrammingLevelDTO programmingLevelDTO) throws Exception;
	public List<ProgrammingLevelDTO> listProgrammingLevelToProgrammingLevelDTO(List<ProgrammingLevel> programmingLevels) throws Exception;
	public List<ProgrammingLevel> listProgrammingLevelDTOToProgrammingLevel(List<ProgrammingLevelDTO> programmingLevelDTOs) throws Exception;
}
