package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.RecompenseDTO;
import co.edu.usbcali.modelo.Recompense;

public interface IRecompenseMapper {

	public RecompenseDTO recompenseToRecompenseDTO(Recompense recompense) throws Exception;
	public Recompense recompenseDTOToRecompense(RecompenseDTO recompenseDTO) throws Exception;
	public List<RecompenseDTO> listRecompenseToRecompenseDTO(List<Recompense> recompenses) throws Exception;
	public List<Recompense> listRecompenseDTOToRecompense(List<RecompenseDTO> recompenseDTOs) throws Exception;
}
