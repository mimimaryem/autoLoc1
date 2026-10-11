package tn.esprit.autoloc.autoloc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Client;
import tn.esprit.autoloc.autoloc.service.IClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final IClientService clientService;

    public ClientController(IClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> retrieveAllClients() {
        return clientService.retrieveAllClients();
    }

    @GetMapping("/{idClient}")
    public ResponseEntity<Client> retrieveClient(@PathVariable("idClient") Long idClient) {
        Client client = clientService.retrieveClient(idClient);
        return client == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(client);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @DeleteMapping("/{idClient}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeClient(@PathVariable("idClient") Long idClient) {
        clientService.removeClient(idClient);
    }

    @PostMapping("/batch")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Client> addClients(@RequestBody List<Client> clients) {
        return clientService.addClients(clients);
    }
}
