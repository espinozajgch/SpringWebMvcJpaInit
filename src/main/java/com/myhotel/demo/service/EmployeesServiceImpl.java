package com.myhotel.demo.service;

import com.myhotel.demo.pojo.StatisticsDto;
import com.myhotel.demo.repo.IEmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeesServiceImpl implements IEmployeesService{

    @Autowired
    private IEmployeesRepo repo;

    @Override
    public int countByMinSalary(Double minSalary) {
        return repo.countByMinSalary(minSalary);
    }

    @Override
    public int countByRangeSalary(Double minSalary, Double maxSalary) {
        return repo.countByRangeSalary(minSalary, maxSalary);
    }

    @Override
    public int countByMaxSalary(Double maxSalary) {
        return repo.countByMaxSalary(maxSalary);
    }

    @Override
    public int countByDeparmentMinSalary(Double minSalary) {
        return repo.countByDeparmentMinSalary(minSalary);
    }

    @Override
    public int countByDeparmentRangeSalary(Double minSalary, Double maxSalary) {
        return repo.countByDeparmentRangeSalary(minSalary, maxSalary);
    }

    @Override
    public int countByDeparmentMaxSalary(Double maxSalary) {
        return repo.countByDeparmentMaxSalary(maxSalary);
    }

    @Override
    public List<StatisticsDto> employeeByDeparmentMaxSalary() {
        List<StatisticsDto> dtoList = repo.employeeByDeparmentMaxSalary().stream().map(e -> {
            StatisticsDto dto = new StatisticsDto();

            dto.setFIRST_NAME (e.getFIRST_NAME());
            dto.setLAST_NAME(e.getLAST_NAME());
            dto.setEMAIL(e.getEMAIL());
            dto.setPHONE_NUMBER(e.getPHONE_NUMBER());
            dto.setHIRE_DATE(e.getHIRE_DATE());
            dto.setDEPARTMENT_NAME(e.getDEPARTMENT_NAME());
            dto.setSALARY(e.getSALARY());

            return dto;
        }).collect(Collectors.toList());

        return dtoList;
    }

    @Override
    public List<StatisticsDto> managerByHireDate(int year) {
        List<StatisticsDto> dtoList = repo.managerByHireDate(year).stream().map(e -> {
            StatisticsDto dto = new StatisticsDto();

            dto.setFIRST_NAME (e.getFIRST_NAME());
            dto.setLAST_NAME(e.getLAST_NAME());
            dto.setEMAIL(e.getEMAIL());
            dto.setPHONE_NUMBER(e.getPHONE_NUMBER());
            dto.setHIRE_DATE(e.getHIRE_DATE());
            dto.setJOB_TITLE(e.getJOB_TITLE());
            dto.setSALARY(e.getSALARY());
            dto.setYEARS(e.getYEARS());

            return dto;
        }).collect(Collectors.toList());

        return dtoList;
    }

    @Override
    public List<StatisticsDto> avgByDeparment(int employee_count) {
        List<StatisticsDto> dtoList = repo.avgByDeparment(employee_count).stream().map(e -> {
            StatisticsDto dto = new StatisticsDto();

            dto.setAVG_SALARY (e.getAVG_SALARY());
            dto.setEMPLOYEES_COUNT(e.getEMPLOYEES_COUNT());
            dto.setDEPARTMENT_NAME(e.getDEPARTMENT_NAME());

            return dto;
        }).collect(Collectors.toList());

        return dtoList;
    }

    @Override
    public List<StatisticsDto> infoByCountry() {
        List<StatisticsDto> dtoList = repo.infoByCountry().stream().map(e -> {
            StatisticsDto dto = new StatisticsDto();

            dto.setAVG_SALARY (e.getAVG_SALARY());
            dto.setMIN_SALARY (e.getMIN_SALARY());
            dto.setMAX_SALARY (e.getMAX_SALARY());
            dto.setAVG_YEARS (e.getAVG_YEARS());
            dto.setEMPLOYEES_COUNT(e.getEMPLOYEES_COUNT());
            dto.setCOUNTRY_NAME(e.getCOUNTRY_NAME());

            return dto;
        }).collect(Collectors.toList());

        return dtoList;
    }


}
