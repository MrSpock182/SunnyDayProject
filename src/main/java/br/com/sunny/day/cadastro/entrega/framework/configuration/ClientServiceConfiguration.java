package br.com.sunny.day.cadastro.entrega.framework.configuration;

import br.com.sunny.day.cadastro.entrega.core.service.ClientService;
import br.com.sunny.day.cadastro.entrega.core.service.implementation.ClientServiceImpl;
import br.com.sunny.day.cadastro.entrega.integration.ConsultaCep;
import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientServiceConfiguration {

    @Bean
    public ClientService clientService(ConsultaCep consultaCep, ClientRepository repository) {
        return new ClientServiceImpl(consultaCep, repository);
    }

}
