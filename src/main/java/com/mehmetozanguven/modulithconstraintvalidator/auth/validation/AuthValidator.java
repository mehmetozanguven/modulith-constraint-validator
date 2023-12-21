package com.mehmetozanguven.modulithconstraintvalidator.auth.validation;

import com.mehmetozanguven.modulithconstraintvalidator.user.FoobarService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class AuthValidator implements ConstraintValidator<AuthValidation, String> {
    private final FoobarService foobarService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return foobarService.isValidValue(value);
    }
}
