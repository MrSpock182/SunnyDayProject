package br.com.sunny.day.cadastro.entrega.repository.implementation;

import br.com.sunny.day.cadastro.entrega.repository.orm.ClientOrm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoryWithMongo extends MongoRepository<ClientOrm, String> {
    ClientOrm findByUser(String user);
}
