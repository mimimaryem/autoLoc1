package tn.esprit.autoloc.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Client;
import tn.esprit.autoloc.autoloc.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService implements IClientService {
    private final ClientRepository repo;

    public ClientService(ClientRepository repo) {
        this.repo = repo;
    }
    @Override
    public List<Client> retrieveAllClients() {
        return repo.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return repo.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return repo.save(c);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return repo.findById(idClient) .orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
        repo.deleteById(idClient);

    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return repo.saveAll(clients);
    }
}
