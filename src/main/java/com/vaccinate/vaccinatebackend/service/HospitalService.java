package com.vaccinate.vaccinatebackend.service;

import com.vaccinate.vaccinatebackend.entity.Hospital;
import com.vaccinate.vaccinatebackend.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    HospitalRepository hospitalRepository;

    public HospitalService(HospitalRepository repository){
        this.hospitalRepository = repository;
    }

    public List<Hospital> getAllHospitals(){
        return hospitalRepository.findAll();
    }

}
