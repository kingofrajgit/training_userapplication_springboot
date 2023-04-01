package com.user.application.validator;

import com.user.application.entity.UserEntity;

public class UserValidator {

	public static  boolean allValidate(UserEntity entity) {
		
		if (entity == null ) {
			return false;
		}
		else {
			return true;
		}
	}

}
