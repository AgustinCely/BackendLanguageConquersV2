package co.edu.usbcali.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.dto.AvatarDTO;
import co.edu.usbcali.modelo.Avatar;

@Component
@Scope("singleton")
public class AvatarMapper implements IAvatarMapper{

	@Transactional(readOnly = true)
	public AvatarDTO avatarToAvatarDTO(Avatar avatar) throws Exception {
		try {
			AvatarDTO avatarDTO = new AvatarDTO();
			
			avatarDTO.setIdAvatar(avatar.getIdAvatar());
			avatarDTO.setImgAvatar(avatar.getImgAvatar());
			avatarDTO.setNameAvatar(avatar.getNameAvatar());
			
			return avatarDTO;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(readOnly = true)
	public Avatar avatarDTOToAvatar(AvatarDTO avatarDTO) throws Exception {
		try {
			Avatar avatar = new Avatar();
			
			avatar.setIdAvatar(avatarDTO.getIdAvatar());
			avatar.setImgAvatar(avatarDTO.getImgAvatar());
			avatar.setNameAvatar(avatarDTO.getNameAvatar());
			
			return avatar;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<AvatarDTO> listAvatarToAvatarDTO(List<Avatar> avatars) throws Exception {
		try {
			List<AvatarDTO> avatarDTOs = new ArrayList<AvatarDTO>();
			
			for (Avatar avatar : avatars) {
				AvatarDTO avatarDTO = avatarToAvatarDTO(avatar);
				avatarDTOs.add(avatarDTO);
			}
			
			return avatarDTOs;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Avatar> listAvatarDTOToavatar(List<AvatarDTO> avatarDTOs) throws Exception {
		try {
			List<Avatar> avatars = new ArrayList<Avatar>();
			
			for (AvatarDTO avatarDTO : avatarDTOs) {
				Avatar avatar = avatarDTOToAvatar(avatarDTO);
				avatars.add(avatar);
			}
			
			return avatars;
		} catch (Exception e) {
			throw e;
		}
	}

	
}
