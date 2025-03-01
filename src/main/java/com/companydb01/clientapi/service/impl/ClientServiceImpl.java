package com.companydb01.clientapi.service.impl;

import com.companydb01.clientapi.entity.Client;
import com.companydb01.clientapi.repository.ClientRepository;
import com.companydb01.clientapi.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getClientById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Optional<Client> updateClient(Integer id, Client client) {
        return clientRepository.findById(id).map(existingClient -> {

            // Si "client.getFirstName()" NO es null, actualiza.
            // De lo contrario, conserva el valor que ya tenía "existingClient".
            if (client.getFirstName() != null) {
                existingClient.setFirstName(client.getFirstName());
            }

            if (client.getLastName() != null) {
                existingClient.setLastName(client.getLastName());
            }

            if (client.getPhoneNumber() != null) {
                existingClient.setPhoneNumber(client.getPhoneNumber());
            }

            if (client.getEmail() != null) {
                existingClient.setEmail(client.getEmail());
            }

            if (client.getAddress() != null) {
                existingClient.setAddress(client.getAddress());
            }

            return clientRepository.save(existingClient);
        });
    }


    @Override
    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }
}
