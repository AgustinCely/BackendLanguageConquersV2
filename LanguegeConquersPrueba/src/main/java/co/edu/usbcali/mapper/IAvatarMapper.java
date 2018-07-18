package co.edu.usbcali.mapper;

import java.util.List;

import co.edu.usbcali.dto.AvatarDTO;
import co.edu.usbcali.modelo.Avatar;

public interface IAvatarMapper {

	public AvatarDTO avatarToAvatarDTO(Avatar avatar) throws Exception;
	public Avatar avatarDTOToAvatar(AvatarDTO avatarDTO) throws Exception;
	public List<AvatarDTO> listAvatarToAvatarDTO(List<Avatar> avatars) throws Exception;
	public List<Avatar> listAvatarDTOToavatar(List<AvatarDTO> avatarDTOs) throws Exception;
}
