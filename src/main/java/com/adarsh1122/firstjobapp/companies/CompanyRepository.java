package com.adarsh1122.firstjobapp.companies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
