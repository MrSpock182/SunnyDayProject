package br.com.sunny.day.cadastro.entrega.api;

import br.com.sunny.day.cadastro.entrega.objects.Cep;
import br.com.sunny.day.cadastro.entrega.objects.Client;
import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;
import br.com.sunny.day.cadastro.entrega.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientApi {

    @Autowired
    private ClientService service;

    @Autowired
    private ClientRepository repository;

    @PostMapping("/save")
    public void save(@RequestBody Client client) {
        repository.save(client);
    }

    @GetMapping("/validation/{user}")
    public Cep validation(@PathVariable("user") String user) {
        return service.validation(user);
    }

}
