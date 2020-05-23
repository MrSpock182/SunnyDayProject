package br.com.sunny.day.cadastro.entrega.integration;

import br.com.sunny.day.cadastro.entrega.core.domain.dto.Cep;

public interface ConsultaCep {
    Cep consulta(String cep);
}
