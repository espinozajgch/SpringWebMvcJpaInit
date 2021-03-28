package com.myhotel.demo.service;

import com.myhotel.demo.pojo.StatisticsDto;

import java.util.List;

public interface IEmployeesService {

    int countByMinSalary(Double minSalary);

    int countByRangeSalary(Double minSalary, Double maxSalary);

    int countByMaxSalary(Double maxSalary);

    int countByDeparmentMinSalary(Double minSalary);

    int countByDeparmentRangeSalary(Double minSalary, Double maxSalary);

    int countByDeparmentMaxSalary(Double maxSalary);

    List<StatisticsDto> employeeByDeparmentMaxSalary();

    List<StatisticsDto> managerByHireDate(int year);

    List<StatisticsDto> avgByDeparment(int employee_count);

    List<StatisticsDto> infoByCountry();
}
