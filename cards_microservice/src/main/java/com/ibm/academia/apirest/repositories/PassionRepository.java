package com.ibm.academia.apirest.repositories;

import com.ibm.academia.apirest.models.entities.Passion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PassionRepository  extends CrudRepository<Passion,Long> {

    @Query("SELECT p FROM Passion p WHERE lower(p.name)=lower(?1) AND ?2 BETWEEN p.minSalary AND p.maxSalary AND ?3 BETWEEN p.minAge AND p.maxAge")
    public  Optional<Passion> findPassion(String passion,int salary,int age);

}
