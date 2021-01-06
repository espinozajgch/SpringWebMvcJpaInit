package com.acid.demo.repo;

import com.acid.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

    public List<Persona> findByRut(String rut);
}
