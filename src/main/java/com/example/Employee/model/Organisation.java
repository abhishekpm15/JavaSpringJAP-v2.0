package com.example.Employee.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Organisation {

    @Id
    @Column(name = "org_id")
    private int organisationID;
    @Column(name = "org_details")
    private String organisationDetails;

    @OneToMany(mappedBy = "organisation")
    @JsonManagedReference
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getOrganisationID() {
        return organisationID;
    }

    public void setOrganisationID(int organisationID) {
        this.organisationID = organisationID;
    }

    public String getOrganisationDetails() {
        return organisationDetails;
    }

    public void setOrganisationDetails(String organisationDetails) {
        this.organisationDetails = organisationDetails;
    }
}
