package com.acid.demo.service;

import com.acid.demo.model.Persona;
import org.json.JSONObject;

import java.util.List;

public interface IPersonaService {

    public JSONObject searchByRut(String rut_input);
}
