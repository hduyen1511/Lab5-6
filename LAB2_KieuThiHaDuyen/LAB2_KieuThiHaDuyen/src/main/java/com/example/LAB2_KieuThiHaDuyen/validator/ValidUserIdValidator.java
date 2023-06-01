package com.example.LAB2_KieuThiHaDuyen.validator;

import com.example.LAB2_KieuThiHaDuyen.entity.User;
import com.example.LAB2_KieuThiHaDuyen.validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid (User user, ConstraintValidatorContext context){
        if (user == null)
            return  true;
        return user.getId() != null;
    }
}
