package com.example.LAB2_KieuThiHaDuyen.validator;

import com.example.LAB2_KieuThiHaDuyen.entity.Category;
import com.example.LAB2_KieuThiHaDuyen.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category>{
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null;
    }
}
