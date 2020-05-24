package br.com.sunny.day.cadastro.entrega.core.service.implementation;

import br.com.sunny.day.cadastro.entrega.core.domain.dto.Client;
import br.com.sunny.day.cadastro.entrega.integration.ConsultaCep;
import br.com.sunny.day.cadastro.entrega.core.domain.dto.Cep;
import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;
import br.com.sunny.day.cadastro.entrega.core.service.ClientService;

public class ClientServiceImpl implements ClientService {

    private final ConsultaCep consultaCep;

    private final ClientRepository repository;

    public ClientServiceImpl(ConsultaCep consultaCep, ClientRepository repository) {
        this.repository = repository;
        this.consultaCep = consultaCep;
    }

    @Override
    public Cep validation(String user) {
        Client client = repository.findByUser(user);
        Cep cep = consultaCep.consulta(client.getCep());
        cep.setRealizaEntrega(cep.getUf().equalsIgnoreCase("SP") ||
                cep.getUf().equalsIgnoreCase("RJ") ||
                cep.getUf().equalsIgnoreCase("GO"));
        return cep;
    }

}
