package com.myhotel.demo.controller;

import com.myhotel.demo.pojo.StatisticsDto;
import com.myhotel.demo.service.EmployeesServiceImpl;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private EmployeesServiceImpl service;

    @CrossOrigin
    @GetMapping(value = {"demo/{problema}", "demo/{problema}/{segmento}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getRut(@PathVariable(value = "problema") int problema,
                            @PathVariable(value = "segmento", required = false) String segmento){

        JSONObject jsonResult = new JSONObject();

        if(problema == 1) {
            if(segmento != null){
                if(segmento.equalsIgnoreCase("A")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS CON SALARIO MENOR A 3.500 USD", service.countByMinSalary(3500.0));
                }
                else
                if(segmento.equalsIgnoreCase("B")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS CON SALARIO MAYOR O IGUAL A 3.500 Y MENOR QUE 8.000", service.countByRangeSalary(3500.0, 8000.0));
                }
                else
                if(segmento.equalsIgnoreCase("C")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS CON SALARIO MAYOR O IGUAL A 8.000", service.countByMaxSalary(8000.0));
                }
                else{
                    jsonResult.put("message", "parametro segmento es invalido");
                }
            }
            else{
                jsonResult.put("message", "parametro segmento es invalido");
            }
        }
        else
        if(problema == 2){
            if(segmento != null){
                //jsonResult.put("message", "CANTIDAD DE EMPLEADOS CON");
                if(segmento.equalsIgnoreCase("A")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS POR DEPARTAMENTO CON SALARIO MENOR A 3.500 USD", service.countByDeparmentMinSalary(3500.0));
                }
                else
                if(segmento.equalsIgnoreCase("B")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS POR DEPARTAMENTO CON SALARIO MAYOR O IGUAL A 3.500 Y MENOR QUE 8.000", service.countByDeparmentRangeSalary(3500.0, 8000.0));
                }
                else
                if(segmento.equalsIgnoreCase("C")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS POR DEPARTAMENTO CON SALARIO MAYOR O IGUAL A 8.000", service.countByDeparmentMaxSalary(8000.0));
                }
                else{
                    jsonResult.put("message", "parametro segmento es invalido");
                }
            }
            else{
                jsonResult.put("message", "parametro segmento es invalido");
            }
        }
        else
        if(problema == 3){
            jsonResult.put("INFORMACION DEL EMPLEADO CON MAYOR SUELDO POR DEPARTAMENTO", service.employeeByDeparmentMaxSalary());
        }
        else
        if(problema == 4){
            jsonResult.put("INFORMACION DE LOS GERENTES QUE HAYAN SIDO CONTRATADOS HACE MAS DE 15 AÑOS", service.managerByHireDate(15));
        }
        else
        if(problema == 5){
            jsonResult.put("SALARIO PROMEDIO DE TODOS LOS DEPARTAMENTOS CON MAS DE 10 EMPLEADOS", service.avgByDeparment(10));
        }
        else
        if(problema == 6){
            jsonResult.put("CANTIDAD DE EMPLEADOS, SALARIO PROMEDIO, MAXIMO Y MINIMO, PROMEDIO DE AÑOS DE ANTIGUEDAD POR PAIS", service.infoByCountry());
        }

        return new ResponseEntity<String>(jsonResult.toString(), HttpStatus.OK);
    }


    @CrossOrigin
    @RequestMapping(value="/{problema}/{segmento}")
    public ResponseEntity<?> cantidadEmpleados(@PathVariable(value = "problema") int problema,
                                    @PathVariable(value = "segmento") String segmento){

        JSONObject jsonResult = new JSONObject();
        if(problema == 1) {
            if(segmento != null){
                if(segmento.equalsIgnoreCase("A")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS CON SALARIO MENOR A 3.500 USD", service.countByMinSalary(3500.0));
                }
                else
                if(segmento.equalsIgnoreCase("B")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS CON SALARIO MAYOR O IGUAL A 3.500 Y MENOR QUE 8.000", service.countByRangeSalary(3500.0, 8000.0));
                }
                else
                if(segmento.equalsIgnoreCase("C")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS CON SALARIO MAYOR O IGUAL A 8.000", service.countByMaxSalary(8000.0));
                }
                else{
                    jsonResult.put("message", "parametro segmento es invalido");
                }
            }
            else{
                jsonResult.put("message", "parametro segmento es invalido");
            }
        }
        else
        if(problema == 2){
            if(segmento != null){
                //jsonResult.put("message", "CANTIDAD DE EMPLEADOS CON");
                if(segmento.equalsIgnoreCase("A")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS POR DEPARTAMENTO CON SALARIO MENOR A 3.500 USD", service.countByDeparmentMinSalary(3500.0));
                }
                else
                if(segmento.equalsIgnoreCase("B")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS POR DEPARTAMENTO CON SALARIO MAYOR O IGUAL A 3.500 Y MENOR QUE 8.000", service.countByDeparmentRangeSalary(3500.0, 8000.0));
                }
                else
                if(segmento.equalsIgnoreCase("C")) {
                    jsonResult.put("CANTIDAD DE EMPLEADOS POR DEPARTAMENTO CON SALARIO MAYOR O IGUAL A 8.000", service.countByDeparmentMaxSalary(8000.0));
                }
                else{
                    jsonResult.put("message", "parametro segmento es invalido");
                }
            }
            else{
                jsonResult.put("message", "parametro segmento es invalido");
            }
        }
        return new ResponseEntity<String>(jsonResult.toString(), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value="/3")
    public List<StatisticsDto> mayorSueldo(){
        return service.employeeByDeparmentMaxSalary();
    }

    @CrossOrigin
    @RequestMapping(value="/4/{year}")
    public List<StatisticsDto> intGerentes(@PathVariable(value = "year") int year){
        return service.managerByHireDate(year);
    }

    @CrossOrigin
    @RequestMapping(value="/5/{employee_count}")
    public List<StatisticsDto> salarioPromedio(@PathVariable(value = "employee_count") int employee_count){
        return service.avgByDeparment(employee_count);
    }

    @CrossOrigin
    @RequestMapping(value="/6")
    public List<StatisticsDto> infoPorPais(){
        return service.infoByCountry();
    }

}
