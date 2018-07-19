package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.RolDTO;
import co.edu.usbcali.modelo.Rol;

public interface IRolMapper {

	public RolDTO rolToRolDTO(Rol rol) throws Exception;
	public Rol rolDTORoRol(RolDTO rolDTO) throws Exception;
	public List<RolDTO> listRolToRolDTO(List<Rol> rols) throws Exception;
	public List<Rol> listRolDTOToRol(List<RolDTO> rolDTOs) throws Exception;
}
