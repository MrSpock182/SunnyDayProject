package br.com.sunny.day.cadastro.entrega.repository;

import br.com.sunny.day.cadastro.entrega.core.domain.dto.Client;

public interface ClientRepository {
    void save(Client client);

    Client findByUser(String user);
}
