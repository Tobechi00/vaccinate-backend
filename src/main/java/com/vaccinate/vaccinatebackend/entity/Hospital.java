package com.vaccinate.vaccinatebackend.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "hospitals")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String hospitalName;

    @Column
    private Long rcNumber;

    @Column
    private String phoneNumber;

    @OneToMany
    @JoinColumn(name = "location_id")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Location location;

    public Hospital() {}


    public Long getId() {
        return id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Long getRcNumber() {
        return rcNumber;
    }

    public void setRcNumber(Long rcNumber) {
        this.rcNumber = rcNumber;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
