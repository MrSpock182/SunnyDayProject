package br.com.sunny.day.cadastro.entrega.repository;

import br.com.sunny.day.cadastro.entrega.domain.orm.Client;

public interface ClientRepository {
    Client save(Client client);

    Client findByUser(String user);
}
