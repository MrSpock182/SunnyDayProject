package br.com.sunny.day.cadastro.entrega.framework.configuration;

import br.com.sunny.day.cadastro.entrega.core.service.ClientSaveService;
import br.com.sunny.day.cadastro.entrega.core.service.implementation.ClientSaveServiceImpl;
import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientSaveServiceConfiguration {

    @Bean
    public ClientSaveService clientSaveService(ClientRepository repository) {
        return new ClientSaveServiceImpl(repository);
    }

}
