package br.com.sunny.day.cadastro.entrega.integration.implementation;

import br.com.sunny.day.cadastro.entrega.domain.dto.CepResponseWithPostmon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ConsultaCepWithPostmon", url = "${api.external.postmon}")
public interface ConsultaCepWithPostmon {

    @GetMapping(value = "/cep/{cep}")
    CepResponseWithPostmon consulta(@PathVariable("cep") String cep);

}
