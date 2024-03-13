package com.vaccinate.vaccinatebackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private double latitude;

    @Column
    private double longitude;

    @OneToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    public Location() {}

    public Location(double latitude, double longitude,Hospital hospital) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.hospital = hospital;
    }

    public Long getId(){
        return this.id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", hospital=" + hospital +
                '}';
    }
}
