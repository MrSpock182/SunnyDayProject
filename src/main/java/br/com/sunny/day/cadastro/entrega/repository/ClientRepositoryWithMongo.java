package br.com.sunny.day.cadastro.entrega.repository;

import br.com.sunny.day.cadastro.entrega.domain.orm.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoryWithMongo extends MongoRepository<Client, String> {
    Client findByUser(String user);
}
