package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ManyToManyFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanyNameLike(String nameLike) {
        return companyDao.findCompanyNameLike(nameLike);
    }

    public List<Employee> findEmployeeNameLike(String nameLike) {
        return employeeDao.findEmployeeNameLike(nameLike);
    }
}