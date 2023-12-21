package com.mehmetozanguven.modulithconstraintvalidator.auth.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.PARAMETER, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AuthValidator.class)
public @interface AuthValidation {

    String message() default "{something.went.wrong}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
