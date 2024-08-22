package com.example.Employee.repository;

import com.example.Employee.model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepo extends JpaRepository<Organisation, Integer> {
}