package br.com.sunny.day.cadastro.entrega.integration.implementation;

import br.com.sunny.day.cadastro.entrega.core.domain.dto.Cep;
import br.com.sunny.day.cadastro.entrega.core.domain.dto.CepResponseWithPostmon;
import br.com.sunny.day.cadastro.entrega.integration.ConsultaCep;

public class ConsultaCepImpl implements ConsultaCep {

    private final ConsultaCepWithPostmon consultaPostmon;

    public ConsultaCepImpl(ConsultaCepWithPostmon consultaPostmon) {
        this.consultaPostmon = consultaPostmon;
    }

    @Override
    public Cep consulta(String cep) {
        CepResponseWithPostmon respostaPostmon = consultaPostmon.consulta(cep);

        Cep objCep = new Cep();
        objCep.setBairro(respostaPostmon.getBairro());
        objCep.setLocalidade(respostaPostmon.getCidade());
        objCep.setLogradouro(respostaPostmon.getLogradouro());
        objCep.setUf(respostaPostmon.getEstado());

        return objCep;
    }
}
