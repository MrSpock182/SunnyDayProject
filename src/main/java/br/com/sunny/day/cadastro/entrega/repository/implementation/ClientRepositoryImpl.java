package br.com.sunny.day.cadastro.entrega.repository.implementation;

import br.com.sunny.day.cadastro.entrega.domain.orm.Client;
import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    @Autowired
    private ClientRepositoryWithMongo repository;

    @Override
    public Client save(Client client) {
        client.setId(UUID.randomUUID().toString());
        return repository.save(client);
    }

    @Override
    public Client findByUser(String user) {
        return repository.findByUser(user);
    }
}
