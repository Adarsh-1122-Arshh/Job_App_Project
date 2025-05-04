package com.adarsh1122.firstjobapp.companies;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);

    void addCompany(Company company);

    boolean deleteCompanyById(long id);

    Company getCompanyById(Long id);
}
