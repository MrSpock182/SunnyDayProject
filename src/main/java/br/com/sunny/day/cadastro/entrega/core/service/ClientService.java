package br.com.sunny.day.cadastro.entrega.core.service;

import br.com.sunny.day.cadastro.entrega.core.domain.dto.Cep;

public interface ClientService {
    Cep validation(String user);
}
