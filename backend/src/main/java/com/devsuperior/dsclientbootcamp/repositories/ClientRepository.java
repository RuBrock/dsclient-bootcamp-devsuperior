package com.devsuperior.dsclientbootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsclientbootcamp.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
