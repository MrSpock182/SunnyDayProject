package br.com.sunny.day.cadastro.entrega.api;

import br.com.sunny.day.cadastro.entrega.domain.dto.Cep;
import br.com.sunny.day.cadastro.entrega.domain.orm.Client;
import br.com.sunny.day.cadastro.entrega.service.ClientSaveService;
import br.com.sunny.day.cadastro.entrega.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientApi {

    @Autowired
    private ClientService service;

    @Autowired
    private ClientSaveService saveService;

    @PostMapping("/save")
    public void save(@RequestBody Client client) {
        saveService.save(client);
    }

    @GetMapping("/validation/{user}")
    public Cep validation(@PathVariable("user") String user) {
        return service.validation(user);
    }

}
