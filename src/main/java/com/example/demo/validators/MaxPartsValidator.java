package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class MaxPartsValidator implements ConstraintValidator<ValidMaxParts, Integer> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidMaxParts constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        if(context==null) return true;
        if(context!=null)myContext=context;
        if (integer > 200) {
            return false;
        }
        else {
            return true;
        }
    }
}
