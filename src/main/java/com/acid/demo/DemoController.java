package com.acid.demo;

import com.acid.demo.model.Persona;
import com.acid.demo.repo.IPersonaRepo;
import com.acid.demo.service.PersonaServiceImpl;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class DemoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    public static final String REGEX = "^[0-9]+-[0-9kK]{1}$";

    @Autowired
    private PersonaServiceImpl service;

    @CrossOrigin
    @GetMapping(value = "reverse_rut", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getRut(
            @Valid @Pattern(regexp = REGEX )
            @RequestParam(value = "rut", defaultValue = "0") String rut_input){

        return new ResponseEntity<>(service.searchByRut(rut_input).toString(), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/")
    public String home(){
        return "hola mundo";
    }

    @CrossOrigin
    @PostMapping(value = "addPerson")
    public ResponseEntity<String> savePerson() {
        service.savePersona();
        return new ResponseEntity<>("Registro guardado", HttpStatus.OK);
    }
}
