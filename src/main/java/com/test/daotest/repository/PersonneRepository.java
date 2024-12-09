package com.test.daotest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.daotest.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
    
}