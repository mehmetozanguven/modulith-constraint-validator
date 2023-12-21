package com.mehmetozanguven.modulithconstraintvalidator.auth.validation;

import jakarta.validation.GroupSequence;
import jakarta.validation.groups.Default;

@GroupSequence({Default.class, FirstOrder.class})
public interface ValidationOrder {
}
