package com.mehmetozanguven.modulithconstraintvalidator.auth;

import com.mehmetozanguven.modulithconstraintvalidator.auth.model.TestModel;
import com.mehmetozanguven.modulithconstraintvalidator.auth.validation.ValidationOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthController {

    @PostMapping
    public ResponseEntity<String> test(@RequestBody @Validated(ValidationOrder.class) TestModel testModel) {
        return new ResponseEntity<>("test", HttpStatus.OK);
    }
}
