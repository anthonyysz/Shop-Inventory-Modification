package com.example.demo.validators;

import com.example.demo.domain.Part;

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
//beginning this validator as the EnufPartsValidator had been done before, though this time with a Part object
public class MaxPartsValidator implements ConstraintValidator<ValidMaxParts, Part> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidMaxParts constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    //creating a boolean object IsValid, and passing a Part object as well as the ConstraintValidator
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(context==null) return true;
        if(context!=null)myContext=context;
        /*Returning true if the inventory is less than or equal to the maximum
        Returning false if the inventory exceeds the maximum
        An error will be thrown if the inventory exceeds the maximum
         */
        return part.getInv() <= part.getMaxInv();
    }
}