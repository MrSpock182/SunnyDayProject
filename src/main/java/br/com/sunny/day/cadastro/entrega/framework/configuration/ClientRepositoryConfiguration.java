package br.com.sunny.day.cadastro.entrega.framework.configuration;

import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;
import br.com.sunny.day.cadastro.entrega.repository.implementation.ClientRepositoryImpl;
import br.com.sunny.day.cadastro.entrega.repository.implementation.ClientRepositoryWithMongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientRepositoryConfiguration {

    @Bean
    public ClientRepository clientRepository(ClientRepositoryWithMongo repository) {
        return new ClientRepositoryImpl(repository);
    }

}
