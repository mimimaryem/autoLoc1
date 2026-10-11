package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Client;

import java.util.List;

public interface IClientService {
    List<Client> retrieveAllClients();
    Client addClient(Client c);
    Client updateClient(Client c);
    Client retrieveClient(Long idClient);
    void removeClient(Long idClient);
    List<Client> addClients (List<Client> clients);
}
