package br.com.sunny.day.cadastro.entrega.core.service.implementation;

import br.com.sunny.day.cadastro.entrega.core.domain.dto.Client;
import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;
import br.com.sunny.day.cadastro.entrega.core.service.ClientSaveService;

public class ClientSaveServiceImpl implements ClientSaveService {

    private final ClientRepository repository;

    public ClientSaveServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Client client) {
        repository.save(client);
    }
}
