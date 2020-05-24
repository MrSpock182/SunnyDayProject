package br.com.sunny.day.cadastro.entrega.framework.configuration;

import br.com.sunny.day.cadastro.entrega.integration.ConsultaCep;
import br.com.sunny.day.cadastro.entrega.integration.implementation.ConsultaCepImpl;
import br.com.sunny.day.cadastro.entrega.integration.implementation.ConsultaCepWithPostmon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsultaCepConfiguration {

    @Bean
    public ConsultaCep consultaCep(ConsultaCepWithPostmon integracao) {
        return new ConsultaCepImpl(integracao);
    }

}
