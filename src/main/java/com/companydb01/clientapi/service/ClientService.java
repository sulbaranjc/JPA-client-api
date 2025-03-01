package com.companydb01.clientapi.service;

import com.companydb01.clientapi.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Client> getAllClients();

    Optional<Client> getClientById(Integer id);

    Client createClient(Client client);

    Optional<Client> updateClient(Integer id, Client client);

    void deleteClient(Integer id);
}
