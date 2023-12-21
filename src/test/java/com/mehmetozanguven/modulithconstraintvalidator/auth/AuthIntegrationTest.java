package com.mehmetozanguven.modulithconstraintvalidator.auth;

import com.mehmetozanguven.modulithconstraintvalidator.auth.model.TestModel;
import com.mehmetozanguven.modulithconstraintvalidator.config.TestRestTemplateConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.modulith.test.ApplicationModuleTest;
import org.springframework.web.util.UriComponentsBuilder;


@Slf4j
@ApplicationModuleTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        mode = ApplicationModuleTest.BootstrapMode.ALL_DEPENDENCIES)
@Import(value = {TestRestTemplateConfiguration.class})
public class AuthIntegrationTest{

    @Autowired
    public TestRestTemplate appRestTestTemplate;
    @LocalServerPort
    public int randomServerPort;

    @Test
    void failingTest() {
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromHttpUrl("http://localhost:" + randomServerPort + "/api")
                ;
        String url =  builder.build().toUri().toString();
        ResponseEntity<String> response = appRestTestTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(new TestModel()), new ParameterizedTypeReference<String>() {
        });
        Assertions.assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        Assertions.assertEquals("test", response.getBody());
    }

}
