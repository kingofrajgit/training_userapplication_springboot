package com.user.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.application.Dto.UserDto;
import com.user.application.entity.UserEntity;
import com.user.application.repository.UserRepository;
import com.user.application.validator.UserValidator;
import com.user.convertor.UserConvertor;


@Service
public class UserService {

	@Autowired
	UserRepository userRpo;
	

	public String  save(UserDto dto) {
			UserEntity entity = UserConvertor.toEntiy(dto);
			String mailId = entity.getMailId();
			UserEntity entity1 = userRpo.findByMailId(mailId);
			boolean bl = UserValidator.allValidate(entity1);
			if(bl == false) {
				entity = userRpo.save(entity);
				dto = UserConvertor.toDto(entity);
				return "success";
			}else {
				return "email id is allready exist";
			}
			
		
	}
	
	
}
