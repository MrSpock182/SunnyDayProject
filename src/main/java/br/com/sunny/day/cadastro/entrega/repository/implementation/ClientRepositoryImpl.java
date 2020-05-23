package br.com.sunny.day.cadastro.entrega.repository.implementation;

import br.com.sunny.day.cadastro.entrega.core.domain.dto.Client;
import br.com.sunny.day.cadastro.entrega.repository.orm.ClientOrm;
import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;

import java.util.UUID;

public class ClientRepositoryImpl implements ClientRepository {

    private final ClientRepositoryWithMongo repository;

    public ClientRepositoryImpl(ClientRepositoryWithMongo repository) {
        this.repository = repository;
    }

    @Override
    public void save(Client client) {
        ClientOrm orm = new ClientOrm();
        orm.setId(UUID.randomUUID().toString());
        orm.setName(client.getName());
        orm.setUser(client.getUser());
        orm.setPassword(client.getPassword());
        orm.setCep(client.getCep());
        orm.setGender(client.getGender());
        orm.setBirthDate(client.getBirthDate());
        repository.save(orm);
    }

    @Override
    public Client findByUser(String user) {
        ClientOrm orm = repository.findByUser(user);
        Client client = new Client();
        client.setName(orm.getName());
        client.setUser(orm.getUser());
        client.setPassword(orm.getPassword());
        client.setCep(orm.getCep());
        client.setGender(orm.getGender());
        client.setBirthDate(orm.getBirthDate());
        return client;
    }
}
