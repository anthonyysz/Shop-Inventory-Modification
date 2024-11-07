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
@Constraint(validatedBy = {EnufPartsValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEnufParts {
    //I changed this message to be more clear for the situation that it will be called in
    String message() default "Please ensure there are enough of each associated part to increase the inventory by this much, and that the part inventory will not fall below it's minimum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
