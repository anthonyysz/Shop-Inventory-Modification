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
@Constraint(validatedBy = {MaxProductValidator.class})
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMaxProducts {
    String message() default "Product inventory value cannot be more than 20";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
