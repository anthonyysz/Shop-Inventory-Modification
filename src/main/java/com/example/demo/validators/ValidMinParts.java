package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
//When an error is thrown by MinPartsValidator, this will react
@Constraint(validatedBy = {MinPartsValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinParts {
    //This below is the message that will be thrown as the error
    String message() default "Part inventory value cannot be less than the minimum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}