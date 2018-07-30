package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.RolDTO;
import co.edu.usbcali.modelo.Rol;


@Component
@Scope("singleton")
public class RolMapper implements IRolMapper{

	@Transactional(readOnly = true)
	public RolDTO rolToRolDTO(Rol rol) throws Exception {
		try {
			RolDTO rolDTO = new RolDTO();
			
			rolDTO.setIdRol(rol.getIdRol());
			rolDTO.setImgRol(rol.getImgRol());
			rolDTO.setNameRol(rol.getNameRol());
			
			return rolDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public Rol rolDTORoRol(RolDTO rolDTO) throws Exception {
		try {
			Rol rol = new Rol();
			
			rol.setIdRol(rolDTO.getIdRol());
			rol.setImgRol(rolDTO.getImgRol());
			rol.setNameRol(rolDTO.getNameRol());
			
			return rol;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<RolDTO> listRolToRolDTO(List<Rol> rols) throws Exception {
		try {
			List<RolDTO> rolDTOs = new ArrayList<RolDTO>();
			
			for (Rol rol : rols) {
				RolDTO rolDTO = rolToRolDTO(rol);
				rolDTOs.add(rolDTO);
			}
			
			return rolDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Rol> listRolDTOToRol(List<RolDTO> rolDTOs) throws Exception {
		try {
			List<Rol> rols = new ArrayList<Rol>();
			
			for (RolDTO rolDTO : rolDTOs) {
				Rol rol = rolDTORoRol(rolDTO);
				rols.add(rol);
			}
			
			return rols;
		} catch (Exception e) {
			throw e;
		}
	}

}
