package com.vaccinate.vaccinatebackend.repository;

import com.vaccinate.vaccinatebackend.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Long> {
}
