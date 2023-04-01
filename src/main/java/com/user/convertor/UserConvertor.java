package com.user.convertor;

import com.user.application.Dto.UserDto;
import com.user.application.entity.UserEntity;

public class UserConvertor {
	
	public static UserEntity toEntiy(UserDto dto) {
		UserEntity entity = new UserEntity();
		entity.setId(dto.getId());
		entity.setMailId(dto.getMailId());
		entity.setPass(dto.getPass());
		return entity;
	}

	public static UserDto toDto(UserEntity entity) {

		UserDto dto = new UserDto();
		dto.setId(entity.getId());
		dto.setMailId(entity.getMailId());
		dto.setPass(entity.getPass());
		return dto;
	}

}
