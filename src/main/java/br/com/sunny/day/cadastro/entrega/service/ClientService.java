package br.com.sunny.day.cadastro.entrega.service;

import br.com.sunny.day.cadastro.entrega.integration.ConsultaCep;
import br.com.sunny.day.cadastro.entrega.domain.dto.Cep;
import br.com.sunny.day.cadastro.entrega.domain.orm.Client;
import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ConsultaCep consultaCep;

    @Autowired
    private ClientRepository repository;

    public Cep validation(String user) {
        Client client = repository.findByUser(user);
        Cep cep = consultaCep.consulta(client.getCep());
        cep.setRealizaEntrega(cep.getUf().equalsIgnoreCase("SP") ||
                cep.getUf().equalsIgnoreCase("RJ"));
        return cep;
    }

}
