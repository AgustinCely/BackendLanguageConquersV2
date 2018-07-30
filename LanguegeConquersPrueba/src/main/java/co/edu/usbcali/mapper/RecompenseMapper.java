package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.RecompenseDTO;
import co.edu.usbcali.modelo.Recompense;


@Component
@Scope("singleton")
public class RecompenseMapper implements IRecompenseMapper {

	@Transactional(readOnly = true)
	public RecompenseDTO recompenseToRecompenseDTO(Recompense recompense) throws Exception {
		try {
			RecompenseDTO recompenseDTO = new RecompenseDTO();
			
			recompenseDTO.setIdRecompense(recompense.getIdRecompense());
			recompenseDTO.setImgRecompense(recompense.getImgRecompense());
			recompenseDTO.setScoreMin(recompense.getScoreMin());
			recompenseDTO.setTitleRecompense(recompense.getTitleRecompense());
			
			return recompenseDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public Recompense recompenseDTOToRecompense(RecompenseDTO recompenseDTO) throws Exception {
		try {
			Recompense recompense = new Recompense();
			
			recompense.setIdRecompense(recompenseDTO.getIdRecompense());
			recompense.setImgRecompense(recompenseDTO.getImgRecompense());
			recompense.setScoreMin(recompenseDTO.getScoreMin());
			recompense.setTitleRecompense(recompenseDTO.getTitleRecompense());
			
			return recompense;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<RecompenseDTO> listRecompenseToRecompenseDTO(List<Recompense> recompenses) throws Exception {
		try {
			List<RecompenseDTO> recompenseDTOs = new ArrayList<RecompenseDTO>();
			
			for (Recompense recompense : recompenses) {
				
				RecompenseDTO recompenseDTO = recompenseToRecompenseDTO(recompense);
				
				recompenseDTOs.add(recompenseDTO);
			}
			
			return recompenseDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Recompense> listRecompenseDTOToRecompense(List<RecompenseDTO> recompenseDTOs) throws Exception {
		try {
			List<Recompense> recompenses = new ArrayList<Recompense>();
			
			for (RecompenseDTO recompenseDTO : recompenseDTOs) {
				
				Recompense recompense = recompenseDTOToRecompense(recompenseDTO);
				
				recompenses.add(recompense);
			}
			
			return recompenses;
		} catch (Exception e) {
			throw e;
		}
	}

}
