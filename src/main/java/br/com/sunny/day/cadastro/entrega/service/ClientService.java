package br.com.sunny.day.cadastro.entrega.service;

import br.com.sunny.day.cadastro.entrega.domain.dto.Cep;

public interface ClientService {
    Cep validation(String user);
}
