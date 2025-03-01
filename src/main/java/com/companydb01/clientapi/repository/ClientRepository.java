package com.companydb01.clientapi.repository;

import com.companydb01.clientapi.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
