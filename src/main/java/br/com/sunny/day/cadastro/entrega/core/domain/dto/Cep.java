package br.com.sunny.day.cadastro.entrega.core.domain.dto;

public class Cep {
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private Boolean realizaEntrega;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Boolean getRealizaEntrega() {
        return realizaEntrega;
    }

    public void setRealizaEntrega(Boolean realizaEntrega) {
        this.realizaEntrega = realizaEntrega;
    }
}
