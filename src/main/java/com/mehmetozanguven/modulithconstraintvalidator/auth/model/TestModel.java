package com.mehmetozanguven.modulithconstraintvalidator.auth.model;

import com.mehmetozanguven.modulithconstraintvalidator.auth.validation.AuthValidation;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TestModel {
    @AuthValidation
    private String test;
}
