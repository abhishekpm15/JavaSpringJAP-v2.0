package com.example.Employee.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Organisation {

    @Id
    int organisationID;
    String organisationDetails;

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
