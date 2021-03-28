package com.myhotel.demo.repo;

import com.myhotel.demo.model.employees;
import com.myhotel.demo.pojo.IResultFormatter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeesRepo extends JpaRepository<employees, Integer> {

    @Query(value = "select count(0) EMPLOYEES_COUNT from employees e where SALARY < ?1", nativeQuery = true)
    int countByMinSalary(Double minSalary);

    @Query(value = "select count(0) EMPLOYEES_COUNT from employees e where SALARY >= ?1 and SALARY < ?2", nativeQuery = true)
    int countByRangeSalary(Double minSalary, Double maxSalary);

    @Query(value = "select count(0) EMPLOYEES_COUNT from employees e where SALARY >= ?1", nativeQuery = true)
    int countByMaxSalary(Double maxSalary);

    @Query(value = "select DEPARTMENT_NAME, count(0) EMPLOYEES_COUNT from departments d inner join employees e on d.DEPARTMENT_ID = e.DEPARTMENT_ID \n" +
            "where SALARY < ?1 group by DEPARTMENT_NAME order by EMPLOYEES_COUNT", nativeQuery = true)
    int countByDeparmentMinSalary(Double minSalary);

    @Query(value = "select DEPARTMENT_NAME, count(0) EMPLOYEES_COUNT from departments d inner join employees e on d.DEPARTMENT_ID = e.DEPARTMENT_ID \n" +
            "where SALARY >= ?1 and SALARY < ?2 group by DEPARTMENT_NAME order by EMPLOYEES_COUNT", nativeQuery = true)
    int countByDeparmentRangeSalary(Double minSalary, Double maxSalary);

    @Query(value = "select DEPARTMENT_NAME, count(0) EMPLOYEES_COUNT from departments d inner join employees e on d.DEPARTMENT_ID = e.DEPARTMENT_ID \n" +
            "where SALARY >= ?1 group by DEPARTMENT_NAME order by EMPLOYEES_COUNT", nativeQuery = true)
    int countByDeparmentMaxSalary(Double maxSalary);

    @Query(value = "select FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, DEPARTMENT_NAME, MAX(SALARY) SALARY from departments d \n" +
            "inner join employees e on d.DEPARTMENT_ID = e.DEPARTMENT_ID  group by DEPARTMENT_NAME order by SALARY\n", nativeQuery = true)
    List<IResultFormatter> employeeByDeparmentMaxSalary();

    @Query(value = "select FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, JOB_TITLE, HIRE_DATE, SALARY, (year(now()) - year(HIRE_DATE)) YEARS from employees e2 \n" +
            "inner join jobs j2 on e2.JOB_ID = j2.JOB_ID where j2.JOB_TITLE like '%MANAGER%' and (year(now()) - year(HIRE_DATE)) > ?1 \n", nativeQuery = true)
    List<IResultFormatter> managerByHireDate(int year);

    @Query(value = "select DEPARTMENT_NAME, count(0) EMPLOYEES_COUNT, TRUNCATE(AVG(SALARY),0) AVG_SALARY from departments d \n" +
                   "inner join employees e on d.DEPARTMENT_ID = e.DEPARTMENT_ID  \n" +
                   "group by DEPARTMENT_NAME having count(0) > ?1 ", nativeQuery = true)
    List<IResultFormatter> avgByDeparment(int employee_count);

    @Query(value = "select count(0) EMPLOYEES_COUNT, TRUNCATE(AVG(SALARY),0) AVG_SALARY,\n" +
                    "TRUNCATE(MAX(SALARY),0) MAX_SALARY, TRUNCATE(MIN(SALARY),0) MIN_SALARY, TRUNCATE(AVG(year(now()) - year(HIRE_DATE)),0) AVG_YEARS, COUNTRY_NAME from departments d \n" +
                    "inner join employees e on d.DEPARTMENT_ID = e.DEPARTMENT_ID \n" +
                    "inner join locations l on d.LOCATION_ID = l.LOCATION_ID\n" +
                    "inner join countries c on c.COUNTRY_ID = l.COUNTRY_ID\n" +
                    "group by COUNTRY_NAME", nativeQuery = true)
    List<IResultFormatter> infoByCountry();

}
