package com.example.Employee.service;

import com.example.Employee.model.Organisation;
import com.example.Employee.repository.OrganisationRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class OrganisationService {

    @Autowired
    private OrganisationRepo organisationRepo;

    public Organisation getOrganisationById(int organisationID){
        return organisationRepo.findById(organisationID).orElse(null);
    }

}
