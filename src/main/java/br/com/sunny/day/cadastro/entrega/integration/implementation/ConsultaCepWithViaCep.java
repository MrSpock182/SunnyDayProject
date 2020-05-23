package br.com.sunny.day.cadastro.entrega.integration.implementation;

import br.com.sunny.day.cadastro.entrega.core.domain.dto.CepResponseWithViaCep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ConsultaCepWithViaCep", url = "${api.external.viacep}")
public interface ConsultaCepWithViaCep {

    @GetMapping(value = "/{cep}/json")
    CepResponseWithViaCep consulta(@PathVariable("cep") String cep);

}
