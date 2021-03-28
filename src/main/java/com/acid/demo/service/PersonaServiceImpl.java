package com.acid.demo.service;

import com.acid.demo.controller.DemoController;
import com.acid.demo.model.Persona;
import com.acid.demo.repo.IPersonaRepo;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PersonaServiceImpl implements IPersonaService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private IPersonaRepo repo;

    @Override
    public JSONObject searchByRut(String rut_input) {

        JSONObject jsonResult = new JSONObject();

        JSONObject jsonError = new JSONObject();
        jsonError.put("Type", "400");
        jsonError.put("error", "BAD REQUEST");
        jsonError.put("message", "RUT PARAMETER IS INVALID");

        Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
        Matcher matcher = pattern.matcher(rut_input);

        if ( matcher.matches() == false ){
            return jsonError;
        }
        else
        if (rut_input != null && rut_input.length() >1) {

            String[] rut_array = rut_input.split("-");

            if(rut_array.length==2){
                String run = rut_array[0];
                String dv = rut_array[1];

                if(run.matches("\\d*")){
                    if(dv.equalsIgnoreCase(this.dv(run))){
                        jsonResult.put("result", repo.findByRut(run+dv));
                    }
                    else{
                        return jsonError;
                    }
                }
                else{
                    return jsonError;
                }
            }
            else{
                return jsonError;
            }
        }
        else{
            return jsonError;
        }

        return jsonResult;
    }

    public void savePersona(){
        Persona persona = new Persona();
        //persona.setIdPersona(1);
        persona.setNombre("Jose");
        persona.setApellido("Espinoza");
        persona.setRut("267383421");
        persona.setFecha_nac("27/06/1989");
        repo.save(persona);
    }

    /**
     * Valida el dígito verificador
     */
    private String dv ( String rut ) {
        Integer M=0,S=1,T=Integer.parseInt(rut);
        for (;T!=0;T=(int) Math.floor(T/=10))
            S=(S+T%10*(9-M++%6))%11;

        String dv = ( S > 0 ) ? String.valueOf(S-1) : "k";

        //LOGGER.info(dv);
        return dv;
    }
}
