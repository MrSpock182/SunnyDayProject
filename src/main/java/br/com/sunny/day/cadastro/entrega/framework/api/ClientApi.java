package br.com.sunny.day.cadastro.entrega.framework.api;

import br.com.sunny.day.cadastro.entrega.core.domain.dto.Cep;
import br.com.sunny.day.cadastro.entrega.core.domain.orm.Client;
import br.com.sunny.day.cadastro.entrega.core.service.ClientSaveService;
import br.com.sunny.day.cadastro.entrega.core.service.ClientService;
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
